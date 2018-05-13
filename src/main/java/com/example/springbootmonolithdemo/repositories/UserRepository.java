package com.example.springbootmonolithdemo.repositories;

import com.example.springbootmonolithdemo.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}