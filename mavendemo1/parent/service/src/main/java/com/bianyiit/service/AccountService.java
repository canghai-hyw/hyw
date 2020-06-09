package com.bianyiit.service;


import com.bianyiit.domain.Account;

import java.util.List;

public interface AccountService {

    //查询所用用户信息的方法
    List<Account> findAll();

    //添加用户
    void addAccount(Account account);
}
