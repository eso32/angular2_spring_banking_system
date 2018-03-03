package com.goliatbank.bank.Dao;

import com.goliatbank.bank.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Long >{
    User findByUsername(String username);
    User findByEmail(String emial);
}
