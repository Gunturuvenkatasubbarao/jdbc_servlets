package com.ltts.ServletProject.Dao;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.ServletProject.configure.MyConnection;
import com.ltts.ServletProject.model.Player;
import com.ltts.ServletProject.model.Team;

	public class TeamDao {
		public List<Team> getAllTeam() throws Exception{
			List<Team> li=new ArrayList<Team>();
			Connection mc=MyConnection.getConnection(); // TRanfers control to another 
			Statement ps=mc.createStatement();
			ResultSet rs=ps.executeQuery("select * from Team");
			//Player p=new Player();
			while(rs.next()) {
				li.add(new Team(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
				
			}
		
			return li;
		}
		public Team getTeamById(int id) throws Exception {
			Team t=new Team();
			List<Team> li=getAllTeam();
			for(Team t1:li) {
				if(t1.getTeam_id() == id) {
					t.setTeam_id(id);
					t.setTeam_Name(t1.getTeam_Name());
					t.setCoach_Name(t1.getCoach_Name());
					t.setOwner_Name(t1.getOwner_Name());
					t.setCaptain_Name(t1.getCaptain_Name());
				}
			}
			
			return t;
		}
		public boolean insertTeam(Team t) throws Exception {
			//fill your code
			Connection mc=MyConnection.getConnection(); // TRanfers control to another 
			PreparedStatement ps=mc.prepareStatement("insert into Team values(?,?,?,?,?)");
			ps.setInt(1, t.getTeam_id());
			ps.setString(2, t.getTeam_Name());
			ps.setString(3, t.getCoach_Name());
			ps.setString(4,t.getOwner_Name());
			ps.setString(5, t.getCaptain_Name());

			return ps.execute();
			//return false;

			
		}

	}
