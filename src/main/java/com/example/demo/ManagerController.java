package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ManagerController {
	@Autowired
	ManagerService ms;
@PostMapping(value="/add")
	
	public String addInfo(@RequestBody ManagerEntity me) {
		return ms.addInfo(me);
	

}
}
