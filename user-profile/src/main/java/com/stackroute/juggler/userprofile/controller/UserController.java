package com.stackroute.juggler.userprofile.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
<<<<<<< HEAD

=======
>>>>>>> 63ce83ece91d925925a048a33402f1329815819d
import com.stackroute.juggler.userprofile.domain.User;
import com.stackroute.juggler.userprofile.service.UserService;

@RestController
public class UserController {
<<<<<<< HEAD
	
UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
	this.userService=userService;
		
	}
	@RequestMapping(value = "/user/save", method = RequestMethod.POST)
	public ResponseEntity<?> saveUser(@RequestBody User user)  {
			User userobj=null;
			userobj=userService.saveUser(user);
			return new ResponseEntity<User>(userobj, HttpStatus.OK);
		}
	@RequestMapping(value = "/user/{userid}", method = RequestMethod.GET)
	public ResponseEntity<User> viewuser(@PathVariable int userid ){
		User userobj=userService.viewUser(userid);
		
        return new ResponseEntity<User>( userobj,HttpStatus.OK);
	}
	

=======

	UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;

	}

	@RequestMapping(value = "/user/save", method = RequestMethod.POST)
	public ResponseEntity<?> saveUser(@RequestBody User user) {
		User userobj = null;
		userobj = userService.saveUser(user);
		return new ResponseEntity<User>(userobj, HttpStatus.OK);
	}

	@RequestMapping(value = "/user/{userid}", method = RequestMethod.GET)
	public ResponseEntity<User> viewuser(@PathVariable int userid) {
		User userobj = userService.viewUser(userid);
		return new ResponseEntity<User>(userobj, HttpStatus.OK);
	}

	@RequestMapping(value = "/user/{userid}", method = RequestMethod.PUT)
	public ResponseEntity<User> updateuser(@PathVariable int userid,@RequestBody User user) {
		User userobj = userService.updateUser(userid,user);
		return new ResponseEntity<User>(userobj, HttpStatus.OK);

	}
>>>>>>> 63ce83ece91d925925a048a33402f1329815819d
}
