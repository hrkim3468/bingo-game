package kr.or.javacafe;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ApiController {
	
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	String getCustomer(@PathVariable Integer id) {
		return "hello world";
	}
	


	
}


















