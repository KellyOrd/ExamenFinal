/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.ordonezpenaloza.kelly.examenfinal.vista.registro;

import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.controlador.ClienteControlador;
import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.controlador.ReservaControlador;
import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.modelo.Reserva;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class VentanaRegistroReserva extends javax.swing.JInternalFrame {
    private ClienteControlador clienteControlador;
    private ReservaControlador reservaControlador;
    /**
     * Creates new form VentanaRegistroReserva
     */
    public VentanaRegistroReserva(ReservaControlador reservaControlador) {
        initComponents();
        this.reservaControlador = reservaControlador;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        lstRestaurantes = new javax.swing.JList<>();
        lblRestaurantes = new javax.swing.JLabel();
        btnMostrarRestaurantes = new javax.swing.JButton();
        lblNumPersonas = new javax.swing.JLabel();
        txtNumPersonas = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblHora = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        btnGuardarReserva = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setToolTipText("Registro Reserva");

        lblCedula.setText("Cédula del cliente");

        lstRestaurantes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstRestaurantes);

        lblRestaurantes.setText("Restaurantes");

        btnMostrarRestaurantes.setText("Mostrar");
        btnMostrarRestaurantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRestaurantesActionPerformed(evt);
            }
        });

        lblNumPersonas.setText("Número de personas");

        lblFecha.setText("Fecha");

        lblHora.setText("Hora");

        btnGuardarReserva.setText("Guardar");
        btnGuardarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarReservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHora)
                    .addComponent(lblFecha)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCedula)
                            .addComponent(lblRestaurantes))
                        .addGap(15, 15, 15))
                    .addComponent(lblNumPersonas))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(txtCedula)
                    .addComponent(txtNumPersonas)
                    .addComponent(txtFecha)
                    .addComponent(txtHora, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrarRestaurantes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarReserva)
                .addGap(138, 138, 138))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRestaurantes)
                    .addComponent(btnMostrarRestaurantes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumPersonas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHora)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardarReserva)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("Registro Reserva");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarReservaActionPerformed
        String nombreRestaurante = lstRestaurantes.getSelectedValue();
    if (nombreRestaurante == null) {
        JOptionPane.showMessageDialog(this, "Seleccione un restaurante antes de guardar la reserva.");
        return;
    }

    String cedulaCliente = txtCedula.getText();
    int numeroPersonas = Integer.parseInt(txtNumPersonas.getText());
    String fecha = txtFecha.getText();
    String hora = txtHora.getText();

    Reserva reserva = new Reserva(cedulaCliente, nombreRestaurante, numeroPersonas, fecha, hora);

    boolean aforoDisponible = clienteControlador.validarAforoDisponible(nombreRestaurante, numeroPersonas, fecha, hora);
    if (!aforoDisponible) {
        JOptionPane.showMessageDialog(this, "Lo sentimos, el restaurante seleccionado no tiene aforo disponible para la fecha y hora especificadas.");
        return;
    }

    clienteControlador.crearReserva(reserva);

    JOptionPane.showMessageDialog(this, "Reserva realizada exitosamente!");
    limpiarDatos();
    }//GEN-LAST:event_btnGuardarReservaActionPerformed

    private void btnMostrarRestaurantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRestaurantesActionPerformed
        String cedula = txtCedula.getText();

  if (cedula.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Ingrese la cédula del cliente para mostrar sus reservas.");
    return;
  }

  List<Reserva> reservas = clienteControlador.obtenerReservasPorCliente(cedula);

  if (reservas.isEmpty()) {
    JOptionPane.showMessageDialog(this, "El cliente no tiene reservas registradas.");
    return;
  }

// Crea un modelo de lista para las reservas.
DefaultListModel<String> listModel = new DefaultListModel<>();

// Agrega las reservas al modelo de lista.
for (Reserva reserva : reservas) {
  String text = reserva.getFecha() + " - " + reserva.getHora() + " - " +
      reserva.getNombreRestaurante() + " - " + reserva.getNumeroPersonas();
  listModel.addElement(text);
}

// Asigna el modelo de lista al JList.
lstRestaurantes.setModel(listModel);

    btnGuardarReserva.setEnabled(true);
    }//GEN-LAST:event_btnMostrarRestaurantesActionPerformed
    private void limpiarDatos() {
    txtCedula.setText("");
    btnMostrarRestaurantes.setEnabled(false); 
    lstRestaurantes.setListData(new String[0]); 
    txtNumPersonas.setText("");
    txtFecha.setText("");
    txtHora.setText("");
    btnGuardarReserva.setEnabled(false); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarReserva;
    private javax.swing.JButton btnMostrarRestaurantes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblNumPersonas;
    private javax.swing.JLabel lblRestaurantes;
    private javax.swing.JList<String> lstRestaurantes;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtNumPersonas;
    // End of variables declaration//GEN-END:variables
}
