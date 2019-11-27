package com.github.haozi.ueditorlab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author wanghao
 * @Description
 * @date 2019-11-27 18:13
 */
@Controller
@RequestMapping("/")
public class DispatchController {

    @GetMapping("/test")
    public String dispatch() {
        return "test";
    }

    @RequestMapping("/cat")
    public ModelAndView index() {
        //设置对应JSP的模板文件
        ModelAndView modelAndView = new ModelAndView("cat");
        //设置${hi}标签的值为Hello,Cat
        modelAndView.addObject("hi", "Hello,Cat");
        return modelAndView;
    }
}
