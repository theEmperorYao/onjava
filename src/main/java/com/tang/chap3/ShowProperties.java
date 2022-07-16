package com.tang.chap3;

/**
 * @Classname ShowProperties
 * @Description TODO
 * @Date 2022/7/9 12:41
 * @Author by tangyao
 */
public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}