/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrodeanuncios.pages;

import cadastrodeanuncios.dao.AnuncioDAO;
import cadastrodeanuncios.model.AnuncioModel;
import cadastrodeanuncios.model.PessoaModel;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduarda Amaral - carmoduda6@gmail.com
 */
public class RelatorioAnuncio extends javax.swing.JFrame {

    private AnuncioModel anuncio;
    private Double valorConvertido;
    /**
     * Creates new form RelatorioAnuncio
     */
    public RelatorioAnuncio() {
        initComponents();
        anuncio = new AnuncioModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DataInicio = new javax.swing.JFormattedTextField();
        DataFinal = new javax.swing.JFormattedTextField();
        Cliente = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        GerarRelatorio = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        ValorInvestido = new javax.swing.JTextField();
        VisualizacaoMaxima = new javax.swing.JTextField();
        CliqueMaximo = new javax.swing.JTextField();
        CompartilhamentoMaximo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Relat??rio de An??ncios");

        jLabel2.setText("Preencher data in??cio:");

        jLabel3.setText("Preencher data final:");

        jLabel4.setText("Preencher cliente:");

        DataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        DataInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataInicioActionPerformed(evt);
            }
        });

        DataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        DataFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataFinalActionPerformed(evt);
            }
        });

        Cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente 1", "Cliente 2", "Cliente 3", "Cliente 4" }));
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });

        jLabel5.setText("Valor total investido: R$");

        GerarRelatorio.setText("Gerar relat??rio");
        GerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerarRelatorioActionPerformed(evt);
            }
        });

        jLabel6.setText("Quantidade m??xima de visualiza????es:");

        jLabel7.setText("Quantidade m??xima de cliques:");

        jLabel8.setText("Quantidade m??xima de compartilhamentos:");

        Cancelar.setText("Cancelar");

        ValorInvestido.setEditable(false);
        ValorInvestido.setText("0,00");
        ValorInvestido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorInvestidoActionPerformed(evt);
            }
        });

        VisualizacaoMaxima.setEditable(false);
        VisualizacaoMaxima.setText("00");
        VisualizacaoMaxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizacaoMaximaActionPerformed(evt);
            }
        });

        CliqueMaximo.setEditable(false);
        CliqueMaximo.setText("00");
        CliqueMaximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CliqueMaximoActionPerformed(evt);
            }
        });

        CompartilhamentoMaximo.setEditable(false);
        CompartilhamentoMaximo.setText("00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(CompartilhamentoMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(DataFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                                    .addComponent(DataInicio, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(Cancelar)
                                                        .addGap(8, 8, 8)))
                                                .addGap(59, 59, 59)
                                                .addComponent(GerarRelatorio))
                                            .addComponent(Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ValorInvestido, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(VisualizacaoMaxima)
                                .addGap(127, 127, 127))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1)))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(CliqueMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(DataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(GerarRelatorio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ValorInvestido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(VisualizacaoMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CliqueMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CompartilhamentoMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Cancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DataInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataInicioActionPerformed
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
        formato.setTimeZone(TimeZone.getTimeZone("Etc/UTC"));
        try {
            anuncio.setDinicio(formato.parse(DataInicio.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(RelatorioAnuncio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DataInicioActionPerformed

    private void DataFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataFinalActionPerformed
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
        formato.setTimeZone(TimeZone.getTimeZone("Etc/UTC"));
        try {
            anuncio.setDfinal(formato.parse(DataFinal.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(RelatorioAnuncio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DataFinalActionPerformed

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        PessoaModel cliente = new PessoaModel(Cliente.getSelectedItem().toString(),"123.123.123.123");
        anuncio.setCliente(cliente);
    }//GEN-LAST:event_ClienteActionPerformed

    private void GerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerarRelatorioActionPerformed
        AnuncioDAO anuncioDao = new AnuncioDAO();
        Object resultado = anuncioDao.consultarAnuncio(anuncio);
        
        valorConvertido = new Double(resultado.toString());
        ValorInvestido.setText(valorConvertido.toString()); 
        
        Double quantidadeMaxima = valorConvertido * 30 *40+(((((valorConvertido * 30 *40)*12)/100)*3)/20)*3;
        VisualizacaoMaxima.setText(quantidadeMaxima.toString());
        
        Double cliquesMaximo = (((valorConvertido * 30 *40)*12)/100);
        CliqueMaximo.setText(cliquesMaximo.toString());
        
        Double compartilhamentoMaximo = ((((valorConvertido * 30 *40)*12)/100)*3)/20;
        CompartilhamentoMaximo.setText(compartilhamentoMaximo.toString());
        JOptionPane.showMessageDialog(null,"O relat??rio foi gerado com sucesso!");
    }//GEN-LAST:event_GerarRelatorioActionPerformed

    private void ValorInvestidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorInvestidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorInvestidoActionPerformed

    private void VisualizacaoMaximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizacaoMaximaActionPerformed

    }//GEN-LAST:event_VisualizacaoMaximaActionPerformed

    private void CliqueMaximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CliqueMaximoActionPerformed

    }//GEN-LAST:event_CliqueMaximoActionPerformed

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
            java.util.logging.Logger.getLogger(RelatorioAnuncio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioAnuncio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioAnuncio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioAnuncio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioAnuncio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JComboBox<String> Cliente;
    private javax.swing.JTextField CliqueMaximo;
    private javax.swing.JTextField CompartilhamentoMaximo;
    private javax.swing.JFormattedTextField DataFinal;
    private javax.swing.JFormattedTextField DataInicio;
    private javax.swing.JButton GerarRelatorio;
    private javax.swing.JTextField ValorInvestido;
    private javax.swing.JTextField VisualizacaoMaxima;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
