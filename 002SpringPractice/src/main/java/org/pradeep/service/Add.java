package org.pradeep.service;

import org.springframework.stereotype.Service;

@Service
public class Add implements Cal
{
	@Override
	public int add(int a,int b)
	{
		return a+b;
	}
}
