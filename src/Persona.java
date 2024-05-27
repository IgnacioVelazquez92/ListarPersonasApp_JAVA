public class Persona {
    private int id;
    private String nombre;
    private String tel;
    private String email;

    private static int numeroPersonas = 0;

    //Agregamos un constructor vacio
    public Persona() {
        this.id = ++Persona.numeroPersonas;
    }

    //Constructor con argumentos
    //sobre carga del constructor

    public Persona(String nombre, String tel, String email) {
        this(); //llamo al constructor vacio
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "tel='" + tel + '\'' +
                ", nombre='" + nombre + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                '}';
    }

}
