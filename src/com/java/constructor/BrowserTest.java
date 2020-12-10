package com.java.constructor;

import java.util.ArrayList;

public class BrowserTest {

	public static void main(String[] args) {
		Browser br = new Browser("Chrome", "Google");
		System.out.println(br.getBrowserName() + "  " + br.getVendorName());
		
		System.out.println("--------------------------------------");
		
		Browser br1 = new Browser("Firefox", "Mozilla", "69.0.1");
		System.out.println(br1.getBrowserName() + "  " + br1.getVendorName() + "  " + br1.getCurrentVersion());
		
		System.out.println("--------------------------------------");
		
		ArrayList<String> extensions = new ArrayList<String>();	
		extensions.add("Block and Focus");
		extensions.add("Pocket");
		extensions.add("Noisli");
		extensions.add("Wolfram Alpha");

		Browser br2 = new Browser("Chrome", "Google", "85.0.4183.121", extensions);
		System.out.println(br2.getBrowserName() + "  " + br2.getVendorName() + "  " + br2.getCurrentVersion() + " "
				+ br2.getPlugins().get(3));

	}

}
