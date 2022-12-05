package gui;
import gerenciar.Cliente;
import java.util.Scanner;
import gerenciar.GerenciarClientes;
import gerenciar.GerenciarLocacoes;
import gerenciar.GerenciarVeiculo;
import gerenciar.Locacao;
import gerenciar.Veiculo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class MenuPrincipa extends javax.swing.JFrame {
    private GerenciarVeiculo gerenciarVeiculo;
    //private GerenciarClientes gerenciarCliente;
    //private GerenciarLocacoes gerenciarLocacoes;
    
    
    public MenuPrincipa(GerenciarLocacoes gerenciarLocacoes, GerenciarClientes gerenciarClientes, GerenciarVeiculo gerenciarVeiculo) {
        initComponents();
        this.gerenciarVeiculo= gerenciarVeiculo;
        
    }
 
    
    //////////////////////////////////////////////////////////////////////

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        nomeLocadora = new javax.swing.JLabel();
        menuPrincipal = new javax.swing.JMenuBar();
        menuCliente = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuVeiculo = new javax.swing.JMenu();
        addVeiculo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Locadora");

        nomeLocadora.setFont(new java.awt.Font("NSimSun", 1, 48)); // NOI18N
        nomeLocadora.setText("LOCADORA");

        menuPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menuPrincipal.setMargin(new java.awt.Insets(5, 5, 5, 5));

        menuCliente.setText("Cliente");

        jMenuItem1.setText("Gerenciar cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuCliente.add(jMenuItem1);

        menuPrincipal.add(menuCliente);

        menuVeiculo.setText("Veículos");

        addVeiculo.setText("Gerenciar veículo");
        addVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVeiculoActionPerformed(evt);
            }
        });
        menuVeiculo.add(addVeiculo);

        menuPrincipal.add(menuVeiculo);

        jMenu3.setText("Locações");

        jMenuItem4.setText("Gerenciar locações");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        menuPrincipal.add(jMenu3);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(nomeLocadora, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(nomeLocadora, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVeiculoActionPerformed
        GerenciarVeiculoInterface gerenciarVeiculoInterface = new GerenciarVeiculoInterface(gerenciarVeiculo);
        gerenciarVeiculoInterface.setVisible(true);
    }//GEN-LAST:event_addVeiculoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                List<Veiculo> veiculos = new ArrayList<>(); 
                List<Cliente> clientes = new ArrayList<>();
                List<Locacao> locacoes = new ArrayList<>();
                
                new MenuPrincipa(new GerenciarLocacoes(locacoes), new GerenciarClientes(clientes), new GerenciarVeiculo(veiculos)).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addVeiculo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenu menuVeiculo;
    private javax.swing.JLabel nomeLocadora;
    // End of variables declaration//GEN-END:variables
}
