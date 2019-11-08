package com.cloud.client.controller;


import com.cloud.client.UserFeignClient;
import com.cloud.client.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        User user = this.userFeignClient.findById(id);
        return user;
    }


    @GetMapping("/test")
    public User testfindById(@PathVariable Long id) {
        User findOne = new User();

            findOne.setAge(1);
            findOne.setName("test_client");
            findOne.setUsername("2333");
            findOne.setId(888L);
            findOne.setBalance(1024D);
        return findOne;
    }

}


