package com.lynda.olivepress.olives;

import java.util.ArrayList;

public class OliveJar {
	public static ArrayList<Olive> olives;
	static {
		olives = new ArrayList<>();
		olives.add(new Olive("Kalamata", 0X000000));
		olives.add(new Olive("Picholine", 0X00FF00));
		olives.add(new Olive("Kalamata", 0X000000));
	}
	

}
