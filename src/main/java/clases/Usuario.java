package clases;
public class Usuario {
    //Declaracion de variables
    int id_usuario;
    String nombre;
    String apellido;
    String email;
    String telefono;
    //enum tipo {n, a};
    tipo tipo_usuario;


    Usuario(int id, String nmbr, String apll, String mail, String tlf, tipo tp)   {

        id_usuario=id;
        nombre=nmbr;
        apellido=apll;
        email=mail;
        telefono=tlf;
        tipo_usuario = tp;


    }
    enum tipo {n, a};
    //Metodos setter and getter

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public tipo getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(tipo tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }
}
