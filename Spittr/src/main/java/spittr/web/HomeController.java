package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by liujiajia on 2017/3/29.
 */
@Controller // 声明为一个控制器
public class HomeController {
    // 处理对"/"的GET请求
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "home"; // 视图名为home
    }
}
