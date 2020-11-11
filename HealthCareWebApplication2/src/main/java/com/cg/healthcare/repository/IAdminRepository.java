
package com.cg.healthcare.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.healthcare.entity.User;

/**
 * The IAdminRepository performs databas operations related to admin.
 * 
 *
 * @author Tiwary Rajat Shubham(alias)
 * @version 1.0
 * @since 11/11/2020
 */
@Repository
public interface IAdminRepository extends JpaRepository<User, Long> {

}