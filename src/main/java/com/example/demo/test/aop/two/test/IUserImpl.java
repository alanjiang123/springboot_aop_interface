package com.example.demo.test.aop.two.test;

import java.util.HashMap;
import java.util.Map;

public class IUserImpl implements IUser {

	public static Map map;

	public static void init() {
		String[] list = { "Lucy", "Tom", "С��", "Smith", "Hello" };
		Map tmp = new HashMap();
		for (int i = 0; i < list.length; i++) {
			tmp.put(list[i], list[i] + "00");
		}
		map = tmp;
	}

	@Override
	public String findUser(String username) {
		init();
		String password = "û�鵽���û�";
		if (map.containsKey(username)) {
			password = map.get(username).toString();
		}
		System.out.println("-----------------��findUser��-----------------");
		System.out.println("-----------------Username:" + username + "-----------------");
		System.out.println("-----------------��Result��:" + password + "------------------");
		return password;
	}

	@Override
	public void addUser(String username) {
		// TODO Auto-generated method stub
		init();
		map.put(username, username + "11");
		System.out.println("--------------��addUser��: " + username + " --------------");
	}

	@Override
	public void findAll() {
		init();
		System.out.println("---------------��findAll��: " + map + " ------------------");
	}

}
