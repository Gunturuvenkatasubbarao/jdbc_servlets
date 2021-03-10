package com.ltts.ServletProject.model;

import java.sql.Date;

public class Player {
	private int Player_id;
	private String Player_Name;
	private String Skill;
	private String country;
	private Date DOB;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Player_id=" + Player_id + ", Player_Name=" + Player_Name + ", Skill=" + Skill + ", country="
				+ country + ", DOB=" + DOB ;
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
	public Player(int player_id, String player_Name, String skill, String country, Date dOB) {
		super();
		Player_id = player_id;
		Player_Name = player_Name;
		Skill = skill;
		this.country = country;
		DOB = dOB;
	}
	
	

}
