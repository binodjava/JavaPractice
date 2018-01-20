package com.jlcindia.spring;

public class Workshop {
	String topic;
	double fee;
	int nos;

	public Workshop(String topic, double fee, int nos) {
		this.topic = topic;
		this.fee = fee;
		this.nos = nos;

	}

	@Override
	public String toString() {
		String msg = "JLC Anno...New Workshop";
		msg = msg + "\n topic" + topic;
		msg = msg + "\n fee" + fee;
		msg = msg + "\n No Of Seats" + nos;
		return msg;
	}

}
