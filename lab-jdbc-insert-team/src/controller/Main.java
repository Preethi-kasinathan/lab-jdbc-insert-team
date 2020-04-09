package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import dao.CityDAO;
//import dao.CityDAO;
import dao.TeamDAO;
import model.City;
//import model.City;
import model.Team;

public class Main {

	public static void main(String[] args) throws SQLException, Exception, NullPointerException {
		
		
		System.out.println("1.TEAM REGISTERATION");
		System.out.println("2. DISPLAY CITY");
		
		int n;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(bf.readLine());
		
		
		Team tm = new Team(n, null, null, n, n);
	    TeamDAO tmdao = new TeamDAO();
		City ct = new City(n, null);
		CityDAO ctdao = new CityDAO();
		
		
		switch(n)
		{
		
		case 1:
			
			
			System.out.println("ENTER ID");
			int id=Integer.parseInt(bf.readLine());
			System.out.println("ENTER YOUR NAME");
			String name = bf.readLine();
			System.out.println("ENTER COACH NAME");
			String coach = bf.readLine();
			System.out.println("ENTER YOUR HOME CITY ID");
			int home_city_id = Integer.parseInt(bf.readLine());
			System.out.println("ENTER NUMBER OF CAPTAIN");
			int captain =Integer.parseInt(bf.readLine());
			
			
			tm.setId(id);
			tm.setName(name);
			tm.setCoach(coach);
			tm.setHome_city_id(home_city_id);
			tm.setCaptain(captain);
			
			tmdao.createTeam(tm);
			
			break;
			
		case 2:
			
			ctdao.getCityByName(ct);
		
		}

	}

}
