package com.car;

public class Engine {
	private String fuletype;
	private String power;
		
	public Engine(String fuletype, String power) {
		super();
		this.fuletype = fuletype;
		this.power = power;
	}

	public Engine() {
		// TODO Auto-generated constructor stub
		fuletype="petrol";
				power="1200CC";
	}

	public String getFuletype() {
		return fuletype;
	}

	public void setFuletype(String fuletype) {
		this.fuletype = fuletype;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

}
