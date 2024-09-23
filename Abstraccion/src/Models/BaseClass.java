package Models;
public class BaseClass {
    private int Id;
    private String rol;
    public BaseClass() {
    }
    public BaseClass(int id, String rol) {
        this.Id = id;
        this.rol = rol;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    @Override
    public String toString() {
        return "Id y Rol: (" +
                "Id=" + Id +
                ", Rol='" + rol + '\'' +
                ')';
    }
}
