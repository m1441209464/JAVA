
Page({
  data: {
    inputShowed: false,
    inputVal: "",
    totalDataCount: 0, // 总数据条数
    currentPage: 0,
    articles: [], // 存放所有的数据
    showMoreBtn: false,
  },
  showInput: function () {
    this.setData({
      inputShowed: true
    });
  },
  hideInput: function () {
    this.setData({
      inputVal: "",
      inputShowed: false
    });
  },
  clearInput: function () {
    this.setData({
      inputVal: ""
    });
  },
  inputTyping: function (e) {
    this.setData({
      inputVal: e.detail.value
    });
    this.loadInitData();
  },

  /**
   * 加载初始数据,有时候为了提升页面打开速度，会将所有数据合并到一个接口中返回，然后列表中的第二页数据开始，使用其它接口返回，即分页获取数据时，仅获取下一页的数据。（这里仅做示例，因为每一页数据都取一样的。在实际开发中可以考虑这样分开。）
   */
  loadInitData: function () {
    var that = this
    var currentPage = 1; // 从第一页加载
    var tips = "加载第" + (currentPage) + "页";
    console.log("load page " + (currentPage));
    wx.showLoading({
      //title: tips,
      title:"加载中"
    })
    // 刷新时，清空dataArray，防止新数据与原数据冲突
    that.setData({
      dataArray: []
    })
    // 请封装自己的网络请求接口，这里作为示例就直接使用了wx.request.
    wx.request({
      url: 'https://www.cloplex.com/property/index.php/UserController/selectUser',
      data: {
        offset: currentPage,
        searchKey: that.data.inputVal,
        status: "1",//查询正常用户
      },
      header: {
        'content-type': "application/x-www-form-urlencoded", // 默认值
        'cookie': wx.getStorageSync("sessionid")
      },
      method: "POST",
      success: function (res) {
        wx.hideLoading();
        var data = res.data; // 接口相应的json数据
        if(data.status == 1){
          var articles = data.data; // 接口中的data对应了一个数组，这里取名为 articles
          if(articles && articles.length && articles.length > 0){
            var totalDataCount = articles.length;
            console.log(articles);
            // console.log(articles);
            console.log("totalDataCount:"+totalDataCount);
            that.setData({
              ["dataArray["+currentPage+"]"]: articles,
              currentPage: currentPage,
              totalDataCount: totalDataCount,
              showMoreBtn: true
            })
          }else{
            that.setData({
              showMoreBtn: false
            })
            wx.showToast({
              title: '暂无数据',
              icon: 'none',
              duration: 2000
            })
          }
        }else{
          that.setData({
            showMoreBtn: false
          })
          wx.showToast({
            title: '出错了',
            icon: 'none',
            duration: 2000
          })
        }
        
        
      }
    })

  },

  /**
   * 加载下一页数据
   */
  loadMoreData: function () {
    var that = this
    var currentPage = that.data.currentPage; // 获取当前页码
    currentPage += 1; // 加载当前页面的下一页数据
    var tips = "加载第" + (currentPage) + "页";
    console.log("load page " + (currentPage));
    wx.showLoading({
      //title: tips,
      title:"加载中"
    })
    // 请封装自己的网络请求接口，这里作为示例就直接使用了wx.request.
    wx.request({
      url: 'https://www.cloplex.com/property/index.php/UserController/selectUser',
      data: {
        offset: currentPage,
        searchKey: that.data.inputVal,
        status: "1",//查询正常用户
      },
      header: {
        'content-type': "application/x-www-form-urlencoded", // 默认值
        'cookie': wx.getStorageSync("sessionid")
      },
      method: "POST",
      success: function (res) {
        wx.hideLoading();
        var data = res.data; // 接口相应的json数据
        console.log(data);
        if(data.status == 1){
          var articles = data.data; // 接口中的data对应了一个数组，这里取名为 articles
          if(articles && articles.length && articles.length > 0){
            // 计算当前共加载了多少条数据，来证明这种方式可以加载更多数据
            var totalDataCount = that.data.totalDataCount;
            totalDataCount = totalDataCount + articles.length;
            console.log("totalDataCount:" + totalDataCount);

            // 直接将新一页的数据添加到数组里
            that.setData({
              ["dataArray[" + currentPage + "]"]: articles,
              currentPage: currentPage,
              totalDataCount: totalDataCount,
              showMoreBtn: true,
            })
          }else{
            that.setData({
              showMoreBtn: false,
            })
            wx.showToast({
              title: '到底了',
              icon: 'none',
              duration: 2000
            })
          }
        }else{
          that.setData({
            showMoreBtn: false
          })
          wx.showToast({
            title: '出错了,错误信息：'+data.msg,
            icon: 'none',
            duration: 2000
          })
        }
      }
    })
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var that = this
    that.setData({
      //icon: base64.icon20,
      slideButtons: [{
        text: '角色设置',
        src: '/page/weui/cell/icon_love.svg', // icon的路径
      },{
          type: 'warn',
          text: '后台授权',
          src: '/page/weui/cell/icon_star.svg', // icon的路径
        }],

    });

    // 加载页面初始化时需要的数据
    setTimeout(function () {
      that.loadInitData();
    }, 1000) //延迟时间 这里是1秒
  },
  //点击功能项
  slideButtonTap(e) {
    var that = this;
    var userData = e.currentTarget.dataset.userdata;
    var operationIndex = e.detail.index;
    if (0 == operationIndex) {
      //角色设置
      wx.navigateTo({
        url: '/pages/property/thirdPages/setRole/setRole?id=' + userData.id + '&roleid=' + userData.roleid,
      })
    } else if (1 == operationIndex) {
      //后台授权
      wx.showModal({
        title: '提示',
        content: '确认给【' + userData.username+'】授后台登陆权限吗？',
        confirmText: "确认授权",
        cancelText: "放弃授权",
        success: function (res) {
          if (res.confirm) {
            console.log('用户点击确认');
            that.loginWeb(userData);
          } else {
            console.log('用户点击放弃')
          }
        }
      });
    }
  },


  //用户授权
  loginWeb: function(userData){
    var that = this;
    wx.request({
      url: 'https://www.cloplex.com/property/index.php/UserController/updateUserStatus', //仅为示例，并非真实的接口地址
      data: {
        id: userData.id,
        adminpdw: "123456"
      },
      header: {
        'content-type': "application/x-www-form-urlencoded", // 默认值
        'cookie': wx.getStorageSync("sessionid")
      },
      method: "POST",
      success(res) {
        wx.hideLoading();//关闭遮罩
        if (res.data.status == 1) {
          wx.showToast({
            title: '授权成功',
            duration: 2000,
            success: function(){
              that.loadInitData();
            }
          });
        } else {
          wx.showToast({
            title: '出错了：错误信息'+JSON.stringify(res),
            icon: 'none',
            duration: 2000
          });
        }
      }
    })
  },




});