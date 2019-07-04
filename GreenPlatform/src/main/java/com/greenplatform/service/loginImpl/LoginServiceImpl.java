package com.greenplatform.service.loginImpl;

import com.greenplatform.aop.OperationLog;
import com.greenplatform.dao.*;
import com.greenplatform.model.*;
import com.greenplatform.model.base.ReturnModel;
import com.greenplatform.service.LoginService;
import com.greenplatform.util.GetcurrentLoginUser;
import com.greenplatform.util.MD5;
import com.greenplatform.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.UUID;


@Transactional
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    PlateUserMapper plateUserMapper;
    @Autowired
    TGreenNlZjnlmxMapper tGreenNlZjnlmxMapper;
    @Autowired
    TGreenNlHzMapper tGreenNlHzMapper;

    ReturnModel returnModel = new ReturnModel();


    @Override
    public ReturnModel checkLogin(PlateUser plateUser, HttpSession session) {
        List plateUserList;
        PlateUserExample plateUserExample = new PlateUserExample();
        PlateUserExample.Criteria criteria = plateUserExample.createCriteria();
        criteria.andCRyztEqualTo("1");//人员状态（0未激活1已激活）
        criteria.andCRyxzEqualTo("1");//人员性质（1正常 -1黑名单）
        criteria.andCZtEqualTo("1");//数据状态（0无效  1有效）

        //1、用户是否存在
        plateUser.setcPassword(MD5.md5(plateUser.getcPassword()));
        criteria.andCLoginnameEqualTo(plateUser.getcLoginname());
        plateUserList = plateUserMapper.selectByExample(plateUserExample);
        if (plateUserList.isEmpty()){
            returnModel.setFlag(1);
            returnModel.setMsg("用户不存在！");
            returnModel.setObject(null);
            return returnModel;
        }else{
            //2.登陆密码是否正确
            criteria.andCPasswordEqualTo(plateUser.getcPassword());
            criteria.andCRylbEqualTo(plateUser.getcRylb());
            plateUserList = plateUserMapper.selectByExample(plateUserExample);
            if (plateUserList.isEmpty()){
                returnModel.setFlag(1);
                returnModel.setMsg("登录密码错误");
                returnModel.setObject(null);
                return returnModel;
            }else{
                returnModel.setFlag(0);
                returnModel.setMsg("登陆成功");
                returnModel.setObject(plateUserList);
                PlateUser plateUser1 = (PlateUser) plateUserList.get(0);
                session.setAttribute("loginUser",plateUser1);
                return returnModel;
            }
        }
    }


    @OperationLog(cCzfs = "I")
    @Override
    public ReturnModel doRegister(PlateUser plateUser, HttpSession session) {
        try{
            List plateUserList;
            PlateUser plateUser1 = new PlateUser();
            //1.判断邮箱或用户名是否被注册
            PlateUserExample plateUserExample = new PlateUserExample();
            PlateUserExample.Criteria criteria = plateUserExample.createCriteria();
            criteria.andCRylbEqualTo(plateUser.getcRylb());
            criteria.andCEmailEqualTo(plateUser.getcEmail());

            plateUserList = plateUserMapper.selectByExample(plateUserExample);
            if (!(plateUserList.isEmpty())){
                returnModel.setFlag(1);
                returnModel.setObject(null);
                returnModel.setMsg("注册失败，邮箱已经被注册!");
                return returnModel;
            }
            //2.判断用户名是否被注册
            PlateUserExample plateUserExample1 = new PlateUserExample();
            plateUserExample1.createCriteria().andCLoginnameEqualTo(plateUser.getcLoginname());
            plateUserList = plateUserMapper.selectByExample(plateUserExample1);
            if (!(plateUserList.isEmpty())){
                returnModel.setFlag(1);
                returnModel.setObject(null);
                returnModel.setMsg("注册失败，用户名已经被注册!");
                return returnModel;
            }
            //3.注册用户
            String majorKey = UUID.randomUUID().toString().replaceAll("-", "");
            plateUser.setcPassword(MD5.md5(plateUser.getcPassword()));
            plateUser.setcRyzt("1");//人员状态（0未激活1已激活）
            plateUser.setcRylb("2");//人员类别（1系统用户2前端用户）
            plateUser.setcRydj("0");//人员等级（0，1，2，3，4）
            plateUser.setcRyxz("1");//人员性质（1正常，-1黑名单）
            plateUser.setcZt("1");//数据状态（0无效1有效）

            plateUser.setcUserid(majorKey);
            plateUser.setdCjsj(TimeUtil.getTimestamp(new Date()));
            plateUser.setcCjuser(majorKey);
            int insertRet = plateUserMapper.insert(plateUser);
            if (1 != insertRet){
                returnModel.setFlag(1);
                returnModel.setObject(null);
                returnModel.setMsg("注册失败，系统错误!");
                return returnModel;
            }else{
                //平台用户注册成功则对应账户账户增加100能量
                TGreenNlZjnlmx tGreenNlZjnlmx = new TGreenNlZjnlmx();
                tGreenNlZjnlmx.setcLsh(UUID.randomUUID().toString().replaceAll("-", ""));
                tGreenNlZjnlmx.setcUserid(plateUser.getcUserid());
                tGreenNlZjnlmx.setcZjnl("100");
                tGreenNlZjnlmx.setdZjsj(TimeUtil.getTimestamp(new Date()));
                tGreenNlZjnlmx.setcZjyy("1");
                tGreenNlZjnlmx.setcZt("1");
                tGreenNlZjnlmx.setcCjuser(plateUser.getcUserid());
                tGreenNlZjnlmx.setdCjsj(TimeUtil.getTimestamp(new Date()));

                TGreenNlHz tGreenNlHz = new TGreenNlHz();
                tGreenNlHz.setcUserid(plateUser.getcUserid());
                tGreenNlHz.setcNlhz("100");
                tGreenNlHz.setcZt("1");
                tGreenNlHz.setcCjuser(plateUser.getcUserid());
                tGreenNlHz.setdCjsj(TimeUtil.getTimestamp(new Date()));

                tGreenNlZjnlmxMapper.insert(tGreenNlZjnlmx);
                tGreenNlHzMapper.insert(tGreenNlHz);
                session.setAttribute("loginUser",plateUser);//前端用户注册成功后写入session
                returnModel.setFlag(0);
                returnModel.setObject(null);
                returnModel.setMsg("注册成功!");
                return  returnModel;
            }
        }catch (Exception e){
            e.printStackTrace();
            returnModel.setFlag(1);
            returnModel.setObject(null);
            returnModel.setMsg("注册失败，系统错误!");
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return returnModel;
        }
    }



}