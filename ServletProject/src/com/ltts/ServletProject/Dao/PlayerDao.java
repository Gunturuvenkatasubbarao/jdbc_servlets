package com.ltts.ServletProject.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ltts.ServletProject.configure.MyConnection;
import com.ltts.ServletProject.model.Player;

public class PlayerDao {
	
	public boolean insertPlayer(Player p) throws Exception {
		//fill your code
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into player values(?,?,?,?,?)");
		ps.setInt(1, p.getPlayer_id());
		ps.setString(2, p.getPlayer_Name());
		ps.setString(3, p.getSkill());
		ps.setString(4,p.getCountry());
		ps.setDate(5, p.getDOB());

		return ps.execute();
		//return false;

		
	}

}