public class MusicPlayer {
    private static MusicPlayer instance;
    private MediaFile mediaFile;
    private AudioEffect audioEffect;
    private Playlist playlist;

    private MusicPlayer() {}

    public static synchronized MusicPlayer getInstance() {
        if (instance == null) {
            instance = new MusicPlayer();
        }
        return instance;
    }

    public void setMediaFile(MediaFile mediaFile) {
        this.mediaFile = mediaFile;
    }

    public void setAudioEffect(AudioEffect audioEffect) {
        this.audioEffect = audioEffect;
    }

    public void play() {
        // Apply audio effect (if any)
        if (audioEffect != null) {
            audioEffect.apply(mediaFile);
        }

        // Play media file
        // ...
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }
}
