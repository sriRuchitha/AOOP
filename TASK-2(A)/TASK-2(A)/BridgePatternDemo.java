interface MusicSource {
    void playMusic();
}

class LocalFile implements MusicSource {
    private String fileName;
    public LocalFile(String fileName) { this.fileName = fileName; }
    public void playMusic() { System.out.println("Playing local file: " + fileName); }
}

class OnlineStreamingService implements MusicSource {
    private String serviceName;
    public OnlineStreamingService(String serviceName) { this.serviceName = serviceName; }
    public void playMusic() { System.out.println("Streaming from: " + serviceName); }
}

class RadioStation implements MusicSource {
    private String stationName;
    public RadioStation(String stationName) { this.stationName = stationName; }
    public void playMusic() { System.out.println("Playing radio station: " + stationName); }
}

abstract class MusicPlayer {
    protected MusicSource musicSource;
    public MusicPlayer(MusicSource musicSource) { this.musicSource = musicSource; }
    public abstract void play();
}

class AdvancedMusicPlayer extends MusicPlayer {
    public AdvancedMusicPlayer(MusicSource musicSource) { super(musicSource); }
    public void play() { System.out.println("Advanced Player:"); musicSource.playMusic(); }
}

class BasicMusicPlayer extends MusicPlayer {
    public BasicMusicPlayer(MusicSource musicSource) { super(musicSource); }
    public void play() { System.out.println("Basic Player:"); musicSource.playMusic(); }
}

public class BridgePatternDemo {
    public static void main(String[] args) {
        new AdvancedMusicPlayer(new LocalFile("song.mp3")).play();
        new BasicMusicPlayer(new OnlineStreamingService("Spotify")).play();
        new AdvancedMusicPlayer(new RadioStation("Classic FM")).play();
    }
}
