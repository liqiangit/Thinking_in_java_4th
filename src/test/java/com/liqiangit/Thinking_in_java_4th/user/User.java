package com.liqiangit.Thinking_in_java_4th.user;

public class User implements IUser<String> {

	public String changes(String t) {
		return "hello"+t;
	}

}
