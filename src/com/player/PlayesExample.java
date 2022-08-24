package com.player;

public class PlayesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			CricketPlayer cp=new CricketPlayer("dhoni",35,100);
			SoccerPlayer sp=new SoccerPlayer();
			cp.printinfo();
		//	cp.setName("dohni");
		//	cp.setAge(35);
		//	cp.setRun(150);
			BasketBall bb=new BasketBall("tony",40,200);
			Kabaddi kb=new Kabaddi("Ajay",27,10);
		//	sp.setName("messi");
		//	sp.setAge(34);
			//sp.setGoals(106);
	//System.out.println(cp.getAge());
	System.out.println(bb.getName()+", "+bb.getAge()+", "+bb.getPoints());
	//System.out.println(kb.getPoints());
	}

}
