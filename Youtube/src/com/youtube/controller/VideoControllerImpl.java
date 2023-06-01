package com.youtube.controller;

import com.youtube.model.Video;

public interface VideoControllerImpl {

	public Video videoUpload();

	public Video[] videoList();

	public Video viewVideo();

	public Video updateVideo();

	public boolean deleteVideio();
}