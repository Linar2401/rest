package ru.linar.rest.services;


import ru.linar.rest.dto.UserRegDto;
import ru.linar.rest.model.User;

import java.util.List;

public interface UserService {
    public User signUp(UserRegDto form);
    public User getUser(Long userID);
    public List<User> getAllUser();
}
