/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FASARLJP
 */
public class FrmPrincipal extends javax.swing.JFrame {

    //Vector<ListaPersonas> registro;
    PrincipalClass registro = new PrincipalClass();

 
    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        barraMenus = new javax.swing.JMenuBar();
        menuAgregar = new javax.swing.JMenu();
        menuItemAgregarAlumno = new javax.swing.JMenuItem();
        separador1 = new javax.swing.JPopupMenu.Separator();
        menuAgregarMaestro = new javax.swing.JMenuItem();
        menuModificar = new javax.swing.JMenu();
        menuItemModificarPersonas = new javax.swing.JMenuItem();
        menuItemModificarAlumno = new javax.swing.JMenuItem();
        separador2 = new javax.swing.JPopupMenu.Separator();
        menuModificarMaestro = new javax.swing.JMenuItem();
        menuRegistro = new javax.swing.JMenu();
        menuItemVerDetalles = new javax.swing.JMenuItem();
        separador3 = new javax.swing.JPopupMenu.Separator();
        menuEliminar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        setLocation(new java.awt.Point(100, 100));

        tblDatos.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        tblDatos.setForeground(new java.awt.Color(204, 0, 204));
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDatos);

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        menuAgregar.setText("Agregar");

        menuItemAgregarAlumno.setText("Agregar Alumnos");
        menuItemAgregarAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItemAgregarAlumnoMouseClicked(evt);
            }
        });
        menuItemAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAgregarAlumnoActionPerformed(evt);
            }
        });
        menuAgregar.add(menuItemAgregarAlumno);
        menuAgregar.add(separador1);

        menuAgregarMaestro.setText("Agregar Maestro");
        menuAgregarMaestro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAgregarMaestroMouseClicked(evt);
            }
        });
        menuAgregarMaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgregarMaestroActionPerformed(evt);
            }
        });
        menuAgregar.add(menuAgregarMaestro);

        barraMenus.add(menuAgregar);

        menuModificar.setText("Modificar");

        menuItemModificarPersonas.setText("Modificar Personas");
        menuItemModificarPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItemModificarPersonasMouseClicked(evt);
            }
        });
        menuModificar.add(menuItemModificarPersonas);

        menuItemModificarAlumno.setText("Modificar Alumnos");
        menuItemModificarAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItemModificarAlumnoMouseClicked(evt);
            }
        });
        menuItemModificarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemModificarAlumnoActionPerformed(evt);
            }
        });
        menuModificar.add(menuItemModificarAlumno);
        menuModificar.add(separador2);

        menuModificarMaestro.setText("Modificar Maestro");
        menuModificarMaestro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuModificarMaestroMouseClicked(evt);
            }
        });
        menuModificar.add(menuModificarMaestro);

        barraMenus.add(menuModificar);

        menuRegistro.setText("Registro");

        menuItemVerDetalles.setText("Ver detalles");
        menuItemVerDetalles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItemVerDetallesMouseClicked(evt);
            }
        });
        menuItemVerDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerDetallesActionPerformed(evt);
            }
        });
        menuRegistro.add(menuItemVerDetalles);
        menuRegistro.add(separador3);

        menuEliminar.setText("Eliminar registro");
        menuEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEliminarMouseClicked(evt);
            }
        });
        menuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarActionPerformed(evt);
            }
        });
        menuRegistro.add(menuEliminar);

        barraMenus.add(menuRegistro);

        setJMenuBar(barraMenus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAgregarAlumnoActionPerformed
        AgregarAlumnos agregaralumno = new AgregarAlumnos(this, registro);
        agregaralumno.setVisible(true);
        
        
    }//GEN-LAST:event_menuItemAgregarAlumnoActionPerformed

    public void registro(PrincipalClass registro) {
        this.registro = registro;

    }
    
    public void mostrarRegistros(){
        DefaultTableModel modelo = (DefaultTableModel) tblDatos.getModel();
        modelo.setRowCount(0);//limpiamos tabla
        if(registro.size() >= 1){
            ArrayList<Persona> person = registro.obtenerPersonas();
            for(int i = 0; i < registro.size();i++){
                String tipo = "";
                if(person.get(i) instanceof Maestro){
                    tipo = "Maestro";
                }else{
                    tipo = "Alumno";
                }
                modelo.addRow(new String[]{
                    person.get(i).getNombre(),
                    String.valueOf(person.get(i).getEdad()),
                    tipo
                });
            }
        }
    }
    
    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        btnSalir.setBackground(Color.white);
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void menuItemAgregarAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemAgregarAlumnoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemAgregarAlumnoMouseClicked

    private void menuAgregarMaestroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAgregarMaestroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuAgregarMaestroMouseClicked

    private void menuItemModificarPersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemModificarPersonasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemModificarPersonasMouseClicked

    private void menuItemModificarAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemModificarAlumnoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemModificarAlumnoMouseClicked

    private void menuItemModificarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemModificarAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemModificarAlumnoActionPerformed

    private void menuModificarMaestroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuModificarMaestroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuModificarMaestroMouseClicked

    private void menuItemVerDetallesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemVerDetallesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemVerDetallesMouseClicked

    private void menuEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuEliminarMouseClicked

    private void menuAgregarMaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgregarMaestroActionPerformed
        // TODO add your handling code here:
         AgregarMaestros agregarmaestros=new AgregarMaestros(this,registro);
         agregarmaestros.setVisible(true);
    }//GEN-LAST:event_menuAgregarMaestroActionPerformed

    private void menuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarActionPerformed
        
    }//GEN-LAST:event_menuEliminarActionPerformed

    private void menuItemVerDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerDetallesActionPerformed
        int seleccionada = tblDatos.getSelectedRow();
        if(seleccionada > -1){
            if(registro.obtenerPersonas().get(seleccionada) instanceof Alumno){
                //llamar ventana de detalles alumno
                MostrarDetallesAlumno mostrarAlumno =  new 
                MostrarDetallesAlumno((Alumno)registro.obtenerPersonas().get(seleccionada));
                mostrarAlumno.setVisible(true);
            }else{
                //llamar ventana de detalles Maestro
                MostrarDetallesMaestro mostrarMaestro = new
                MostrarDetallesMaestro((Maestro)registro.obtenerPersonas().get(seleccionada));
                mostrarMaestro.setVisible(true);
            }
        }
    }//GEN-LAST:event_menuItemVerDetallesActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenus;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuAgregar;
    private javax.swing.JMenuItem menuAgregarMaestro;
    private javax.swing.JMenuItem menuEliminar;
    private javax.swing.JMenuItem menuItemAgregarAlumno;
    private javax.swing.JMenuItem menuItemModificarAlumno;
    private javax.swing.JMenuItem menuItemModificarPersonas;
    private javax.swing.JMenuItem menuItemVerDetalles;
    private javax.swing.JMenu menuModificar;
    private javax.swing.JMenuItem menuModificarMaestro;
    private javax.swing.JMenu menuRegistro;
    private javax.swing.JPopupMenu.Separator separador1;
    private javax.swing.JPopupMenu.Separator separador2;
    private javax.swing.JPopupMenu.Separator separador3;
    private javax.swing.JTable tblDatos;
    // End of variables declaration//GEN-END:variables

    
}