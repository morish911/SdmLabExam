package com.player;

public class SoccerPlayer extends Player {
private int goals;
public  SoccerPlayer()
{
	
}
public SoccerPlayer(String name, int age,int goals)
{super(name,age); 
	this.goals=goals;
}
public int getGoals() {
	return goals;
}

public void setGoals(int goals) {
	this.goals = goals;
}

}
