/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.EstadoControlador;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import logica.Tablero;
import modelo.Estado;

/**
 *
 * @author jsnar
 */
public class SudokuVista extends javax.swing.JFrame {

    /**
     * Creates new form SudokuVista
     */
    
    private Tablero tablero;
    
    public SudokuVista() {
        initComponents();
        tablero = new Tablero();
    }
    
    public void cargarTablero() {
        Estado estadoTablero = tablero.getEstadoTablero();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sudokuPanel = new javax.swing.JPanel() {
            public void paintComponent(Graphics g) {
                Image fondo = new ImageIcon("src/imagen/fondo.jpg").getImage();
                g.drawImage(fondo, 0, 0, this.getWidth(), this.getHeight(), this);
            }
        };
        dificultadLabel = new javax.swing.JLabel();
        dificultadComboBox = new javax.swing.JComboBox<>();
        cargarBoton = new javax.swing.JButton();
        tableroPanel = new javax.swing.JPanel() {
            public void paintComponent(Graphics g) {
                Image fondo = new ImageIcon("src/imagen/tablero.jpg").getImage();
                g.drawImage(fondo, 0, 0, this.getWidth(), this.getHeight(), this);
            }
        };
        f1c1Label = new javax.swing.JLabel();
        f1c2Label = new javax.swing.JLabel();
        f1c3Label = new javax.swing.JLabel();
        f1c4Label = new javax.swing.JLabel();
        f1c5Label = new javax.swing.JLabel();
        f1c6Label = new javax.swing.JLabel();
        f1c7Label = new javax.swing.JLabel();
        f1c8Label = new javax.swing.JLabel();
        f1c9Label = new javax.swing.JLabel();
        f2c1Label = new javax.swing.JLabel();
        f2c2Label = new javax.swing.JLabel();
        f2c3Label = new javax.swing.JLabel();
        f2c4Label = new javax.swing.JLabel();
        f2c5Label = new javax.swing.JLabel();
        f2c6Label = new javax.swing.JLabel();
        f2c7Label = new javax.swing.JLabel();
        f2c8Label = new javax.swing.JLabel();
        f2c9Label = new javax.swing.JLabel();
        f3c1Label = new javax.swing.JLabel();
        f3c2Label = new javax.swing.JLabel();
        f3c3Label = new javax.swing.JLabel();
        f3c4Label = new javax.swing.JLabel();
        f3c5Label = new javax.swing.JLabel();
        f3c6Label = new javax.swing.JLabel();
        f3c7Label = new javax.swing.JLabel();
        f3c8Label = new javax.swing.JLabel();
        f3c9Label = new javax.swing.JLabel();
        f4c1Label = new javax.swing.JLabel();
        f4c2Label = new javax.swing.JLabel();
        f4c3Label = new javax.swing.JLabel();
        f4c4Label = new javax.swing.JLabel();
        f4c5Label = new javax.swing.JLabel();
        f4c6Label = new javax.swing.JLabel();
        f4c7Label = new javax.swing.JLabel();
        f4c8Label = new javax.swing.JLabel();
        f4c9Label = new javax.swing.JLabel();
        f5c1Label = new javax.swing.JLabel();
        f5c2Label = new javax.swing.JLabel();
        f5c3Label = new javax.swing.JLabel();
        f5c4Label = new javax.swing.JLabel();
        f5c5Label = new javax.swing.JLabel();
        f5c6Label = new javax.swing.JLabel();
        f5c7Label = new javax.swing.JLabel();
        f5c8Label = new javax.swing.JLabel();
        f5c9Label = new javax.swing.JLabel();
        f6c1Label = new javax.swing.JLabel();
        f6c2Label = new javax.swing.JLabel();
        f6c3Label = new javax.swing.JLabel();
        f6c4Label = new javax.swing.JLabel();
        f6c5Label = new javax.swing.JLabel();
        f6c6Label = new javax.swing.JLabel();
        f6c7Label = new javax.swing.JLabel();
        f6c8Label = new javax.swing.JLabel();
        f6c9Label = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sudoku - Proyecto 1 - Inteligencia Artificial");
        setResizable(false);

        dificultadLabel.setText("Dificultad:");

        dificultadComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Principiante", "Fácil", "Medio", "Difícil", "Experto" }));

        cargarBoton.setText("Iniciar");

        tableroPanel.setOpaque(false);
        tableroPanel.setLayout(new java.awt.GridLayout(9, 9));
        tableroPanel.add(f1c1Label);
        tableroPanel.add(f1c2Label);
        tableroPanel.add(f1c3Label);
        tableroPanel.add(f1c4Label);
        tableroPanel.add(f1c5Label);
        tableroPanel.add(f1c6Label);
        tableroPanel.add(f1c7Label);
        tableroPanel.add(f1c8Label);
        tableroPanel.add(f1c9Label);
        tableroPanel.add(f2c1Label);
        tableroPanel.add(f2c2Label);
        tableroPanel.add(f2c3Label);
        tableroPanel.add(f2c4Label);
        tableroPanel.add(f2c5Label);
        tableroPanel.add(f2c6Label);
        tableroPanel.add(f2c7Label);
        tableroPanel.add(f2c8Label);
        tableroPanel.add(f2c9Label);
        tableroPanel.add(f3c1Label);
        tableroPanel.add(f3c2Label);
        tableroPanel.add(f3c3Label);
        tableroPanel.add(f3c4Label);
        tableroPanel.add(f3c5Label);
        tableroPanel.add(f3c6Label);
        tableroPanel.add(f3c7Label);
        tableroPanel.add(f3c8Label);
        tableroPanel.add(f3c9Label);
        tableroPanel.add(f4c1Label);
        tableroPanel.add(f4c2Label);
        tableroPanel.add(f4c3Label);
        tableroPanel.add(f4c4Label);
        tableroPanel.add(f4c5Label);
        tableroPanel.add(f4c6Label);
        tableroPanel.add(f4c7Label);
        tableroPanel.add(f4c8Label);
        tableroPanel.add(f4c9Label);
        tableroPanel.add(f5c1Label);
        tableroPanel.add(f5c2Label);
        tableroPanel.add(f5c3Label);
        tableroPanel.add(f5c4Label);
        tableroPanel.add(f5c5Label);
        tableroPanel.add(f5c6Label);
        tableroPanel.add(f5c7Label);
        tableroPanel.add(f5c8Label);
        tableroPanel.add(f5c9Label);
        tableroPanel.add(f6c1Label);
        tableroPanel.add(f6c2Label);
        tableroPanel.add(f6c3Label);
        tableroPanel.add(f6c4Label);
        tableroPanel.add(f6c5Label);
        tableroPanel.add(f6c6Label);
        tableroPanel.add(f6c7Label);
        tableroPanel.add(f6c8Label);
        tableroPanel.add(f6c9Label);
        tableroPanel.add(jLabel137);
        tableroPanel.add(jLabel138);
        tableroPanel.add(jLabel139);
        tableroPanel.add(jLabel140);
        tableroPanel.add(jLabel141);
        tableroPanel.add(jLabel142);
        tableroPanel.add(jLabel143);
        tableroPanel.add(jLabel144);
        tableroPanel.add(jLabel145);
        tableroPanel.add(jLabel146);
        tableroPanel.add(jLabel147);
        tableroPanel.add(jLabel148);
        tableroPanel.add(jLabel149);
        tableroPanel.add(jLabel150);
        tableroPanel.add(jLabel151);
        tableroPanel.add(jLabel152);
        tableroPanel.add(jLabel153);
        tableroPanel.add(jLabel154);
        tableroPanel.add(jLabel155);
        tableroPanel.add(jLabel156);
        tableroPanel.add(jLabel157);
        tableroPanel.add(jLabel158);
        tableroPanel.add(jLabel159);
        tableroPanel.add(jLabel160);
        tableroPanel.add(jLabel161);
        tableroPanel.add(jLabel172);

        javax.swing.GroupLayout sudokuPanelLayout = new javax.swing.GroupLayout(sudokuPanel);
        sudokuPanel.setLayout(sudokuPanelLayout);
        sudokuPanelLayout.setHorizontalGroup(
            sudokuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sudokuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dificultadLabel)
                .addGap(18, 18, 18)
                .addComponent(dificultadComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cargarBoton)
                .addContainerGap(565, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sudokuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tableroPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sudokuPanelLayout.setVerticalGroup(
            sudokuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sudokuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sudokuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dificultadLabel)
                    .addComponent(dificultadComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargarBoton))
                .addGap(30, 30, 30)
                .addComponent(tableroPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sudokuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sudokuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SudokuVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SudokuVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SudokuVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SudokuVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SudokuVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cargarBoton;
    private javax.swing.JComboBox<String> dificultadComboBox;
    private javax.swing.JLabel dificultadLabel;
    private javax.swing.JLabel f1c1Label;
    private javax.swing.JLabel f1c2Label;
    private javax.swing.JLabel f1c3Label;
    private javax.swing.JLabel f1c4Label;
    private javax.swing.JLabel f1c5Label;
    private javax.swing.JLabel f1c6Label;
    private javax.swing.JLabel f1c7Label;
    private javax.swing.JLabel f1c8Label;
    private javax.swing.JLabel f1c9Label;
    private javax.swing.JLabel f2c1Label;
    private javax.swing.JLabel f2c2Label;
    private javax.swing.JLabel f2c3Label;
    private javax.swing.JLabel f2c4Label;
    private javax.swing.JLabel f2c5Label;
    private javax.swing.JLabel f2c6Label;
    private javax.swing.JLabel f2c7Label;
    private javax.swing.JLabel f2c8Label;
    private javax.swing.JLabel f2c9Label;
    private javax.swing.JLabel f3c1Label;
    private javax.swing.JLabel f3c2Label;
    private javax.swing.JLabel f3c3Label;
    private javax.swing.JLabel f3c4Label;
    private javax.swing.JLabel f3c5Label;
    private javax.swing.JLabel f3c6Label;
    private javax.swing.JLabel f3c7Label;
    private javax.swing.JLabel f3c8Label;
    private javax.swing.JLabel f3c9Label;
    private javax.swing.JLabel f4c1Label;
    private javax.swing.JLabel f4c2Label;
    private javax.swing.JLabel f4c3Label;
    private javax.swing.JLabel f4c4Label;
    private javax.swing.JLabel f4c5Label;
    private javax.swing.JLabel f4c6Label;
    private javax.swing.JLabel f4c7Label;
    private javax.swing.JLabel f4c8Label;
    private javax.swing.JLabel f4c9Label;
    private javax.swing.JLabel f5c1Label;
    private javax.swing.JLabel f5c2Label;
    private javax.swing.JLabel f5c3Label;
    private javax.swing.JLabel f5c4Label;
    private javax.swing.JLabel f5c5Label;
    private javax.swing.JLabel f5c6Label;
    private javax.swing.JLabel f5c7Label;
    private javax.swing.JLabel f5c8Label;
    private javax.swing.JLabel f5c9Label;
    private javax.swing.JLabel f6c1Label;
    private javax.swing.JLabel f6c2Label;
    private javax.swing.JLabel f6c3Label;
    private javax.swing.JLabel f6c4Label;
    private javax.swing.JLabel f6c5Label;
    private javax.swing.JLabel f6c6Label;
    private javax.swing.JLabel f6c7Label;
    private javax.swing.JLabel f6c8Label;
    private javax.swing.JLabel f6c9Label;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JPanel sudokuPanel;
    private javax.swing.JPanel tableroPanel;
    // End of variables declaration//GEN-END:variables
}
