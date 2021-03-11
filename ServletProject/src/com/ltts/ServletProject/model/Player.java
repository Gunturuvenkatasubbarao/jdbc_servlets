package com.ltts.ServletProject.model;

import java.sql.Date;

public class Player {
	private int Player_id;
	private String Player_Name;
	private String Skill;
	private String country;
	private Date DOB;
	private int Age;
	private int Matches;
	private int Runs;
	private int Wickets;
	private String Batting_Style;
	private String Bowling_Style;
	public Player(int player_id, String player_Name, String skill, String country, Date dOB, int age, int matches,
			int runs, int wickets, String batting_Style, String bowling_Style) {
		super();
		Player_id = player_id;
		Player_Name = player_Name;
		Skill = skill;
		this.country = country;
		DOB = dOB;
		Age = age;
		Matches = matches;
		Runs = runs;
		Wickets = wickets;
		Batting_Style = batting_Style;
		Bowling_Style = bowling_Style;
	}
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getPlayer_id() {
		return Player_id;
	}
	public void setPlayer_id(int player_id) {
		Player_id = player_id;
	}
	public String getPlayer_Name() {
		return Player_Name;
	}
	public void setPlayer_Name(String player_Name) {
		Player_Name = player_Name;
	}
	public String getSkill() {
		return Skill;
	}
	public void setSkill(String skill) {
		Skill = skill;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getMatches() {
		return Matches;
	}
	public void setMatches(int matches) {
		Matches = matches;
	}
	public int getRuns() {
		return Runs;
	}
	public void setRuns(int runs) {
		Runs = runs;
	}
	public int getWickets() {
		return Wickets;
	}
	public void setWickets(int wickets) {
		Wickets = wickets;
	}
	public String getBatting_Style() {
		return Batting_Style;
	}
	public void setBatting_Style(String batting_Style) {
		Batting_Style = batting_Style;
	}
	public String getBowling_Style() {
		return Bowling_Style;
	}
	public void setBowling_Style(String bowling_Style) {
		Bowling_Style = bowling_Style;
	}

	@Override
	public String toString() {
		return "Player [Player_id=" + Player_id + ", Player_Name=" + Player_Name + ", Skill=" + Skill + ", country="
				+ country + ", DOB=" + DOB + ", Age=" + Age + ", Matches=" + Matches + ", Runs=" + Runs + ", Wickets="
				+ Wickets + ", Batting_Style=" + Batting_Style + ", Bowling_Style=" + Bowling_Style + "]";
	}
	
	

}
