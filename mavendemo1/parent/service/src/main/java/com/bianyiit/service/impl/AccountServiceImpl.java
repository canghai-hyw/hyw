package com.bianyiit.service.impl;
import com.bianyiit.dao.AccountDao;
import com.bianyiit.domain.Account;
import com.bianyiit.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    public void addAccount(Account account) {
        accountDao.addAccount(account);
    }
}
