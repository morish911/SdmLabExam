package com.player;

public class Player {
private String name;
private int age;
public Player()
{
	System.out.println("player()");
}
public Player(String name, int age) {
	System.out.println("Player(String, int)");
	this.name = name;
	this.age = age;
}

public Player(int age, String name) {
	System.out.println("Player(int, String)");
	this.name = name;
	this.age = age;
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
public  void printinfo()
{
	System.out.println("Name: " + name);
	System.out.println("Age: " + age);

}

}
