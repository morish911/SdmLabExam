package com.player;

public class CricketPlayer extends Player {
private int run;
public  CricketPlayer()
{
	//super();
	run=50;
	System.out.println("cricket player()");
	
}
public CricketPlayer(String name, int age,int run)
{   super(name,age); 
	this.run=run;
	
}
public int getRun() {
	return run;
}

public void setRun(int run) {
	this.run = run;
}

public void printinfo()
{
	super.printinfo();
	System.out.println("RUNS "+run);
}
}
