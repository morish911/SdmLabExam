package com.swimmer;

public class Swimmer {
private String name;
private String style;
private float  speed;
	public Swimmer() {
		// TODO Auto-generated constructor stub
	}
	public Swimmer(String name, String style, float speed) {
		
		this.name = name;
		this.style = style;
		this.speed = speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public void print()
	{
		System.out.println(name+" ,"+style+","+speed);
	}

}
