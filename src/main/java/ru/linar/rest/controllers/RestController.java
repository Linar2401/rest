package ru.linar.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.linar.rest.dto.ResponseUserDto;
import ru.linar.rest.dto.ResponseUsersDto;
import ru.linar.rest.dto.UserRegDto;
import ru.linar.rest.services.UserService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {
    @Autowired
    private UserService userService;

    @RequestMapping(
            method = RequestMethod.POST,
            value = "/users"
    )
    public ResponseUserDto addUser(@RequestBody UserRegDto data){
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
