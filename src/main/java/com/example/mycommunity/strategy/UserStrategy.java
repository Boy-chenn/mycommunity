package com.example.mycommunity.strategy;

public interface UserStrategy {
    LoginUserInfo getUser(String code, String state);
    String getSupportedType();
}
