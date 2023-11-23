/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

    @Entity
    public class Persona implements Serializable {
       @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY )
            private int id_Persona;
       
            private String Nombre;
            private String Apellido;    
            private String TipoDocumento;
            private String NroDocumento;
            private String Direccion;
            private String Celular;
            private String Email;
            private String Estado;
         @OneToOne
            private Ciudad id_ciudad;

    public int getId_Persona() {
        return id_Persona;
    }

    public void setId_Persona(int id_Persona) {
        this.id_Persona = id_Persona;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String TipoDocumento) {
        this.TipoDocumento = TipoDocumento;
    }

    public String getNroDocumento() {
        return NroDocumento;
    }

    public void setNroDocumento(String NroDocumento) {
        this.NroDocumento = NroDocumento;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Ciudad getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(Ciudad id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public Persona() {
    }

    public Persona(int id_Persona, String Nombre, String Apellido, String TipoDocumento, String NroDocumento, String Direccion, String Celular, String Email, String Estado, Ciudad id_ciudad) {
        this.id_Persona = id_Persona;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.TipoDocumento = TipoDocumento;
        this.NroDocumento = NroDocumento;
        this.Direccion = Direccion;
        this.Celular = Celular;
        this.Email = Email;
        this.Estado = Estado;
        this.id_ciudad = id_ciudad;
    }

     

    
}
