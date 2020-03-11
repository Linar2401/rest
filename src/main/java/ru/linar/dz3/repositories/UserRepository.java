package ru.linar.dz3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.linar.dz3.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    public User getById(Long id);
}
