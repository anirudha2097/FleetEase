package com.fleetease.backend.service;

import java.util.List;

import com.fleetease.backend.exceptions.UserException;
import com.fleetease.backend.model.User;

public interface UserService {

	public User addUser(User user) throws UserException;
	
	public User getUser(Integer userId) throws UserException;
	
	public String deleteUser(Integer userId) throws UserException;
	
	public User updateUser(Integer userId, User user) throws UserException;
	
	public List<User> getAllUser() throws UserException;
}
