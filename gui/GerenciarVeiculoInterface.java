package gui;
import gerenciar.Caminhao;
import gerenciar.Carro;
import gerenciar.GerenciarVeiculo;
import gerenciar.Onibus;
import gerenciar.Veiculo;
import java.util.InputMismatchException;
import Excecoes.ArCondicionadoException;
import Excecoes.PlacaInexistenteException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
public class GerenciarVeiculoInterface extends javax.swing.JFrame {
    
    private GerenciarVeiculo gerenciarVeiculo;
    
    DefaultListModel modeloLista = new DefaultListModel();
    ArrayList<Carro> listaCarro;
    ArrayList<Onibus> listaOnibus;
    ArrayList<Caminhao> listaCaminhao;
    String modo;
  
    public GerenciarVeiculoInterface(GerenciarVeiculo gerenciarVeiculo) {
        initComponents();     
        this.gerenciarVeiculo= gerenciarVeiculo;     
      
        lstVeiculos.setModel(modeloLista);
        
        listaCarro = new ArrayList();
        listaOnibus = new ArrayList();
        listaCaminhao = new ArrayList();
        modo="Navegar";
        ManipularInterface();
    }
    
    public void ManipularInterface(){
        switch(modo){
            case "Navegar":
                btnSalvarCarro.setEnabled(false);
                btnCancelarCarro.setEnabled(false);
                txtPlaca.setEnabled(false);
                txtAno.setEnabled(false);
                txtDiaria.setEnabled(false);
                txtKM.setEnabled(false);
                btnNovoCarro.setEnabled(true);
                btnEditarCarro.setEnabled(false);
                btnExcluirCarro.setEnabled(false);
                ///////////////////////////////////
                btnSalvarOnibus.setEnabled(false);
                btnCancelarOnibus.setEnabled(false);
                txtPlaca1.setEnabled(false);
                txtAno1.setEnabled(false);
                txtDiaria1.setEnabled(false);
                btnNovoOnibus.setEnabled(true);
                btnEditarOnibus.setEnabled(false);
                btnExcluirOnibus.setEnabled(false);
                ////////////////////////////////////
                btnSalvarCaminhao.setEnabled(false);
                btnCancelarCaminhao.setEnabled(false);
                txtPlaca2.setEnabled(false);
                txtAno2.setEnabled(false);
                txtDiaria2.setEnabled(false);
                txtCarga.setEnabled(false);
                btnNovoCaminhao.setEnabled(true);
                btnEditarCaminhao.setEnabled(false);
                btnExcluirCaminhao.setEnabled(false);
                
                break;
            case "Novo":
                btnSalvarCarro.setEnabled(true);
                btnCancelarCarro.setEnabled(true);
                txtPlaca.setEnabled(true);
                txtAno.setEnabled(true);
                txtDiaria.setEnabled(true);
                txtKM.setEnabled(true);
                btnNovoCarro.setEnabled(false);
                btnEditarCarro.setEnabled(false);
                btnExcluirCarro.setEnabled(false); 
                ///////////////////////////////////
                btnSalvarOnibus.setEnabled(true);
                btnCancelarOnibus.setEnabled(true);
                txtPlaca1.setEnabled(true);
                txtAno1.setEnabled(true);
                txtDiaria1.setEnabled(true);
                btnNovoOnibus.setEnabled(false);
                btnEditarOnibus.setEnabled(false);
                btnExcluirOnibus.setEnabled(false);
                ////////////////////////////////////
                btnSalvarCaminhao.setEnabled(true);
                btnCancelarCaminhao.setEnabled(true);
                txtPlaca2.setEnabled(true);
                txtAno2.setEnabled(true);
                txtDiaria2.setEnabled(true);
                txtCarga.setEnabled(true);
                btnNovoCaminhao.setEnabled(false);
                btnEditarCaminhao.setEnabled(false);
                btnExcluirCaminhao.setEnabled(false);
                break;
            case "Editar":
                btnSalvarCarro.setEnabled(true);
                btnCancelarCarro.setEnabled(true);
                txtPlaca.setEnabled(true);
                txtAno.setEnabled(true);
                txtDiaria.setEnabled(true);
                txtKM.setEnabled(true);
                btnNovoCarro.setEnabled(false);
                btnEditarCarro.setEnabled(false);
                btnExcluirCarro.setEnabled(false);  
                //////////////////////////////////
                btnSalvarOnibus.setEnabled(true);
                btnCancelarOnibus.setEnabled(true);
                txtPlaca1.setEnabled(true);
                txtAno1.setEnabled(true);
                txtDiaria1.setEnabled(true);
                btnNovoOnibus.setEnabled(false);
                btnEditarOnibus.setEnabled(false);
                btnExcluirOnibus.setEnabled(false);  
                 ////////////////////////////////////
                btnSalvarCaminhao.setEnabled(true);
                btnCancelarCaminhao.setEnabled(true);
                txtPlaca2.setEnabled(true);
                txtAno2.setEnabled(true);
                txtDiaria2.setEnabled(true);
                txtCarga.setEnabled(true);
                btnNovoCaminhao.setEnabled(false);
                btnEditarCaminhao.setEnabled(false);
                btnExcluirCaminhao.setEnabled(false);
                break;
            case "Excluir":
                btnSalvarCarro.setEnabled(false);
                btnCancelarCarro.setEnabled(false);
                txtPlaca.setEnabled(false);
                txtAno.setEnabled(false);
                txtDiaria.setEnabled(false);
                txtKM.setEnabled(false);
                btnNovoCarro.setEnabled(true);
                btnEditarCarro.setEnabled(false);
                btnExcluirCarro.setEnabled(false);  
                //////////////////////////////////
                btnSalvarOnibus.setEnabled(false);
                btnCancelarOnibus.setEnabled(false);
                txtPlaca1.setEnabled(false);
                txtAno1.setEnabled(false);
                txtDiaria1.setEnabled(false);
                btnNovoOnibus.setEnabled(true);
                btnEditarOnibus.setEnabled(false);
                btnExcluirOnibus.setEnabled(false);
                 ////////////////////////////////////
                btnSalvarCaminhao.setEnabled(false);
                btnCancelarCaminhao.setEnabled(false);
                txtPlaca2.setEnabled(false);
                txtAno2.setEnabled(false);
                txtDiaria2.setEnabled(false);
                txtCarga.setEnabled(false);
                btnNovoCaminhao.setEnabled(true);
                btnEditarCaminhao.setEnabled(false);
                btnExcluirCaminhao.setEnabled(false);
                break;
            case "Selecao":
                btnSalvarCarro.setEnabled(false);
                btnCancelarCarro.setEnabled(false);
                txtPlaca.setEnabled(false);
                txtAno.setEnabled(false);
                txtDiaria.setEnabled(false);
                txtKM.setEnabled(false);
                btnNovoCarro.setEnabled(true);
                btnEditarCarro.setEnabled(true);
                btnExcluirCarro.setEnabled(true); 
                ////////////////////////////////
                btnSalvarOnibus.setEnabled(false);
                btnCancelarOnibus.setEnabled(false);
                txtPlaca1.setEnabled(false);
                txtAno1.setEnabled(false);
                txtDiaria1.setEnabled(false);
                btnNovoOnibus.setEnabled(true);
                btnEditarOnibus.setEnabled(true);
                btnExcluirOnibus.setEnabled(true); 
                 ////////////////////////////////////
                btnSalvarCaminhao.setEnabled(false);
                btnCancelarCaminhao.setEnabled(false);
                txtPlaca2.setEnabled(false);
                txtAno2.setEnabled(false);
                txtDiaria2.setEnabled(false);
                txtCarga.setEnabled(false);
                btnNovoCaminhao.setEnabled(true);
                btnEditarCaminhao.setEnabled(true);
                btnExcluirCaminhao.setEnabled(true);
                break;
        
        }
    }
  
