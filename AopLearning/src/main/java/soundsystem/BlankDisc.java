package soundsystem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by liujiajia on 2017/3/8.
 */
public class BlankDisc implements CompactDisc {
    public BlankDisc() {
    }

    public BlankDisc(@Value("${disc.title}") String title, @Value("${disc.artist}") String artist) {
        this.title = title;
        this.artist = artist;
    }

    private String title;

    private String artist;

    private List<String> tracks;

    public void playTrack(int trackNumber) {
        System.out.println(tracks.get(trackNumber - 1));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }
}
