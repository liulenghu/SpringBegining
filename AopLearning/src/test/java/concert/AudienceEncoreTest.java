package concert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by liujiajia on 2017/3/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class AudienceEncoreTest {
    @Autowired
    private Performance performance;

    @Test
    public void performance() {
        // Performance自己的方法
        performance.perform();
        // 通过AOP增加的方法
        ((Encoreable) performance).performEncore();
    }
}
