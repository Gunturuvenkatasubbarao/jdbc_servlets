package com.ltts.ServletProject.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.ServletProject.configure.MyConnection;
import com.ltts.ServletProject.model.Player;

public class PlayerDao {
	
	public List<Player> getAllPlayers() throws Exception{
		List<Player> li=new ArrayList<Player>();
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=mc.createStatement();
		ResultSet rs=ps.executeQuery("select * from player");
		//Player p=new Player();
		while(rs.next()) {
			li.add(new Player(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11)));
			
		}
		return li;
		
	}
	public Player getPlayerById(int id) throws Exception {
		Player p=new Player();
		List<Player> li=getAllPlayers();
		for(Player p1:li) {
			if(p1.getPlayer_id() == id) {
				p.setPlayer_id(id);
				p.setPlayer_Name(p1.getPlayer_Name());
				p.setSkill(p1.getSkill());
				p.setCountry(p1.getCountry());
				p.setDOB(p1.getDOB());
				p.setAge(p1.getAge());
				p.setMatches(p1.getMatches());
				p.setRuns(p1.getRuns());
				p.setWickets(p1.getWickets());
				p.setBatting_Style(p1.getBatting_Style());
				p.setBowling_Style(p1.getBowling_Style());
			}
		}
		
		return p;
	}

	
	public boolean insertPlayer(Player p) throws Exception {
		//fill your code
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into player values(?,?,?,?,?,?,?,?,?,?,?)");
		ps.setInt(1, p.getPlayer_id());
		ps.setString(2, p.getPlayer_Name());
		ps.setString(3, p.getSkill());
		ps.setString(4,p.getCountry());
		ps.setDate(5, p.getDOB());
		ps.setInt(6,p.getAge());
		ps.setInt(7,p.getMatches());
		ps.setInt(8,p.getRuns());
		ps.setInt(9,p.getWickets());
		ps.setString(10,p.getBatting_Style());
		ps.setString(11,p.getBowling_Style());

		return ps.execute();
		//return false;

		
	}

}