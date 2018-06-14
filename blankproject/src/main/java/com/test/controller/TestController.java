package com.test.controller;

import com.alibaba.fastjson.JSONObject;
import com.test.pojo.User;
import com.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test", produces = "text/json;charset=utf-8") //produces 可以保证输出的json数据的编码格式
    @ResponseBody
    public String showTest(HttpServletRequest request) {
        User user = testService.findUserById(1L);
        String result = JSONObject.toJSONString(user);
        return result;
    }


}