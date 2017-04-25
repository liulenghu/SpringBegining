package concert;

import org.springframework.stereotype.Component;

/**
 * Created by liujiajia on 2017/3/28.
 */
@Component
public class MusicConcert implements Performance {
    public void perform() {
        System.out.println("Playing music");
    }
}
