package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.City;
import utility.ConnectionManager;

public class CityDAO
{
	public City getCityByName(City name) throws SQLException, Exception 
	{
		
	  String Cityname = name.getCityName();
	  
	  ConnectionManager cm = new ConnectionManager();
	  
	  Statement st = cm.getConnection().createStatement();
	  
	  ResultSet rs = st.executeQuery("select * from team");
	  
	  while(rs.next())
	  {
		  System.out.println(rs.getString(1) + " "  + rs.getString(2) + " " + rs.getString(4));
	  }
	  
		return null;
		
	}
	
}