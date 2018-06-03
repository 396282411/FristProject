package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("demo")
public class DemoController {
    @Autowired
    UserService userService;
    @RequestMapping("index")
    public String demo(){
        return "hello";
    }
    @RequestMapping("mybatis/test.do")
    @ResponseBody
    public String mybatisTest(@RequestParam("id")String id){
       List<?> list =  userService.getUserById(id);
       System.out.println(list);
        return null;
    }

}
