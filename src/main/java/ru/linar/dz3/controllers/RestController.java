package ru.linar.dz3.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.linar.dz3.dto.ResponseUserDto;
import ru.linar.dz3.dto.ResponseUsersDto;
import ru.linar.dz3.dto.UserRegDto;
import ru.linar.dz3.services.UserService;

import java.util.Calendar;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {
    @Autowired
    private UserService userService;

    @RequestMapping(
            method = RequestMethod.POST,
            value = "/users/reg"
    )
    public ResponseUserDto addUser(@RequestBody UserRegDto data){
        System.out.println("POST Request");
        return ResponseUserDto.builder().data(userService.signUp(data)).build();
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/users/{user-id}"
    )
    public  ResponseUserDto getUser(@PathVariable("user-id") Long userId){
        return ResponseUserDto.builder().data(userService.getUser(userId)).build();
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/users"
    )
    @ResponseBody
    public ResponseUsersDto getUsers(){
        return ResponseUsersDto.builder().data(userService.getAllUser()).build();
    }
}
