package com.jhenrique.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhenrique.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}

