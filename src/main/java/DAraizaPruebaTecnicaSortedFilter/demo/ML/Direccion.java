/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAraizaPruebaTecnicaSortedFilter.demo.ML;

/**
 *
 * @author digis
 */
public class Direccion {
    private int IdDireccion;
    private String Nombre;
    private String Calle;
    private String Pais;

    
    public Direccion(){}
    
    public Direccion(int IdDireccion, String Nombre, String Calle, String Pais) {
        this.IdDireccion = IdDireccion;
        this.Nombre = Nombre;
        this.Calle = Calle;
        this.Pais = Pais;
    }

    
    
    
    public int getIdDireccion() {
        return IdDireccion;
    }

    public void setIdDireccion(int IdDireccion) {
        this.IdDireccion = IdDireccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }
    
    
    
}
