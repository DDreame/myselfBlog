package me.dddream.jdbc;

import com.minis.jdbc.core.JdbcTemplate;
import me.dddream.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/***
 * @description : Todo
 * @author : DDDreame
 * @date : 2023/4/19 20:51 
 */
public class UserJdbcImpl extends JdbcTemplate {
    @Override
    protected Object doInStatement(ResultSet rs) {
        User user = null;
        try {
            if(rs.next()){
                user = new User();
                user.setId(rs.getLong("id"));
                user.setUsername(rs.getString("name"));
                user.setAvatar("123.png");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return user;
    }
}
