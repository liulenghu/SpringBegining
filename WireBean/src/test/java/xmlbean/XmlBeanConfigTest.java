package xmlbean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by liujiajia on 2017/3/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = XmlBeanConfig.class)
public class XmlBeanConfigTest {
    @Autowired
    private DbConfig dbConfig;

    @Autowired
    private DbConfig dbConfig2;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(dbConfig);
    }

    @Test
    public void configShouldEqualTheSettingInConfigXML() {
        assertEquals("com.microsoft.sqlserver.jdbc.SQLServerDriver", dbConfig.getDriver());
        assertEquals("jdbc:sqlserver://127.0.0.1:1433;databaseName=testdb", dbConfig.getUrl());
        assertEquals("user001", dbConfig.getUsername());
        assertEquals("pwd001", dbConfig.getPassword());
    }

    @Test
    public void configShouldEqual() {
        assertEquals(dbConfig, dbConfig2);
    }

    @Test
    public void configShouldNotEqual() {
        assertNotEquals(dbConfig, dbConfig2);
    }
}
