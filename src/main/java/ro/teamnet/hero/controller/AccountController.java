package ro.teamnet.hero.controller;

import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.teamnet.hero.domain.Account;
import ro.teamnet.hero.service.AccountService;

import java.math.BigDecimal;
import java.util.List;

/**
 * AccountController.java
 * <p/>
 * Copyright (c) 2013 Teamnet. All Rights Reserved.
 * <p/>
 * This source file may not be copied, modified or redistributed,
 * in whole or in part, in any form or for any reason, without the express
 * written consent of Teamnet.
 */

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> accountList(){

        List<Account> accountList=accountService.findAll();
        JSONSerializer jsonSerializer=new JSONSerializer();
        String accountListJson=jsonSerializer
                .exclude("*.class")
                .exclude("person")
                .serialize(accountList);
        return new ResponseEntity<String>(accountListJson, HttpStatus.OK);
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> createAccount(@RequestBody String json){
        Account accountTransient=new JSONDeserializer<Account>()
                .use(null, Account.class)
                .deserialize(json);
        Account accountDetached=accountService.createAccount(accountTransient);
        return new ResponseEntity<String>(new JSONSerializer()
                .exclude("*.class")
                .exclude("person")
                .serialize(accountDetached),HttpStatus.OK);
    }

    @RequestMapping(value = "/{accountId}", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<String> deleteAccount (@PathVariable("accountId") BigDecimal accountId) {

        accountService.deleteAccount(accountId);
        return this.accountList();

    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public ResponseEntity<String> updateAccount (@RequestBody String json) {

        Account accountTransient = new JSONDeserializer<Account>()
                .use(null, Account.class)
                .deserialize(json);
        Account accountDetached = null;
        if (accountService.findById(accountTransient.getId()) != null)
            accountDetached = accountService.createAccount(accountTransient);
        else
            accountDetached = null;
        return new ResponseEntity<String>(new JSONSerializer().
                exclude("*.class").
                exclude("person").
                serialize(accountDetached),
                HttpStatus.OK);

    }

}
