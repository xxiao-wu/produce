package produce.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import produce.demo.mapper.UserMapper;
import produce.demo.pojo.User;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/queryUserList")
    public List<User> queryUserList(){
    List<User> userList=userMapper.queryUserList();
    for(User user:userList){
        System.out.println(user);
    }
    return userList;
    }
    @GetMapping("/queryUserById")
    public User queryUserById(){
        User user = userMapper.queryUserById(1);
        return user;
    }
}
