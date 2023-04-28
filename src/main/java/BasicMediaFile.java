public class BasicMediaFile implements MediaFile {
    private String path;
    private int duration;

    public BasicMediaFile(String path) {
        this.path = path;
    }

    public BasicMediaFile(String path, int duration) {
        this.path = path;
        this.duration = duration;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public int getDuration() {
        return duration;
    }
}
