/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz.exceptions;

import Logica.Cuenta;
import Logica.Cuenta.EstadoCuenta;
import Logica.controlador;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Lenovo
 */
public class Cuentas extends javax.swing.JFrame {
    controlador control = new controlador();
    
    public Cuentas() {
        initComponents();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        MaskFormatter maskFormatter = null;
         try {
            maskFormatter = new MaskFormatter("####-##-## ##:##:##");
            maskFormatter.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            e.printStackTrace();
        }
    

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        campoTipoCuenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoEstado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoSaldo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoNroContrato = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoCostoMantenimiento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoPromedioAcreditacion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        campoMoneda = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Agregar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Limpiar = new javax.swing.JButton();
        campoNroCuenta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        campoFechaAlta = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Numero de cuenta");

        jLabel3.setText("Fecha de alta");

        campoEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEstadoActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo de cuenta");

        jLabel5.setText("Estado");

        jLabel6.setText("Saldo");

        jLabel7.setText("Numero de contrato");

        jLabel8.setText("Costo de matenimiento ");

        jLabel9.setText("Promedio de acreditacion");

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        jLabel10.setText("moneda");

        Limpiar.setText("Limpiar");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 48)); // NOI18N
        jLabel1.setText("Gestion de cuentas  ");

        campoFechaAlta.setText("yyyy-MM-dd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Agregar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(campoNroCuenta)
                                            .addComponent(campoTipoCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(campoFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(campoPromedioAcreditacion))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)
                                            .addComponent(campoCostoMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(campoSaldo))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campoEstado))
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoNroContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(39, 39, 39)
                .addComponent(Limpiar)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoNroContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(campoCostoMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campoPromedioAcreditacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(campoMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Agregar)
                            .addComponent(Limpiar))
                        .addGap(44, 44, 44))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEstadoActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
     try {
            String nroCuenta = campoNroCuenta.getText();
            String fechaAltaTexto = campoFechaAlta.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaAlta = dateFormat.parse(fechaAltaTexto);
            
            String tipoDocumento = campoTipoCuenta.getText();
            EstadoCuenta estado = EstadoCuenta.valueOf(campoEstado.getText());
            
            // Validación y conversión segura de números decimales
            double saldo = parseDoubleSafe(campoSaldo.getText());
            double costoMantenimiento = parseDoubleSafe(campoCostoMantenimiento.getText());
            double promedioAcreditacion = parseDoubleSafe(campoPromedioAcreditacion.getText());
            
            String nroContrato = campoNroContrato.getText();
            String moneda = campoMoneda.getText();

            control.guardar_cuenta(nroCuenta, fechaAlta, tipoDocumento, estado, saldo, nroContrato, costoMantenimiento, promedioAcreditacion, moneda);

            // Notificar al usuario que se ha agregado el registro (puedes agregar un JOptionPane u otro método)
            System.out.println("Registro agregado exitosamente a la base de datos");
        } catch (Exception e) {
            e.printStackTrace(); // Manejar la excepción apropiadamente (puedes mostrar un mensaje al usuario o realizar otras acciones)
        }
    }

    private double parseDoubleSafe(String text) {
        try {
            return Double.parseDouble(text);
        } catch (NumberFormatException e) {
            // Manejar la excepción (puedes mostrar un mensaje al usuario o realizar otras acciones)
            System.err.println("Error al convertir número decimal: " + e.getMessage());
            return 0.0; // Otra acción predeterminada, como establecer un valor predeterminado
        }
    
             
    }//GEN-LAST:event_AgregarActionPerformed

   
      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField campoCostoMantenimiento;
    private javax.swing.JTextField campoEstado;
    private javax.swing.JFormattedTextField campoFechaAlta;
    private javax.swing.JTextField campoMoneda;
    private javax.swing.JTextField campoNroContrato;
    private javax.swing.JTextField campoNroCuenta;
    private javax.swing.JTextField campoPromedioAcreditacion;
    private javax.swing.JTextField campoSaldo;
    private javax.swing.JTextField campoTipoCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
