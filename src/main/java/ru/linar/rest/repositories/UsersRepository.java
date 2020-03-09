package ru.linar.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.linar.rest.model.User;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<User, Long> {
    List<User> findByEmail(String email);
}
