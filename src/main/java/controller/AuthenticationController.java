package main.java.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Luc Runge
 *
 */

@RestController
@CrossOrigin
@RequestMapping(path = "/auth")
public class AuthenticationController {

	@GetMapping(path = "/", produces = "application/json")
	public String succes() {
		return "You are authenticated";
	}
}
