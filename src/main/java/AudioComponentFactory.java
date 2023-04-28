public interface AudioComponentFactory {
    public MediaFile createMediaFile(String path);
    public AudioEffect createAudioEffect(String type);
    public Visualization createVisualization(String type);
}