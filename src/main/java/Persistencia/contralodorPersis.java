/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Logica.Ciudad;
import Logica.Cliente;
import Logica.Cuenta;
import Logica.Persona;
import Logica.Usuario;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class contralodorPersis {
    
    CiudadJpaController ciudadJpa = new CiudadJpaController();
    ClienteJpaController clienteJpa = new ClienteJpaController();
    CuentaJpaController cuentaJpa = new CuentaJpaController();
    PersonaJpaController personaJpa = new PersonaJpaController();
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();

    public void guardar_ciudad(Ciudad ciudad) {
        ciudadJpa.create(ciudad);
    }
       public void guardar_cliente(Cliente cliente) {
        clienteJpa.create(cliente);
    }

    public void guardar_persona(Persona persona) {
        personaJpa.create(persona);
    }

    public void guardar_cuentas(Cuenta cuenta) {
        cuentaJpa.create(cuenta);
    }

    public List<Usuario> traerUsuarios() {
     return usuarioJpa.findUsuarioEntities();
    
    
    }
}
