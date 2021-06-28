package rock.dong.springbootmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rock.dong.springbootmybatis.mapper.UserMapper;
import rock.dong.springbootmybatis.pojo.User;

import java.util.List;

@RestController


public class UserController {
    @Autowired
    //@Qualifier(value = "UserMapperImpl")
    //UserMapperImpl userMapperImpl;
    private UserMapper userMapper;

    @GetMapping("/queryUserList")
    public List<User> UserList(){
        return userMapper.queryUserList();
    }

    @GetMapping("/addUser")
    public String addUser(){
        userMapper.addUser(new User(5, "rock.dong@sap.com", "rock"));
        return "ok";
    }
}
