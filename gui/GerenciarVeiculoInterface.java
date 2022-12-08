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
    
    DefaultTableModel modeloOnibus = new DefaultTableModel();
    DefaultTableModel modeloCaminhao = new DefaultTableModel();
    ArrayList<Carro> listaCarro;
    ArrayList<Onibus> listaOnibus;
    ArrayList<Caminhao> listaCaminhao;
    String modo;
  
    public GerenciarVeiculoInterface(GerenciarVeiculo gerenciarVeiculo) {
        initComponents();     
        this.gerenciarVeiculo= gerenciarVeiculo;     
        
        tblOnibus.setModel(modeloOnibus);
        tblCaminhao.setModel(modeloCaminhao);
        
        listaCarro = new ArrayList();
        listaOnibus = new ArrayList();
        listaCaminhao = new ArrayList();
        modo="Navegar";
        ManipularInterface();
    }
    
    public void ManipularInterface(){
        switch(modo){
            case "Navegar":
                btnSalvar.setEnabled(false);
                btnCancelar.setEnabled(false);
                txtPlaca.setEnabled(false);
                txtAno.setEnabled(false);
                txtDiaria.setEnabled(false);
                txtAr.setEnabled(false);
                txtKM.setEnabled(false);
                txtNumPass.setEnabled(false);
                txtNumPortas.setEnabled(false);
                btnNovo.setEnabled(true);
                btnEditarCarro.setEnabled(false);
                btnExcluir.setEnabled(false);
                break;
            case "Novo":
                btnSalvar.setEnabled(true);
                btnCancelar.setEnabled(true);
                txtPlaca.setEnabled(true);
                txtAno.setEnabled(true);
                txtDiaria.setEnabled(true);
                txtAr.setEnabled(true);
                txtKM.setEnabled(true);
                txtNumPass.setEnabled(true);
                txtNumPortas.setEnabled(true);
                btnNovo.setEnabled(false);
                btnEditarCarro.setEnabled(false);
                btnExcluir.setEnabled(false);               
                break;
            case "Editar":
                btnSalvar.setEnabled(true);
                btnCancelar.setEnabled(true);
                txtPlaca.setEnabled(true);
                txtAno.setEnabled(true);
                txtDiaria.setEnabled(true);
                txtAr.setEnabled(true);
                txtKM.setEnabled(true);
                txtNumPass.setEnabled(true);
                txtNumPortas.setEnabled(true);
                btnNovo.setEnabled(false);
                btnEditarCarro.setEnabled(false);
                btnExcluir.setEnabled(false);  
                break;
            case "Excluir":
                btnSalvar.setEnabled(false);
                btnCancelar.setEnabled(false);
                txtPlaca.setEnabled(false);
                txtAno.setEnabled(false);
                txtDiaria.setEnabled(false);
                txtAr.setEnabled(false);
                txtKM.setEnabled(false);
                txtNumPass.setEnabled(false);
                txtNumPortas.setEnabled(false);
                btnNovo.setEnabled(true);
                btnEditarCarro.setEnabled(false);
                btnExcluir.setEnabled(false);  
                break;
            case "Selecao":
                    btnSalvar.setEnabled(false);
                    btnCancelar.setEnabled(false);
                    txtPlaca.setEnabled(false);
                    txtAno.setEnabled(false);
                    txtDiaria.setEnabled(false);
                    txtAr.setEnabled(false);
                    txtKM.setEnabled(false);
                    txtNumPass.setEnabled(false);
                    txtNumPortas.setEnabled(false);
                    btnNovo.setEnabled(true);
                    btnEditarCarro.setEnabled(true);
                    btnExcluir.setEnabled(true);  
                    break;
        
        }
    }
  
    public void LoadTableCarro(){
        DefaultTableModel modelo = new DefaultTableModel(new Object [] {"Placa","Ano", "Valor da Diária","Ar Cond.", "Km", "NºPassageiros", "NºPortas" },0);

            for(int i=0;i<listaCarro.size();i++){
                Object linha []=new Object[]{listaCarro.get(i).getPlaca(),listaCarro.get(i).getAno(),listaCarro.get(i).getValorD(), listaCarro.get(i).getArC(), listaCarro.get(i).getMediaKm(), listaCarro.get(i).getNumePorta(), listaCarro.get(i).getNumePass()};
                modelo.addRow(linha);
            }// cuidado com a lista de carro

            tblCarro.setModel(modelo);
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
        txtAr = new javax.swing.JTextField();
        txtKM = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNumPass = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNumPortas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEditarCarro = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCarro = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblOnibus = new javax.swing.JTable();
        btnNovoOnibus = new javax.swing.JButton();
        btnEditar1 = new javax.swing.JButton();
        btnExcluir1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        txtPlaca1 = new javax.swing.JTextField();
        txtDiaria1 = new javax.swing.JTextField();
        txtAr1 = new javax.swing.JTextField();
        txtInternet = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNumPass1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAno1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnSalvarOnibus = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnCancelar1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblCaminhao = new javax.swing.JTable();
        btnNovoCaminhao = new javax.swing.JButton();
        btnEditar2 = new javax.swing.JButton();
        btnExcluir2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        txtPlaca2 = new javax.swing.JTextField();
        txtDiaria2 = new javax.swing.JTextField();
        txtCarga = new javax.swing.JTextField();
        txtNeixos = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtAno2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnSalvarCaminhao = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        btnCancelar2 = new javax.swing.JButton();
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

        txtAr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArActionPerformed(evt);
            }
        });

        txtKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKMActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Placa do carro:");

        txtNumPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumPassActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Ano:");

        txtAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Possui ar condicionado:");

        txtNumPortas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumPortasActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Valor da diária:");

        btnSalvar.setText("Salvar ");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Média de Km:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Número de portas:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Número de passageiros:");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAr, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKM, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumPortas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumPass, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap(193, Short.MAX_VALUE))
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
                    .addComponent(txtAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNumPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNumPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(122, 122, 122)
                            .addComponent(btnEditarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(116, 116, 116)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo))
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
        jScrollPane4.setViewportView(tblOnibus);

        btnNovoOnibus.setText("Novo");
        btnNovoOnibus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoOnibusActionPerformed(evt);
            }
        });

        btnEditar1.setText("Editar");

        btnExcluir1.setText("Excluir");
        btnExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir1ActionPerformed(evt);
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

        txtAr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAr1ActionPerformed(evt);
            }
        });

        txtInternet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInternetActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Placa do ônibus:");

        txtNumPass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumPass1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Ano:");

        txtAno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAno1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Possui ar condicionado:");

        txtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaActionPerformed(evt);
            }
        });

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

        btnCancelar1.setText("Cancelar");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAno1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlaca1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiaria1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInternet, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvarOnibus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar1))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAr1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(txtInternet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtAr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtNumPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarOnibus)
                    .addComponent(btnCancelar1))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnNovoOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(btnExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoOnibus)
                    .addComponent(btnEditar1)
                    .addComponent(btnExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Ônibus", jPanel3);

        tblCaminhao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Ano", "Valor da Diária", "Nº Eixos", "Carga Maxima"
            }
        ));
        jScrollPane5.setViewportView(tblCaminhao);

        btnNovoCaminhao.setText("Novo");
        btnNovoCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCaminhaoActionPerformed(evt);
            }
        });

        btnEditar2.setText("Editar");

        btnExcluir2.setText("Excluir");
        btnExcluir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir2ActionPerformed(evt);
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

        txtNeixos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNeixosActionPerformed(evt);
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

        btnCancelar2.setText("Cancelar");
        btnCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAno2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlaca2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiaria2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNeixos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnSalvarCaminhao)
                        .addGap(40, 40, 40)
                        .addComponent(btnCancelar2)))
                .addContainerGap(214, Short.MAX_VALUE))
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
                    .addComponent(txtNeixos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarCaminhao)
                    .addComponent(btnCancelar2))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnNovoCaminhao, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(btnEditar2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar2)
                    .addComponent(btnNovoCaminhao))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
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
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(lstVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(btnTodosVeiculos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(207, 207, 207)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void txtArActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArActionPerformed

    private void txtKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKMActionPerformed

    private void txtNumPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumPassActionPerformed

    private void txtAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoActionPerformed

    private void txtNumPortasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumPortasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumPortasActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
 
            if(modo.equals("Novo")){
                Carro carro = new Carro();
        
                String placa =txtPlaca.getText();
                int ano = Integer.parseInt( txtAno.getText());
                int diaria = Integer.parseInt(txtDiaria.getText());
                int arC = Integer.parseInt(txtAr.getText());
                int km = Integer.parseInt(txtKM.getText());
                int numPortas = Integer.parseInt(txtNumPortas.getText());
                int numPass = Integer.parseInt(txtNumPass.getText());

                carro.setPlaca(placa);
                carro.setAno(ano);
                carro.setValorD(diaria);
                carro.setArC(arC);
                carro.setMediaKm(km);
                try {
                    carro.setNumPorta(numPortas);
                } catch (Exception ex) {
                    Logger.getLogger(GerenciarVeiculoInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    carro.setNumePass(numPass);
                } catch (Exception ex) {
                    Logger.getLogger(GerenciarVeiculoInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
                gerenciarVeiculo.add(carro);
                listaCarro.add(carro);
                //JOptionPane.showMessageDialog(null, "Carro adicionado!");         
                
            }else if(modo.equals("Editar")){// parei no editar ta dando erro
               int index = tblCarro.getSelectedRow();
               listaCarro.get(index).setPlaca(txtPlaca.getText());
               listaCarro.get(index).setAno(Integer.parseInt(txtAno.getText()));
               listaCarro.get(index).setValorD(Integer.parseInt(txtDiaria.getText()));
               listaCarro.get(index).setArC(Integer.parseInt(txtAr.getText()));
               listaCarro.get(index).setMediaKm(Integer.parseInt(txtKM.getText()));
                try {
                    listaCarro.get(index).setNumPorta(Integer.parseInt(txtNumPortas.getText()));
                } catch (Exception ex) {
                    Logger.getLogger(GerenciarVeiculoInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    listaCarro.get(index).setNumePass(Integer.parseInt(txtNumPass.getText()));
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
            txtAr.setText("");
            txtKM.setText("");
            txtNumPortas.setText("");
            txtNumPass.setText("");
                 
            
            
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
       
        txtPlaca.setText("");
        txtAno.setText("");
        txtDiaria.setText("");
        txtAr.setText("");
        txtKM.setText("");
        txtNumPortas.setText("");
        txtNumPass.setText("");
        modo="Novo";
        ManipularInterface();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCarroActionPerformed
        modo="Editar";
        ManipularInterface();
    }//GEN-LAST:event_btnEditarCarroActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtPlaca.setText("");
        txtAno.setText("");
        txtDiaria.setText("");
        txtAr.setText("");
        txtKM.setText("");
        txtNumPortas.setText("");
        txtNumPass.setText("");
        modo="Navegar";
        ManipularInterface();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNovoOnibusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoOnibusActionPerformed
        txtPlaca1.setText("");
        txtAno1.setText("");
        txtDiaria1.setText("");
        txtAr1.setText("");
        txtInternet.setText("");
        txtCategoria.setText("");
        txtNumPass.setText("");
        modo="Novo";
        ManipularInterface();
    }//GEN-LAST:event_btnNovoOnibusActionPerformed

    private void btnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluir1ActionPerformed

    private void txtPlaca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlaca1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlaca1ActionPerformed

    private void txtDiaria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaria1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaria1ActionPerformed

    private void txtAr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAr1ActionPerformed

    private void txtInternetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInternetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInternetActionPerformed

    private void txtNumPass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumPass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumPass1ActionPerformed

    private void txtAno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAno1ActionPerformed

    private void txtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaActionPerformed

    private void btnSalvarOnibusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarOnibusActionPerformed
            Onibus onibus = new Onibus();// aqui
                
            String placa =txtPlaca1.getText();
            int ano = Integer.parseInt( txtAno1.getText());
            int diaria = Integer.parseInt(txtDiaria1.getText());
            int arC = Integer.parseInt(txtAr1.getText());
            int internet = Integer.parseInt(txtInternet.getText());
            int categoria = Integer.parseInt(txtCategoria.getText());
            int numPass = Integer.parseInt(txtNumPass1.getText());

            onibus.setPlaca(placa);
            onibus.setAno(ano);
            onibus.setValorD(diaria);
            onibus.setArC(arC);
            try {
                onibus.setCategoria(categoria);
            } catch (Exception ex) {
                Logger.getLogger(GerenciarVeiculoInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                onibus.setInternet(internet);
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
            
            DefaultTableModel modeloOnibus = new DefaultTableModel(new Object [] {"Placa","Ano", "Valor da Diária", "Internet","Ar Cond.","Categoria" , "NºPassageiros" },0);
      
            for(int i=0;i<listaOnibus.size();i++){
                Object linha []=new Object[]{listaOnibus.get(i).getPlaca(),listaOnibus.get(i).getAno(),listaOnibus.get(i).getValorD(),listaOnibus.get(i).getInternet(), listaOnibus.get(i).getArC(), listaOnibus.get(i).getCategoria(), listaOnibus.get(i).getNumePass()};
                modeloOnibus.addRow(linha);
            }// tem que arrumar mas valenndo
        
            tblOnibus.setModel(modeloOnibus);
            JOptionPane.showMessageDialog(null, "Ônibus adicionado!");
        
            modo="Navegar";
            ManipularInterface();
            //limpar os campos
            txtPlaca1.setText("");
            txtAno1.setText("");
            txtDiaria1.setText("");
            txtAr1.setText("");
            txtInternet.setText("");
            txtCategoria.setText("");
            txtNumPass1.setText("");
    }//GEN-LAST:event_btnSalvarOnibusActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnNovoCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoCaminhaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoCaminhaoActionPerformed

    private void btnExcluir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluir2ActionPerformed

    private void txtPlaca2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlaca2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlaca2ActionPerformed

    private void txtDiaria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaria2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaria2ActionPerformed

    private void txtCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargaActionPerformed

    private void txtNeixosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNeixosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNeixosActionPerformed

    private void txtAno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAno2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAno2ActionPerformed

    private void btnSalvarCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCaminhaoActionPerformed
            Caminhao caminhao = new Caminhao(null, 0, 0);// aqui
            
            
            String placa =txtPlaca2.getText();
            int ano = Integer.parseInt( txtAno2.getText());
            int diaria = Integer.parseInt(txtDiaria2.getText());
            int nEixos = Integer.parseInt(txtNeixos.getText());
            int cargaM = Integer.parseInt(txtCarga.getText());

            caminhao.setPlaca(placa);
            caminhao.setAno(ano);
            caminhao.setValorD(diaria);
            caminhao.setNumEixos(nEixos);
            //caminhao.setCargaMax(cargaM);
            
            gerenciarVeiculo.add(caminhao);
            listaCaminhao.add(caminhao);
           
            DefaultTableModel modeloCaminhao = new DefaultTableModel(new Object [] {"Placa","Ano", "Valor da Diária", "Nº Eixos","Carga Maxima" },0);
      
            for(int i=0;i<listaCaminhao.size();i++){
                Object linha []=new Object[]{listaCaminhao.get(i).getPlaca(),listaCaminhao.get(i).getAno(),listaCaminhao.get(i).getValorD(),listaCaminhao.get(i).getNumEixos(), listaCaminhao.get(i).getCargaMax()};
                modeloCaminhao.addRow(linha);
            }// tem que arrumar mas valenndo
        
            tblCaminhao.setModel(modeloCaminhao);
            JOptionPane.showMessageDialog(null, "Caminhão adicionado!");
        
            modo="Navegar";
            ManipularInterface();
            //limpar os campos
            txtPlaca2.setText("");
            txtAno2.setText("");
            txtDiaria2.setText("");
            txtNeixos.setText("");
            txtCarga.setText("");
    }//GEN-LAST:event_btnSalvarCaminhaoActionPerformed

    private void btnCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar2ActionPerformed

    private void btnTodosVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosVeiculosActionPerformed
        // Mostrar todo os veículos
        DefaultListModel todosV;
        todosV = new DefaultListModel();
        //lstVeiculos.addAll(gerenciarVeiculo.getInfo());
        //lstVeiculos.setModel(gerenciarVeiculo.getInfo());
        
        
    }//GEN-LAST:event_btnTodosVeiculosActionPerformed

    private void tblCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCarroMouseClicked
        int index = tblCarro.getSelectedRow();
        
        if (index>=0 && index<listaCarro.size()){
            Carro C =  listaCarro.get(index);
            
            txtPlaca.setText(C.getPlaca());
            txtAno.setText(String.valueOf(C.getAno()));
            txtDiaria.setText(String.valueOf(C.getValorD()));
            txtAr.setText(String.valueOf(C.getArCint()));
            txtKM.setText(String.valueOf(C.getMediaKm()));
            txtNumPortas.setText(String.valueOf(C.getNumePorta()));
            txtNumPass.setText(String.valueOf(C.getNumePass()));
            
            modo="Selecao";
            ManipularInterface();
        }
    }//GEN-LAST:event_tblCarroMouseClicked

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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnCancelar2;
    private javax.swing.JButton btnEditar1;
    private javax.swing.JButton btnEditar2;
    private javax.swing.JButton btnEditarCarro;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExcluir1;
    private javax.swing.JButton btnExcluir2;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnNovoCaminhao;
    private javax.swing.JButton btnNovoOnibus;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvarCaminhao;
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
    private javax.swing.JTable tblCaminhao;
    private javax.swing.JTable tblCarro;
    private javax.swing.JTable tblOnibus;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtAno1;
    private javax.swing.JTextField txtAno2;
    private javax.swing.JTextField txtAr;
    private javax.swing.JTextField txtAr1;
    private javax.swing.JTextField txtCarga;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtDiaria;
    private javax.swing.JTextField txtDiaria1;
    private javax.swing.JTextField txtDiaria2;
    private javax.swing.JTextField txtInternet;
    private javax.swing.JTextField txtKM;
    private javax.swing.JTextField txtNeixos;
    private javax.swing.JTextField txtNumPass;
    private javax.swing.JTextField txtNumPass1;
    private javax.swing.JTextField txtNumPortas;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPlaca1;
    private javax.swing.JTextField txtPlaca2;
    // End of variables declaration//GEN-END:variables
}
