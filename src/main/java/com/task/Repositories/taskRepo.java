package com.task.Repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.task.Models.*;

@Repository
public interface taskRepo extends JpaRepository<Tasks,Integer> {

	@Modifying
	@Query(value = "UPDATE tasks SET status=:status WHERE id=:id",nativeQuery = true)
	void setStatus(@Param("id") int id,@Param("status") String status);
	
	@Query(value = "SELECT * FROM tasks WHERE assigned_to=:assigned_to",nativeQuery = true)
	List<Tasks> findAllTask(@Param("assigned_to") String assigned_to);
	
	@Modifying
	@Query(value = "UPDATE tasks SET title=:title,description=:description,status=:status,assigned_to=:assigned_to,due_date=:due_date WHERE id=:id",nativeQuery = true)
	void editTask(@Param("id") int id,@Param("title") String title,@Param("description") String description,@Param("status") String status,@Param("assigned_to") String assigned_to,@Param("due_date") LocalDate due_date);
}
