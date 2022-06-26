package com.hky;

public class ObjectAndString {

    public static void main(String[] args) {
        Object object = new Object();
        // 判断对象是否相同
        // equals()用于确认两个对象是否相同。
        // hashCode()用于获取对象的哈希值，这个值的作用是检索，具体的作用可以参考这里
        // 哈希值相同的对象不一定equale()
        // equals()返回true的两个对象一定相同。
        object.hashCode();
        object.equals();
        // 线程等待，线程唤醒
        object.wait();
        object.notify();
        object.toString();
        String str = "";
        //判断字符串是否相同
        str.equals();
        // 将字符串根据字符分开
        str.split();
        //字符串长度
        str.length();
        //字符最后出现的位置
        str.lastIndexOf();
    }
}
