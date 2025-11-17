package com.in.oop.DeepCloning;

import com.in.oops.Account;

public class Coustmer implements Cloneable {

	public String name;

	public Accounts number;

	public Coustmer(String name) {
		this.name = name;

		number = new Accounts(100);
	}

	// OverRIDE

	protected Object clone() throws CloneNotSupportedException {
		Coustmer c = (Coustmer) super.clone();
		c.number=(Accounts)number.clone();

		return c;
	}

}
