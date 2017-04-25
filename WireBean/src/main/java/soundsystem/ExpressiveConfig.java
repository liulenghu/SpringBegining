package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Created by liujiajia on 2017/3/8.
 */
@Configuration
@ComponentScan
@PropertySource("classpath:/soundsystem/app.properties") // 声明属性源
public class ExpressiveConfig {
    @Autowired
    Environment env;

//    @Bean
//    public BlankDisc disc() {
//        return new BlankDisc(
//                env.getProperty("disc.title"),
//                env.getProperty("disc.artist"));
//    }

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }

}
