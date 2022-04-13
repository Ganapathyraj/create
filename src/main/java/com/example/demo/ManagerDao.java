package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class ManagerDao {
	@Autowired
    ManagerRepo mr;
	public String addInfo(ManagerEntity me) {
		
		mr.save(me);
		return "data added successfully";

}
}