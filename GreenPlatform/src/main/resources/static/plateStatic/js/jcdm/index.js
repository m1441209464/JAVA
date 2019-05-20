var grid;
$(function(){
    initEvent();
    initGrid();
});

/**
 * 初始化事件
 */
function initEvent(){
    initSelect();
    initMenu();
    $("#btnReset").click(function(){
        $("#insertPlateUserForm input").val("");
        $("#insertPlateUserForm select").val("");
    });
    $("#btnAdd").click(function(){
        $("#myModalLabel").html("新增基础代码");
        $("#btnReset").click();
        $("#cUserid").val("");
        $("#addUserModel").modal('show');
    });

    $("#btnSearch").click(function(){
        loadGridData();
    });
    $("#btnSave").click(function(){
        checkRegister();
        $("#insertPlateUserForm").bootstrapValidator('validate');//提交验证

        if ($("#insertPlateUserForm").data('bootstrapValidator').isValid()) {
            if($("#cUserid").val()){
                f_submitData("1","/plate/updPlateuser");
            }else{
                f_submitData("0","/plate/insertPlateuser");
            }
        }
    });

}

function initMenu(){
    $(".center_main_left").find("li").each(function () {
        var a = $(this).find("a:first")[0];
        if ($(a).attr("href") === location.pathname) {
            $(this).addClass("active");
        } else {
            $(this).removeClass("active");
        }
    });
}

/**
 * 初始化表格
 */
function initGrid(){
    grid = new dhtmlXGridObject('gridbox');
    grid.setImagePath("/publicFrame/dhtmlx-4.5/skins/web/imgs/");
    grid.setHeader("操作,代码类别,代码类别名称,代码值,代码值名称,排序号,状态");
    grid.setInitWidthsP("15,15,15,15,15,10,14.5");
    grid.setColAlign("center,center,center,center,center,center,center");
    grid.setColTypes("ro,ro,ro,ro,ro,ro,ro");
    grid.enableMultiselect(false);
    grid.init();
}

/**
 * 查询数据
 */
function loadGridData(){
    grid.clearAll();
    var sendRequest = new SendRequest("/plate/selectPlateCodeDmz","POST");//构造对象
    sendRequest.addParamObj({
        "cDmlb":$("#cDmlbSeatch").val(),
        "cDm":$("#cDmSearch").val()
    });//构造请求参数

    sendRequest.sendRequest(function(ret){
        if(ret.flag != "0"){
            BootstrapDialog.alert({
                type: BootstrapDialog.TYPE_WARNING,
                size: BootstrapDialog.SIZE_SMALL,
                title: '提示',
                message: "查询出错,系统错误！",
                closeable: true,
                buttonLabel: "确定"
            });
        }else{
            if(ret.object.length > 0){
                $("#commonInfo").hide();
                initData(ret.object);
            }else{
                $("#commonInfo").show();
                $("#commonInfo").text("没有查询结果！");
            }
        }
    });//发送请求并获取返回结果
}

/**
 * 表格赋值
 * @param data
 */
function initData(data){
    for (var i=0; i<data.length; i++){
        var opLinkBuff = new StringBuffer();
        opLinkBuff.append("<button type=\"button\" class=\"btn btn-sm btn-primary \" onclick=\"f_upd(\'"+(i+1)+"\');\" id=\"xg_link_"+(i+1)+"\" >修改</button>")
        opLinkBuff.append("<button type=\"button\" class=\"btn btn-sm btn-warning \" onclick=\"f_del(\'"+(i+1)+"\');\" id=\"del_link_"+(i+1)+"\" >删除</button>")

        grid.addRow((i+1),[
            opLinkBuff.toString(),
            data[i].cDmlb,
            data[i].cDmlbmc,
            data[i].cDm,
            data[i].cDmmc,
            data[i].cSort,
            data[i].cZt
        ]);
        grid.setUserData((i+1),"data",data[i]);
    }
}

/**
 * 验证新增用户表单
 */
