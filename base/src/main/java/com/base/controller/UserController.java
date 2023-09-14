package com.base.controller;

import com.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class UserController {

    @Autowired
    private UserService  userService;

    //save or create/add User Data
    @PostMapping("/add")
    public User addData(@RequestBody User user){
        return userService.addData(user);
    }
    //get all data from databse
    public List<User>readAllData(){
        return userService.getAllData();
    }
    //get data ById

    //Update Data By Id;

    //Delete Data By Id;
}
