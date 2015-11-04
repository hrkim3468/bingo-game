package kr.or.javacafe.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kr.or.javacafe.core.common.manager.QueueManager;


@RestController
@RequestMapping("api/")
public class ApiController {

	
	@Autowired
	private QueueManager queueManager;
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	String getCustomer(@PathVariable Integer id) {
		queueManager.send("Hello World");
		return "OK";
	}
}
