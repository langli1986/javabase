package net.wanho;

public class TestUserService {
    public static void main(String[] args) {
        System.out.println(UserService.a);


        //把实现类的对象付给接口的引用，用这个引用去调用方法，真正执行的实现类里面已经实现的方法->面向接口编程   【对象的上转型】
        UserService userService = new UserServiceImpl();

    }
}
