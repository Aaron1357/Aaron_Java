package com.kh.practice1.compare;

import java.util.Comparator;

import com.kh.practice1.model.Music;

public class TitleAscending implements Comparator<Music> {

	
	// 두개의 매개값으로 전달된 객체를 비교
//     비교해서 같으면 0 , 첫번째 객체가 뒤에 있어야하면 1 , 앞에 있어야하면 -1
	

	public int compare(Music o1, Music o2) {
		return o1.getTitle().compareTo(o2.getTitle());
		 
	}


		
	

	
}
