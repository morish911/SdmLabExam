package com.player;

public class BasketBall extends Player {
private int points;
	public BasketBall() {
		// TODO Auto-generated constructor stub
	}
	public BasketBall(String name, int age, int points) {
		super(name, age);
		this.points = points;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}

	

}
