package com.car;

public class MusicSystem {
private String make;
private String soundeffect;
	public MusicSystem() {
		// TODO Auto-generated constructor stub
	make="panasonic";
	soundeffect="HIGH";
	}
	public MusicSystem(String make, String soundeffect) {
		super();
		this.make = make;
		this.soundeffect = soundeffect;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getSoundeffect() {
		return soundeffect;
	}
	public void setSoundeffect(String soundeffect) {
		this.soundeffect = soundeffect;
	}

}
