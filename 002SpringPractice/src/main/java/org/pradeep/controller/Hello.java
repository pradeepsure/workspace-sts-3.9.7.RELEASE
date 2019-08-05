package org.pradeep.controller;

import org.pradeep.service.Cal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello
{
	@Autowired
	Cal cal;
	
	@GetMapping("/hi")
	public int hello()
	{
		return cal.add(20,78);
	}
}
