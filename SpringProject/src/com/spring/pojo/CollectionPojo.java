package com.spring.pojo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionPojo {
	
	public List fruits;
	public Set Players;
	public Map Country;
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	public void setPlayers(Set players) {
		Players = players;
	}
	public void setCountry(Map country) {
		Country = country;
	}
public void Print() {
	for(Object f: fruits)
	{
		System.out.println(f);
	}
	for (Object p:Players) {
		System.out.println(p);
	}
	Set s=Country.keySet();
	for(Object key:s) {
		System.out.println(key+" " +Country.get(key));
	}
	
}
}
