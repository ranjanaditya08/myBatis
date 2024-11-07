package com.spring.myBatis.service;

import com.spring.myBatis.entity.User;
import com.spring.myBatis.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    public User getUserById(int userId) {
        return userMapper.getUserById(userId);
    }

    public void createUser(User user) {
        userMapper.createUser(user);
    }

    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    public List<User> getUsersBwYearRange(String startYear, String endYear){
        Map<String,String> yearRange = new HashMap<>();
        yearRange.put("startYear", startYear);
        yearRange.put("endYear", endYear);

        return userMapper.getUsersBwYearRange(yearRange);
    }
}
