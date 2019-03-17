package com.rookie.pattern.strategy.promotion;

/**
 * 测试促销活动
 *
 * @Author: Eric
 * @Date: 2019/3/17 23:56
 * @Version 1.0
 */
public class PromotationActivityTest {
    public static void main(String[] args) {
        PromotionActivicty act618 = new PromotionActivicty(new CashbackStrategy());
        PromotionActivicty act1111 = new PromotionActivicty(new CouponStrategy());

        act618.execute();
        act1111.execute();
    }
}
