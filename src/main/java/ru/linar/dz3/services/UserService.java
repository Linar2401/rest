package ru.linar.dz3.services;


import ru.linar.dz3.dto.UserRegDto;
import ru.linar.dz3.models.User;

import java.util.List;

public interface UserService {
    public User signUp(UserRegDto form);
    public User getUser(Long userID);
    public List<User> getAllUser();
}
