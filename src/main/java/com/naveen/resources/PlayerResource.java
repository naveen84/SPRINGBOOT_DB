package com.naveen.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.dao.PlayerDao;
import com.naveen.exceptions.PlayerNotFoundException;
import com.naveen.model.Player;

@RestController
public class PlayerResource {
	
	@Autowired
	private PlayerDao playerDao;
	
	@PostMapping(value="/players")
	public Player savePlayer(@RequestBody Player player) {
		return playerDao.save(player);
	}
	
	@PostMapping(value="/allplayers")
	public List<Player> saveListOfPlayer(@RequestBody List<Player> player) {
		return playerDao.saveAll(player);
	}
	
	@GetMapping
	public List<Player> get(){
		return playerDao.findAll();
	}
	
	@GetMapping("/players/{id}")
	public Player getById(@PathVariable("id") Integer id) {
		if(!playerDao.existsById(id))
			throw new PlayerNotFoundException("PLAYR NOT FOUND WITH ID: "+id);
		return playerDao.findById(id).get();
	}
	@DeleteMapping("/players/{id}")
	public void deletePlayer(@PathVariable("id") Integer id) {
		if(!playerDao.existsById(id))
			throw new PlayerNotFoundException("PLAYR NOT FOUND WITH ID: "+id);
		else
			playerDao.deleteById(id);
	}
	@PutMapping("/players/{id}")
	public Player updatePlayer(@PathVariable("id") Integer id,@RequestBody Player player) {
		if(!playerDao.existsById(id))
			throw new PlayerNotFoundException("PLAYR NOT FOUND WITH ID: "+id);
		player.setId(id);
		return playerDao.save(player);
	}
	@GetMapping("/players/{nation}/{sport}")
	public List<Player> getByNationAndSport(@PathVariable("nation")String nation , @PathVariable("sport")String sport){
		
		return playerDao.findByNationAndSport(nation, sport);
		
	}
}
