package com.comaymanagement.cmd.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.comaymanagement.cmd.entity.User;

@Repository
public class UserRepository {
	

	public List<User> findAll(){
		List<User> users = new ArrayList<User>();
		User u1 = new User("Congtoan1", 12);
		User u2 = new User("Congtoan2", 13);
		User u3 = new User("Congtoan3", 14);
		User u4 = new User("Congtoan4", 15);
		
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		
		return users;
	}
}
