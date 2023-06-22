package me.dddream.controller;

import com.minis.ioc.beans.factory.annotation.Autowired;
import com.minis.web.RequestMapping;
import com.minis.web.ResponseBody;
import me.dddream.service.UserService;

/***
 * @description : 所有用户请求
 * @author : DDDreame
 * @date : 2023/6/15 16:34 
 */
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/api/v1/user/register")
    @ResponseBody
    public String addUser() {
        //todo 用户注册
        boolean result = userService.forgotPassword("123");
        System.out.println(result);
        System.out.println("addUser is not completed");
        return "addUser is not completed";
    }

    @RequestMapping("/api/v1/user/login")
    public String userLogin() {
        //todo 用户登陆
        System.out.println("user Login is not completed");
        return "user Login is not completed";
    }


    @RequestMapping("/api/v1/user/logout")
    public String userLogout() {
        //todo 用户退出登陆
        System.out.println("logout is not completed");
        return "logout is not completed";
    }

}
