package com.tjy.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author tjy
 * @Date 2020/12/29 21:42
 */

@Controller
@RequestMapping("login")

public class LoginController {

    @RequestMapping("/login")
    public String login(String username,String password) {
        return "index";
    }

    @RequestMapping("/success")
    public String success(String username,String password) {
        return "success";
    }


}
