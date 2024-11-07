package com.spring.myBatis.mappers;


import com.spring.myBatis.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    User getUserById(int id);

    List<User> getAllUsers();

    void createUser(User user);

    void updateUser(User user);

    List<User> getUsersBwYearRange(Map<String,String > yearRange);



    /* Annotation based */

   /* @Select("SELECT * FROM users")
    List<User> getAllUsers();

    @Select("SELECT * FROM users WHERE id = #{id}")
    User getUserById(int id);

    @Insert("INSERT INTO users (name, email, dob) VALUES (#{name}, #{email}, #{dob})")
    void createUser(User user);*/

}
