package clases;

public class Coche {
    //Declaracion de variables
    private int id_coche;
    private String matricula;
    private int caballos;
    private String color;
    private int precioBase;
    //Metodo Constructor
    public Coche(int id,String matr, int cbll, String cl, int prBase ){
        id_coche=id;
        matricula= matr;
        caballos=cbll;
        color=cl;
        precioBase=prBase;
    }
    //Metodos setter and getter
    public int getId_coche() {
        return id_coche;
    }

    public void setId_coche(int id_coche) {
        this.id_coche = id_coche;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }
}
