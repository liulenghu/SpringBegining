//package spittr.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
///**
// * Created by liujiajia on 2017/3/28.
// */
//@Configuration
//@EnableWebMvc // 启用Spring MVC
//@ComponentScan("spitter.web") // 启用组件扫描
//public class WebConfig extends WebMvcConfigurerAdapter {
//    /**
//     * 配置JSP视图解析器
//     *
//     * @return
//     */
//    @Bean
//    public ViewResolver viewResolver() {
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix("/views");
//        resolver.setSuffix(".jsp");
//        resolver.setExposeContextBeansAsAttributes(true);
//
//        return resolver;
//    }
//
//    /**
//     * 配置静态资源的处理
//     *
//     * @param configurer
//     */
//    @Override
//    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//        configurer.enable();
//    }
//}
