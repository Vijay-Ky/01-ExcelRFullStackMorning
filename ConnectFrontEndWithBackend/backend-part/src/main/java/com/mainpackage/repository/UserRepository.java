package com.mainpackage.repository;

import com.mainpackage.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
}
