/**
 * 入口函数
 * @param args  父页面传入的参数
 * @param mdi
 * @param layerIdx
 * @param parentWindow  父页面对象
 * @returns
 */
function _init(args, mdi, layerIdx, parentWindow) {
    if(args){
        setInputArea(nullToEmptyForObject(args));
        $("#cYwlxdm,#cMenudm").attr("disabled",true);
    }
    var refresh = false;
    initEvent();
    $("#btnRet").click(function(){
        parentWindow.returnValue = refresh;
        parent.layer.close(layerIdx);
    });


    function initEvent(){
        if (args && args.cMenudm){
            initBaseCodeSelect($("#cZt"),{cDmlb:"C_JC_ZT"},args.cZt,"---请选择状态---");
        } else{
            initBaseCodeSelect($("#cZt"),{cDmlb:"C_JC_ZT"},null,"---请选择状态---");
        }
        $("#btnSave").click(function(){
            var bPass = requiredFieldCheck($("label .require"), top, function(){});
            if(!bPass){
                return;
            }else{
                if(args && args.cMenudm){
                    f_submitData("1","/plate/updPlateYwLxMenu");
                }else{
                    f_submitData("0","/plate/insertPlateYwLxMenu");
                }
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
                "cYwlxdm":$("#cYwlxdm").val(),
                "cMenudm":$("#cMenudm").val(),
                "cMenumc":$("#cMenumc").val(),
                "cMenujc":$("#cMenujc").val(),
                "cRuncommand":$("#cRuncommand").val(),
                "cSort":$("#cSort").val(),
                "cZt":$("#cZt").val()
            });//构造请求参数
        }else if("1" === type){
            sendRequest.addParamObj({
                "cYwlxdm":args.cYwlxdm,
                "cMenudm":args.cMenudm,
                "cMenumc":$("#cMenumc").val(),
                "cMenujc":$("#cMenujc").val(),
                "cRuncommand":$("#cRuncommand").val(),
                "cSort":$("#cSort").val(),
                "cZt":$("#cZt").val()
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
                    buttonLabel: "确定",
                    callback: function () {

                    }
                });
            }else{
                BootstrapDialog.alert({
                    type: BootstrapDialog.TYPE_PRIMARY,
                    size: BootstrapDialog.SIZE_SMALL,
                    title: '提示',
                    message: "操作成功",
                    closeable: true,
                    buttonLabel: "确定",
                    callback: function () {
                        refresh = true;
                        parentWindow.returnValue = refresh;
                        parent.layer.close(layerIdx);
                    }
                });
            }
        });//发送请求并获取返回结果
    }

}
