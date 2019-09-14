package com.naveen.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naveen.model.Player;

@Repository
public interface PlayerDao extends JpaRepository<Player, Integer> {
	
	List<Player> findByNationAndSport(String nation , String sport);
}
