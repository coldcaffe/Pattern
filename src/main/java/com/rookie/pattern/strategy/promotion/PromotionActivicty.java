package com.rookie.pattern.strategy.promotion;

/**
 * 优惠活动类
 *
 * @Author: Eric
 * @Date: 2019/3/17 23:49
 * @Version 1.0
 */
public class PromotionActivicty {
    private PromotionStrategy promotionStrategy;

    public PromotionActivicty(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void execute() {
        promotionStrategy.doPromotion();
    }
}
