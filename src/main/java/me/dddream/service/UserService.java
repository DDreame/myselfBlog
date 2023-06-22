package me.dddream.service;

import com.minis.jdbc.core.JdbcTemplate;
import me.dddream.entity.User;

/***
 * @description : Todo
 * @author : DDDreame
 * @date : 2023/6/22 16:29 
 */
public class UserService {

    JdbcTemplate jdbcTemplate;

    /**
     * 注册用户
     * @param user 注册用户对象
     * @return 注册成功返回用户对象
     */
    public User userRegister(User user){
        return null;
    }

    /**
     * 验证用户登录，并返回token
     * @param userName
     * @param passwd
     * @return
     */
    public String userLogin(String userName, String passwd){
        return "this is a token";
    }

    /**
     * 验证Token-返回对应
     * @param token
     * @return
     */
    public User checkLogin(String token){
        return null;
    }

    /**
     * 修改用户密码
     * @param userName 用户名
     * @param oldPasswd 旧密码
     * @param newPasswd 新密码
     * @return 修改结果-是否成功
     */
    public boolean updatePassword(String userName, String oldPasswd, String newPasswd){
        return  false;
    }

    /**
     * 修改密码
     * @param email 修改密码
     * @return 邮件发送结果
     */
    public boolean forgotPassword(String email){
        return false;
    }

}
