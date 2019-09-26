package main.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.java.dao.UserDao;

/**
 * @author Luc Runge
 *
 */

@RestController
@CrossOrigin
@RequestMapping(path = "/users")
public class UserController {
	@Autowired
	private UserDao userDao;

	@GetMapping(path = "/", produces = "application/json")
	public String getEmployees() {
		return "hellooo!";
	}
}