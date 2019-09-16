package net.wanho;

/**
 * 一个类就是有属性+方法【成员变量+成员方法】组成；
 * 除以上两种，还有两类极特殊的存在
 * 代码块：静态代码块，实例代码块
 * 构造方法：创建对象的
 */
public class Student {

    public static void main(String[] args) {
        Student student = new Student();
        new Student();
        new Student(1);

        student.test("mingzi","xingbie");

        System.out.println("abc"+"efg");
        int a = 8+9;
        String s1 = new String("abcd");
        String s2 = "abcd";
        String s3 = new String(new byte[]{1,3,4,5});

        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.charAt(2));
        System.out.println(s1.concat(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.isEmpty());
        System.out.println(s1.indexOf("23"));
        System.out.println(s1==s2);


    }


    public void test(String name,String sex)
    {

    }

    {
        System.out.println("实例代码块");
    }

    static{
        System.out.println("静态代码块");
    }

    /**
     *无参构造方法是默认存在的，可以不写直接用
     *
     * 方法名称相同，参数列表不同，重载；重载是多态的一种体现；
     * 多态：同一个事物的多种形态->重载，重写，面向接口编程，对象的上转型
     */
    public Student(){
        System.out.println("无参构造方法");
    }

    public Student(int age )//局部变量
    {
        System.out.println("有参构造方法");
        this.age = age;  //this指代当前类，只能方法实例方法当中
    }

    //一个类当中，属性【成员变量】通常用来描述静态的信息
    int age;//成员变量
    String name;



    //一个类当中，功能【成员方法】通常用来描述动态的信息
    public void run()
    {

    }

    public void jump(){

    }
}
