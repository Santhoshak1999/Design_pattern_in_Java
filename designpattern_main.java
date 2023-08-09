package player;
public class Main {
	public static void main(String args[]){
	    MediaPlayer player = new MP3Player();
	    player.play("testmp3file.mp3");
	    player = new MediaPlayerAdapter(new MP4Player());
	    player.play("testmp4file.mp4");
	    player = new MediaPlayerAdapter(new VLCPlayer());
	    player.play("testvlcfile.avi");
	}
}