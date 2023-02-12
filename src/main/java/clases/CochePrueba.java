package clases;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.StringProperty;

public class CochePrueba {
    //Declaracion de variables
    private IntegerProperty id_coche;
    private StringProperty matricula;
    private String marca;
    private StringProperty modelo;
    private IntegerProperty caballos;
    private StringProperty color;
    private IntegerProperty ano;
    private IntegerProperty precio_base;

    //Metodo Constructor


    public CochePrueba(String marca) {
        this.marca = marca;
    }

    public CochePrueba(StringProperty modelo) {
        this.modelo = modelo;
    }

    //@Override
    //public String toString(){
     // /  return  (modelo.get());
    //}

}
