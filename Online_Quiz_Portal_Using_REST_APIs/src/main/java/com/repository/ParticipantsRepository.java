package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.User;

@Repository
public interface ParticipantsRepository extends JpaRepository<User, Integer> {
	
	public User findByEmailid(String emailid);

}
