package Quiz.Ch06.STOP;

public class MusicCDInfo extends CDInfo {
    String artist;
    String songName[];
    MusicCDInfo(String registerNo,String title,String artist, String[] songName) {
        super(registerNo, title);
        this.artist = artist;
        this.songName = songName;
    }
}