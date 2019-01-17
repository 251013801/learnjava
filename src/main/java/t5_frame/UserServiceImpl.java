package t5_frame;

public class UserServiceImpl implements UserService{
    public String getName() {
        System.out.println("getName");
        return "AAA";
    }

    public String getAge() {
        System.out.println("getAge");
        return "23";
    }
}
