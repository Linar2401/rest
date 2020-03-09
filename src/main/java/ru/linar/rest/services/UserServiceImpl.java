package ru.linar.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.linar.rest.dto.UserRegDto;
import ru.linar.rest.model.User;
import ru.linar.rest.repositories.UsersRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UsersRepository repository;

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
        return repository.getOne(userID);
    }

    @Override
    public List<User> getAllUser() {
        return repository.findAll();
    }

}
