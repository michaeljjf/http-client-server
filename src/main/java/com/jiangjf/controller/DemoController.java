package com.jiangjf.controller;

import com.jiangjf.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiangjf
 * @date 2021/10/1
 */
@Controller
public class DemoController {
    @RequestMapping("/demo")
    @ResponseBody
    public String demo(String param) {
        return param + "test";
    }

    @RequestMapping("/demo2")
    @ResponseBody
    public User demo2(User user) {
        return user;
    }

    @RequestMapping("/demo3")
    @ResponseBody
    public List<User> demo3() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "张三丰"));
        users.add(new User(2, "张无忌"));
        return users;
    }

    @RequestMapping("/demo4")
    @ResponseBody
    public String demo4(@RequestBody List<User> users) {
        System.out.println(users);
        return users.toString();
    }
}
