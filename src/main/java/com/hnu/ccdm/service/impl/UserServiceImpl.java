package com.hnu.ccdm.service.impl;

import com.hnu.ccdm.mapper.UserMapper;
import com.hnu.ccdm.entity.User;
import com.hnu.ccdm.entity.UserExample;
import com.hnu.ccdm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());    // 日志：暂时没用

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int deleteUserByAccount(String userAccount) {
        return userMapper.deleteByPrimaryKey(userAccount);
    }

    @Override
    public User getUserByAccount(String userAccount) {
        return userMapper.selectByPrimaryKey(userAccount);
    }

    @Override
    public List<User> getUserList() {
        return userMapper.selectByExample(new UserExample());
    }

    @Override
    public List<User> getUserListBySearch(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();   // 生成条件对象
        criteria.andUserAgeLessThan(user.getUserAge()); // 设置条件：只查询年龄不少于user.getUserAge()的用户

        return userMapper.selectByExample(userExample);
    }

    @Override
    public int setUserNameByAccount(String userAccount , String name){
        User user = new User();
        user.setUserAccount(userAccount);
        user.setUserName(name);
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int setNickNameByAccount(String userAccount, String nickname) {
        User user = new User();
        user.setUserAccount(userAccount);
        user.setUserNickname(nickname);
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int setLocationByAccount(String userAccount, String location) {
        User user = new User();
        user.setUserAccount(userAccount);
        user.setUserLocation(location);
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int setAgeByAccount(String userAccount, int age) {
        User user=new User();
        user.setUserAccount(userAccount);
        user.setUserAge(age);
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int setBirthdayByAccount(String userAccount, Date birthday) throws Exception{
        User user=new User();
        user.setUserAccount(userAccount);
        user.setUserBirthday(birthday);
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int setEmailByAccount(String userAccount, String email) {
        User user=new User();
        user.setUserAccount(userAccount);
        user.setUserEmail(email);
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int setLabelByAccount(String userAccount, String label) {
        User user=new User();
        user.setUserAccount(userAccount);
        user.setUserLabel(label);
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int setNumberByAccount(String userAccount, String number) {
        User user=new User();
        user.setUserAccount(userAccount);
        user.setUserNumber(number);
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int setPlaceByAccount(String userAccount, String place) {
        User user=new User();
        user.setUserAccount(userAccount);
        user.setUserPlace(place);
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int setTimeByAccount(String userAccount, Date time) {
        User user=new User();
        user.setUserAccount(userAccount);
        user.setUserTime(time);
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int setPasswordByAccount(String userAccount, String password) {
        User user=new User();
        user.setUserAccount(userAccount);
        user.setUserPassword(password);
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int setScoreByAccount(String userAccount, int score) {
        User user=new User();
        user.setUserAccount(userAccount);
        user.setUserScore(score);
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int setPortraitByAccount(String userAccount, String portrait) {
        User user = new User();
        user.setUserAccount(userAccount);
        user.setUserPortrait(portrait);
        return userMapper.updateByPrimaryKeySelective(user);
    }

}
