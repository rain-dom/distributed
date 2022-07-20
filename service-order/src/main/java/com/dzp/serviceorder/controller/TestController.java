package com.dzp.serviceorder.controller;

import com.dzp.serviceorder.dao.UserDao;
import com.dzp.serviceorder.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class TestController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/test")
    public String test() {
        return "ok";
    }

    @GetMapping("/{id}")
    public User test(@PathVariable(value = "id") int id){
        User user = userDao.selectByPrimaryKey(id);
        return user;
    }
}
