package ro.teamnet.hero.repository;

import org.omg.PortableInterceptor.ACTIVE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.teamnet.hero.domain.Account;
import ro.teamnet.hero.domain.Person;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by yozmo on 12/11/13.
 */

@Repository
public interface PersonRepository extends JpaRepository<Person, BigDecimal> {

    // DAO

}
