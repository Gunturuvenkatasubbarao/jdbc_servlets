package com.ltts.ServletProject.model;

public class Auction {
	private int Auction_id;
	private int Player_id;
	private int Team_id;
	private int Year;
	public Auction() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Auction [Auction_id=" + Auction_id + ", Player_id=" + Player_id + ", Team_id=" + Team_id + ", Year="
				+ Year + ", Amount=" + Amount + "]";
	}
	public Auction(int auction_id, int player_id, int team_id, int year, int amount) {
		super();
		Auction_id = auction_id;
		Player_id = player_id;
		Team_id = team_id;
		Year = year;
		Amount = amount;
	}
	public int getAuction_id() {
		return Auction_id;
	}
	public void setAuction_id(int auction_id) {
		Auction_id = auction_id;
	}
	public int getPlayer_id() {
		return Player_id;
	}
	public void setPlayer_id(int player_id) {
		Player_id = player_id;
	}
	public int getTeam_id() {
		return Team_id;
	}
	public void setTeam_id(int team_id) {
		Team_id = team_id;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	private int Amount;

}
