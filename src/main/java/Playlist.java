public interface Playlist extends Cloneable {
    public void addSong(Song song);
    public void removeSong(Song song);
    public void shuffle();
    public void repeat(boolean value);
    public Playlist clone();
}