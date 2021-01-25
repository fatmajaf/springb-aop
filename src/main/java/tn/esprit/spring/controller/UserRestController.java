package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.User;
import tn.esprit.spring.service.UserService;

@RestController
public class UserRestController {

	@Autowired
	UserService service;

	// http://localhost:8081/SpringMVC/servlet/retrieve-all-users
	@GetMapping("/retrieve-all-users")
	@ResponseBody
	public List<User> getUsers() {
		List<User> list = service.retrieveAllUsers();
		return list;
	}

	// http://localhost:8081/SpringMVC/servlet/get-user/{user-id}
	@GetMapping("/retrieve-user/{user-id}")
	@ResponseBody
	public User getEmployee(@PathVariable("user-id") String userId) {
		return service.retrieveUser(userId);
	}

	// Ajouter User : http://localhost:8081/SpringMVC/servlet/add-user
	@PostMapping("/add-user")
	@ResponseBody
	public User addUser(@RequestBody User u) {
		User user = service.addUser(u);
		return user;
	}

	// http://localhost:8081/SpringMVC/servlet/removeuser/{user-id}
	@DeleteMapping("/delete-user/{user-id}")
	@ResponseBody
	public void deleteEmployee(@PathVariable("user-id") String userId) {
		service.deleteUser(userId);
	}

	// http://localhost:8081/SpringMVC/servlet/modify-user
	@PutMapping("/modify-user")
	@ResponseBody
	public User updateEmployee(@RequestBody User user) {
		return service.updateUser(user);
	}

}
