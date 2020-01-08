package fr.mds.tpadapter.classes;

import fr.mds.tpadapter.interfaces.AdvancedMediaPlayer;
import fr.mds.tpadapter.interfaces.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

	AdvancedMediaPlayer advancedMusicPlayer;
	
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equals("mp3") ) {
			System.out.println("Playing mp3 file. Name: " + fileName);
		}else if(audioType.equals("mp4") || audioType.equals("vlc")) {
			MediaAdapter adapter = new MediaAdapter(audioType);
			adapter.play(audioType, fileName);
		}else if(audioType.equals("avi")){
			System.out.println("le format 'avi' n'est pas compatible");
		}else {
			System.out.println("le format utilisé n'est pas reconnu");
		}
		
	}
}