function checkRegister(){
    $('#insertPlateUserForm').bootstrapValidator({
        excluded: [':disabled'],
        message: '表单验证有误',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            /*invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'*/
        },
        fields: {
            cEmail: {
                message: '邮箱验证失败',
                validators: {
                    notEmpty: {
                        message: '邮箱不能为空'
                    },
                    emailAddress: {
                        message: '邮箱地址格式有误'
                    }
                }
            },
            cLoginname: {
                message: '用户名验证失败',
                validators: {
                    notEmpty: {
                        message: '用户名不能为空'
                    },
                    stringLength: {
                        min: 3,
                        max: 18,
                        message: '用户名长度必须在3到18位之间'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_]+$/,
                        message: '用户名只能包含大写、小写、数字和下划线'
                    }
                }
            }/*,
            cPassword: {
                validators: {
                    notEmpty: {
                        message: '密码不能为空'
                    }
                }
            },
            cPassword1: {
                validators: {
                    notEmpty: {
                        message: '密码不能为空'
                    },
                    identical: {
                        field: 'cPassword',
                        message: '两次密码不一致'
                    },
                }
            }*/
        }
    });
}


/**
 * 发送请求保存数据
 * type:操作类型，0新增/1修改/2删除
 * reqURL：服务地址
 */
function f_submitData(type,reqURL){
    var sendRequest = new SendRequest(reqURL,"POST");//构造对象

    if ("0" === type) {
        sendRequest.addParamObj({
            "cUsername":$("#cUsername").val(),
            "cSex":$("#cSex").val(),
            "cEmail":$("#cEmail").val(),
            "cPhone":$("#cPhone").val(),
            "cWxhm":$("#cWxhm").val(),
            "cZjhm":$("#cZjhm").val(),
            "cLoginname":$("#cLoginname").val(),
            "cRylb":$("#cRylb").val(),
            "cPassword":$("#cPassword").val(),
            "cZt":'1',
        });//构造请求参数
    }else if("1" === type){
        sendRequest.addParamObj({
            "cUserid":$("#cUserid").val(),
            "cUsername":$("#cUsername").val(),
            "cSex":$("#cSex").val(),
            "cEmail":$("#cEmail").val(),
            "cPhone":$("#cPhone").val(),
            "cWxhm":$("#cWxhm").val(),
            "cZjhm":$("#cZjhm").val(),
            "cLoginname":$("#cLoginname").val(),
            "cRylb":$("#cRylb").val(),
            "cPassword":$("#cPassword").val(),
            "cZt":'1'
        });//构造请求参数
    }else if("2" === type){
        sendRequest.addParamObj({
            "cUserid":$("#cUserid").val()
        });//构造请求参数
    }

    sendRequest.sendRequest(function(ret){
        $("#btnSave").attr("disabled",false);
        if("0" != ret.flag){
            BootstrapDialog.alert({
                type: BootstrapDialog.TYPE_WARNING,
                size: BootstrapDialog.SIZE_SMALL,
                title: '提示',
                message: "操作失败！"+ret.msg,
                closeable: true,
                buttonLabel: "确定"
            });
        }else{
            BootstrapDialog.alert({
                type: BootstrapDialog.TYPE_WARNING,
                size: BootstrapDialog.SIZE_SMALL,
                title: '提示',
                message: "操作成功",
                closeable: true,
                buttonLabel: "确定"
            });
            $("#btnRet,#btnReset").click();
            loadGridData();
        }
    });//发送请求并获取返回结果
}

/*
修改用户,页面赋值
 */
function f_upd(id){
    console.log(id);
    var data = grid.getUserData(id,"data");
    console.log(data);
    $("#btnAdd").click();//触发新增按钮点击事件（设置人员id为空，清空输入框，打开模态框，初始化下拉框）
    $("#myModalLabel").html("修改基础代码");
    setInputArea(nullToEmptyForObject(data));
    $("#cPassword,#cPassword1").hide();
}
/*
删除用户
 */
function f_del(id){
    $("#cUserid").val(id);
    BootstrapDialog.confirm({
        type: BootstrapDialog.TYPE_DANGER,
        size: BootstrapDialog.SIZE_SMALL,
        title: '提示',
        message: "确认删除吗！",
        closeable: true,
        btnOKLabel: "确定",
        btnCancelLabel: "取消",
        callback: function (ret) {
            if(ret){
                f_submitData('2',"/plate/delPlateuser");
            }
        }
    });
}

/**
 *
 * 初始化下拉框
 */
function initSelect(){
    initBaseCodeSelect($("#cZt"),{cDmlb:"C_JC_ZT"},null,"---请选择状态---")
}


