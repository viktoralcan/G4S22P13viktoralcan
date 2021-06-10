package agendamysql;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrPrincipal extends javax.swing.JFrame {

    DefaultTableModel tablaModelo = new DefaultTableModel();
    List<DatosDTO> listaDatos = new ArrayList<>();
    int vId=0;
    
    public FrPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargartitulos();
        cargar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        TxtEdad = new javax.swing.JTextField();
        TxtSexo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        BtnReg = new javax.swing.JButton();
        BtnAct = new javax.swing.JButton();
        BtnDel = new javax.swing.JButton();
        BtnLim = new javax.swing.JButton();
        BtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jLabel1.setText("Agenda");

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel3.setText("Edad:");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel4.setText("Sexo:");

        TxtNombre.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N

        TxtEdad.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N

        TxtSexo.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatos);

        BtnReg.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        BtnReg.setText("Registrar");
        BtnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegActionPerformed(evt);
            }
        });

        BtnAct.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        BtnAct.setText("Actualizar");
        BtnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActActionPerformed(evt);
            }
        });

        BtnDel.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        BtnDel.setText("Eliminar");
        BtnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDelActionPerformed(evt);
            }
        });

        BtnLim.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        BtnLim.setText("Limpiar");
        BtnLim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimActionPerformed(evt);
            }
        });

        BtnExit.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        BtnExit.setText("Salir");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnLim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnAct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)
                        .addGap(13, 13, 13)
                        .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnReg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnLim)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(BtnAct)
                                .addGap(10, 10, 10)
                                .addComponent(BtnDel)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegActionPerformed
        DatosDTO datos = new DatosDTO();
        ConexionDAO conexion = new ConexionDAO();
        
        datos.setNombre(TxtNombre.getText());
        datos.setEdad(TxtEdad.getText());
        datos.setSexo(TxtSexo.getText());
        
        limpiar ();
        
        if(conexion.inserta(datos)){
            JOptionPane.showMessageDialog(this, "Se registro correctamente...", "Registro", JOptionPane.INFORMATION_MESSAGE);
            tablaModelo = (DefaultTableModel)TablaDatos.getModel();
            tablaModelo.getDataVector().removeAllElements();
            cargar();
        }else{
            JOptionPane.showMessageDialog(this, "Error al insertar", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_BtnRegActionPerformed

    private void BtnLimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimActionPerformed
        limpiar ();
    }//GEN-LAST:event_BtnLimActionPerformed

    private void BtnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActActionPerformed
        ConexionDAO conexion = new ConexionDAO();
        DatosDTO datos = new DatosDTO();
        
        datos.setId(vId);
        datos.setNombre(TxtNombre.getText());
        datos.setEdad(TxtEdad.getText());
        datos.setSexo(TxtSexo.getText());
        
        if(conexion.actualiza(datos)){
            JOptionPane.showMessageDialog(this, "Se actualizo correctamente...", "Registro", JOptionPane.INFORMATION_MESSAGE);
            tablaModelo = (DefaultTableModel)TablaDatos.getModel();
            tablaModelo.getDataVector().removeAllElements();
            cargar();
        }else{
            JOptionPane.showMessageDialog(this, "Error al actualizar", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_BtnActActionPerformed

    private void BtnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDelActionPerformed
        DatosDTO datos = new DatosDTO();
        ConexionDAO conexion = new ConexionDAO();
        
        datos.setId(vId);
        
        if(conexion.eliminar(datos)){
            JOptionPane.showMessageDialog(this, "Se elimino correctamente...", "Registro", JOptionPane.INFORMATION_MESSAGE);
            tablaModelo = (DefaultTableModel)TablaDatos.getModel();
            tablaModelo.getDataVector().removeAllElements();
            cargar();
        }else{
            JOptionPane.showMessageDialog(this, "Error al eliminar", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_BtnDelActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        int nfilas = 0;
        int fila = 0;
        nfilas = TablaDatos.getSelectedRowCount();
        if(nfilas == 1){
            fila = TablaDatos.getSelectedRow();
            vId = (int) TablaDatos.getValueAt(fila, 0);
            TxtNombre.setText((String)TablaDatos.getValueAt(fila, 1));
            TxtEdad.setText((String)TablaDatos.getValueAt(fila, 2));
            TxtSexo.setText((String)TablaDatos.getValueAt(fila, 3));
        }
    }//GEN-LAST:event_TablaDatosMouseClicked

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnExitActionPerformed

    private void limpiar(){
        TxtNombre.setText("");
        TxtEdad.setText("");
        TxtSexo.setText("");
    }
    
    private void cargar(){
        ConexionDAO conexion = new ConexionDAO();
        if(conexion.cargar()){
            listaDatos = conexion.getDatos();
        }else{
               JOptionPane.showMessageDialog(this, "Error al cargar la informacion", "Error", JOptionPane.INFORMATION_MESSAGE); 
            }
        if(listaDatos.size() > 0 && listaDatos != null){
            cargarcontenido();
        }
    }
    
    private void cargarcontenido(){
        Object[] filatabla = new Object[4];
        for (DatosDTO datos : listaDatos){
            filatabla[0]=datos.getId();
            filatabla[1]=datos.getNombre();
            filatabla[2]=datos.getEdad();
            filatabla[3]=datos.getSexo();
            tablaModelo.addRow(filatabla);
            
        }
        TablaDatos.setModel(tablaModelo);
    }
    
    public void cargartitulos(){
        tablaModelo.addColumn("Id");
        tablaModelo.addColumn("Nombre");
        tablaModelo.addColumn("Edad");
        tablaModelo.addColumn("Sexo");
        TablaDatos.setModel(tablaModelo);
    }
    
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
            java.util.logging.Logger.getLogger(FrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAct;
    private javax.swing.JButton BtnDel;
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnLim;
    private javax.swing.JButton BtnReg;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JTextField TxtEdad;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}