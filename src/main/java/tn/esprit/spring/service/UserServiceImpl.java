package tn.esprit.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.User;
import tn.esprit.spring.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository repository;

	@Override
	public List<User> retrieveAllUsers() {
		List<User> users = new ArrayList<User>();
		repository.findAll().forEach(users::add);
		return users;		
	}

	@Override
	public User addUser(User u) {		
		return repository.save(u);
	}

	@Override
	public void deleteUser(String id) {
		repository.deleteById(Long.getLong(id));
		
	}

	@Override
	public User updateUser(User u) {		
		return repository.save(u);
	}

	@Override
	public User retrieveUser(String id) {
		return repository.findById(Long.getLong(id)).get();
	}
	

}
