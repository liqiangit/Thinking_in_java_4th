package com.liqiangit.Thinking_in_java_4th.dao;

public class Person {
	public Person(){
		System.out.println(1);
	}
	static{
		System.out.println(3);
	}
	{
		System.out.println(2);
	}
    private String nameString = "233";
 
    public String getNameString() {
        return nameString;
    }
 
    public void setNameString(String nameString) {
        this.nameString = nameString;
    }
 
    @Override
    public String toString() {
        return "Person [nameString=" + nameString + "]";
    }
     
}