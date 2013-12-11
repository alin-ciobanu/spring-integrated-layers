package ro.teamnet.hero.controller;

import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.teamnet.hero.domain.Person;
import ro.teamnet.hero.service.PersonService;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by yozmo on 12/11/13.
 */

@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> personList() {

        List<Person> personList = personService.findAll();
        JSONSerializer jsonSerializer = new JSONSerializer();
        String personListJson = jsonSerializer
                .exclude("*.class")
                .serialize(personList);
        ResponseEntity<String> ret = new ResponseEntity<String>(personListJson, HttpStatus.OK);
        return ret;

    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> createPerson (@RequestBody String json) {

        Person personTransient = new JSONDeserializer<Person>()
                .use(null, Person.class)
                .deserialize(json);
        Person personDetached = personService.createPerson(personTransient);
        return new ResponseEntity<String>(new JSONSerializer().
                exclude("*.class").
                serialize(personDetached),
                HttpStatus.OK);

    }

    @RequestMapping(value = "/{personId}", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<String> deletePerson (@PathVariable("personId") BigDecimal personId) {

        personService.deletePerson(personId);
        return this.personList();

    }

}
