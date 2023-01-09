/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import gerenciar.Cliente;
import gerenciar.GerenciarLocacoes;
import gerenciar.GerenciarVeiculo;
import gerenciar.Locacao;
import gerenciar.Veiculo;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerenciarLocacoesInterface extends javax.swing.JFrame {
    private GerenciarLocacoes gerenciarLocacoes;
    private GerenciarVeiculo gerenciarVeiculo;
    private int totalLocacoes;
    
    DefaultTableModel modelo = new DefaultTableModel();
    private String dataInicialDiaAno;

    
    public GerenciarLocacoesInterface(GerenciarLocacoes gerenciarLocacoes) {
        initComponents();
        this.gerenciarLocacoes = gerenciarLocacoes;
        
        ComboBoxModel comboBoxClienteModel = new DefaultComboBoxModel(gerenciarLocacoes.getListaClientes().toArray());
        comboBoxCliente.setModel(comboBoxClienteModel);
        
        ComboBoxModel comboBoxVeiculoModel = new DefaultComboBoxModel(gerenciarLocacoes.getListaVeiculos().toArray());
        comboBoxVeiculo.setModel(comboBoxVeiculoModel);
                
        loadTableLocacoes();
        setLocationRelativeTo(null);
    }

    
    public void loadTableLocacoes(){
        DefaultTableModel novoModelo = new DefaultTableModel(new Object[] {"Código da locação ", "Cliente", "Placa do veículo", "Seguro", "Data inicial da locação", "Data final da locação"},0);
            
            for(int i=0;i<gerenciarLocacoes.getQuantElementos();i++){
               Object linha []=new Object[]{
                    gerenciarLocacoes.getListaLocacoes().get(i).getCodigoDaLocacao(),
                    gerenciarLocacoes.getListaLocacoes().get(i).getCliente().getNome(), 
                    gerenciarLocacoes.getListaLocacoes().get(i).getVeiculo().getPlaca(),
                    gerenciarLocacoes.getListaLocacoes().get(i).getSeguro(),
                    gerenciarLocacoes.getListaLocacoes().get(i).getDataInicial(),
                    gerenciarLocacoes.getListaLocacoes().get(i).getDataFinal()
               };
               novoModelo.addRow(linha);     
                //System.out.println(gerenciarLocacoes.getListaLocacoes().get(i));
        }
            
        this.modelo = novoModelo;
        tabelaLocacoes.setModel(modelo);
    }
    
    
    public int codigo (){
        this.totalLocacoes++;
        return this.totalLocacoes;
        
    }
    public void salvar(){
        Locacao locacao = new Locacao();
        locacao.setCodigoDaLocacao(codigo());
        
        Cliente cliente = (Cliente)comboBoxCliente.getSelectedItem();
        Veiculo veiculo = (Veiculo) comboBoxVeiculo.getSelectedItem();
        
        boolean seguro = checkboxSeguro.getState();
                
        int dataInicialDia= Integer.parseInt( dataInicialDaLocacaoDia.getText());
        int dataInicialMes = Integer.parseInt( dataInicialLocacaoMes.getText());
        int dataInicialAno = Integer.parseInt( dataInicialLocacaoAno1.getText());
        
        int dataFinalDia = Integer.parseInt( dataFinalLocacaoDia.getText());
        int dataFinalMes = Integer.parseInt( dataFinalLocacaoMes.getText());
        int dataFinalAno= Integer.parseInt( dataFinalLocacaoAno.getText());
       
        locacao.setCliente(cliente);
        locacao.setVeiculo(veiculo);
        locacao.setSeguro(seguro);
        
        
       
        
        

        String dataInicialLocacao = dataInicialDia+"/"+ dataInicialMes +"/"+dataInicialAno;
        locacao.setDataInicial(dataInicialLocacao);
        
        String dataFinalLocacao = dataFinalDia+"/"+ dataFinalMes +"/"+dataFinalAno;
        locacao.setDataFinal(dataFinalLocacao);
        
      
        //System.out.println(cliente);
        //System.out.println(veiculo);
        
        gerenciarLocacoes.add(locacao);
           //System.out.println(gerenciarLocacoes.getListaLocacoes().size());
        loadTableLocacoes();
        }
    
    public void excluir (java.awt.event.ActionEvent evt){
          //Locacao locacao = new Locacao();
          
          
        
          
            if(tabelaLocacoes.getSelectedRow() != -1){
            gerenciarLocacoes.remove(tabelaLocacoes.getSelectedRow());
            loadTableLocacoes();
            JOptionPane.showMessageDialog(null, "cadastro excluido!");
        }else{
           JOptionPane.showMessageDialog(null, "Selecione um cadastro para excluir!");
        }
          
   }
    
    
   
    
  public void editar(java.awt.event.ActionEvent evt){
    Locacao locacao = new Locacao();
    if(tabelaLocacoes.getSelectedRow() !=-1){
        
      
        locacao.setCodigoDaLocacao(codigo());
        
        Cliente cliente = (Cliente)comboBoxCliente.getSelectedItem();

        Veiculo veiculo = (Veiculo) comboBoxVeiculo.getSelectedItem();
        
        boolean seguro = checkboxSeguro.getState();
                
        int dataInicialDia= Integer.parseInt( dataInicialDaLocacaoDia.getText());
        int dataInicialMes = Integer.parseInt( dataInicialLocacaoMes.getText());
        int dataInicialAno = Integer.parseInt( dataInicialLocacaoAno1.getText());
        
        int dataFinalDia = Integer.parseInt( dataFinalLocacaoDia.getText());
        int dataFinalMes = Integer.parseInt( dataFinalLocacaoMes.getText());
        int dataFinalAno= Integer.parseInt( dataFinalLocacaoAno.getText());
        
        //locacao.setCodigoDaLocacao(codigoDaLocacao);
        locacao.setCliente(cliente);
        locacao.setVeiculo(veiculo);
        locacao.setSeguro(seguro);
        
        
        String dataInicialTESTE = dataInicialDia+"/"+ dataInicialMes +"/"+dataInicialAno;
        
        
        locacao.setDataInicial(dataInicialTESTE);
        locacao.setDataInicial(dataInicialTESTE);
        locacao.setDataInicial(dataInicialTESTE);
        
        
        String dataFinalTESTE = dataInicialDia+"/"+ dataInicialMes +"/"+dataInicialAno;
        
        locacao.setDataFinal(dataFinalTESTE);
        locacao.setDataFinal(dataFinalTESTE);
        locacao.setDataFinal(dataFinalTESTE);
        
        System.out.println(cliente);
        System.out.println(veiculo);
        
        
        gerenciarLocacoes.getListaDeLocacoes().set(tabelaLocacoes.getSelectedRow(),locacao);
     
        
            loadTableLocacoes();
            JOptionPane.showMessageDialog(null, "atualizado");
            
        }else{
            JOptionPane.showMessageDialog(null, "elecione um produto para editar");
        }
    }
    


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem5 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem6 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem7 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem8 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem9 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem10 = new javax.swing.JCheckBoxMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        botaoEditarLocacao = new javax.swing.JButton();
        botaoExcluirLocacao = new javax.swing.JButton();
        botaoSalvarLocacao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaLocacoes = new javax.swing.JTable();
        label2 = new java.awt.Label();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dataInicialDaLocacaoDia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dataInicialLocacaoMes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dataFinalLocacaoAno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dataFinalLocacaoDia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dataFinalLocacaoMes = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dataInicialLocacaoAno1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        seguro = new javax.swing.JLabel();
        comboBoxCliente = new javax.swing.JComboBox<>();
        comboBoxVeiculo = new javax.swing.JComboBox<>();
        checkboxSeguro = new java.awt.Checkbox();

        jTextField1.setText("jTextField1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("jCheckBoxMenuItem4");

        jCheckBoxMenuItem5.setSelected(true);
        jCheckBoxMenuItem5.setText("jCheckBoxMenuItem5");

        jCheckBoxMenuItem6.setSelected(true);
        jCheckBoxMenuItem6.setText("jCheckBoxMenuItem6");

        jCheckBoxMenuItem7.setSelected(true);
        jCheckBoxMenuItem7.setText("jCheckBoxMenuItem7");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");

        jCheckBoxMenuItem8.setSelected(true);
        jCheckBoxMenuItem8.setText("jCheckBoxMenuItem8");

        jCheckBoxMenuItem9.setSelected(true);
        jCheckBoxMenuItem9.setText("jCheckBoxMenuItem9");

        jCheckBoxMenuItem10.setSelected(true);
        jCheckBoxMenuItem10.setText("jCheckBoxMenuItem10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoEditarLocacao.setText("Editar");
        botaoEditarLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarLocacaoActionPerformed(evt);
            }
        });

        botaoExcluirLocacao.setText("Excluir");
        botaoExcluirLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirLocacaoActionPerformed(evt);
            }
        });

        botaoSalvarLocacao.setText("Salvar");
        botaoSalvarLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarLocacaoActionPerformed(evt);
            }
        });

        tabelaLocacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código da locação ", "Cliente", "Placa do veículo", "Seguro", "Data de inicio", "Data final "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaLocacoes);
        if (tabelaLocacoes.getColumnModel().getColumnCount() > 0) {
            tabelaLocacoes.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelaLocacoes.getColumnModel().getColumn(1).setPreferredWidth(11);
            tabelaLocacoes.getColumnModel().getColumn(2).setPreferredWidth(10);
            tabelaLocacoes.getColumnModel().getColumn(4).setPreferredWidth(8);
            tabelaLocacoes.getColumnModel().getColumn(5).setPreferredWidth(8);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(botaoExcluirLocacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoEditarLocacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSalvarLocacao)
                .addContainerGap(620, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoExcluirLocacao)
                    .addComponent(botaoEditarLocacao)
                    .addComponent(botaoSalvarLocacao))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Locações", jPanel1);

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label2.setEnabled(false);
        label2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        label2.setName("GerenciarLocacao"); // NOI18N
        label2.setText("Locação");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionar"));

        jLabel2.setText("Veículo:");

        jLabel3.setText("Data de inicio da locação:");

        dataInicialDaLocacaoDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataInicialDaLocacaoDiaActionPerformed(evt);
            }
        });

        jLabel4.setText("Dia");

        jLabel5.setText("Mês");

        jLabel6.setText("Ano");

        jLabel7.setText("Data Final da Locação:");

        jLabel8.setText("Dia");

        dataFinalLocacaoDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataFinalLocacaoDiaActionPerformed(evt);
            }
        });

        jLabel9.setText("Mês");

        jLabel10.setText("Ano");

        jLabel12.setText("Cliente:");

        seguro.setText("Veículo possui seguro?");

        comboBoxCliente.setToolTipText("");
        comboBoxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxClienteActionPerformed(evt);
            }
        });

        comboBoxVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxVeiculoActionPerformed(evt);
            }
        });

        checkboxSeguro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        checkboxSeguro.setForeground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(dataFinalLocacaoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(dataFinalLocacaoMes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(dataFinalLocacaoAno, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(dataInicialDaLocacaoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(dataInicialLocacaoMes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(dataInicialLocacaoAno1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(comboBoxVeiculo, 0, 830, Short.MAX_VALUE)
                                            .addComponent(comboBoxCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 27, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(seguro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkboxSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(comboBoxVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(comboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seguro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkboxSeguro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dataInicialDaLocacaoDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(dataInicialLocacaoMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(dataInicialLocacaoAno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(dataFinalLocacaoDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(dataFinalLocacaoMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(dataFinalLocacaoAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel11)
                .addGap(18, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEditarLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarLocacaoActionPerformed
        editar(evt);
    }//GEN-LAST:event_botaoEditarLocacaoActionPerformed

    private void botaoExcluirLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirLocacaoActionPerformed
        excluir(evt);
       
    }//GEN-LAST:event_botaoExcluirLocacaoActionPerformed

    private void botaoSalvarLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarLocacaoActionPerformed
        salvar();
        loadTableLocacoes();
       
    }//GEN-LAST:event_botaoSalvarLocacaoActionPerformed

    private void comboBoxVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxVeiculoActionPerformed

    private void dataFinalLocacaoDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataFinalLocacaoDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataFinalLocacaoDiaActionPerformed

    private void dataInicialDaLocacaoDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataInicialDaLocacaoDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataInicialDaLocacaoDiaActionPerformed

    private void comboBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxClienteActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GerenciarLocacoesInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarLocacoesInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarLocacoesInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarLocacoesInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEditarLocacao;
    private javax.swing.JButton botaoExcluirLocacao;
    private javax.swing.JButton botaoSalvarLocacao;
    private java.awt.Checkbox checkboxSeguro;
    private javax.swing.JComboBox<Cliente> comboBoxCliente;
    private javax.swing.JComboBox<Veiculo> comboBoxVeiculo;
    private javax.swing.JTextField dataFinalLocacaoAno;
    private javax.swing.JTextField dataFinalLocacaoDia;
    private javax.swing.JTextField dataFinalLocacaoMes;
    private javax.swing.JTextField dataInicialDaLocacaoDia;
    private javax.swing.JTextField dataInicialLocacaoAno1;
    private javax.swing.JTextField dataInicialLocacaoMes;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem10;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem5;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem6;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem7;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem8;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private java.awt.Label label2;
    private javax.swing.JLabel seguro;
    private javax.swing.JTable tabelaLocacoes;
    // End of variables declaration//GEN-END:variables

    private String tabelaLocacoesgetText() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
