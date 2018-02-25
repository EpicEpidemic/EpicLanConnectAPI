package com.epicepidemic.lanconnectapi.repository;

import com.epicepidemic.lanconnectapi.dao.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long>{
}
