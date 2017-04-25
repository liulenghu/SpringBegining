package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by liujiajia on 2017/3/7.
 */
//@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    // @Autowired
    @Autowired(required = false) // 如果没有匹配的bean的话,Spring将会让这个bean处于未装配的状态
    // @Inject // 同@Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void paly() {
        cd.play();
    }

//    // @Autowired可以用在属性的Setter方法上,也可以用在类的任何方法上
//    @Autowired
//    public void setCd(CompactDisc cd) {
//        this.cd = cd;
//    }
}
