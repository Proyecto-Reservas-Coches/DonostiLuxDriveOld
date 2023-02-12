package clases;
/*id_seguros` int(11) NOT NULL,
  `tipo` varchar(15) DEFAULT NULL,
  `precio` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;*/

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

import java.sql.*;

public class SeguroPrueba {
    //Declaraciopn de varibles
    private IntegerProperty id_seguro;
    private StringProperty tipo;
    private IntegerProperty precio;

    //Metodo Constructor
    public SeguroPrueba(Integer id, String tp, Integer prc) {
        this.id_seguro = new SimpleIntegerProperty(id);
        this.tipo = new SimpleStringProperty(tp);
        this.precio = new SimpleIntegerProperty(prc);
    }
    public SeguroPrueba(String tp) {
        //this.id_seguro = new SimpleIntegerProperty(id);
        this.tipo = new SimpleStringProperty(tp);
        //this.precio = new SimpleIntegerProperty(prc);
    }

    public Integer getId_seguro() {
        return id_seguro.get();
    }

    public void setId_seguro (Integer id) {
        this.id_seguro = new SimpleIntegerProperty(id);
    }

    public void setId_seguro(int id_seguro) {
        this.id_seguro.set(id_seguro);
    }

    public String getTipo() {
        return tipo.get();
    }

    public StringProperty tipoProperty() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo.set(tipo);
    }

    public int getPrecio() {
        return precio.get();
    }

    public IntegerProperty precioProperty() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio.set(precio);
    }

    /*public static void llenarSeguro(Connection connection, ObservableList<SeguroPrueba> lista) {

        /*try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ejemplocrud", "root", "");
            Statement statement = connection.createStatement();
            ResultSet resultado = statement.executeQuery("SELECT tipo FROM seguros");
            while (resultado.next()){
                lista.add(new SeguroPrueba(resultado.getString("tipo")));


            }

            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            Statement statement = connection.createStatement();
            ResultSet resultado = statement.executeQuery("SELECT id," +
                    " tipo," +
                    " precio " +
                    " FROM seguros"
            );
            while (resultado.next()) {
                lista.add(new SeguroPrueba(
                        resultado.getInt("id"),
                        resultado.getString("tipo"),
                        resultado.getInt("precio")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }*/
    @Override
    public String toString(){
        return  (tipo.get());
    }
}
