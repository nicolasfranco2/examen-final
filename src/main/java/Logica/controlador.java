/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;


import Interfaz.exceptions.Principal;
import Persistencia.contralodorPersis;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class controlador {
    contralodorPersis ControladoraPersistencia = new contralodorPersis();

    public void guardar_ciudad(String NombreCity, String Depar, String Postal ) {
        //ciudad
        Ciudad ciudad = new Ciudad();
        ciudad.setCiudad(NombreCity);
        ciudad.setDepartamento(Depar);
        ciudad.setPostal_code(Postal);
       ControladoraPersistencia.guardar_ciudad(ciudad);
    }



    public void guardar_cliente(Date fechaIngreso, String califi, String Estatus) {
         Cliente cliente = new Cliente();

        // Convertir Date a LocalDateTime
        Instant instant = fechaIngreso.toInstant();
        LocalDateTime fechaIngresoParsed = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        cliente.setFechaIngreso(fechaIngresoParsed);
        cliente.setCalificacion(califi);
        cliente.setEstado(Estatus);
        ControladoraPersistencia.guardar_cliente(cliente);

    }

    public void guardar_persona(String Nombre, String Apellido, String Tipo_documento, String Documento, String Direccion, String Celular, String Email) {
        Persona persona = new Persona();
        persona.setNombre(Nombre);
        persona.setApellido(Apellido);
        persona.setTipoDocumento(Tipo_documento);
        persona.setNroDocumento(Documento);
        persona.setDireccion(Direccion);
        persona.setCelular(Celular);
        persona.setEmail(Email);
        
        
        ControladoraPersistencia.guardar_persona(persona);
        
    }



  

   public void guardar_cuenta(String nroCuenta, Date fechaAlta, String tipoDocumento, Cuenta.EstadoCuenta estado, double saldo, String nroContrato, double costoMantenimiento, double promedioAcreditacion, String moneda) {
    Cuenta cuenta = new Cuenta();
    cuenta.setNroCuenta(nroCuenta);

    // Convertir Date a LocalDate
    Instant instant = fechaAlta.toInstant();
    LocalDate fechaAltaLocalDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();
    cuenta.setFechaAlta(fechaAltaLocalDate);

    cuenta.setTipoDocumento(tipoDocumento);
    cuenta.setEstado(estado);
    cuenta.setSaldo(saldo);
    cuenta.setNroContrato(nroContrato);
    cuenta.setCostoMantenimiento(costoMantenimiento);
    cuenta.setPromedioAcreditacion(promedioAcreditacion);
    cuenta.setMoneda(moneda);

    ControladoraPersistencia.guardar_cuentas(cuenta);
}

    public String ValidaruUsuario(String username, String password) {
            String mensaje="";
            List<Usuario> listaUsuario = ControladoraPersistencia.traerUsuarios();
            for(Usuario usu : listaUsuario){
               if (usu.getUsername().equals(username)) {
                   if (usu.getPassword().equals(password)){
                       mensaje = "Usuario y contraseña correctos, bienvenido";
                       
                       Principal princ = new Principal();
                        princ.setVisible(true);
                       princ.SetLocationRelativeTo(null);
                       }
                   
                   else {
                       mensaje = "Contraseña incorrecta";
            }
    }
               else {
                mensaje = "Usuario no encontrado ";
                    }   }        
     
           return mensaje;    
               
            }
   
}