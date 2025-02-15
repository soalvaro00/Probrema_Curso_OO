package entities;

public class Video extends Lesson {
    private String url;
    private int durationInSeconds;

    public Video(String title, String url, int durationInSeconds) {
        super(title);
        this.url = url;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public int duration() {
        return durationInSeconds;
    }
}

