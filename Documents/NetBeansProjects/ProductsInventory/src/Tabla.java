

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Tabla extends javax.swing.JFrame {
    Conexion cox = new Conexion();
    Connection connt = cox.conectar();
    
    
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
   

    DefaultTableModel model = new DefaultTableModel();
    
    int id = 1;

    public Tabla() {
        initComponents();
   
        String lista[] = {"ID", "Fabricante", "Descripcion", "Precio", "Existencia"};
        model.setColumnIdentifiers(lista);
        jTable.setModel(model);
        
        listarTabla();

        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTfabricante = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTdescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTprecio = new javax.swing.JTextField();
        jTexistencia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jBagregar = new javax.swing.JButton();
        jBactualizar = new javax.swing.JButton();
        jBborrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Fabricante", "Descripcion", "Precio", "Existencia"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jLabel1.setText("ID :");

        jTid.setEditable(false);
        jTid.setEnabled(false);

        jLabel2.setText("Fabricante :");

        jTfabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfabricanteActionPerformed(evt);
            }
        });

        jLabel3.setText("Descripción :");

        jLabel4.setText("Precio :");

        jLabel6.setText("Existencia :");

        jBagregar.setText("Agregar");
        jBagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarActionPerformed(evt);
            }
        });

        jBactualizar.setText("Actualizar");
        jBactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBactualizarActionPerformed(evt);
            }
        });

        jBborrar.setText("Borrar");
        jBborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBborrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTfabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jBactualizar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTexistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTfabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTexistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBagregar)
                    .addComponent(jBactualizar)
                    .addComponent(jBborrar))
                .addContainerGap(189, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public boolean verificarDatosBasios(){
        
        boolean validar = false;
        if(jTfabricante.getText().equalsIgnoreCase("") || jTdescripcion.getText().equalsIgnoreCase("")
                || jTprecio.getText().equalsIgnoreCase("") || jTexistencia.getText().equalsIgnoreCase("")){
            
            validar = true;
        }
        
        return validar;
    } 
    private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed
        
        if(!verificarDatosBasios()){
            
            try {
                PreparedStatement ps = connt.prepareStatement("INSERT INTO tabla (Fabricante, Descripcion, Precio, Existencia)VALUE(?,?,?,?)");

                ps.setString(1, jTfabricante.getText());
                ps.setString(2, jTdescripcion.getText());
                ps.setString(3, jTprecio.getText());
                ps.setString(4, jTexistencia.getText());

                ps.executeUpdate();

                JOptionPane.showMessageDialog(rootPane, "Se agregó a la base de datos");

                try{

                    model.addRow(new Object [] { (id++), jTfabricante.getText(), jTdescripcion.getText(),
                        jTprecio.getText(), jTexistencia.getText()} );

                    jTfabricante.setText("");
                    jTdescripcion.setText("");
                    jTprecio.setText("");
                    jTexistencia.setText("");

                    JOptionPane.showMessageDialog(rootPane, "Datos agregados a la tabla");

                } catch (Exception ex){
                    
                     System.out.println("Los datos no se agregaron a la tabla");

                }


            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Inconsistencia, verifique si:"
                + "\n- Precio es un valor numerico.\n- La existencia es un número entero.\n\n"+ex);
                
            }
        } else {
            
            JOptionPane.showMessageDialog(rootPane, "Verifique si todos los campos estan completados");
        }
        
        
    }//GEN-LAST:event_jBagregarActionPerformed

    private void jTfabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfabricanteActionPerformed
        
    }//GEN-LAST:event_jTfabricanteActionPerformed

    private void jBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizarActionPerformed
       
        int indice = jTable.getSelectedRow();
        
        if(indice >= 0){
            if(!verificarDatosBasios()){
                try {
                    PreparedStatement ps = connt.prepareStatement("UPDATE tabla set Fabricante='"+jTfabricante.getText()
                            +"', Descripcion='"+jTdescripcion.getText()+"', Precio='"+Double.valueOf(jTprecio.getText())
                            +"', Existencia='"+Double.valueOf(jTexistencia.getText())+"' where ID='"+jTid.getText()+"'");

                    ps.executeUpdate();

                    JOptionPane.showMessageDialog(rootPane, "Base de datos actualizada");

                    try {
                        model.setValueAt(jTfabricante.getText(), jTable.getSelectedRow(), 1);
                        model.setValueAt(jTdescripcion.getText(), jTable.getSelectedRow(), 2);
                        model.setValueAt(jTprecio.getText(), jTable.getSelectedRow() ,3);
                        model.setValueAt(jTexistencia.getText(), jTable.getSelectedRow(), 4);

                        JOptionPane.showMessageDialog(rootPane, "Se actualizo la tabla");


                    } catch (Exception e) {

                        JOptionPane.showMessageDialog(rootPane, "No se actualizo la tabla:\n"+e);
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(rootPane, "Inconsistencia, verifique si:"
                    + "\n- Precio es un valor numerico.\n- La existencia es un número entero.\n\n"+ex);
                }
            } else {
            
                JOptionPane.showMessageDialog(rootPane, "Verifique si todos los campos estan completados");
            
            }
            
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un fila");
        }
    }//GEN-LAST:event_jBactualizarActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        
        int fila = jTable.getSelectedRow();
        try{
            jTid.setText(jTable.getValueAt(fila, 0).toString());
            jTfabricante.setText(jTable.getValueAt(fila, 1).toString());
            jTdescripcion.setText(jTable.getValueAt(fila, 2).toString());
            jTprecio.setText(jTable.getValueAt(fila, 3).toString());
            jTexistencia.setText(jTable.getValueAt(fila, 4).toString());
            
        } catch(Exception ex) {
            
            JOptionPane.showMessageDialog(rootPane, "Seleccione una fila\n"+ex);
        }
        
        
        
    }//GEN-LAST:event_jTableMouseClicked

    
    public void listarTabla(){
        
        String mysql = "select * from tabla";
        
        try {
            st = connt.createStatement();
            rs = st.executeQuery(mysql);
            
            model = (DefaultTableModel) jTable.getModel();
            Object list[] = new Object[5];
            
            
            while(rs.next()){
                
                list[0] = rs.getInt("ID");
                list[1] = rs.getString("Fabricante");
                list[2] = rs.getString("Descripcion");
                list[3] = rs.getDouble("Precio");
                list[4] = rs.getInt("Existencia");
                
                model.addRow(list);
               
            }
            
            jTable.setModel(model);
           
        } catch (Exception e) {
           JOptionPane.showMessageDialog(rootPane, "No se cargo la base de datos:\n"+e);
        }
        
        
    }
    
    
    private void jBborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBborrarActionPerformed

        int indice = jTable.getSelectedRow();
        
        if(indice >= 0){
            
            if(JOptionPane.showConfirmDialog(rootPane, 
                   "¿Seguro que desea eliminar esta fila?", "Salir", JOptionPane.YES_NO_OPTION )==0){
            
                try {
                    PreparedStatement ps = connt.prepareStatement("DELETE from tabla where ID='"+jTid.getText()+"'");
                    ps.executeUpdate();

                    JOptionPane.showMessageDialog(rootPane, "Se eliminó la fila en la base de datos");

                    try {

                        model.removeRow(jTable.getSelectedRow());


                    } catch (Exception e) {

                        JOptionPane.showMessageDialog(rootPane, "No se elimino la fila de la tabla"+e);
                    }

                } catch (SQLException ex) {

                    JOptionPane.showMessageDialog(rootPane, "Error, no se elimino la fila en la base de datos:\n"+ex);
                }
                
            }
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccione una fila.");

        }
        
        
        
    }//GEN-LAST:event_jBborrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBactualizar;
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jBborrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTdescripcion;
    private javax.swing.JTextField jTexistencia;
    private javax.swing.JTextField jTfabricante;
    private javax.swing.JTextField jTid;
    private javax.swing.JTextField jTprecio;
    // End of variables declaration//GEN-END:variables
}
