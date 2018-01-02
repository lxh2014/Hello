package com.vcom.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/12/29.
 */
@Controller

public class SpringController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String printHello(ModelMap modelMap)
    {
        modelMap.addAttribute("message","first SpringMVC program!");
        return "hello";
    }

    @RequestMapping("/welcome")
    public String ceshi123(ModelMap modelMap)
    {
        modelMap.addAttribute("message","welcome to springmvc");
        return "welcome";
    }

}
