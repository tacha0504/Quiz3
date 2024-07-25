/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizsem10;

/**
 *
 * @author TChaves
 */
public class Empleados {
    public String empleado;
    public int cedula;

/*Constructor*/

    public Empleados(String empleado, int cedula) {
        this.empleado = empleado;
        this.cedula = cedula;
    }
   /*Setters y Getters*/ 

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
}
