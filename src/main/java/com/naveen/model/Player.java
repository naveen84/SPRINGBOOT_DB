package com.naveen.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String nation;
	private String sport;
	public Player(Integer id, String name, String nation, String sport) {
		super();
		this.id = id;
		this.name = name;
		this.nation = nation;
		this.sport = sport;
	}
	public Player() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", nation=" + nation + ", sport=" + sport + "]";
	}
	
	

}
