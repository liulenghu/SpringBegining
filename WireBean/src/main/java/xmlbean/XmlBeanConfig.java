package xmlbean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by liujiajia on 2017/3/7.
 */
@Configuration
@ComponentScan
//@EnableAutoConfiguration
@ImportResource("classpath:db-config.xml")
public class XmlBeanConfig {
//    public static void main(String[] args) {
////        SpringApplication.run(XMLConfig.class, args);
//    }
}
