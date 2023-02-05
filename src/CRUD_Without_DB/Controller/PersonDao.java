package CRUD_Without_DB.Controller;

import CRUD_Without_DB.Entity.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDao {
    private List<Person> people = new ArrayList<>();

    // Add a person details
    public void addPerson(Person person){
        people.add(person);
    }

    //Getting all person
    public List<Person> getPeople(){
        return people;
    }

    //Update a person details
    public void updatePerson(Person person, int index){
        people.set(index, person);
    }

    //Delete/Remove a person details
    public void deletePerson(int index){
        people.remove(index);
    }
}
