package com.rookie.pattern.adapter.powerAdapter;

/**
 * @Author: Eric
 * @Date: 2019/3/19 8:24
 * @Version 1.0
 */
public class PowerAdapterTest {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outputDC5();
    }
}
