package com.xworkz.event.custom;

public class Player {

	private String name;
	private String noOfGames;

	public Player(String name) {
		super();
		this.name = name;
	}

	public Player(String name, String noOfGames) {
		super();
		this.name = name;
		this.noOfGames = noOfGames;
	}

	public void displayDetails() {
		System.out.println("Name :" + this.name);
		System.out.println("No Of Games :" + this.noOfGames);
	}

}
