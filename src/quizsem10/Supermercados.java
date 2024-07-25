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
/* Declaración de variables */
public class Supermercados {

    private int codigo;
    private String nombre;
    private String empleado;
    private String cedula;
    private int cantidad;
    private double precioBase;
    private TipoProducto tipoProducto;
    private double precioBruto;
    private double gananciaEsperada;
    public int codigosuper;
    public String mercado;

    public enum TipoProducto {
        ALIMENTOS, BEBIDAS, HIGIENE, LIMPIEZA
    }

    /* Constructor */
    public Supermercados(int codigo, String nombre, String empleado, String cedula, int cantidad, double precioBase, TipoProducto tipoProducto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.empleado = empleado;
        this.cedula = cedula;
        this.cantidad = cantidad;
        this.precioBase = precioBase;
        this.tipoProducto = tipoProducto;
        calcularPrecioBruto();
        calcularGananciaEsperada();

    }

    /* Setters */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public void setPrecioBruto(double precioBruto) {
        this.precioBruto = precioBruto;
    }

    public void setGananciaEsperada(double gananciaEsperada) {
        this.gananciaEsperada = gananciaEsperada;
    }

    /* Solicitud de Datos */
    public void obtenerDatos() {
        String mercado = JOptionPane.showInputDialog("Digite el nombre del supermercado");
        int codigosuper = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del supermercado"));
        /* Calculo del precio Bruto */
        
    private void calcularPrecioBruto() {
        switch (tipoProducto) {
            case ALIMENTOS:
                precioBruto = precioBase * 1.20;
                break;
            case BEBIDAS:
                precioBruto = precioBase * 1.30;
                break;
            case HIGIENE:
                precioBruto = precioBase * 1.25 + 500;
                break;
            case LIMPIEZA:
                precioBruto = precioBase * 1.19 + precioBase * 0.04 + 1000;
                break;
        }
    }

    /* Calculo de la ganancia */
    private void calcularGananciaEsperada() {
        gananciaEsperada = (precioBruto - precioBase) * cantidad;
    }

    /* Getters */
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreEmpleado() {
        return empleado;
    }

    public String getCedula() {
        return cedula;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public double getGananciaEsperada() {
        return gananciaEsperada;
    }

    int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos"));
    int x;
    for (x  = 0;
    x
    <=cantidad ;
    x

    
        ++){
    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del producto"));
        String nombre = JOptionPane.showInputDialog("Digite el nombre del producto");
        int preciobase = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio base del producto"));
    }
