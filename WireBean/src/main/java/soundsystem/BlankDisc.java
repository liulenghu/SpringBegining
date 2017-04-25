package soundsystem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by liujiajia on 2017/3/8.
 */
@Component
public class BlankDisc {

    public BlankDisc(@Value("${disc.title}") String title, @Value("${disc.artist}") String artist) {
        this.title = title;
        this.artist = artist;
    }

    private String title;
    private String artist;

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
}
