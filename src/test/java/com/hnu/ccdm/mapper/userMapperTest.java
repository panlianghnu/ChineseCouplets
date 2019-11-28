package com.hnu.ccdm.mapper;

import com.hnu.ccdm.entity.User;
import com.hnu.ccdm.entity.UserExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class userMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testQueryById() {
        User user = userMapper.selectByPrimaryKey("1");
        System.out.println(user);
        System.out.println("--------------------------");
    }

    @Test
    public void testQueryAll() {
        List<User> list = userMapper.selectByExample(new UserExample());
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUserAccount("2");
        user.setUserAge(100);
        System.out.println(userMapper.insert(user));
    }
}
