package com.selisegroup.controllers;


import com.selisegroup.model.UserModel;
import com.selisegroup.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
	
	
	private final UserService userService;
	
	public RegisterController(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<?> saveUser(@RequestBody UserModel userModel) throws Exception {
		return ResponseEntity.ok(userService.saveUser(userModel));
	}
}
