package com.test.controller;

import com.alibaba.fastjson.JSONObject;
import com.test.pojo.User;
import com.test.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {

    private Logger logger = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test", produces = "text/json;charset=utf-8") //produces 可以保证输出的json数据的编码格式
    public String showTest(HttpServletRequest request, Model model) {
        logger.info("test test");
        User user = testService.findUserById(1L);
        model.addAttribute("user", user);
        return "hello";
    }


}