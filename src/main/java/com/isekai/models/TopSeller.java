package com.isekai.models;


public class TopSeller {
	private int id;
	private int sum;
	
	public TopSeller(int id, int sum) {
		super();
		this.id = id;
		this.sum = sum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
}
