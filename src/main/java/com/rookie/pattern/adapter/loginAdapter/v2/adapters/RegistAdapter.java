package com.rookie.pattern.adapter.loginAdapter.v2.adapters;


import com.rookie.pattern.adapter.loginAdapter.ResultMsg;

/**
 * Created by Tom on 2019/3/16.
 */
public interface RegistAdapter {
    boolean support(Object adapter);

    ResultMsg login(String id, Object adapter);
}
