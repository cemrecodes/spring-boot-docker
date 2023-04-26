package com.example.demo.service;

import java.util.Iterator;
import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo.api.model.User;


@Service
public class UserService {

	private int starterId = 1;
	private List<User> userList;
	
	public UserService(List<User> userList) {
		this.userList = userList;
	}

	public User getUser(Integer userId) {
		for(User user: userList) {
			if( userId == user.getId()) {
				return user;
			}
		}
		return null;
	}


	public List<User> getAllUsers() {
		return userList;
	}

	public User saveOneUser(User newUser) {
		newUser.setId(starterId);
		starterId += 1;
		userList.add(newUser);
		return newUser;
	}

	public User updateUser(Integer userId, User newUser) {
	    for (User user : userList) {
	        if (user.getId() == userId ) {
	            user.setName(newUser.getName());
	            user.setAge(newUser.getAge());
	            user.setEmail(newUser.getEmail());
	            return user;
	        }
	    }
	    return null; 
	}


	public boolean deleteById(Integer userId) {
	    Iterator<User> iterator = userList.iterator();
	    while (iterator.hasNext()) {
	        User user = iterator.next();
	        if (user.getId() == userId ) {
	            iterator.remove();
	            return true;
	        }
	    }
	    return false;
	}

}
