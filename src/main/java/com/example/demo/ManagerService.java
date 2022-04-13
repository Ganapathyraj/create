package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {
	@Autowired
	ManagerDao md;

	public String addInfo(ManagerEntity me) {
		// TODO Auto-generated method stub
		return md.addInfo(me);
	}

}
