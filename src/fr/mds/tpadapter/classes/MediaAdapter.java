package fr.mds.tpadapter.classes;

import fr.mds.tpadapter.interfaces.AdvancedMediaPlayer;
import fr.mds.tpadapter.interfaces.MediaPlayer;

public class MediaAdapter implements MediaPlayer {
	
	AdvancedMediaPlayer advancedMusicPlayer;
	
	public MediaAdapter(String audioType) {
		
	}

	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equals("vlc") ) {
			advancedMusicPlayer = new VlcPlayer();
			advancedMusicPlayer.playVlc(fileName);
		}else if(audioType.equals("mp4")) {
			advancedMusicPlayer = new Mp4Player();
			advancedMusicPlayer.playMp4(fileName);
		}
		
	}
}
