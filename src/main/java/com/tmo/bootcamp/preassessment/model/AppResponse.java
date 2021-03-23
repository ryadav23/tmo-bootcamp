package com.tmo.bootcamp.preassessment.model;

public class AppResponse {
	private int sum;

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "AddTenResponse [sum=" + sum + "]";
	}
	
	
}
