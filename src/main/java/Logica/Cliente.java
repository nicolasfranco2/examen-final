/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int  id_Cliente;
    private LocalDateTime FechaIngreso;
    private String Calificacion;
    private String Estado;
    
    @OneToOne
    private Persona id_persona;  

    public Cliente(int id_Cliente, LocalDateTime FechaIngreso, String Calificacion, String Estado, Persona id_persona) {
        this.id_Cliente = id_Cliente;
        this.FechaIngreso = FechaIngreso;
        this.Calificacion = Calificacion;
        this.Estado = Estado;
        this.id_persona = id_persona;
    }

    public Cliente() {
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public LocalDateTime getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(LocalDateTime FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public String getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(String Calificacion) {
        this.Calificacion = Calificacion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Persona getId_persona() {
        return id_persona;
    }

    public void setId_persona(Persona id_persona) {
        this.id_persona = id_persona;
    }


} 
