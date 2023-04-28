import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasicPlaylist implements Playlist {
    private List<Song> songs;
    private boolean shuffle;
    private boolean repeat;

    public BasicPlaylist() {
        songs = new ArrayList<>();
        shuffle = false;
        repeat = false;
    }

    public BasicPlaylist(List<Song> songs, boolean shuffle, boolean repeat) {
        this.songs = songs;
        this.shuffle = shuffle;
        this.repeat = repeat;
    }

    @Override
    public void addSong(Song song) {
        songs.add(song);
    }

    @Override
    public void removeSong(Song song) {
        songs.remove(song);
    }

    @Override
    public void shuffle() {
        Collections.shuffle(songs);
    }

    @Override
    public void repeat(boolean value) {
        repeat = value;
    }

    @Override
    public Playlist clone() {
        List<Song> clonedSongs = new ArrayList<>(songs);
        return new BasicPlaylist(clonedSongs, shuffle, repeat);
    }
}
