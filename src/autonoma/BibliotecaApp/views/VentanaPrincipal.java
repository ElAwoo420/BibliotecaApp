/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package autonoma.BibliotecaApp.views;

import autonoma.BibliotecaApp.models.Biblioteca;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Juan Esteban Vera Velez
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private Biblioteca biblioteca;

    /**
     * Creates new form Biblioteca
     */
    public VentanaPrincipal(Biblioteca biblioteca) {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/BibliotecaApp/images/Biblioteca.png")).getImage());

        } catch (Exception e) {

        }
        this.biblioteca = biblioteca;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JPanel5 = new javax.swing.JPanel();
        btnAgregarlLibro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnMostrarLibro = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnBuscarLibro = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Biblioteca");

        javax.swing.GroupLayout JPanel1Layout = new javax.swing.GroupLayout(JPanel1);
        JPanel1.setLayout(JPanel1Layout);
        JPanel1Layout.setHorizontalGroup(
            JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel1Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanel1Layout.setVerticalGroup(
            JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        btnAgregarlLibro.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarlLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarlLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarlLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarlLibroMouseExited(evt);
            }
        });

        jLabel2.setText("Agregar Libro");

        javax.swing.GroupLayout btnAgregarlLibroLayout = new javax.swing.GroupLayout(btnAgregarlLibro);
        btnAgregarlLibro.setLayout(btnAgregarlLibroLayout);
        btnAgregarlLibroLayout.setHorizontalGroup(
            btnAgregarlLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarlLibroLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
        );
        btnAgregarlLibroLayout.setVerticalGroup(
            btnAgregarlLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarlLibroLayout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        btnMostrarLibro.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMostrarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMostrarLibroMouseExited(evt);
            }
        });

        jLabel3.setText("mostrar Libro");

        javax.swing.GroupLayout btnMostrarLibroLayout = new javax.swing.GroupLayout(btnMostrarLibro);
        btnMostrarLibro.setLayout(btnMostrarLibroLayout);
        btnMostrarLibroLayout.setHorizontalGroup(
            btnMostrarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMostrarLibroLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        btnMostrarLibroLayout.setVerticalGroup(
            btnMostrarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMostrarLibroLayout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        btnBuscarLibro.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarLibroMouseExited(evt);
            }
        });

        jLabel4.setText("Buscar Libro");

        javax.swing.GroupLayout btnBuscarLibroLayout = new javax.swing.GroupLayout(btnBuscarLibro);
        btnBuscarLibro.setLayout(btnBuscarLibroLayout);
        btnBuscarLibroLayout.setHorizontalGroup(
            btnBuscarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBuscarLibroLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(22, 22, 22))
        );
        btnBuscarLibroLayout.setVerticalGroup(
            btnBuscarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBuscarLibroLayout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        javax.swing.GroupLayout JPanel5Layout = new javax.swing.GroupLayout(JPanel5);
        JPanel5.setLayout(JPanel5Layout);
        JPanel5Layout.setHorizontalGroup(
            JPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel5Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnAgregarlLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btnMostrarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnBuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        JPanel5Layout.setVerticalGroup(
            JPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(JPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarlLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarLibroMouseExited
        this.mouseExited(btnMostrarLibro);
    }//GEN-LAST:event_btnMostrarLibroMouseExited

    private void btnMostrarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarLibroMouseEntered
        this.mouseEntered(btnMostrarLibro);
    }//GEN-LAST:event_btnMostrarLibroMouseEntered

    private void btnMostrarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarLibroMouseClicked
        System.out.println("Mostrar libro: ");
    }//GEN-LAST:event_btnMostrarLibroMouseClicked

    private void btnBuscarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarLibroMouseExited
        this.mouseExited(btnBuscarLibro);
    }//GEN-LAST:event_btnBuscarLibroMouseExited

    private void btnBuscarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarLibroMouseEntered
        this.mouseEntered(btnBuscarLibro);
    }//GEN-LAST:event_btnBuscarLibroMouseEntered

    private void btnBuscarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarLibroMouseClicked
        System.out.println("Buscar Libro: ");
    }//GEN-LAST:event_btnBuscarLibroMouseClicked

    private void btnAgregarlLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarlLibroMouseExited
        this.mouseExited(btnAgregarlLibro);
    }//GEN-LAST:event_btnAgregarlLibroMouseExited

    private void btnAgregarlLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarlLibroMouseEntered
        this.mouseEntered(btnAgregarlLibro);
    }//GEN-LAST:event_btnAgregarlLibroMouseEntered

    private void btnAgregarlLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarlLibroMouseClicked
        System.out.println("Agregar Producto: ");
    }//GEN-LAST:event_btnAgregarlLibroMouseClicked

     private void mouseEntered(JPanel panel){
         panel.setBackground(new Color(200,255,255));
     }
     private void mouseExited(JPanel panel){
         panel.setBackground(new Color(200,255,255));
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel1;
    private javax.swing.JPanel JPanel5;
    private javax.swing.JPanel btnAgregarlLibro;
    private javax.swing.JPanel btnBuscarLibro;
    private javax.swing.JPanel btnMostrarLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

}