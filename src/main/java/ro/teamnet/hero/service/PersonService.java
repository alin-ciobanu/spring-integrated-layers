package ro.teamnet.hero.service;

import ro.teamnet.hero.domain.Person;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by yozmo on 12/11/13.
 */

public interface PersonService {

    Person createPerson (Person person);

    Person findById (BigDecimal idPerson);

    List<Person> findAll();

    void deletePerson(BigDecimal idPerson);

}
