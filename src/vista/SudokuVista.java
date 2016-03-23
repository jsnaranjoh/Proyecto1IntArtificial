/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.EstadoControlador;
import controlador.TableroControlador;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author jsnar
 */
public class SudokuVista extends javax.swing.JFrame {

    /**
     * Creates new form SudokuVista
     */
    
    private EstadoControlador estadoControlador;
    private TableroControlador tableroControlador;
    
    public SudokuVista() {
        initComponents();
        estadoControlador = new EstadoControlador();
        tableroControlador = new TableroControlador();
    }
    
    public void actualizarTablero() {
        List<Character> listaCaracteres = tableroControlador.getListaCaracteres();
        f1c1Label.setText(String.valueOf(listaCaracteres.get(0)));
        f1c2Label.setText(String.valueOf(listaCaracteres.get(1)));
        f1c3Label.setText(String.valueOf(listaCaracteres.get(2)));
        f1c4Label.setText(String.valueOf(listaCaracteres.get(3)));
        f1c5Label.setText(String.valueOf(listaCaracteres.get(4)));
        f1c6Label.setText(String.valueOf(listaCaracteres.get(5)));
        f1c7Label.setText(String.valueOf(listaCaracteres.get(6)));
        f1c8Label.setText(String.valueOf(listaCaracteres.get(7)));
        f1c9Label.setText(String.valueOf(listaCaracteres.get(8)));
        f2c1Label.setText(String.valueOf(listaCaracteres.get(9)));
        f2c2Label.setText(String.valueOf(listaCaracteres.get(10)));
        f2c3Label.setText(String.valueOf(listaCaracteres.get(11)));
        f2c4Label.setText(String.valueOf(listaCaracteres.get(12)));
        f2c5Label.setText(String.valueOf(listaCaracteres.get(13)));
        f2c6Label.setText(String.valueOf(listaCaracteres.get(14)));
        f2c7Label.setText(String.valueOf(listaCaracteres.get(15)));
        f2c8Label.setText(String.valueOf(listaCaracteres.get(16)));
        f2c9Label.setText(String.valueOf(listaCaracteres.get(17)));
        f3c1Label.setText(String.valueOf(listaCaracteres.get(18)));
        f3c2Label.setText(String.valueOf(listaCaracteres.get(19)));
        f3c3Label.setText(String.valueOf(listaCaracteres.get(20)));
        f3c4Label.setText(String.valueOf(listaCaracteres.get(21)));
        f3c5Label.setText(String.valueOf(listaCaracteres.get(22)));
        f3c6Label.setText(String.valueOf(listaCaracteres.get(23)));
        f3c7Label.setText(String.valueOf(listaCaracteres.get(24)));
        f3c8Label.setText(String.valueOf(listaCaracteres.get(25)));
        f3c9Label.setText(String.valueOf(listaCaracteres.get(26)));
        f4c1Label.setText(String.valueOf(listaCaracteres.get(27)));
        f4c2Label.setText(String.valueOf(listaCaracteres.get(28)));
        f4c3Label.setText(String.valueOf(listaCaracteres.get(29)));
        f4c4Label.setText(String.valueOf(listaCaracteres.get(30)));
        f4c5Label.setText(String.valueOf(listaCaracteres.get(31)));
        f4c6Label.setText(String.valueOf(listaCaracteres.get(32)));
        f4c7Label.setText(String.valueOf(listaCaracteres.get(33)));
        f4c8Label.setText(String.valueOf(listaCaracteres.get(34)));
        f4c9Label.setText(String.valueOf(listaCaracteres.get(35)));
        f5c1Label.setText(String.valueOf(listaCaracteres.get(36)));
        f5c2Label.setText(String.valueOf(listaCaracteres.get(37)));
        f5c3Label.setText(String.valueOf(listaCaracteres.get(38)));
        f5c4Label.setText(String.valueOf(listaCaracteres.get(39)));
        f5c5Label.setText(String.valueOf(listaCaracteres.get(40)));
        f5c6Label.setText(String.valueOf(listaCaracteres.get(41)));
        f5c7Label.setText(String.valueOf(listaCaracteres.get(42)));
        f5c8Label.setText(String.valueOf(listaCaracteres.get(43)));
        f5c9Label.setText(String.valueOf(listaCaracteres.get(44)));
        f6c1Label.setText(String.valueOf(listaCaracteres.get(45)));
        f6c2Label.setText(String.valueOf(listaCaracteres.get(46)));
        f6c3Label.setText(String.valueOf(listaCaracteres.get(47)));
        f6c4Label.setText(String.valueOf(listaCaracteres.get(48)));
        f6c5Label.setText(String.valueOf(listaCaracteres.get(49)));
        f6c6Label.setText(String.valueOf(listaCaracteres.get(50)));
        f6c7Label.setText(String.valueOf(listaCaracteres.get(51)));
        f6c8Label.setText(String.valueOf(listaCaracteres.get(52)));
        f6c9Label.setText(String.valueOf(listaCaracteres.get(53)));
        f7c1Label.setText(String.valueOf(listaCaracteres.get(54)));
        f7c2Label.setText(String.valueOf(listaCaracteres.get(55)));
        f7c3Label.setText(String.valueOf(listaCaracteres.get(56)));
        f7c4Label.setText(String.valueOf(listaCaracteres.get(57)));
        f7c5Label.setText(String.valueOf(listaCaracteres.get(58)));
        f7c6Label.setText(String.valueOf(listaCaracteres.get(59)));
        f7c7Label.setText(String.valueOf(listaCaracteres.get(60)));
        f7c8Label.setText(String.valueOf(listaCaracteres.get(61)));
        f7c9Label.setText(String.valueOf(listaCaracteres.get(62)));
        f8c1Label.setText(String.valueOf(listaCaracteres.get(63)));
        f8c2Label.setText(String.valueOf(listaCaracteres.get(64)));
        f8c3Label.setText(String.valueOf(listaCaracteres.get(65)));
        f8c4Label.setText(String.valueOf(listaCaracteres.get(66)));
        f8c5Label.setText(String.valueOf(listaCaracteres.get(67)));
        f8c6Label.setText(String.valueOf(listaCaracteres.get(68)));
        f8c7Label.setText(String.valueOf(listaCaracteres.get(69)));
        f8c8Label.setText(String.valueOf(listaCaracteres.get(70)));
        f8c9Label.setText(String.valueOf(listaCaracteres.get(71)));
        f9c1Label.setText(String.valueOf(listaCaracteres.get(72)));
        f9c2Label.setText(String.valueOf(listaCaracteres.get(73)));
        f9c3Label.setText(String.valueOf(listaCaracteres.get(74)));
        f9c4Label.setText(String.valueOf(listaCaracteres.get(75)));
        f9c5Label.setText(String.valueOf(listaCaracteres.get(76)));
        f9c6Label.setText(String.valueOf(listaCaracteres.get(77)));
        f9c7Label.setText(String.valueOf(listaCaracteres.get(78)));
        f9c8Label.setText(String.valueOf(listaCaracteres.get(79)));
        f9c9Label.setText(String.valueOf(listaCaracteres.get(80)));
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
        iniciarBoton = new javax.swing.JButton();
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
        f7c1Label = new javax.swing.JLabel();
        f7c2Label = new javax.swing.JLabel();
        f7c3Label = new javax.swing.JLabel();
        f7c4Label = new javax.swing.JLabel();
        f7c5Label = new javax.swing.JLabel();
        f7c6Label = new javax.swing.JLabel();
        f7c7Label = new javax.swing.JLabel();
        f7c8Label = new javax.swing.JLabel();
        f7c9Label = new javax.swing.JLabel();
        f8c1Label = new javax.swing.JLabel();
        f8c2Label = new javax.swing.JLabel();
        f8c3Label = new javax.swing.JLabel();
        f8c4Label = new javax.swing.JLabel();
        f8c5Label = new javax.swing.JLabel();
        f8c6Label = new javax.swing.JLabel();
        f8c7Label = new javax.swing.JLabel();
        f8c8Label = new javax.swing.JLabel();
        f8c9Label = new javax.swing.JLabel();
        f9c1Label = new javax.swing.JLabel();
        f9c2Label = new javax.swing.JLabel();
        f9c3Label = new javax.swing.JLabel();
        f9c4Label = new javax.swing.JLabel();
        f9c5Label = new javax.swing.JLabel();
        f9c6Label = new javax.swing.JLabel();
        f9c7Label = new javax.swing.JLabel();
        f9c8Label = new javax.swing.JLabel();
        f9c9Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sudoku - Proyecto 1 - Inteligencia Artificial");
        setResizable(false);

        dificultadLabel.setText("Dificultad:");

        dificultadComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Principiante", "Fácil", "Medio", "Difícil", "Experto" }));

        iniciarBoton.setText("Iniciar");
        iniciarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarBotonActionPerformed(evt);
            }
        });

        tableroPanel.setOpaque(false);
        tableroPanel.setLayout(new java.awt.GridLayout(9, 9));

        f1c1Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f1c1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f1c1Label);

        f1c2Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f1c2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f1c2Label);

        f1c3Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f1c3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f1c3Label);

        f1c4Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f1c4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f1c4Label);

        f1c5Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f1c5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f1c5Label);

        f1c6Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f1c6Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f1c6Label);

        f1c7Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f1c7Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f1c7Label);

        f1c8Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f1c8Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f1c8Label);

        f1c9Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f1c9Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f1c9Label);

        f2c1Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f2c1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f2c1Label);

        f2c2Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f2c2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f2c2Label);

        f2c3Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f2c3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f2c3Label);

        f2c4Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f2c4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f2c4Label);

        f2c5Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f2c5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f2c5Label);

        f2c6Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f2c6Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f2c6Label);

        f2c7Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f2c7Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f2c7Label);

        f2c8Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f2c8Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f2c8Label);

        f2c9Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f2c9Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f2c9Label);

        f3c1Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f3c1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f3c1Label);

        f3c2Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f3c2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f3c2Label);

        f3c3Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f3c3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f3c3Label);

        f3c4Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f3c4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f3c4Label);

        f3c5Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f3c5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f3c5Label);

        f3c6Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f3c6Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f3c6Label);

        f3c7Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f3c7Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f3c7Label);

        f3c8Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f3c8Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f3c8Label);

        f3c9Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f3c9Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f3c9Label);

        f4c1Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f4c1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f4c1Label);

        f4c2Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f4c2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f4c2Label);

        f4c3Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f4c3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f4c3Label);

        f4c4Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f4c4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f4c4Label);

        f4c5Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f4c5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f4c5Label);

        f4c6Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f4c6Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f4c6Label);

        f4c7Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f4c7Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f4c7Label);

        f4c8Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f4c8Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f4c8Label);

        f4c9Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f4c9Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f4c9Label);

        f5c1Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f5c1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f5c1Label);

        f5c2Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f5c2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f5c2Label);

        f5c3Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f5c3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f5c3Label);

        f5c4Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f5c4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f5c4Label);

        f5c5Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f5c5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f5c5Label);

        f5c6Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f5c6Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f5c6Label);

        f5c7Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f5c7Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f5c7Label);

        f5c8Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f5c8Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f5c8Label);

        f5c9Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f5c9Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f5c9Label);

        f6c1Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f6c1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f6c1Label);

        f6c2Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f6c2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f6c2Label);

        f6c3Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f6c3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f6c3Label);

        f6c4Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f6c4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f6c4Label);

        f6c5Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f6c5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f6c5Label);

        f6c6Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f6c6Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f6c6Label);

        f6c7Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f6c7Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f6c7Label);

        f6c8Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f6c8Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f6c8Label);

        f6c9Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f6c9Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f6c9Label);

        f7c1Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f7c1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f7c1Label);

        f7c2Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f7c2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f7c2Label);

        f7c3Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f7c3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f7c3Label);

        f7c4Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f7c4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f7c4Label);

        f7c5Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f7c5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f7c5Label);

        f7c6Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f7c6Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f7c6Label);

        f7c7Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f7c7Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f7c7Label);

        f7c8Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f7c8Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f7c8Label);

        f7c9Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f7c9Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f7c9Label);

        f8c1Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f8c1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f8c1Label);

        f8c2Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f8c2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f8c2Label);

        f8c3Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f8c3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f8c3Label);

        f8c4Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f8c4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f8c4Label);

        f8c5Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f8c5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f8c5Label);

        f8c6Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f8c6Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f8c6Label);

        f8c7Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f8c7Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f8c7Label);

        f8c8Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f8c8Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f8c8Label);

        f8c9Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f8c9Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f8c9Label);

        f9c1Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f9c1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f9c1Label);

        f9c2Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f9c2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f9c2Label);

        f9c3Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f9c3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f9c3Label);

        f9c4Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f9c4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f9c4Label);

        f9c5Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f9c5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f9c5Label);

        f9c6Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f9c6Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f9c6Label);

        f9c7Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f9c7Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f9c7Label);

        f9c8Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f9c8Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f9c8Label);

        f9c9Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        f9c9Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableroPanel.add(f9c9Label);

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
                .addComponent(iniciarBoton)
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
                    .addComponent(iniciarBoton))
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

    private void iniciarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarBotonActionPerformed
        Integer indexDificultad = dificultadComboBox.getSelectedIndex();
        tableroControlador.setEstado(estadoControlador.getEstadoInicial(indexDificultad));
        actualizarTablero();
    }//GEN-LAST:event_iniciarBotonActionPerformed

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
    private javax.swing.JLabel f7c1Label;
    private javax.swing.JLabel f7c2Label;
    private javax.swing.JLabel f7c3Label;
    private javax.swing.JLabel f7c4Label;
    private javax.swing.JLabel f7c5Label;
    private javax.swing.JLabel f7c6Label;
    private javax.swing.JLabel f7c7Label;
    private javax.swing.JLabel f7c8Label;
    private javax.swing.JLabel f7c9Label;
    private javax.swing.JLabel f8c1Label;
    private javax.swing.JLabel f8c2Label;
    private javax.swing.JLabel f8c3Label;
    private javax.swing.JLabel f8c4Label;
    private javax.swing.JLabel f8c5Label;
    private javax.swing.JLabel f8c6Label;
    private javax.swing.JLabel f8c7Label;
    private javax.swing.JLabel f8c8Label;
    private javax.swing.JLabel f8c9Label;
    private javax.swing.JLabel f9c1Label;
    private javax.swing.JLabel f9c2Label;
    private javax.swing.JLabel f9c3Label;
    private javax.swing.JLabel f9c4Label;
    private javax.swing.JLabel f9c5Label;
    private javax.swing.JLabel f9c6Label;
    private javax.swing.JLabel f9c7Label;
    private javax.swing.JLabel f9c8Label;
    private javax.swing.JLabel f9c9Label;
    private javax.swing.JButton iniciarBoton;
    private javax.swing.JPanel sudokuPanel;
    private javax.swing.JPanel tableroPanel;
    // End of variables declaration//GEN-END:variables
}
