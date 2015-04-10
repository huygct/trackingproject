package com.springapp.mvc.repository;

import com.springapp.mvc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByEmailAndPassword(String email, String password);

}
