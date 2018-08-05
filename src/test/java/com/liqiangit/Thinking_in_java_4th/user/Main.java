package com.liqiangit.Thinking_in_java_4th.user;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
//获取泛型类型
public class Main {
public static void main(String[] args) {
	User user=new User();
	System.out.println(user.getClass());
	Type[] types=user.getClass().getGenericInterfaces();
	for (int i = 0; i < types.length; i++) {
		Type type=types[i];
//		System.out.println(type.getClass().getName());
		if(type instanceof ParameterizedType){
			ParameterizedType p=(ParameterizedType) type;
//			System.out.println(p.getActualTypeArguments()[0]);
			Type type2=p.getActualTypeArguments()[0];
			if(type2 instanceof Class){
				Class class1=(Class) type2;
				System.out.println(class1.getName());
			}
		}
	}
}
}
