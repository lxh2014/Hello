package com.vcom.springmvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2018/1/2.
 */
public class FormController {
    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public ModelAndView Student()
    {
        return new ModelAndView("student","command",new Student());
    }

    @RequestMapping(value = "/addStudent",method = RequestMethod.GET)
    public  String AddStudent()
    {
        return "result";
    }

}
