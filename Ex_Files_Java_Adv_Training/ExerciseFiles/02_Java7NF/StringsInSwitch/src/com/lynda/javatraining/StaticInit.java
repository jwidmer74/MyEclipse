package com.lynda.javatraining;
import java.util.ArrayList;

import com.lynda.olivepress.olives.Olive;
import com.lynda.olivepress.olives.OliveJar;
public class StaticInit {

	public static void main(String[] args) {
		System.out.println("Starting the app");
		ArrayList<Olive> olives = OliveJar.olives;
		for (Olive o:olives) {
			System.out.println("Its a " + o.oliveName + " olive!");
		}

	}

}
