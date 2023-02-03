package clases;

public class Coche {
    //Declaracion de variables
    private int id_coche;
    private String matricula;
    private int caballos;
    private String color;
    private int ano;
    private int precio_base;
    //Metodo Constructor
    public Coche(int id,String matr, int cbll, String cl,int a, int prBase ){
        id_coche=id;
        matricula= matr;
        caballos=cbll;
        color=cl;
        ano=a;
        precio_base=prBase;
    }
    //Metodos setter and getter

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

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
        return precio_base;
    }

    public void setPrecioBase(int precio_base) {
        this.precio_base = precio_base;
    }
}
