package clases;

public class Reserva {
    //Declaracion de variables
        int id_reserva;
        int id_usuario;
        int id_coche;
        String localizacion;
        String fechaIn;
        String fechaFin;
        String hora;
        boolean chofer;

    //Metodo Constructor
    Reserva(int id,int id_usuario,int id_coche, String loca, String fIn, String fFin, String hr, boolean chf){
        id_reserva=id;
        this.id_usuario=id_usuario;
        this.id_coche=id_coche;
        localizacion=loca;
        fechaIn=fIn;
        fechaFin=fFin;
        hora=hr;
        chofer=chf;

    }
    //Metodos setter and getter
    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(String fechaIn) {
        this.fechaIn = fechaIn;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public boolean isChofer() {
        return chofer;
    }

    public void setChofer(boolean chofer) {
        this.chofer = chofer;
    }
}
