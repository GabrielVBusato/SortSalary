/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.system.view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import com.system.components.ComboStrategyItem;

/**
 *
 * @author busat
 */
public class SortView extends javax.swing.JFrame {

    /**
     * Creates new form OrdenacaoView
     */
    public SortView() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(this.getParent());
    }

    public JButton getBtnCarregarArquivo() {
        return btnCarregarArquivo;
    }

    public JButton getBtnOrdenar() {
        return btnOrdenar;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public JComboBox<ComboStrategyItem> getCmbMetodo() {
        return cmbMetodo;
    }

    public JList<String> getLstOrdenados() {
        return lstOrdenados;
    }

    public JList<String> getLstSemOrdem() {
        return lstSemOrdem;
    }

    public JRadioButton getRbtnCrescente() {
        return rbtnCrescente;
    }

    public JRadioButton getRbtnDecrescente() {
        return rbtnDecrescente;
    }

    public JLabel getLblTempo() {
        return lblTempo;
    }
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblSemOrdem = new javax.swing.JLabel();
        lblOrdenados = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSemOrdem = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstOrdenados = new javax.swing.JList<>();
        lblOrdenacao = new javax.swing.JLabel();
        cmbMetodo = new javax.swing.JComboBox<>();
        lblOrdem = new javax.swing.JLabel();
        rbtnCrescente = new javax.swing.JRadioButton();
        rbtnDecrescente = new javax.swing.JRadioButton();
        btnOrdenar = new javax.swing.JButton();
        btnCarregarArquivo = new javax.swing.JButton();
        lblTempoEstatico = new javax.swing.JLabel();
        lblMs = new javax.swing.JLabel();
        lblTempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ordenação");
        setResizable(false);

        lblSemOrdem.setText("Elementos a serem ordenados");

        lblOrdenados.setText("Elementos ordenados");

        jScrollPane1.setViewportView(lstSemOrdem);

        jScrollPane3.setViewportView(lstOrdenados);

        lblOrdenacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrdenacao.setText("Método de Ordenação");

        lblOrdem.setText("Ordem");

        buttonGroup1.add(rbtnCrescente);
        rbtnCrescente.setSelected(true);
        rbtnCrescente.setText("Crescente");
        rbtnCrescente.setActionCommand("asc");

        buttonGroup1.add(rbtnDecrescente);
        rbtnDecrescente.setText("Decrescente");
        rbtnDecrescente.setActionCommand("desc");

        btnOrdenar.setText("Ordenar");

        btnCarregarArquivo.setText("Carregar do arquivo");

        lblTempoEstatico.setText("Tempo:");

        lblMs.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMs.setText("ms");

        lblTempo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTempo.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSemOrdem)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCarregarArquivo))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btnOrdenar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblOrdenacao))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOrdem)
                                    .addComponent(cmbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbtnCrescente)
                                    .addComponent(rbtnDecrescente))))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOrdenados, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTempoEstatico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTempo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMs)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSemOrdem)
                    .addComponent(lblOrdenados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarregarArquivo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTempoEstatico)
                            .addComponent(lblMs)
                            .addComponent(lblTempo)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblOrdenacao, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOrdem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnCrescente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnDecrescente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOrdenar)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarregarArquivo;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<ComboStrategyItem> cmbMetodo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblMs;
    private javax.swing.JLabel lblOrdem;
    private javax.swing.JLabel lblOrdenacao;
    private javax.swing.JLabel lblOrdenados;
    private javax.swing.JLabel lblSemOrdem;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JLabel lblTempoEstatico;
    private javax.swing.JList<String> lstOrdenados;
    private javax.swing.JList<String> lstSemOrdem;
    private javax.swing.JRadioButton rbtnCrescente;
    private javax.swing.JRadioButton rbtnDecrescente;
    // End of variables declaration//GEN-END:variables
}
