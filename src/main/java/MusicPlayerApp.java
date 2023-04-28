public class MusicPlayerApp {

    public static void main(String[] args) {
        // Create a music player instance (Singleton)
        MusicPlayer musicPlayer = MusicPlayer.getInstance();

        // Create a playlist builder and add some songs (Builder)
        PlaylistBuilder playlistBuilder = new PlaylistBuilder()
                .addSong(new Song("Song 1", "artist 1", 1))
                .addSong(new Song("Song 2", "artist 2", 2))
                .addSong(new Song("Song 3", "artist 3", 3));

        // Build a playlist from the builder (Builder)
        Playlist playlist = playlistBuilder.build();

        // Clone the playlist to create a new one (Prototype)
        Playlist clonedPlaylist = playlist.clone();

        // Create an audio component factory (Abstract Factory)
        AudioComponentFactory audioComponentFactory = new BasicAudioComponentFactory();

        // Create a media file and an equalizer (Abstract Factory)
        MediaFile mediaFile = audioComponentFactory.createMediaFile("path/to/file.mp3");
        AudioEffect equalizer = audioComponentFactory.createAudioEffect("equalizer");

        // Play the media file with the equalizer (Strategy)
        musicPlayer.setMediaFile(mediaFile);
        musicPlayer.setAudioEffect(equalizer);
        System.out.println("Playing media file: " + mediaFile.getPath() + " with equalizer effect.");

        // Shuffle the playlist (Prototype)
        playlist.shuffle();
        System.out.println("Shuffling playlist...");

        // Play the shuffled playlist (Strategy)
        musicPlayer.setPlaylist(playlist);
        musicPlayer.play();
        System.out.println("Playing shuffled playlist...");

        // Repeat the playlist (Builder)
        playlistBuilder.setRepeat(true);
        Playlist repeatedPlaylist = playlistBuilder.build();
        System.out.println("Building repeated playlist...");

        // Play the repeated playlist (Strategy)
        musicPlayer.setPlaylist(repeatedPlaylist);
        musicPlayer.play();
        System.out.println("Playing repeated playlist...");
    }

}
