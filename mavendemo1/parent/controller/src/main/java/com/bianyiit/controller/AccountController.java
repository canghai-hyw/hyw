package com.bianyiit.controller;
import com.bianyiit.service.AccountService;
import com.bianyiit.domain.Account;
import com.bianyiit.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }
}
