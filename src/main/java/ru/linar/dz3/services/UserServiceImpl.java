package ru.linar.dz3.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.linar.dz3.dto.UserRegDto;
import ru.linar.dz3.models.User;
import ru.linar.dz3.repositories.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public User signUp(UserRegDto form) {
        User user = User.builder()
                .email(form.getEmail())
                .country(form.getCountry())
                .gender(form.isGender())
                .password(form.getPassword())
                .build();
        repository.save(user);
        return user;
    }

    @Override
    public User getUser(Long userID) {
        return repository.getById(userID);
    }

    @Override
    public List<User> getAllUser() {
        return repository.findAll();
    }

}
