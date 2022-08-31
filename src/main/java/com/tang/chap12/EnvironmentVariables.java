package com.tang.chap12;

import java.util.Map;

/**
 * @Classname EnvironmentVariables
 * @Description
 * @Date 2022/8/30 23:17
 * @Author by tangyao
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
