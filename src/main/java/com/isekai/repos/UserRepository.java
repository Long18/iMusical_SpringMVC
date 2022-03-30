package com.isekai.repos;

import org.springframework.data.repository.CrudRepository;

import com.isekai.models.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
