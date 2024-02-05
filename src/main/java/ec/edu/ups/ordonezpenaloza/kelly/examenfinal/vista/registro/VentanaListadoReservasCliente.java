/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.ordonezpenaloza.kelly.examenfinal.vista.registro;

import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.controlador.ClienteControlador;
import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.modelo.Reserva;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class VentanaListadoReservasCliente extends javax.swing.JInternalFrame {
private ClienteControlador clienteControlador;

    public VentanaListadoReservasCliente(ClienteControlador clienteControlador) {
        this.clienteControlador = clienteControlador;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        btnMostrarReservasPorCedula = new javax.swing.JButton();
        lblReservaciones = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblReservasCliente = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblCedula.setText("Cédula del cliente");

        btnMostrarReservasPorCedula.setText("Mostrar");
        btnMostrarReservasPorCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarReservasPorCedulaActionPerformed(evt);
            }
        });

        lblReservaciones.setText("Reservaciones");

        tblReservasCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblReservasCliente);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCedula)
                    .addComponent(lblReservaciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(btnMostrarReservasPorCedula))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarReservasPorCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblReservaciones)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarReservasPorCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarReservasPorCedulaActionPerformed
        String cedulaCliente = txtCedula.getText();
    if (cedulaCliente.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese su número de cédula.");
        return;
    }

    // 2. Call the controller method:
    List<Reserva> reservas;
    try {
        reservas = clienteControlador.buscarReservasPorCedulaCliente(cedulaCliente);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al buscar reservas: " + e.getMessage());
        return; // Handle errors gracefully
    }

    // 3. Display reservations (use JTable instead of JList for flexibility):
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Fecha");
    model.addColumn("Hora");
    model.addColumn("Número de personas");
    model.addColumn("Restaurante");

    for (Reserva reserva : reservas) {
        model.addRow(new Object[]{reserva.getFecha(), reserva.getHora(), reserva.getNumeroPersonas(), reserva.getNombreRestaurante()});
    }

    tblReservasCliente.setModel(model); // Assuming you have a JTable named tblReservasCliente
    }//GEN-LAST:event_btnMostrarReservasPorCedulaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarReservasPorCedula;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblReservaciones;
    private javax.swing.JTable tblReservasCliente;
    private javax.swing.JTextField txtCedula;
    // End of variables declaration//GEN-END:variables
}
