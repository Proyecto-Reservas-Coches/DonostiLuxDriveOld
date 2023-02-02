package clases;
/*id_seguros` int(11) NOT NULL,
  `tipo` varchar(15) DEFAULT NULL,
  `precio` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;*/

public class Seguro {
    //Declaraciopn de varibles
    int id_seguros;
    String tipo;
    int precio;
    //Metodo Constructor
    Seguro(int id, String tp, int prc){
        id_seguros=id;
        tipo=tp;
        precio=prc;
    }
    //Metodos setter and getter
    public int getId_seguros() {
        return id_seguros;
    }

    public void setId_seguros(int id_seguros) {
        this.id_seguros = id_seguros;
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
