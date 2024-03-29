/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pizzaria.interfaces;

import controller.ListaFuncionarios;
import java.awt.Color;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pizzaria.classes.Barista;
import pizzaria.classes.ChefeDeCozinha;
import pizzaria.classes.Cozinheiro;
import pizzaria.classes.Entregador;
import pizzaria.classes.Funcionarios;
import pizzaria.classes.Garcom;
import pizzaria.classes.Gerente;

/**
 *
 * @author usuario
 */
public class interface_gerencia extends javax.swing.JFrame {

    /**
     * Creates new form interface_gerencia
     */
    private ListaFuncionarios funcionarios = new ListaFuncionarios();
    private int linhaSelecionada;

    public interface_gerencia() {
        initComponents();
        setLocationRelativeTo(null);
        adicionarGerenteDefault();
        adicionarChefeDeCozinhaDefault();
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
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        b_retornar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jtfNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfSalarioMin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        titulo_listafuncionarios = new javax.swing.JLabel();
        b_cadastrarFuncionario = new javax.swing.JButton();
        b_atualizarFuncionario = new javax.swing.JButton();
        b_excluirFuncionario1 = new javax.swing.JButton();
        demitir = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        editar = new javax.swing.JLabel();
        cadastrar = new javax.swing.JLabel();
        pizza_logopequena1 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(85, 0, 0));

