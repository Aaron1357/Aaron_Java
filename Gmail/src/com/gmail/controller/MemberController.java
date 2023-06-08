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
		/*
		 * 전달 받은 id가 없다면 id와 m을 map에 추가 후 true 반환 있다면 false 값 반환
		 */
		map.put(id, m);
		return true;

	}

	public String login(String id, String password) {

		Set<String> key = map.keySet();
		Collection<Member> values = map.values();

		
		if (map.containsKey(id) && map.get(id).getPassword().equals(password)) {
			return map.get(id).getName();
		}else return null;
		/*
		 * 
		 * 전달 받은 id가 존재하는지 확인 후 존재하면 Member에 저장된 비밀번호와 사용자가 입력한 비밀번호가 같은지 비교 같다면 저장된
		 * Member의 이름 반환, 그 외 모든 상황에는 null 반환
		 * 
		 */
		
		
	}

	public boolean changePassword(String id, String oldPw, String newPw) {
     if(map.containsKey(id) && map.get(id).getPassword().equals(oldPw)) {
    	 map.get(id).setPassword(newPw); return true;
    	 
     }
		/*
		 * 아이디가 존재하면서 저장된 비밀번호와 사용자가 입력한 비밀번호(oldPw)가 같을 때 새로운 비밀번호로 바꾸고 true 반환, 아니라면
		 * false 반환
		 */

		return false;
	}

	public void changeName(String id, String newName) {
		
		if(map.containsKey(id)) {
			map.get(id).setName(newName);
		}
	    	 
	     }
		/* 
		 * 전달 받은 id를 통해 Member의 이름을 새로 입력한 이름으로 변경
		 * 
		 */

	

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
