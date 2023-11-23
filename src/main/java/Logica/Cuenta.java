/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

   
public class Cuenta implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_cuenta;
    private String NroCuenta;
    private LocalDate  FechaAlta;
    private String TipoDocumento;
    private EstadoCuenta estado;
    private double Saldo;
    private String nroContrato;
    private double CostoMantenimiento;
    private double PromedioAcreditacion;
    private String Moneda;
    @OneToOne
    private Cliente id_cliente;
    public enum EstadoCuenta {
    ACTIVA, INACTIVA, PENDIENTE, CERRADA
      }

    public Cuenta(int id_cuenta, String NroCuenta, LocalDate FechaAlta, String TipoDocumento, double Saldo, String nroContrato, double CostoMantenimiento, double PromedioAcreditacion, String Moneda, Cliente id_cliente) {
        this.id_cuenta = id_cuenta;
        this.NroCuenta = NroCuenta;
        this.FechaAlta = FechaAlta;
        this.TipoDocumento = TipoDocumento;
        this.Saldo = Saldo;
        this.nroContrato = nroContrato;
        this.CostoMantenimiento = CostoMantenimiento;
        this.PromedioAcreditacion = PromedioAcreditacion;
        this.Moneda = Moneda;
        this.id_cliente = id_cliente;
    }

    public Cuenta() {
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public String getNroCuenta() {
        return NroCuenta;
    }

    public void setNroCuenta(String NroCuenta) {
        this.NroCuenta = NroCuenta;
    }

    public LocalDate getFechaAlta() {
        return FechaAlta;
    }

    public void setFechaAlta(LocalDate FechaAlta) {
        this.FechaAlta = FechaAlta;
    }

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String TipoDocumento) {
        this.TipoDocumento = TipoDocumento;
    }

    public EstadoCuenta getEstado() {
        return estado;
    }

    public void setEstado(EstadoCuenta estado) {
        this.estado = estado;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public String getNroContrato() {
        return nroContrato;
    }

    public void setNroContrato(String nroContrato) {
        this.nroContrato = nroContrato;
    }

    public double getCostoMantenimiento() {
        return CostoMantenimiento;
    }

    public void setCostoMantenimiento(double CostoMantenimiento) {
        this.CostoMantenimiento = CostoMantenimiento;
    }

    public double getPromedioAcreditacion() {
        return PromedioAcreditacion;
    }

    public void setPromedioAcreditacion(double PromedioAcreditacion) {
        this.PromedioAcreditacion = PromedioAcreditacion;
    }

    public String getMoneda() {
        return Moneda;
    }

    public void setMoneda(String Moneda) {
        this.Moneda = Moneda;
    }

    public Cliente getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Cliente id_cliente) {
        this.id_cliente = id_cliente;
    }


    
}
