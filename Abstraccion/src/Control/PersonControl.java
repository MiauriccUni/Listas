package Control;
import Models.Person;
import java.util.ArrayList;
import java.util.Iterator;
public class PersonControl {
    private static ArrayList<Person> listPersons = new ArrayList<>();
    public static String addPerson(int id, String role, String name, String lastName ) {
        Person person = new Person(id, role, name, lastName);
        person.setId(id);
        person.setRol(role);
        person.setName(name);
        person.setLastName(lastName);
        listPersons.add(person);
        return person.toString();
    }
    public static ArrayList<Person> getListPersons() {
        for (Person person : listPersons) {
            System.out.println(person.toString());
        }
        return listPersons;
    }
    public static String getPerson(int id, String name, String lastName, String role) {
        boolean found = false;

        for (Person person : listPersons) {
            if (person.getId() == id) {
                person.setName(name);
                person.setLastName(lastName);
                person.setRol(role);
                found = true;
                break;
            }
        }
        if (!found) {
            return "La identificacion indicada no existe";
        }
        return "Se realizo la modificacion";
    }
    public static String removePerson(int id) {
        Iterator<Person> iterator = listPersons.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getId() == id) {
                iterator.remove();
                return "Se elimino la modificacion";
            }
        }
        return "No se encintro la identificacion indicada";
    }
}