    public void LoadTableCarro(){
        DefaultTableModel modeloCarro = new DefaultTableModel(new Object [] {"Placa","Ano", "Valor da Diária","Ar Cond.", "Km", "NºPortas" , "NºPassageiros"},0);

            for(int i=0;i<listaCarro.size();i++){
                Object linha []=new Object[]{listaCarro.get(i).getPlaca(),listaCarro.get(i).getAno(),listaCarro.get(i).getValorD(), listaCarro.get(i).getArC(), listaCarro.get(i).getMediaKm(), listaCarro.get(i).getNumePorta(), listaCarro.get(i).getNumePass()};
                modeloCarro.addRow(linha);
            }// cuidado com a lista de carro

            tblCarro.setModel(modeloCarro);
    }   
    public void LoadTableOnibus(){
        DefaultTableModel modeloOnibus = new DefaultTableModel(new Object [] {"Placa","Ano", "Valor da Diária", "Internet", "Ar Cond.", "Categoria" , "NºPassageiros"},0);

            for(int i=0;i<listaOnibus.size();i++){
                Object linha []=new Object[]{listaOnibus.get(i).getPlaca(),listaOnibus.get(i).getAno(),listaOnibus.get(i).getValorD(), listaOnibus.get(i).getInternet(), listaOnibus.get(i).getArC(), listaOnibus.get(i).getCategoria(), listaOnibus.get(i).getNumePass()};
                modeloOnibus.addRow(linha);
            }// cuidado com a lista de bus

            tblOnibus.setModel(modeloOnibus);
    }
    public void LoadTableCaminhao(){
        DefaultTableModel modeloCaminhao = new DefaultTableModel(new Object [] {"Placa","Ano", "Valor da Diária", "Nº de Eixos", "Carga Máxima" },0);

            for(int i=0;i<listaCaminhao.size();i++){
                Object linha []=new Object[]{listaCaminhao.get(i).getPlaca(),listaCaminhao.get(i).getAno(),listaCaminhao.get(i).getValorD(), listaCaminhao.get(i).getNumEixos(), listaCaminhao.get(i).getCargaMax()};
                modeloCaminhao.addRow(linha);
            }// cuidado com a lista de bus

            tblCaminhao.setModel(modeloCaminhao);
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
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtPlaca = new javax.swing.JTextField();
        txtDiaria = new javax.swing.JTextField();
        txtKM = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSalvarCarro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCancelarCarro = new javax.swing.JButton();
        opArCarro = new javax.swing.JComboBox<>();
        opNumPortaCarro = new javax.swing.JComboBox<>();
        opNumPassCarro = new javax.swing.JComboBox<>();
        btnExcluirCarro = new javax.swing.JButton();
        btnNovoCarro = new javax.swing.JButton();
        btnEditarCarro = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCarro = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblOnibus = new javax.swing.JTable();
        btnNovoOnibus = new javax.swing.JButton();
        btnEditarOnibus = new javax.swing.JButton();
        btnExcluirOnibus = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        txtPlaca1 = new javax.swing.JTextField();
        txtDiaria1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtAno1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnSalvarOnibus = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnCancelarOnibus = new javax.swing.JButton();
        opArOnibus = new javax.swing.JComboBox<>();
        opNumPassOnibus = new javax.swing.JComboBox<>();
        opInternetOnibus = new javax.swing.JComboBox<>();
        opCategoria = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblCaminhao = new javax.swing.JTable();
        btnNovoCaminhao = new javax.swing.JButton();
        btnEditarCaminhao = new javax.swing.JButton();
        btnExcluirCaminhao = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        txtPlaca2 = new javax.swing.JTextField();
        txtDiaria2 = new javax.swing.JTextField();
        txtCarga = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtAno2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnSalvarCaminhao = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        btnCancelarCaminhao = new javax.swing.JButton();
        opNumEixos = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        lstVeiculos = new javax.swing.JList<>();
        btnTodosVeiculos = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Veiculos");

        jLabel1.setFont(new java.awt.Font("NSimSun", 1, 20)); // NOI18N
        jLabel1.setText("GERENCIAMENTO DOS VEÍCULOS");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 0, 14))); // NOI18N

        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });

        txtDiaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiariaActionPerformed(evt);
            }
        });

        txtKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKMActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Placa do carro:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Ano:");

        txtAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Possui ar condicionado:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Valor da diária:");

        btnSalvarCarro.setText("Salvar ");
        btnSalvarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCarroActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Média de Km:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Número de portas:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Número de passageiros:");

        btnCancelarCarro.setText("Cancelar");
        btnCancelarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCarroActionPerformed(evt);
            }
        });

        opArCarro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        opNumPortaCarro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4 portas", "2 portas" }));

        opNumPassCarro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKM, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opArCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(5, 5, 5)
                        .addComponent(opNumPassCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvarCarro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelarCarro))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opNumPortaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 198, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(opArCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(opNumPortaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(btnSalvarCarro)
                    .addComponent(btnCancelarCarro)
                    .addComponent(opNumPassCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        btnExcluirCarro.setText("Excluir");
        btnExcluirCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCarroActionPerformed(evt);
            }
        });

        btnNovoCarro.setText("Novo");
        btnNovoCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCarroActionPerformed(evt);
            }
        });

        btnEditarCarro.setText("Editar");
        btnEditarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCarroActionPerformed(evt);
            }
        });

        tblCarro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Ano", "Valor da Diária", "Ar Cond.", "Km", "Nº Passageiros", "Nº Portas"
            }
        ));
        tblCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCarroMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblCarro);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnNovoCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(122, 122, 122)
                            .addComponent(btnEditarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(116, 116, 116)
                            .addComponent(btnExcluirCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovoCarro))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jTabbedPane2.addTab("Carros", jPanel2);

        tblOnibus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Ano", "Valor da Diária", "Internet", "Ar Cond.", "Categoria", "Nº Passageiros"
            }
        ));
        tblOnibus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOnibusMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblOnibus);

        btnNovoOnibus.setText("Novo");
        btnNovoOnibus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoOnibusActionPerformed(evt);
            }
        });

        btnEditarOnibus.setText("Editar");
        btnEditarOnibus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarOnibusActionPerformed(evt);
            }
        });

        btnExcluirOnibus.setText("Excluir");
        btnExcluirOnibus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirOnibusActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 0, 14))); // NOI18N

        txtPlaca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlaca1ActionPerformed(evt);
            }
        });

        txtDiaria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaria1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Placa do ônibus:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Ano:");

        txtAno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAno1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Possui ar condicionado:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Valor da diária:");

        btnSalvarOnibus.setText("Salvar ");
        btnSalvarOnibus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarOnibusActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Possui internet:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Categoria: ");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Número de passageiros:");

        btnCancelarOnibus.setText("Cancelar");
        btnCancelarOnibus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarOnibusActionPerformed(evt);
            }
        });

        opArOnibus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        opNumPassOnibus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50" }));

        opInternetOnibus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        opCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Leito", "Executivo", "Convencional" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlaca1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(5, 5, 5)
                        .addComponent(opNumPassOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvarOnibus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelarOnibus))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opInternetOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opArOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAno1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiaria1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPlaca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtAno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtDiaria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(opInternetOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(opArOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(opCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(btnSalvarOnibus)
                    .addComponent(btnCancelarOnibus)
                    .addComponent(opNumPassOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnNovoOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditarOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(btnExcluirOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoOnibus)
                    .addComponent(btnEditarOnibus)
                    .addComponent(btnExcluirOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Ônibus", jPanel3);

        tblCaminhao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Ano", "Valor da Diária", "Nº Eixos", "Carga Maxima"
            }
        ));
        tblCaminhao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCaminhaoMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblCaminhao);

        btnNovoCaminhao.setText("Novo");
        btnNovoCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCaminhaoActionPerformed(evt);
            }
        });

        btnEditarCaminhao.setText("Editar");
        btnEditarCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCaminhaoActionPerformed(evt);
            }
        });

        btnExcluirCaminhao.setText("Excluir");
        btnExcluirCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCaminhaoActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 0, 14))); // NOI18N

        txtPlaca2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlaca2ActionPerformed(evt);
            }
        });

        txtDiaria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaria2ActionPerformed(evt);
            }
        });

        txtCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargaActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Placa do caminhão:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Ano:");

        txtAno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAno2ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Carga Maxima:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Valor da diária:");

        btnSalvarCaminhao.setText("Salvar ");
        btnSalvarCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCaminhaoActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Nº Eixos");

        btnCancelarCaminhao.setText("Cancelar");
        btnCancelarCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCaminhaoActionPerformed(evt);
            }
        });

        opNumEixos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "7", "9" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlaca2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opNumEixos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnSalvarCaminhao)
                        .addGap(40, 40, 40)
                        .addComponent(btnCancelarCaminhao))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAno2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiaria2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtPlaca2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtAno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtDiaria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(opNumEixos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarCaminhao)
                    .addComponent(btnCancelarCaminhao))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnNovoCaminhao, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(btnEditarCaminhao, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluirCaminhao, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirCaminhao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarCaminhao)
                    .addComponent(btnNovoCaminhao))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Caminhão", jPanel4);

        btnTodosVeiculos.setText("Mostrar todos os veículos");
        btnTodosVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosVeiculosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(btnTodosVeiculos)
                .addContainerGap(279, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lstVeiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(btnTodosVeiculos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lstVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Todos veículos", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel1)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed

    private void txtDiariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiariaActionPerformed

    private void txtKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKMActionPerformed

    private void txtAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoActionPerformed
    //MÉTODOS DO CARRO
    private void btnSalvarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCarroActionPerformed
 
            if(modo.equals("Novo")){
                Carro carro = new Carro();
        
                String placa =txtPlaca.getText();
                int ano = Integer.parseInt( txtAno.getText());
                int diaria = Integer.parseInt(txtDiaria.getText());
                String opArC = opArCarro.getSelectedItem().toString();
                if(opArC == "Sim"){
                    int arC = 1;
                    carro.setArC(arC);
                }else if(opArC == "Não"){
                    int arC = 2;
                    carro.setArC(arC);
                }      
                int km = Integer.parseInt(txtKM.getText());
                String opNumPortas= opNumPortaCarro.getSelectedItem().toString();
                if(opNumPortas == "4 portas"){
                    int numPortas = 4;
                    try {
                        carro.setNumPorta(numPortas);
                    } catch (Exception ex) {
                        Logger.getLogger(GerenciarVeiculoInterface.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else if(opNumPortas == "2 portas"){
                    int numPortas = 2;
                    try {
                        carro.setNumPorta(numPortas);
                    } catch (Exception ex) {
                        Logger.getLogger(GerenciarVeiculoInterface.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                //int numPass = Integer.parseInt(txtNumPass.getText());
                int numPass= Integer.parseInt(opNumPassCarro.getSelectedItem().toString());
               

                carro.setPlaca(placa);
                carro.setAno(ano);
                carro.setValorD(diaria);    
                carro.setMediaKm(km);
                
                try {
                    carro.setNumePass(numPass);
                } catch (Exception ex) {
                    Logger.getLogger(GerenciarVeiculoInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
                gerenciarVeiculo.add(carro);
                listaCarro.add(carro);
                //JOptionPane.showMessageDialog(null, "Carro adicionado!");         
                
            }else if(modo.equals("Editar")){
               int index = tblCarro.getSelectedRow();
               listaCarro.get(index).setPlaca(txtPlaca.getText());
               listaCarro.get(index).setAno(Integer.parseInt(txtAno.getText()));
               listaCarro.get(index).setValorD(Integer.parseInt(txtDiaria.getText())); 
               /////////////////////////////////
               String opArC = opArCarro.getSelectedItem().toString();
                if(opArC == "Sim"){
                    int arC = 1;
                    listaCarro.get(index).setArC(arC);
                    
                }else if(opArC == "Não"){
                    int arC = 2;
                    listaCarro.get(index).setArC(arC);
                }   
               listaCarro.get(index).setMediaKm(Integer.parseInt(txtKM.getText()));
               ////////////////////////////////////
               String opNumPortas= opNumPortaCarro.getSelectedItem().toString();
                if(opNumPortas == "4 portas"){
                    int numPortas = 4;
                    try {
                        listaCarro.get(index).setNumPorta(numPortas);
                    } catch (Exception ex) {
                        Logger.getLogger(GerenciarVeiculoInterface.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else if(opNumPortas == "2 portas"){
                    int numPortas = 2;
                    try {
                        listaCarro.get(index).setNumPorta(numPortas);
                    } catch (Exception ex) {
                        Logger.getLogger(GerenciarVeiculoInterface.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                //////////////////////////////////////////////////////////////
                try {
                    listaCarro.get(index).setNumePass(Integer.parseInt(opNumPassCarro.getSelectedItem().toString()));
                } catch (Exception ex) {
                    Logger.getLogger(GerenciarVeiculoInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
             //   JOptionPane.showMessageDialog(null, "Carro modificado!");
            }    
            LoadTableCarro();
            
            modo="Navegar";
            ManipularInterface();
            //limpar os campos
            txtPlaca.setText("");
            txtAno.setText("");
            txtDiaria.setText("");
            txtKM.setText("");
                 
            
            
        
    }//GEN-LAST:event_btnSalvarCarroActionPerformed

    private void btnExcluirCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCarroActionPerformed
        int index = tblCarro.getSelectedRow();
        
        if (index>=0 && index<listaCarro.size()){
            listaCarro.remove(index);
        }
        LoadTableCarro();
        modo="Navegar";
        ManipularInterface();
    }//GEN-LAST:event_btnExcluirCarroActionPerformed
    
    private void btnNovoCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoCarroActionPerformed
       
        txtPlaca.setText("");
        txtAno.setText("");
        txtDiaria.setText("");
        txtKM.setText("");
        modo="Novo";
        ManipularInterface();
    }//GEN-LAST:event_btnNovoCarroActionPerformed
    
    private void btnEditarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCarroActionPerformed
        modo="Editar";
        ManipularInterface();
    }//GEN-LAST:event_btnEditarCarroActionPerformed

    private void btnCancelarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCarroActionPerformed
        txtPlaca.setText("");
        txtAno.setText("");
        txtDiaria.setText("");
        txtKM.setText("");
        modo="Navegar";
        ManipularInterface();
    }//GEN-LAST:event_btnCancelarCarroActionPerformed

    //MÉTODOS DO ONIBUS
    private void btnNovoOnibusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoOnibusActionPerformed

        modo="Novo";
        ManipularInterface();
    }//GEN-LAST:event_btnNovoOnibusActionPerformed

    private void btnExcluirOnibusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirOnibusActionPerformed
        // TODO add your handling code here:
        int index = tblOnibus.getSelectedRow();
        
        if (index>=0 && index<listaOnibus.size()){
            listaOnibus.remove(index);
        }
        LoadTableOnibus();
        modo="Navegar";
        ManipularInterface();
    }//GEN-LAST:event_btnExcluirOnibusActionPerformed

    private void txtPlaca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlaca1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlaca1ActionPerformed

    private void txtDiaria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaria1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaria1ActionPerformed

    private void txtAno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAno1ActionPerformed

    private void btnSalvarOnibusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarOnibusActionPerformed
            
        if(modo.equals("Novo")){
            Onibus onibus = new Onibus();
                
            String placa =txtPlaca1.getText();
            int ano = Integer.parseInt( txtAno1.getText());
            int diaria = Integer.parseInt(txtDiaria1.getText());
            String opArC = opArOnibus.getSelectedItem().toString();
                if(opArC == "Sim"){
                    int arC = 1;
                    onibus.setArC(arC);
                }else if(opArC == "Não"){
                    int arC = 2;
                    onibus.setArC(arC);
                }    
            String opInternet = opInternetOnibus.getSelectedItem().toString();
                if(opInternet == "Sim"){
                    int internet = 1;
                    try {
                        onibus.setInternet(internet);
                    } catch (Exception ex) {
                        Logger.getLogger(GerenciarVeiculoInterface.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else if(opInternet == "Não"){
                    int internet = 2;
                    try {
                        onibus.setInternet(internet);
                    } catch (Exception ex) {
                        Logger.getLogger(GerenciarVeiculoInterface.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                //PAREI NA CATEGORIA DO ONIBUS
            String categoria =opCategoria.getSelectedItem().toString();
            int numPass= Integer.parseInt(opNumPassOnibus.getSelectedItem().toString());

            onibus.setPlaca(placa);
            onibus.setAno(ano);
            onibus.setValorD(diaria);
            try {
                onibus.setCategoria(categoria);
            } catch (Exception ex) {
                Logger.getLogger(GerenciarVeiculoInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                onibus.setNumePass(numPass);
            } catch (Exception ex) {
                Logger.getLogger(GerenciarVeiculoInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
            gerenciarVeiculo.add(onibus);
            listaOnibus.add(onibus);
            
        }else if (modo.equals("Editar")){
            int index = tblOnibus.getSelectedRow();
            listaOnibus.get(index).setPlaca(txtPlaca1.getText());
            listaOnibus.get(index).setAno(Integer.parseInt(txtAno1.getText()));
            listaOnibus.get(index).setValorD(Integer.parseInt(txtDiaria1.getText()));
            String opArC = opArOnibus.getSelectedItem().toString();
                if(opArC == "Sim"){
                    int arC = 1;
                    listaOnibus.get(index).setArC(arC);
                    
                }else if(opArC == "Não"){
                    int arC = 2;
                    listaOnibus.get(index).setArC(arC);
                }
            String opInternet = opInternetOnibus.getSelectedItem().toString();
                if(opInternet == "Sim"){
                    int internet = 1;
                    try {
                        listaOnibus.get(index).setInternet(internet);
                    } catch (Exception ex) {
                        Logger.getLogger(GerenciarVeiculoInterface.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else if(opInternet == "Não"){
                    int internet = 2;
                    try {
                        listaOnibus.get(index).setInternet(internet);
                    } catch (Exception ex) {
                        Logger.getLogger(GerenciarVeiculoInterface.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            try {/////////
                listaOnibus.get(index).setCategoria(opCategoria.getSelectedItem().toString());
            } catch (Exception ex) {
                Logger.getLogger(GerenciarVeiculoInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
               listaOnibus.get(index).setNumePass(Integer.parseInt(opNumPassOnibus.getSelectedItem().toString()));
            } catch (Exception ex) {
                Logger.getLogger(GerenciarVeiculoInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        LoadTableOnibus();
        
        modo="Navegar";
        ManipularInterface();
        //limpar os campos
        txtPlaca1.setText("");
        txtAno1.setText("");
        txtDiaria1.setText("");
    }//GEN-LAST:event_btnSalvarOnibusActionPerformed

    private void btnCancelarOnibusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarOnibusActionPerformed
        // TODO add your handling code here:
        txtPlaca1.setText("");
        txtAno1.setText("");
        txtDiaria1.setText("");
        modo="Navegar";
        ManipularInterface();
    }//GEN-LAST:event_btnCancelarOnibusActionPerformed

    private void btnNovoCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoCaminhaoActionPerformed
        // TODO add your handling code here:
        txtPlaca2.setText("");
        txtAno2.setText("");
        txtDiaria2.setText("");
        txtCarga.setText("");
        modo="Novo";
        ManipularInterface();
          
    }//GEN-LAST:event_btnNovoCaminhaoActionPerformed

    private void btnExcluirCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCaminhaoActionPerformed
        // TODO add your handling code here:
        int index = tblCaminhao.getSelectedRow();
        
        if (index>=0 && index<listaCaminhao.size()){
            listaCaminhao.remove(index);
        }
        LoadTableCaminhao();
        modo="Navegar";
        ManipularInterface();
    }//GEN-LAST:event_btnExcluirCaminhaoActionPerformed

    private void txtPlaca2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlaca2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlaca2ActionPerformed

    private void txtDiaria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaria2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaria2ActionPerformed

    private void txtCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargaActionPerformed

    private void txtAno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAno2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAno2ActionPerformed

    private void btnSalvarCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCaminhaoActionPerformed
            
            
         if(modo.equals("Novo")){
            Caminhao caminhao = new Caminhao(null, 0, 0);// aqui
           
            String placa =txtPlaca2.getText();
            int ano = Integer.parseInt( txtAno2.getText());
            int diaria = Integer.parseInt(txtDiaria2.getText());
            int nEixos = Integer.parseInt(opNumEixos.getSelectedItem().toString());
            int cargaM = Integer.parseInt(txtCarga.getText());

            caminhao.setPlaca(placa);
            caminhao.setAno(ano);
            caminhao.setValorD(diaria);
            caminhao.setNumEixos(nEixos);
            caminhao.setCargaMax(cargaM);
            
            gerenciarVeiculo.add(caminhao);
            listaCaminhao.add(caminhao);
           
         }else if (modo.equals("Editar")){
            int index = tblCaminhao.getSelectedRow();
            listaCaminhao.get(index).setPlaca(txtPlaca2.getText());
            listaCaminhao.get(index).setAno(Integer.parseInt(txtAno2.getText()));
            listaCaminhao.get(index).setValorD(Integer.parseInt(txtDiaria2.getText()));
            listaCaminhao.get(index).setValorD(Integer.parseInt(opNumEixos.getSelectedItem().toString()));
            listaCaminhao.get(index).setCargaMax(Integer.parseInt(txtCarga.getText()));
             
         }

        LoadTableCaminhao();
            modo="Navegar";
            ManipularInterface();
            //limpar os campos
            txtPlaca2.setText("");
            txtAno2.setText("");
            txtDiaria2.setText("");
            txtCarga.setText("");
    }//GEN-LAST:event_btnSalvarCaminhaoActionPerformed

    private void btnCancelarCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCaminhaoActionPerformed
        // TODO add your handling code here:
        txtPlaca2.setText("");
        txtAno2.setText("");
        txtDiaria2.setText("");
        txtCarga.setText("");
        modo="Navegar";
        ManipularInterface();
    }//GEN-LAST:event_btnCancelarCaminhaoActionPerformed

    private void btnTodosVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosVeiculosActionPerformed
        // Mostrar todo os veículos
        modeloLista.removeAllElements();
       
        for(int i=0;i<listaCarro.size();i++){
           modeloLista.addElement(listaCarro.get(i));
        
        }
        for(int i=0;i<listaOnibus.size();i++){
           modeloLista.addElement(listaOnibus.get(i));
        
        }
        for(int i=0;i<listaCaminhao.size();i++){
           modeloLista.addElement(listaCaminhao.get(i));
        
        }
        
    }//GEN-LAST:event_btnTodosVeiculosActionPerformed

    private void tblCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCarroMouseClicked
        int index = tblCarro.getSelectedRow();
        
        if (index>=0 && index<listaCarro.size()){
            Carro C =  listaCarro.get(index);
            
            txtPlaca.setText(C.getPlaca());
            txtAno.setText(String.valueOf(C.getAno()));
            txtDiaria.setText(String.valueOf(C.getValorD()));
            txtKM.setText(String.valueOf(C.getMediaKm()));
            
            modo="Selecao";
            ManipularInterface();
        }
    }//GEN-LAST:event_tblCarroMouseClicked

    private void btnEditarOnibusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarOnibusActionPerformed
        // TODO add your handling code here:
        modo="Editar";
        ManipularInterface();
    }//GEN-LAST:event_btnEditarOnibusActionPerformed

    private void tblOnibusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOnibusMouseClicked
        // TODO add your handling code here:
        int index = tblOnibus.getSelectedRow();
        
        if (index>=0 && index<listaOnibus.size()){
            Onibus O =  listaOnibus.get(index);
            
            txtPlaca1.setText(O.getPlaca());
            txtAno1.setText(String.valueOf(O.getAno()));
            txtDiaria1.setText(String.valueOf(O.getValorD()));
            
            modo="Selecao";
            ManipularInterface();
        }
    }//GEN-LAST:event_tblOnibusMouseClicked

    private void btnEditarCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCaminhaoActionPerformed
        // TODO add your handling code here:
        modo="Editar";
        ManipularInterface();
    }//GEN-LAST:event_btnEditarCaminhaoActionPerformed

    private void tblCaminhaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCaminhaoMouseClicked
        // TODO add your handling code here:
        int index = tblCaminhao.getSelectedRow();
        
        if (index>=0 && index<listaCaminhao.size()){
            Caminhao C =  listaCaminhao.get(index);
            
            txtPlaca2.setText(C.getPlaca());
            txtAno2.setText(String.valueOf(C.getAno()));
            txtDiaria2.setText(String.valueOf(C.getValorD()));
            txtCarga.setText(String.valueOf(C.getCargaMax()));
            
            modo="Selecao";
            ManipularInterface();
        }
    }//GEN-LAST:event_tblCaminhaoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {//FlatLaf Light
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GerenciarVeiculoInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarVeiculoInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarVeiculoInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarVeiculoInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarCaminhao;
    private javax.swing.JButton btnCancelarCarro;
    private javax.swing.JButton btnCancelarOnibus;
    private javax.swing.JButton btnEditarCaminhao;
    private javax.swing.JButton btnEditarCarro;
    private javax.swing.JButton btnEditarOnibus;
    private javax.swing.JButton btnExcluirCaminhao;
    private javax.swing.JButton btnExcluirCarro;
    private javax.swing.JButton btnExcluirOnibus;
    private javax.swing.JButton btnNovoCaminhao;
    private javax.swing.JButton btnNovoCarro;
    private javax.swing.JButton btnNovoOnibus;
    private javax.swing.JButton btnSalvarCaminhao;
    private javax.swing.JButton btnSalvarCarro;
    private javax.swing.JButton btnSalvarOnibus;
    private javax.swing.JButton btnTodosVeiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JList<String> lstVeiculos;
    private javax.swing.JComboBox<String> opArCarro;
    private javax.swing.JComboBox<String> opArOnibus;
    private javax.swing.JComboBox<String> opCategoria;
    private javax.swing.JComboBox<String> opInternetOnibus;
    private javax.swing.JComboBox<String> opNumEixos;
    private javax.swing.JComboBox<String> opNumPassCarro;
    private javax.swing.JComboBox<String> opNumPassOnibus;
    private javax.swing.JComboBox<String> opNumPortaCarro;
    private javax.swing.JTable tblCaminhao;
    private javax.swing.JTable tblCarro;
    private javax.swing.JTable tblOnibus;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtAno1;
    private javax.swing.JTextField txtAno2;
    private javax.swing.JTextField txtCarga;
    private javax.swing.JTextField txtDiaria;
    private javax.swing.JTextField txtDiaria1;
    private javax.swing.JTextField txtDiaria2;
    private javax.swing.JTextField txtKM;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPlaca1;
    private javax.swing.JTextField txtPlaca2;
    // End of variables declaration//GEN-END:variables
}
