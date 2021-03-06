// miniprogram/pages/household/pay/pay.js
var util = require('../../../utils/util.js');
Page({

  /**
   * 页面的初始数据
   */
  data: {
    date: util.formatTime(new Date()).substr(0,7),
    totalDataCount: 0, // 总数据条数
    currentPage: 0,
    articles: [], // 存放所有的数据
    showMoreBtn: false,
    parentId: "",
    isInitLoad: true,
  },

  bindDateChange: function (e) {
    this.setData({
      date: e.detail.value,
      isInitLoad: false
    });
    this.loadInitData();
  },

  //查看详情
  gotoViewDetails: function(e){
    var that = this;
    var dataList = e.currentTarget.dataset.datalist;


    wx.navigateTo({
      url: "/pages/household/payDetails/payDetails?dataList=" + JSON.stringify(dataList),
    })
  },
  
  /**
   * 滚动到某个view
   */
  scrollToView: function (e) {
    var that = this
    const dataset = e.currentTarget.dataset;
    var mark = dataset.mark
    console.log("scroll to :" + mark);
    that.setData({
      toView: mark
    })
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

    var reqParams = {
      id: that.data.parentId,
      offset: currentPage,
      date_begin: that.data.date
    };

    if(that.data.isInitLoad){
      reqParams = {
        id: that.data.parentId,
        offset: currentPage
      };
    }
    // 请封装自己的网络请求接口，这里作为示例就直接使用了wx.request.
    wx.request({
      url: 'https://www.cloplex.com/property/index.php/FuniController/getRechargeList',
      data: reqParams,
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
    var reqParams = {
      id: that.data.parentId,
      offset: currentPage,
      date_begin: that.data.date
    };
    if(that.data.isInitLoad){
      reqParams = {
        id: that.data.parentId,
        offset: currentPage
      };
    }
    // 请封装自己的网络请求接口，这里作为示例就直接使用了wx.request.
    wx.request({
      url: 'https://www.cloplex.com/property/index.php/FuniController/getRechargeList',
      data: reqParams,
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

    var that = this;

    if(options.id){
      that.setData({
        parentId: options.id
      });
    }

    // 加载页面初始化时需要的数据
    setTimeout(function () {
      that.loadInitData();
    }, 1000) //延迟时间 这里是1秒
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})