package clases;

public class Imagen {
    //Declaración de variables
    int id_imagen;
    String path;
    //Constroctur
    Imagen(int id, String pth){
        id_imagen=id;
        path=pth;
    }
    //Metodos getter and setter

    public int getId_imagen() {
        return id_imagen;
    }

    public void setId_imagen(int id_imagen) {
        this.id_imagen = id_imagen;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
