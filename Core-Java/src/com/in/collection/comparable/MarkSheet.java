package com.in.collection.comparable;

public class MarkSheet implements Comparable<MarkSheet> {
//this is comprable 
	int rollNo;
	String name;
	int physics;

	public MarkSheet(int rollNo, int Physics, String name) {
		this.physics = Physics;
		this.name = name;
		this.rollNo = rollNo;
	}

	/**
	 *
	 */
	@Override
	public int compareTo(MarkSheet o) {

		/**
		 * for int value comparsion we use - for String value comparsion we use
		 * compareto() meethod
		 *
		 */

		/*
		 * if(this.name.equals(o.name)) {
		 * 
		 * return this.rollNo - o.rollNo;
		 * 
		 * }else { return this.name.compareTo(o.name); }
		 */

		/*
		 * if(this.physics== o.physics) { return this.rollNo - o.rollNo; }
		 * ed}/'''''else { return
		 * this.physics - o.physics; }
		 * 
		 * 
		 * 
		 */
		// return this.rollNo - o.rollNo;//it is acceding
		// return o.rollNo - this.rollNo;//it id deceding

		if (this.rollNo > o.rollNo) {
			return 1;

		} else if (this.rollNo == o.rollNo) {
			return 0;
		} else {
			return -1;
		}

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name: " + name + " rollNo: " + rollNo + " phy: " + physics;
	}
}
