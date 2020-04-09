package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Team;
import utility.ConnectionManager;

public class TeamDAO
{
	public void createTeam(Team tm) throws SQLException, Exception {
		
		int id = tm.getId();
		String name = tm.getName();
		String coach = tm.getCoach();
		int home_city_id = tm.getHome_city_id();
		int captain = tm.getCaptain();
		
		ConnectionManager con = new ConnectionManager();
		
		String sql = "insert into team(id,name,coach,home_city,captain)VALUES(?,?,?,?,?)";
		
		PreparedStatement st =con.getConnection().prepareStatement(sql);
		
		st.setLong(1, id);
		st.setString(2, name);
		st.setString(3, coach);
		st.setLong(4, home_city_id);
		st.setLong(5, captain);
		
		st.executeUpdate();
		
		con.getConnection().close();
	}
}
