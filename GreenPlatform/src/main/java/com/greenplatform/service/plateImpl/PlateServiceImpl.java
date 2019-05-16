package com.greenplatform.service.plateImpl;

import com.greenplatform.dao.PlateDao;
import com.greenplatform.model.*;
import com.greenplatform.model.base.ReturnModel;
import com.greenplatform.service.PlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class PlateServiceImpl implements PlateService {
    ReturnModel returnModel = new ReturnModel();
    @Autowired
    PlateDao plateDao;
    Date date = new Date();
    Timestamp timestamp = new Timestamp(date.getTime());


    @Override
    public ReturnModel selectPlateuser(PlateUser plateUser,String type) {
        List plateUserList = plateDao.selectPlateuser(plateUser);
        if (!plateUserList.isEmpty()){
            returnModel.setFlag(0);
            returnModel.setMsg("登陆成功");
            returnModel.setObject(plateUserList);
        }else{
            returnModel.setFlag(1);
            returnModel.setMsg("登录名或密码错误");
            returnModel.setObject(null);
        }
        return returnModel;
    }

    @Override
    public ReturnModel selectPlateuser(PlateUser plateUser) {
        List plateUserList;
        try{
            plateUserList = plateDao.selectPlateuser(plateUser);
            returnModel.setFlag(0);
            returnModel.setMsg("");
            returnModel.setObject(plateUserList);
        }catch(Exception e){
            System.out.println(e);
            returnModel.setFlag(1);
            returnModel.setMsg("系统错误");
            returnModel.setObject(null);
        }
        return returnModel;
    }

    @Override
    public ReturnModel insertPlateuser(PlateUser plateUser) {
        String majorKey = UUID.randomUUID().toString().replaceAll("-", "");
        plateUser.setcUserid(majorKey);
        plateUser.setdCjsj(timestamp);

        try{
            plateDao.insertPlateuser(plateUser);
        }catch( Exception e){
            System.out.println(e);
            returnModel.setFlag(1);
            returnModel.setMsg("新增用户失败，系统错误!");
            returnModel.setObject(null);
        }

        return returnModel;
    }

    @Override
    public ReturnModel delPlateuser(PlateUser plateUser) {
        try{
            plateDao.delPlateuser(plateUser);
        }catch (Exception e){
            System.out.println(e);
            returnModel.setFlag(1);
            returnModel.setMsg("删除失败，系统错误!");
            returnModel.setObject(null);
        }
        return returnModel;
    }

    @Override
    public ReturnModel updPlateuser(PlateUser plateUser) {
        try{
            plateUser.setdXgsj(timestamp);
            plateDao.updPlateuser(plateUser);
        }catch (Exception e){
            System.out.println(e);
            returnModel.setFlag(1);
            returnModel.setMsg("修改用户失败，系统错误!");
            returnModel.setObject(null);
        }
        return returnModel;
    }

    @Override
    public ReturnModel selectPlateCodeDmlb(PlateCodeDmlb plateCodeDmlb) {
        return null;
    }

    @Override
    public ReturnModel insertPlateCodeDmlb(PlateCodeDmlb plateCodeDmlb) {
        return null;
    }

    @Override
    public ReturnModel delPlateCodeDmlb(PlateCodeDmlb plateCodeDmlb) {
        return null;
    }

    @Override
    public ReturnModel updPlateCodeDmlb(PlateCodeDmlb plateCodeDmlb) {
        return null;
    }

    @Override
    public ReturnModel selectPlateCodeDmz(PlateCodeDmz plateCodeDmz) {
        List plateCodeDmzList;
        try{
            plateCodeDmzList = plateDao.selectPlateCodeDmz(plateCodeDmz);
            returnModel.setFlag(0);
            returnModel.setMsg("操作成功!");
            returnModel.setObject(plateCodeDmzList);
        }catch (Exception e){
            returnModel.setFlag(1);
            returnModel.setMsg("操作失败，系统错误!");
            returnModel.setObject(null);
        }

        return returnModel;
    }

    @Override
    public ReturnModel insertPlateCodeDmz(PlateCodeDmz plateCodeDmz) {
        return null;
    }

    @Override
    public ReturnModel delPlateCodeDmz(PlateCodeDmz plateCodeDmz) {
        return null;
    }

    @Override
    public ReturnModel updPlateCodeDmz(PlateCodeDmz plateCodeDmz) {
        return null;
    }

    @Override
    public ReturnModel selectPlateLog(PlateLog plateLog) {
        return null;
    }

    @Override
    public ReturnModel insertPlateLog(PlateLog plateLog) {
        return null;
    }


}