package CreationalDesignPatterns.Singleton;

public class MusicStreaming {

    private String playlistName;
    private static MusicStreaming musicStreaming;

    private MusicStreaming(){
        playlistName = new String();
    }

    public static MusicStreaming listenToMusic(){
        if(musicStreaming == null){
            musicStreaming = new MusicStreaming();
        }
        return musicStreaming;
    }

    public void choosePlaylistGenre(String genre){
        playlistName = genre;
    }
}
