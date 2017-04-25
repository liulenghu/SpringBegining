package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liujiajia on 2017/3/7.
 */
@Configuration
@ComponentScan // 以配置所在类的包为基础包
//@ComponentScan("soundsystem") // 明确地设定基础包
//@ComponentScan(basePackages = "soundsystem") // 通过basePackages属性明确地设定基础包
//@ComponentScan(basePackages = {"soundsystem", "video"}) // 指定多个基础包
//@ComponentScan(basePackageClasses = { CDPlayer.class }) // 类型安全的指定基础包
public class CDPlayerConfig {

    @Bean // id默认与方法名一样
    // @Bean(name = "lonelyHeartsClubBean") // 指定bean的id
    public CompactDisc sgtPeppers() {
        // 方法返回所需类型的实例
        // 这里可以使用java的所有功能来创建所需要的实例
        return new SgtPeppers();
    }

//    @Bean
//    public CompactDisc randomBeatlesCD() {
//        int choice = (int) Math.floor(Math.random() * 4);
//        if (choice == 0) {
//            return new SgtPeppers();
//        } else if (choice == 1) {
//            return new WhiteAlbum();
//        } else if (choice == 2) {
//            return new HardDaysNight();
//        } else {
//            return new Revolver();
//        }
//    }

    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }

//    // 这种写法效果同上面的cdPlayer一样
//    @Bean
//    public CDPlayer cdPlayer(CompactDisc compactDisc) {
//        return new CDPlayer(compactDisc);
//    }

//    @Bean
//    public CDPlayer anotherCDPlayer() {
//        // 调用构造函数的参数sgtPeppers()同上面cdPlayer bean中的参数是同一个实例
//        // 默认情况下,Spring中的bean都是单例的
//        return new CDPlayer(sgtPeppers());
//    }
}
