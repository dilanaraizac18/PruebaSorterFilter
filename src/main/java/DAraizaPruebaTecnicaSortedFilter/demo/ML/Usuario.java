/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAraizaPruebaTecnicaSortedFilter.demo.ML;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author digis
 */
public class Usuario {
    
    
    private String IdUsuario;
    private String Email;
    private String Username;
    private String Telefono;
    private String Password;
    private String TaxId;
    public LocalDate Fecha;
    public List<Direccion> Direcciones;

    public Usuario(){}
    
    public Usuario(String IdUsuario, String Email, String Username, String Telefono, String Password, String TaxId, LocalDate Fecha, List<Direccion> Direcciones) {
        this.IdUsuario = IdUsuario;
        this.Email = Email;
        this.Username = Username;
        this.Telefono = Telefono;
        this.Password = Password;
        this.TaxId = TaxId;
        this.Fecha = Fecha;
        this.Direcciones =  Direcciones;
    }

    
    
    
    


    public String getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(String IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getTaxId() {
        return TaxId;
    }

    public void setTaxId(String TaxId) {
        this.TaxId = TaxId;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }

    public List<Direccion> getDirecciones() {
        return Direcciones;
    }

    public void setDirecciones(List<Direccion> Direcciones) {
        this.Direcciones = Direcciones;
    }
    
    
    
}
    

