import Control.PersonControl;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        opciones();
    }
    public static void menu() {
        System.out.println("Indique 1, para realizar el registro del usuario.");
        System.out.println("Indique 2, para mostrar los registros.");
        System.out.println("Indique 3, para editar un usuario.");
        System.out.println("Indique 4, para eliminar el usuario indicado.");
        System.out.println("Indique 7 para salir de la aplicacion.");
    }
    public static void regUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del usuario: ");
        String name = sc.nextLine();
        System.out.println("Ingrese el apellido del usuario: ");
        String lasName = sc.nextLine();
        System.out.println("Ingrese el numero de identificacion: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el rol del usuario: ");
        String rol = sc.nextLine();
        String res = PersonControl.addPerson(number, rol, name, lasName);
        System.out.println(res);
    }
    public static void listTostring() {
        PersonControl.getListPersons();
    }
    public static void remove(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique la identificacion que desea eliminar: ");
        int id = Integer.parseInt(sc.nextLine());
        PersonControl.removePerson(id);
    }
    public static void opciones() {
        int opcion = 0;
        do {
            menu();
            System.out.println("Ingrese la opcion: ");
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    regUser();
                break;
                case 2:
                    listTostring();
                break;
                case 3:
                    edit();
                break;
                case 4:
                    remove();
                break;
                case 7:
                    System.out.println("Hasta pronto!");
                default:
                    System.out.println("Opcion no valida");
                break;
            }
        }while (opcion != 7);
    }
    public static void edit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el identificador del usuario: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el nuevo nombre del usuario: ");
        String name = sc.nextLine();
        System.out.println("Ingrese el nuevo apellido del usuario: ");
        String lasName = sc.nextLine();
        System.out.println("Ingrese el nuevo rol del usuario: ");
        String rol = sc.nextLine();
        PersonControl.getPerson(id,name,lasName,rol);
    }
}