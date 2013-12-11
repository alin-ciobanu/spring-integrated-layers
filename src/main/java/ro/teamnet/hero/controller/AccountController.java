package ro.teamnet.hero.controller;

import flexjson.JSONSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ro.teamnet.hero.domain.Account;
import ro.teamnet.hero.service.AccountService;

import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by yozmo on 12/11/13.
 */

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> accountList() {

        List<Account> accountList = accountService.findAll();
        JSONSerializer jsonSerializer = new JSONSerializer();
        String accountListJson = jsonSerializer
                .exclude(".class")
                .serialize(accountList);
        ResponseEntity<String> ret = new ResponseEntity<String>(accountListJson, HttpStatus.OK);
        return ret;

    }

}
