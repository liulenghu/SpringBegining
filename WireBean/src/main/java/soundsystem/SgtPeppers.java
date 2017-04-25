package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by liujiajia on 2017/3/7.
 */
//@Component
//@Component("lonelyHeartsClub") // 为bean命名
//@Named("lonelyHeartsClub") // @Component注解的替代方案
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
