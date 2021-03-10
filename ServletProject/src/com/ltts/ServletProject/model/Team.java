package com.ltts.ServletProject.model;

public class Team {
	private int Team_id;
	private String Team_Name;
	private String Coach_Name;
	private String Owner_Name;
	private String Captain_Name;
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Team [Team_id=" + Team_id + ", Team_Name=" + Team_Name + ", Coach_Name=" + Coach_Name + ", Owner_Name="
				+ Owner_Name + ", Captain_Name=" + Captain_Name + "]";
	}
	public Team(int team_id, String team_Name, String coach_Name, String owner_Name, String captain_Name) {
		super();
		Team_id = team_id;
		Team_Name = team_Name;
		Coach_Name = coach_Name;
		Owner_Name = owner_Name;
		Captain_Name = captain_Name;
	}
	public int getTeam_id() {
		return Team_id;
	}
	public void setTeam_id(int team_id) {
		Team_id = team_id;
	}
	public String getTeam_Name() {
		return Team_Name;
	}
	public void setTeam_Name(String team_Name) {
		Team_Name = team_Name;
	}
	public String getCoach_Name() {
		return Coach_Name;
	}
	public void setCoach_Name(String coach_Name) {
		Coach_Name = coach_Name;
	}
	public String getOwner_Name() {
		return Owner_Name;
	}
	public void setOwner_Name(String owner_Name) {
		Owner_Name = owner_Name;
	}
	public String getCaptain_Name() {
		return Captain_Name;
	}
	public void setCaptain_Name(String captain_Name) {
		Captain_Name = captain_Name;
	}

}
