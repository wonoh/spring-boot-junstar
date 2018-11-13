package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.UserVO;

@Controller
@EnableAutoConfiguration
public class UserController {
    
    @Autowired
    private UserMapper mapper;
    
    @RequestMapping(value="/")
    @ResponseBody
    public String home() throws Exception{
        
        List<UserVO> list = mapper.selectUserList();
        
        for(int i=0; i<list.size(); i++){
            System.out.println("getUserId : " + list.get(i).getUserId());
            System.out.println("getUserName : " + list.get(i).getUserName());
        }        
        
        return "hello Gradle!";
    }
 
}
