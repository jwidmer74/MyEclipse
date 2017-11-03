package com.lynda.javatraining;


import com.lynda.olivepress.olives.OliveJar;

public class MemberClasses {

	public static void main(String[] args) throws Exception {

		OliveJar jar = new OliveJar(3, "Kalamata", 0x000000);
		jar.addOlive("Kalamata", 0x000000);
		jar.addOlive("Kalamata", 0x000000);
		jar.addOlive("Kalamata", 0x000000);
		jar.addOlive("Kalamata", 0x000000);
		jar.reportOlives();
		}
	}
	

	