        b_retornar.setBackground(new java.awt.Color(85, 0, 0));
        b_retornar.setForeground(new java.awt.Color(245, 239, 239));
        b_retornar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaria.icons/saida.png"))); // NOI18N
        b_retornar.setBorderPainted(false);
        b_retornar.setFocusPainted(false);
        b_retornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_retornarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(147, 26, 37));

        jTable2.setBackground(new java.awt.Color(245, 239, 239));
        jTable2.setForeground(new java.awt.Color(0, 0, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Cargo", "SalárioMin", "SalárioTotal"
            }
        ));
        jTable2.setRowHeight(30);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jtfNome.setBackground(new java.awt.Color(233, 113, 113));
        jtfNome.setForeground(new java.awt.Color(245, 239, 239));
        jtfNome.setToolTipText("");
        jtfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome :");

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cargo :");

        jtfSalarioMin.setBackground(new java.awt.Color(233, 113, 113));
        jtfSalarioMin.setForeground(new java.awt.Color(245, 239, 239));
        jtfSalarioMin.setToolTipText("");
        jtfSalarioMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSalarioMinActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Salário :");

        jComboBox1.setBackground(new java.awt.Color(233, 113, 113));
        jComboBox1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(245, 239, 239));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Barista", "Cozinheiro", "Entregador", "Garcom" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addGap(133, 133, 133))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jtfSalarioMin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                        .addComponent(jtfNome, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(23, 23, 23)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfSalarioMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        titulo_listafuncionarios.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        titulo_listafuncionarios.setForeground(new java.awt.Color(245, 239, 239));
        titulo_listafuncionarios.setText("Lista Funcionários:");

        b_cadastrarFuncionario.setBackground(new java.awt.Color(233, 113, 113));
        b_cadastrarFuncionario.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        b_cadastrarFuncionario.setForeground(new java.awt.Color(245, 239, 239));
        b_cadastrarFuncionario.setText("Cadastrar");
        b_cadastrarFuncionario.setBorderPainted(false);
        b_cadastrarFuncionario.setFocusPainted(false);
        b_cadastrarFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_cadastrarFuncionarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_cadastrarFuncionarioMouseExited(evt);
            }
        });
        b_cadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cadastrarFuncionarioActionPerformed(evt);
            }
        });

        b_atualizarFuncionario.setBackground(new java.awt.Color(233, 113, 113));
        b_atualizarFuncionario.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        b_atualizarFuncionario.setForeground(new java.awt.Color(245, 239, 239));
        b_atualizarFuncionario.setText("Editar");
        b_atualizarFuncionario.setToolTipText("");
        b_atualizarFuncionario.setBorderPainted(false);
        b_atualizarFuncionario.setFocusPainted(false);
        b_atualizarFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_atualizarFuncionarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_atualizarFuncionarioMouseExited(evt);
            }
        });
        b_atualizarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_atualizarFuncionarioActionPerformed(evt);
            }
        });

        b_excluirFuncionario1.setBackground(new java.awt.Color(233, 113, 113));
        b_excluirFuncionario1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        b_excluirFuncionario1.setForeground(new java.awt.Color(245, 239, 239));
        b_excluirFuncionario1.setText("Demitir");
        b_excluirFuncionario1.setBorderPainted(false);
        b_excluirFuncionario1.setFocusPainted(false);
        b_excluirFuncionario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_excluirFuncionario1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_excluirFuncionario1MouseExited(evt);
            }
        });
        b_excluirFuncionario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_excluirFuncionario1ActionPerformed(evt);
            }
        });

        demitir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaria.icons/demitir.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(245, 239, 239));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(245, 239, 239));
        jPanel4.setPreferredSize(new java.awt.Dimension(0, 3));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(245, 239, 239));
        jPanel5.setPreferredSize(new java.awt.Dimension(0, 3));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaria.icons/editar.png"))); // NOI18N

        cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaria.icons/cadastrar.png"))); // NOI18N

        pizza_logopequena1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaria.icons/pizza_logo_pequena.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(titulo_listafuncionarios)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(b_retornar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(b_excluirFuncionario1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(demitir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(b_atualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(b_cadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cadastrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(pizza_logopequena1)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titulo_listafuncionarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(b_retornar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pizza_logopequena1)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(b_cadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cadastrar)
                                .addGap(92, 92, 92)))
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(b_atualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editar)
                                .addGap(86, 86, 86)))
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(demitir)
                                .addGap(57, 57, 57))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(b_excluirFuncionario1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))))))
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

    private void b_retornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_retornarActionPerformed
        interface_areaFuncionarios i_areaFuncionarios = new interface_areaFuncionarios();
        i_areaFuncionarios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b_retornarActionPerformed

    private void b_cadastrarFuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_cadastrarFuncionarioMouseEntered
        b_cadastrarFuncionario.setBackground(new Color(233, 143, 143));
    }//GEN-LAST:event_b_cadastrarFuncionarioMouseEntered

    private void b_cadastrarFuncionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_cadastrarFuncionarioMouseExited
        b_cadastrarFuncionario.setBackground(new Color(233, 113, 113));
    }//GEN-LAST:event_b_cadastrarFuncionarioMouseExited

    private void b_cadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cadastrarFuncionarioActionPerformed
        try {
            String nome = jtfNome.getText();

            if (!nome.matches("[a-zA-Z]+")) {
                throw new IllegalArgumentException("O nome deve conter apenas letras.");
            }

            String cargo = (String) jComboBox1.getSelectedItem();

            double salarioMin;
            try {
                salarioMin = Double.parseDouble(jtfSalarioMin.getText());
            } catch (NumberFormatException ex) {
                throw new NumberFormatException("Por favor, insira um salário válido.");
            }

            if (cargo.equals("Barista")) {
                Funcionarios f = new Barista(cargo, salarioMin, nome);
                funcionarios.inserirFuncionarios(f);
            } else if (cargo.equalsIgnoreCase("Cozinheiro")) {
                Funcionarios f = new Cozinheiro(cargo, salarioMin, nome);
                funcionarios.inserirFuncionarios(f);
            } else if (cargo.equals("Entregador")) {
                Funcionarios f = new Entregador(cargo, salarioMin, nome);
                funcionarios.inserirFuncionarios(f);
            } else if (cargo.equals("Garcom")) {
                Funcionarios f = new Garcom(cargo, salarioMin, nome);
                funcionarios.inserirFuncionarios(f);
            }

            jtfNome.setText(null);
            jtfSalarioMin.setText(null);
            listarFuncionarios();

            JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso!");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_b_cadastrarFuncionarioActionPerformed

    private void b_atualizarFuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_atualizarFuncionarioMouseEntered
        b_atualizarFuncionario.setBackground(new Color(233, 143, 143));
    }//GEN-LAST:event_b_atualizarFuncionarioMouseEntered

    private void b_atualizarFuncionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_atualizarFuncionarioMouseExited
        b_atualizarFuncionario.setBackground(new Color(233, 113, 113));
    }//GEN-LAST:event_b_atualizarFuncionarioMouseExited

    private void b_atualizarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_atualizarFuncionarioActionPerformed
        try {
            double salarioMin = Double.parseDouble(jtfSalarioMin.getText());

            String nome = jtfNome.getText();
            String cargo = (String) jComboBox1.getSelectedItem();

            funcionarios.removerFuncionarios(linhaSelecionada);

            if (cargo.equals("Barista")) {
                Funcionarios f = new Barista(cargo, salarioMin, nome);
                funcionarios.insereFuncionarioPos(linhaSelecionada, f);
            } else if (cargo.equals("Cozinheiro")) {
                Funcionarios f = new Cozinheiro(cargo, salarioMin, nome);
                funcionarios.insereFuncionarioPos(linhaSelecionada, f);
            } else if (cargo.equals("Entregador")) {
                Funcionarios f = new Entregador(cargo, salarioMin, nome);
                funcionarios.insereFuncionarioPos(linhaSelecionada, f);
            } else if (cargo.equals("Garcom")) {
                Funcionarios f = new Garcom(cargo, salarioMin, nome);
                funcionarios.insereFuncionarioPos(linhaSelecionada, f);
            }

            jtfNome.setText(null);
            jtfSalarioMin.setText(null);
            listarFuncionarios();

            JOptionPane.showMessageDialog(null, "Funcionário atualizado com sucesso!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um valor válido para o salário.", "Erro", JOptionPane.ERROR_MESSAGE);
            jtfSalarioMin.setText(null);
        }


    }//GEN-LAST:event_b_atualizarFuncionarioActionPerformed

    private void b_excluirFuncionario1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_excluirFuncionario1MouseEntered
        b_excluirFuncionario1.setBackground(new Color(233, 143, 143));
    }//GEN-LAST:event_b_excluirFuncionario1MouseEntered

    private void b_excluirFuncionario1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_excluirFuncionario1MouseExited
        b_excluirFuncionario1.setBackground(new Color(233, 113, 113));
    }//GEN-LAST:event_b_excluirFuncionario1MouseExited

    private void b_excluirFuncionario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_excluirFuncionario1ActionPerformed
        funcionarios.removerFuncionarios(linhaSelecionada);
        listarFuncionarios();
        jtfNome.setText(null);
        jtfSalarioMin.setText(null);

        JOptionPane.showMessageDialog(null, "Funcionario demitido com sucesso!");
    }//GEN-LAST:event_b_excluirFuncionario1ActionPerformed

    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeActionPerformed

    }//GEN-LAST:event_jtfNomeActionPerformed

    private void jtfSalarioMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSalarioMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSalarioMinActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        linhaSelecionada = jTable2.getSelectedRow();
        jtfNome.setText(jTable2.getModel().getValueAt(linhaSelecionada, 0).toString());
        jComboBox1.setSelectedItem(jTable2.getModel().getValueAt(linhaSelecionada, 1).toString());
        jtfSalarioMin.setText(jTable2.getModel().getValueAt(linhaSelecionada, 2).toString());
    }//GEN-LAST:event_jTable2MouseClicked
    private void listarFuncionarios() {

        ArrayList nomeColunas = new ArrayList();
        nomeColunas.add("Nome");
        nomeColunas.add("Cargo");
        nomeColunas.add("SalarioMin");
        nomeColunas.add("SalarioTotal");

        List<Object[]> dados = new ArrayList<>();
        NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        for (Funcionarios fun : funcionarios.getListaFuncionarios()) {

            List dadosCli = new ArrayList();
            dadosCli.add(fun.getNome());
            dadosCli.add(fun.getCargo());
            dadosCli.add(formatador.format(fun.getSalario()));
            dadosCli.add(formatador.format(fun.calculoSalario()));

            dados.add(dadosCli.toArray());

        }

        DefaultTableModel tabelaDefault = new DefaultTableModel(dados.toArray(new Object[dados.size()][]), nomeColunas.toArray());
        jTable2.setModel(tabelaDefault);
    }

    private void adicionarGerenteDefault() {
        Gerente gerenteDefault = new Gerente(1234, "Gerente", 6000, "Joao Victor");
        funcionarios.inserirFuncionarios(gerenteDefault);
        listarFuncionarios();
    }

    private void adicionarChefeDeCozinhaDefault() {
        ChefeDeCozinha chefeDefault = new ChefeDeCozinha("ChefeDeCozinha", 5000, "Kaiky Pires", "Excellence");
        funcionarios.inserirFuncionarios(chefeDefault);
        listarFuncionarios();
    }

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
            java.util.logging.Logger.getLogger(interface_gerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface_gerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface_gerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface_gerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface_gerencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_atualizarFuncionario;
    private javax.swing.JButton b_cadastrarFuncionario;
    private javax.swing.JButton b_excluirFuncionario1;
    private javax.swing.JButton b_retornar;
    private javax.swing.JLabel cadastrar;
    private javax.swing.JLabel demitir;
    private javax.swing.JLabel editar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfSalarioMin;
    private javax.swing.JLabel pizza_logopequena1;
    private javax.swing.JLabel titulo_listafuncionarios;
    // End of variables declaration//GEN-END:variables
}
