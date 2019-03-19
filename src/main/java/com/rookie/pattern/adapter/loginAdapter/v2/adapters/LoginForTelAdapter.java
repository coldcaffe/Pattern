package com.rookie.pattern.adapter.loginAdapter.v2.adapters;


import com.rookie.pattern.adapter.loginAdapter.ResultMsg;

/**
 * Created by Tom.
 */
public class LoginForTelAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
