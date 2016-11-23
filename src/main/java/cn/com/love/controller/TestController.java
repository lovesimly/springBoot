package cn.com.love.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.com.love.dao.UserDao;
import cn.com.love.model.User;

import com.alibaba.fastjson.JSONObject;

@RestController
public class TestController {
	Logger log=LoggerFactory.getLogger(TestController.class);
	
	
	@Resource
	private UserDao userDao;

    @RequestMapping("/addUser")
    public JSONObject addUser(@RequestParam( "username" ) String username,@RequestParam( "password" ) String password) {
        JSONObject jsonObject = new JSONObject();
        User user = new User();
        user.setPassword(username);
        user.setUsername(password);
        Long count=userDao.addUser(user);
        log.info("count:"+count);
        jsonObject.put("ok", "返回数据count："+count);
        return jsonObject;
    }

    @RequestMapping("/test2")
    public String test2() {
        return "Hello,ok";
    }
}

