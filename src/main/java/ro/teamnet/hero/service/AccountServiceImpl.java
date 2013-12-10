package ro.teamnet.hero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ro.teamnet.hero.domain.Account;
import ro.teamnet.hero.repository.AccountRepository;

import java.math.BigDecimal;

/**
 * Created by yozmo on 12/10/13.
 */

@Service
@Transactional(readOnly = true)
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Transactional
    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account findById(BigDecimal idAccount) {
        return null;
    }
}
