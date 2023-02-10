package clases;
public class Usuario {
    //Declaracion de variables
    int id_usuario;
    tipo tipo_usuario;
    String nombre;
    String apellido;
    String email;
    String contrasena;

    String telefono;
    String dni;
    //enum tipo {n, a};



    Usuario(tipo tp, String nmbr, String apll, String mail,String contra, String tlf ) {
        this.tipo_usuario = tp;
        this.nombre=nmbr;
        this.apellido=apll;
        this.email=mail;
        this.contrasena=contra;
        this.telefono=tlf;
    }

    Usuario(int id, tipo tp, String nmbr, String apll, String mail,String contra, String tlf ) {
        this.id_usuario=id;
        this.tipo_usuario = tp;
        this.nombre=nmbr;
        this.apellido=apll;
        this.email=mail;
        this.contrasena=contra;
        this.telefono=tlf;
    }
    enum tipo {n, a};
    //Metodos setter and getter

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

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
