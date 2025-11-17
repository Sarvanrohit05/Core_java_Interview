package com.in.collection;

public class EqualHashCode {

	int id;
	String name;
	int sallery;

	public EqualHashCode(int id, String name, int sallery) {
		this.id = id;
		this.name = name;
		this.sallery = sallery;

	}
	@Override
	public int hashCode() {
		System.out.println("Hashcode run ");
		System.out.println();
		String s = this.id + this.name + this.sallery;
		return s.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		System.out.println("equals wokrs");
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof EqualHashCode)) {  
			return false;
		}

		EqualHashCode e = (EqualHashCode) obj;
              String s=  this.id + this.name+ this.sallery;
              String s2= e.id+e.name+e.sallery;
	     System.out.println("equals returns " + s.equals(s2));
	     return s.equals(s2);
	}

	
	@Override
	public String toString() {
		String s = this.id + " " + this.name + " " + this.sallery;
		return s;
	}

}
