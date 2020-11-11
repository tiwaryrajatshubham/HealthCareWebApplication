package com.cg.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.healthcare.entity.User;

/**
 * The UserRepository performs databas operations related to user.
 * 
 *
 * @author Tiwary Rajat Shubham(alias)
 * @version 1.0
 * @since 11/11/2020
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUsernameAndPassword(String username, String password);

	public User findByIdAndUsername(int id, String username);
}
