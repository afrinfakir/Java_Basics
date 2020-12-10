package com.session.practice;

public class ChromeDriver implements WebDriver {

	@Override
	public void prfindElement() {

		System.out.println("FE");
	}

	@Override
	public void prfindElements() {

		System.out.println("FEs");
	}

	@Override
	public void prurl() {
		System.out.println("URL");
	}

	@Override
	public void prgetTitle() {
		System.out.println("Title");
	}

	@Override
	public void prquit() {
		System.out.println("Quit");
	}

}
