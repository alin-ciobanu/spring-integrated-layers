package ro.teamnet.hero.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by yozmo on 12/10/13.
 */

@Entity
@Table(name = "PERSON")
public class Person {

    @Id
    @Column(name = "ID_PERSON")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigDecimal id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
