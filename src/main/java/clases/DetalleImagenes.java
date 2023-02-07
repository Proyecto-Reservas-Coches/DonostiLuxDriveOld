package clases;

public class DetalleImagenes {
    //Deaclaración de varibles
    int id_coche;
    int id_imagen;
    //Constructor
    DetalleImagenes(int idCoche, int idImagen){
        id_coche=idCoche;
        id_imagen=idImagen;
    }
    //Metodos getter and getter

    public int getId_coche() {
        return id_coche;
    }

    public void setId_coche(int id_coche) {
        this.id_coche = id_coche;
    }

    public int getId_imagen() {
        return id_imagen;
    }

    public void setId_imagen(int id_imagen) {
        this.id_imagen = id_imagen;
    }
}
