package carrot.controller;

import carrot.bean.User;
import carrot.dto.Result;
import carrot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {


    @Autowired
    UserService userService;

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String test(HttpServletRequest request){
        request.getSession();
        return "hello world";
    }

    @RequestMapping(value = "register",method = RequestMethod.POST)
    public Result register(HttpServletRequest request, @RequestBody User user){
        System.out.println(user.getName());
        return Result.successRs();
    }

    @ResponseBody
    @RequestMapping(value = "/user/{name}",method = RequestMethod.GET)
    public User findUser(HttpServletRequest request,@PathVariable("name") String  name){
        return userService.getUser(name);
    }


}
