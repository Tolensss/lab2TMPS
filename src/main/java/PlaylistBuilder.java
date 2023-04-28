import java.util.ArrayList;
import java.util.List;
public class PlaylistBuilder {
    private List<Song> songs;
    private boolean shuffle;
    private boolean repeat;

    public PlaylistBuilder() {
        songs = new ArrayList<>();
        shuffle = false;
        repeat = false;
    }

    public PlaylistBuilder addSong(Song song) {
        songs.add(song);
        return this;
    }

    public PlaylistBuilder removeSong(Song song) {
        songs.remove(song);
        return this;
    }

    public PlaylistBuilder setShuffle(boolean shuffle) {
        this.shuffle = shuffle;
        return this;
    }

    public PlaylistBuilder setRepeat(boolean repeat) {
        this.repeat = repeat;
        return this;
    }

    public Playlist build() {
        return new BasicPlaylist(songs, shuffle, repeat);
    }
}
