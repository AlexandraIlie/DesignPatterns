package CreationalDesignPatterns.Singleton;

public class Client {
    public static void main(String[] args) {
        MusicStreaming spotify = MusicStreaming.listenToMusic();
        spotify.choosePlaylistGenre("Rock Solid");
    }
}
