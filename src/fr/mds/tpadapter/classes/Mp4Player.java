package fr.mds.tpadapter.classes;

import fr.mds.tpadapter.interfaces.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
	
	@Override
	public void playVlc(String fileName) {
		// do nothing
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: " + fileName);
	}
}
