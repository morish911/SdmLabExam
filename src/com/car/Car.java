package com.car;

public class Car {
private String make;
private String model;
private MusicSystem musicsys;
private Engine engintype;

	public Car() {
	make="maruti";
	model="OMNI";
	engintype=new Engine()	;
	
}

	public Car(String make, String model, MusicSystem musicsys, Engine engintype) {
		
		this.make = make;
		this.model = model;
		this.musicsys = musicsys;
		this.engintype = engintype;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public MusicSystem getMusicsys() {
		return musicsys;
	}

	public void setMusicsys(MusicSystem musicsys) {
		this.musicsys = musicsys;
	}

	public Engine getEngintype() {
		return engintype;
	}

	public void setEngintype(Engine engintype) {
		this.engintype = engintype;
	}

	

}
