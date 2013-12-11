package ro.teamnet.hero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ro.teamnet.hero.domain.Account;
import ro.teamnet.hero.domain.Person;
import ro.teamnet.hero.repository.AccountRepository;
import ro.teamnet.hero.repository.PersonRepository;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by yozmo on 12/11/13.
 */

@Service
@Transactional(readOnly = true)
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;
    private AccountRepository accountRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository, AccountRepository accountRepository) {
        this.personRepository = personRepository;
        this.accountRepository = accountRepository;
    }

    @Transactional
    @Override
    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person findById(BigDecimal idPerson) {
        return personRepository.findOne(idPerson);
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Transactional
    @Override
    public void deletePerson(BigDecimal idPerson) {
        personRepository.delete(idPerson);
    }
}
