package Models;
public class Person extends BaseClass{
    private String Name;
    private String LastName;
    public Person() {
        super();
    }
    public Person(String name, String lastName) {
        Name = name;
        LastName = lastName;
    }
    public Person(int id, String rol, String name, String lastName) {
        super(id, rol);
        Name = name;
        LastName = lastName;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    @Override
    public String toString() {
        return "Empleado: (" +
                "Nombre='" + Name + '\'' +
                ", Apellido='" + LastName + '\'' +
                ") " + super.toString();
    }
}
