package com.car;

public class CarShowroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car simplecar=new Car();//without music system
		Engine premiumeEngin=new Engine("Diesel","3000cc");
		MusicSystem richSystem=new	MusicSystem("Sony","Dolby with woofer");
		Car premiumCar= new Car("HONDA","CITY",richSystem,premiumeEngin);
		System.out.println(simplecar.getMake());
		System.out.println(premiumCar.getMake());
		Engine simpleEngine=simplecar.getEngintype();
		
		String Fule=simpleEngine.getFuletype();
		System.out.println("FULE "+Fule);
		
		
		
		
		Fule=premiumCar.getEngintype().getFuletype();
		System.out.println(Fule);
		
		
		
	//music system
		MusicSystem music=simplecar.getMusicsys();
	if(music!=null)
	{
		String sound =music.getMake();
		System.out.println(sound);
	}
	else
		System.out.println("there is no system in car");
	}

}
