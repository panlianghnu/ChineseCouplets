package com.hnu.ccdm.service;

import com.hnu.ccdm.entity.User;

import java.util.List;

import java.util.Date;

public interface UserService {

    // 新增用户
    int addUser(User user);

    // 通过用户id删除用户
    int deleteUserByAccount(String userAccount);

    // 通过用户id查询用户
    User getUserByAccount(String userAccount);

    // 用户列表
    List<User> getUserList();

    // 用户列表：在某条件下
    List<User> getUserListBySearch(User user);

    //通过用户id修改用户的名称
    int setUserNameByAccount(String userAccount, String name);

    int setNickNameByAccount(String userAccount, String nickname);

    int setLocationByAccount(String userAccount, String location);

    int setEmailByAccount(String userAccount,String email);

    int setPlaceByAccount(String userAccount,String place);

    int setLabelByAccount(String userAccount,String label);

    int setAgeByAccount(String userAccount,int age);

    int setBirthdayByAccount(String userAccount,Date birthday) throws Exception;

    int setNumberByAccount(String userAccount,String number);

    int setTimeByAccount(String userAccount,Date time);

    int setPasswordByAccount(String userAccount, String password);

    int setScoreByAccount(String userAccount,int score);


}
