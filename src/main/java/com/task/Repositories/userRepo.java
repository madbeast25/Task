package com.task.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.task.Models.User;

@Repository
public interface userRepo extends JpaRepository<User,Integer> {
   
	@Query(value = "UPDATE users SET mail=:email,username=:name,password=:password WHERE u_id=:u_id ",nativeQuery = true)
	@Modifying
	public void updateUser(@Param("email") String email,@Param("name") String name,@Param("password") String password,@Param("u_id") int u_id);
	public boolean existsByEmail(String userEmail);
	User findByEmail(String userMail);
	boolean existsByEmailAndIdNot(String newEmail,int u_id);
	
}
