package ro.teamnet.hero.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ro.teamnet.hero.config.InfrastructureConfig;
import ro.teamnet.hero.domain.Account;
import ro.teamnet.hero.domain.Person;

import java.math.BigDecimal;

/**
 * Created by yozmo on 12/10/13.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {InfrastructureConfig.class})
public class AccountServiceImplTest {

    @Autowired
    private AccountService accountService;

    private Account account;

    @Before
    public void setUp() throws Exception {

        account = new Account();
        account.setUserName("myFirstJpaTest");
        account.setEmail("test@hero.ro");
        account.setPassword("secret");
        Person person = new Person();
        person.setFirstName("First Test");
        person.setLastName("Last Name");
        account.setPerson(person);

    }

    @Test
    public void testCreateAccount() throws Exception {

        Account testAccount = accountService.createAccount(account);
        Assert.assertNotNull(testAccount.getId());

    }

    @Test
    public void testFindById() throws Exception {

        // Daca nu merge createAccount, pica testul, dar nu am stiut cum sa
        // adaug date in baza altfel.
        Account testAccount = accountService.createAccount(account);
        BigDecimal id = testAccount.getId();
        Assert.assertEquals(id, accountService.findById(id).getId());

    }

}
