package carrot.controller;

import carrot.bean.User;
import carrot.dto.Result;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String test(){
        return "hello world";
    }

    @RequestMapping(value = "register",method = RequestMethod.POST)
    public Result register(HttpServletRequest request, @RequestBody User user){
        System.out.println(user.getName());
        return Result.successRs();
    }
}
