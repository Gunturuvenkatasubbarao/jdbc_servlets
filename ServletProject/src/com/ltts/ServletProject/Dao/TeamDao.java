package com.ltts.ServletProject.Dao;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import com.ltts.ServletProject.configure.MyConnection;
	import com.ltts.ServletProject.model.Team;

	public class TeamDao {
		
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
