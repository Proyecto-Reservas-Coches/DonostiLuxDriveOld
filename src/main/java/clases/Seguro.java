package clases;
/*id_seguros` int(11) NOT NULL,
  `tipo` varchar(15) DEFAULT NULL,
  `precio` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;*/

public class Seguro {
    //Declaraciopn de varibles
    int id_seguro;
    String tipo;
    int precio;
    //Metodo Constructor
    Seguro(int id, String tp, int prc){
        id_seguro=id;
        tipo=tp;
        precio=prc;
    }
    //Metodos setter and getter
    public int getId_seguros() {
        return id_seguro;
    }

    public void setId_seguros(int id) {
        this.id_seguro = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
