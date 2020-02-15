package workaholic.tools.docsholic.user.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import workaholic.tools.docsholic.user.domain.User;

@RestController
@RequestMapping("/user")
public class UserController {
	@GetMapping("")
	public ResponseEntity<User> getUser() {
		return new ResponseEntity<User>(new User(), HttpStatus.OK);
	}
}
