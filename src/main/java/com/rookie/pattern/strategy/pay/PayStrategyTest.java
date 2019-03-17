package com.rookie.pattern.strategy.pay;

import com.rookie.pattern.strategy.pay.payport.PayStrategy;

/**
 * 通过选择支付方式模拟交易
 *
 * @Author: Eric
 * @Date: 2019/3/18 0:12
 * @Version 1.0
 */
public class PayStrategyTest {
    public static void main(String[] args) {
        Order order = new Order("1", "1234", 200);
        System.out.println(order.pay(PayStrategy.ALI_PAY));
    }
}
