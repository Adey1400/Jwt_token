package com.example.JWT_TOKEN.User;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long>{
     Optional<User> findByUsername(String username);
}

//plain text-> hash 1->hash 2->plain text