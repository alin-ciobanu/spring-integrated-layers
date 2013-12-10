package ro.teamnet.hero.service;

import ro.teamnet.hero.domain.Account;

import java.math.BigDecimal;

/**
 * Created by yozmo on 12/10/13.
 */
public interface AccountService {

    Account createAccount (Account account);

    Account findById (BigDecimal idAccount);

}
