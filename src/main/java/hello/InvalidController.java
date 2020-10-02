package hello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class InvalidController {

	@GetMapping("/testAPI")
	public String fail() {
		return "data";
	}

}
