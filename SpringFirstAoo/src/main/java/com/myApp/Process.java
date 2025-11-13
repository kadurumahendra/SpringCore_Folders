package com.myApp;

public class Process {
	private Information info;

	public Process() {
		super();
	}

	public Information getInfo() {
		return info;
	}

	public void setInfo(Information info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Process [info=" + info + "]";
	}
	

}
