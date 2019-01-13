package service;

import beans.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUser(){
        return new User();
    }

}
