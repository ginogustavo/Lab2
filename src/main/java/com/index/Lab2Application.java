package com.index;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.index.model.Player;
import com.index.model.Team;
import com.index.repository.TeamRepository;

@SpringBootApplication
public class Lab2Application {

	@Autowired
	TeamRepository teamRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Lab2Application.class, args);
	}
	
	@PostConstruct
	public void init(){
		List<Team> list = new ArrayList<Team>();
		
		//1st set of players
		Set<Player> players = new HashSet<Player>();
		players.add(new Player("Hugo", "forward"));
		players.add(new Player("Gino", "goalkeeper"));
		players.add(new Player("Giordano", "defense"));
		players.add(new Player("Tony", "midfielder"));
		
		//1st team definition (including players set)
		Team team = new Team("team1", "Location1", players);
		list.add(team);
		
		//2nd set of players
		players = new HashSet<Player>();
		players.add(new Player("Rafael", "forward"));
		players.add(new Player("Angelo", "goalkeeper"));
		players.add(new Player("Soly", "defense"));
		players.add(new Player("Melanie", "midfielder"));
		
		//2nd team definition (including players set)
		team = new Team("team2", "Location2", players);
		list.add(team);
		
		//3rd set of players
		players = new HashSet<Player>();
		players.add(new Player("Jean", "forward"));
		players.add(new Player("Raphael", "goalkeeper"));
		players.add(new Player("Kiara", "defense"));
		players.add(new Player("Rosa", "midfielder"));
		
		//3rd team definition (including players set)
		team = new Team("team3", "Location3", players);
		list.add(team);
		
		//Saving
		teamRepository.save(list);
		
	}
}