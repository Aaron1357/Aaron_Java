package com.gmail.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

import com.gmail.model.*;

public class MemberController {

	private HashMap<String, Member> map = new HashMap<>();

	public boolean joinMembership(String id, Member m) {

		Set<String> key = map.keySet();

		for (String string : key) {
			if (map.get(string).equals(id)) {
				return false;
			}
		}
		
		map.put(id, m);
		return true;

	}

	public String login(String id, String password) {

		Set<String> key = map.keySet();
		Collection<Member> values = map.values();

		
		if (map.containsKey(id) && map.get(id).getPassword().equals(password)) {
			return map.get(id).getName();
		}else return null;
		
		
		
	}

	public boolean changePassword(String id, String oldPw, String newPw) {
     if(map.containsKey(id) && map.get(id).getPassword().equals(oldPw)) {
    	 map.get(id).setPassword(newPw); return true;
    	 
     }
		
		return false;
	}

	public void changeName(String id, String newName) {
		
		if(map.containsKey(id)) {
			map.get(id).setName(newName);
		}
	    	 
	     }
		

	

	@Override
	public int hashCode() {
		return Objects.hash(map);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberController other = (MemberController) obj;
		return Objects.equals(map, other.map);
	}

}
