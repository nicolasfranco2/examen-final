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

@Entity
public class Ciudad implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private String ciudad;

    public Ciudad() {
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getPostal_code() {
        return Postal_code;
    }

    public void setPostal_code(String Postal_code) {
        this.Postal_code = Postal_code;
    }

    public Ciudad(int id, String ciudad, String Departamento, String Postal_code) {
        this.id = id;
        this.ciudad = ciudad;
        this.Departamento = Departamento;
        this.Postal_code = Postal_code;
    }
    private String Departamento;
    private String Postal_code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
