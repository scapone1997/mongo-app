package service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import java.util.List;

import entity.Person;

@ApplicationScoped
public class PersonService {

    public List<Person> getAll() {
        return Person.listAll();
    }

    @Transactional
    public void create(Person person) {
        person.persist();
    }
}