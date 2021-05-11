package com.yshuoo.jvm.bytecode;

/**
 * @Author yangshuo
 * @Date 2021/5/10 16:18
 */
public class MyTest5 {

    // 方法重载，是一种静态行为,编译器就可以完全确定
    public void test(Grandpa grandpa){
        System.out.println("grandpa");
    }

    public void test(Father father){
        System.out.println("father");
    }

    public void test(Son son){
        System.out.println("son");
    }

    public static void main(String[] args) {
        Grandpa g1 = new Father();
        Grandpa g2 = new Son();

        MyTest5 myTest5 = new MyTest5();

        myTest5.test(g1);
        myTest5.test(g2);
    }

}

class Grandpa{

}

class Father extends Grandpa{

}

class Son extends Father{

}
