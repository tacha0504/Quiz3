/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizsem10;

import javax.swing.JOptionPane;

/**
 *
 * @author TChaves
 */

public class Productos {

    public int codigo;
    public String nombre;
    public int cantidad;
    public int preciobase = 0;
    public int tipo;
    public int preciobruto;
    public int ganancia;
    public String mercado;
    public int codigosuper;

        public Productos(int codigo, String nombre, int cantidad, int preciobase, String tipo, int preciobruto, int ganancia, String mercado, int codigosuper) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.cantidad = cantidad;
            this.preciobase = preciobase;
            this.tipo = tipo;
            this.preciobruto = preciobruto;
            this.ganancia = ganancia;
            this.mercado = mercado;
            this.codigosuper = codigosuper;
        }
          

   
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPreciobase() {
        return preciobase;
    }

    public void setPreciobase(int preciobase) {
        this.preciobase = preciobase;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPreciobruto() {
        return preciobruto;
    }

    public void setPreciobruto(int preciobruto) {
        this.preciobruto = preciobruto;
    }

    public int getGanancia() {
        return ganancia;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }

    public void obtenerDatos(){
    String mercado = JOptionPane.showInputDialog("Digite el nombre del supermercado");
    int codigosuper = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del supermercado"));
int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos"));
int x;
for (x=0;x<=cantidad;x++){
    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del producto"));
String  nombre = JOptionPane.showInputDialog("Digite el nombre del producto");
int preciobase = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio base del producto"));
int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 si el producto a ingresar es de tipo Alimentos, 2 si es de tipo Bebidas, 3 si es de tipo Higiene o 4 si es de tipo Limpieza: "));
    if (tipo == 1) {
        preciobruto = preciobase * 0.20 + preciobase;
} if (tipo == 2){
preciobruto = preciobase * 0.30 + preciobase;
} if (tipo == 3){
preciobruto = preciobase * 0.25 + preciobase+500;
} if (tipo == 4){
preciobruto = preciobase * 0.19 + preciobase * 0.04 + 1000 + preciobase;}


    }
}

