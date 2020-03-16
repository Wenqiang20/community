package life.majiang.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  //注解   允许接受前端的请求
public class HelloController {

    //接受页面传过来的数据，并且显示
    @GetMapping("/hello")  // 映射路径
    public String hello(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name", name); // 接受页面传过来的数据
        return "hello";
    }

}
