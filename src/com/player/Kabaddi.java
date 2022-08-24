package com.player;

public class Kabaddi extends Player {
private int points;

public Kabaddi() {
	super();
	// TODO Auto-generated constructor stub
}

public Kabaddi(String name, int age, int points) {
	super(name, age);
	this.points = points;
}

public Kabaddi(int age, String name, int points) {
	super(age, name);
	this.points = points;
}

public int getPoints() {
	return points;
}

public void setPoints(int points) {
	this.points = points;
}



}
