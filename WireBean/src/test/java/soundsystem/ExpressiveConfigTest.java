package soundsystem;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by liujiajia on 2017/3/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExpressiveConfig.class)
public class ExpressiveConfigTest {
    @Autowired
    private BlankDisc bd;

    @Test
    public void bdShouldSameWithAppProperties() {
        Assert.assertEquals(bd.getTitle(), "Sgt. Peppers Lonely Hearts Club Band");
        Assert.assertEquals(bd.getArtist(), "The Beatles");
    }
}
