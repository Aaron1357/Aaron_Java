package com.kh.practice1.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.practice1.compare.ArtistAscending;
import com.kh.practice1.compare.TitleAscending;
import com.kh.practice1.model.Music;

public class MusicController {
	Music m = new Music();

	ArrayList<Music> list = new ArrayList();
	

	public boolean addList(Music music) {

		if (list.add(music)) {
			return true;
		} else
			return false;

	}

	public boolean addAteZero(Music music) {

		list.add(0, music);
		if (list.add(music)) {
			return true;
		} else
			return false;

	}

	public ArrayList<Music> printAll() {

		return list;

	}

	public Music searchMusic(String title) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				return list.get(i);
			} 
		}return null;
	

	}

	public Music removeMusic(String title) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) { 
//				list.remove(list.get(i));
//				list.remove(i);
				return list.remove(i);
			} 
		}return null;
	}

	public Music setMusic(String title, Music music) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) { 
                  list.get(i).setTitle(music.getTitle()); 
                  list.get(i).setArtist(music.getArtist()); 
				return list.get(i);
			} 
		}return null;

	}

	public ArrayList<Music> ascTitle() {
		ArrayList<Music> list = (ArrayList<Music>) this.list.clone();
		Collections.sort(list, new TitleAscending());
		return list;

	}

	public ArrayList<Music> descArtist() {
		ArrayList<Music> list = (ArrayList<Music>) this.list.clone();
		Collections.sort(list, new ArtistAscending().reversed());
		return list;

	}

}
