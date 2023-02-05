import CRUD_Without_DB.Controller.PersonDao;
import CRUD_Without_DB.Entity.Person;

import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        PersonDao dao = new PersonDao();
        // Add a person
        dao.addPerson(new Person("Masum", 27, "Chattogram"));
        dao.addPerson(new Person("Masum D", 25, "Raozan"));


        // Retrieve a list of people
        List<Person> people = dao.getPeople();
        System.out.println("After Adding person Details");
        for (Person person : people){
            System.out.println("Nane :"+person.getName()
                    +"Age: "+person.getAge()
                    +"Address :"+person.getAddress());
        }

        //Update person details
        Person person = people.get(1);
        person.setName("Masum Didar");
        person.setAddress("Raozan, CTG");

        dao.updatePerson(person, 1);

        // Retrieve a list of people
        List<Person> updatePeople = dao.getPeople();
            System.out.println("After Updating person Details");
        for (Person updatePerson: updatePeople){
            System.out.println("Nane :"+updatePerson.getName()
                    +"Age: "+updatePerson.getAge()
                    +"Address :"+updatePerson.getAddress());
        }

        //Delete a person
        dao.deletePerson(0);

        List<Person> afterDelete = dao.getPeople();
        System.out.println("After deleting person Details");
        for (Person updatePerson: afterDelete){
            System.out.println("Nane :"+updatePerson.getName()
                    +"Age: "+updatePerson.getAge()
                    +"Address :"+updatePerson.getAddress());
        }

    }

}