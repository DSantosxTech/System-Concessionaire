/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lorem.view;

/**
 *
 * @author Aluno
 */
import br.com.lorem.model.Acessorios;
import br.com.lorem.model.Carro;
import br.com.lorem.model.Combustiveis;
import br.com.lorem.model.Dados;
import br.com.lorem.model.Total;
import javax.swing.ImageIcon;
import java.text.DecimalFormat;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class ViewPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    public ViewPrincipal() {
        initComponents();
    }

    public ViewPrincipal(Dados[] dds, int cds) {
        array = dds;
        count = cds;
        initComponents();

    }

    DecimalFormat df = new DecimalFormat("R$ " + "#,###.00");

    Carro[][] carros = {
        // {new Carro("","",), new Carro("","",), new Carro("","",)}
        {new Carro("Selecione a Montadora", "Selecione o Modelo", 0), new Carro(null, null, 0), new Carro(null, null, 0)},
        {new Carro("Fiat", "Argo", 75000), new Carro("Fiat", "Mobi", 68000), new Carro("Fiat", "Pulse", 100000)},
        {new Carro("Honda", "City", 120000), new Carro("Honda", "Civic", 240000), new Carro("Honda", "Hrv", 148000)},
        {new Carro("Volkswagem", "Polo", 80000), new Carro("Volkswagem", "Nivus", 130000), new Carro("Volkswagem", "Jetta", 230000)},
        {new Carro("Lamborghini", "Urus", 1000000), new Carro("Lamborghini", "Huracam", 5300000), new Carro("Lamborghini", "Veneno", 9000000)},
        {new Carro("BMW", "X1", 300000), new Carro("BMW", "Serie 4", 450000), new Carro("BMW", "I8", 630000)},
        {new Carro("Mercedes", "Sedan", 460000), new Carro("Mercedes", "AMG GT R", 1900000), new Carro("Mercedes", "GLA", 368000)}
    };

    Carro[][] carrosimg = {
        // {new Carro("",""), new Carro("",""), new Carro("","")}
        {new Carro(null, null), new Carro(null, null), new Carro(null, null)},
        {new Carro("E:\\ProjetoConcessionaria\\src\\lib\\utils\\img2\\fiat.png", "E:\\ProjetoConcessionaria\\src\\lib\\utils\\img\\fiatArgo.jpeg"), new Carro("E:\\ProjetoConcessionaria\\src\\lib\\utils\\img2\\fiat.png", "E:\\ProjetoConcessionaria\\src\\lib\\utils\\img\\fiatMobi.jpeg"), new Carro("E:\\ProjetoConcessionaria\\src\\lib\\utils\\img2\\fiat.png", "E:\\ProjetoConcessionaria\\src\\lib\\utils\\img\\fiatPulse.jpeg")},
        {new Carro("E:\\ProjetoConcessionaria\\src\\lib\\utils\\img2\\honda.png", "E:\\ProjetoConcessionaria\\src\\lib\\utils\\img\\hondaCity.jpeg"), new Carro("E:\\ProjetoConcessionaria\\src\\lib\\utils\\img2\\honda.png", "E:\\ProjetoConcessionaria\\src\\lib\\utils\\img\\hondaCivic.jpeg"), new Carro("E:\\ProjetoConcessionaria\\src\\lib\\utils\\img2\\honda.png", "E:\\ProjetoConcessionaria\\src\\lib\\utils\\img\\hondaHrv.jpeg")},
        {new Carro("E:\\ProjetoConcessionaria\\src\\lib\\utils\\img2\\volkswagem.png", "E:\\ProjetoConcessionaria\\src\\lib\\utils\\img\\volksPolo.jpeg"), new Carro("E:\\ProjetoConcessionaria\\src\\lib\\utils\\img2\\volkswagem.png", "D:\\ProjetoConcessionaria\\src\\lib\\utils\\img\\volksNivus.jpeg"), new Carro("D:\\ProjetoConcessionaria\\src\\lib\\utils\\img2\\volkswagem.png", ":\\ProjetoConcessionaria\\src\\lib\\utils\\img\\volksJetta.jpeg")},
        {new Carro("E:\\ProjetoConcessionaria\\src\\lib\\utils\\img2\\lambo.png", "E:\\ProjetoConcessionaria\\src\\lib\\utils\\img\\lamboUrus.jpeg"), new Carro("E:\\ProjetoConcessionaria\\src\\lib\\utils\\img2\\lambo.png", "E:\\ProjetoConcessionaria\\src\\lib\\utils\\img\\lamboHuracan.jpeg"), new Carro("E:\\ProjetoConcessionaria\\src\\lib\\utils\\img2\\lambo.png", "E:\\ProjetoConcessionaria\\src\\lib\\utils\\img\\lamboVeneno.jpeg")},
        {new Carro("E:\\ProjetoConcessionaria\\src\\lib\\utils\\img2\\bmw.png", "E:\\ProjetoConcessionaria\\src\\lib\\utils\\img\\x1bmw.jpeg"), new Carro("E:\\ProjetoConcessionaria\\src\\lib\\utils\\img2\\bmw.png", "E:\\ProjetoConcessionaria\\src\\lib\\utils\\img\\serie4bmw.jpeg"), new Carro("E:\\ProjetoConcessionaria\\src\\lib\\utils\\img2\\bmw.png", "E:\\ProjetoConcessionaria\\src\\lib\\utils\\img\\i8bmw.jpeg")},
        {new Carro("E:\\ProjetoConcessionaria\\src\\lib\\utils\\img2\\mercedes.png", "E:\\ProjetoConcessionaria\\src\\lib\\utils\\img\\merceSedan.jpeg"), new Carro("E:\\ProjetoConcessionaria\\src\\lib\\utils\\img2\\mercedes.png", "E:\\ProjetoConcessionaria\\src\\lib\\utils\\img\\merceAMGTR.jpeg"), new Carro("E:\\ProjetoConcessionaria\\src\\lib\\utils\\img2\\mercedes.png", "E:\\ProjetoConcessionaria\\src\\lib\\utils\\img2\\merceGla.jpeg")},};
    Acessorios ar = new Acessorios("Ar Condicionado", 3000);
    Acessorios direcao = new Acessorios("Direçao Hidráulica", 1000);
    Acessorios multi = new Acessorios("Multimídia", 275.90);
    Acessorios teto = new Acessorios("Teto Solar", 1670);
    Acessorios banco = new Acessorios("Banco de Couro", 1567.44);
    Acessorios freio = new Acessorios("Freio de disco", 1510);
    Acessorios roda = new Acessorios("Roda de Liga Leve", 1099);

    Combustiveis combustao = new Combustiveis("Combustao", 1000);
    Combustiveis eletrico = new Combustiveis("Elétrico", 5000);
    Combustiveis hibrido = new Combustiveis("Hibrido", 10000);

    Total total = new Total(0);

    private void valorCarros() {
        int indiceMontadora = cbxMontadora.getSelectedIndex();
        int indiceModelo = cbxModelo.getSelectedIndex();
        Carro carroSelecionado = carros[indiceMontadora][indiceModelo];
        total.setValor(carroSelecionado.getValor());
        lblTotal.setText(String.valueOf(df.format(total.getTotal())));
    }

    private void limpaValores() {
        total = new Total(0);
        lblTotal.setText("");
    }

    private void limpaCliente() {
        txtCliente.setText("");
        txtCpf.setText("");
        cbxMontadora.setSelectedIndex(0);
    }

    private void limpaCheckbox() {
        chbxAr.setSelected(false);
        chbxDirecao.setSelected(false);
        chbxMulti.setSelected(false);
        chbxTeto.setSelected(false);
        chbxBanco.setSelected(false);
        chbxFreio.setSelected(false);
        chbxRoda.setSelected(false);
    }

    private void limpaRadio() {
        Combustivel.clearSelection();
    }

    private Dados[] array = new Dados[10];
    int count = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Combustiveis = new javax.swing.ButtonGroup();
        Combustivel = new javax.swing.ButtonGroup();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        imgMontadora = new javax.swing.JLabel();
        imgModelo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxMontadora = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbxModelo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        chbxAr = new javax.swing.JCheckBox();
        chbxDirecao = new javax.swing.JCheckBox();
        chbxMulti = new javax.swing.JCheckBox();
        chbxTeto = new javax.swing.JCheckBox();
        chbxBanco = new javax.swing.JCheckBox();
        chbxFreio = new javax.swing.JCheckBox();
        chbxRoda = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        rdCombustao = new javax.swing.JRadioButton();
        rdEletrico = new javax.swing.JRadioButton();
        rdHibrido = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        Salvar = new javax.swing.JButton();
        Vender = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();

        Combustivel.add(jRadioButtonMenuItem1);
        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("X - System OS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        jLabel3.setText("Cliente");

        txtCliente.setBackground(new java.awt.Color(240, 240, 240));

        txtCpf.setBackground(new java.awt.Color(240, 240, 240));
        txtCpf.setBorder(null);
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPF");

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        jLabel5.setText("Selecione a Montadora");

        cbxMontadora.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        cbxMontadora.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxMontadoraItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        jLabel4.setText("Selecione o Modelo");

        cbxModelo.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        cbxModelo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxModeloItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        jLabel6.setText("Selecione os acessórios");

        chbxAr.setBackground(new java.awt.Color(255, 255, 255));
        chbxAr.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        chbxAr.setText("Ar Condicionado");
        chbxAr.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxArItemStateChanged(evt);
            }
        });

        chbxDirecao.setBackground(new java.awt.Color(255, 255, 255));
        chbxDirecao.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        chbxDirecao.setText("Direçao Hidráulica");
        chbxDirecao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxDirecaoItemStateChanged(evt);
            }
        });

        chbxMulti.setBackground(new java.awt.Color(255, 255, 255));
        chbxMulti.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        chbxMulti.setText("Multímidia");
        chbxMulti.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxMultiItemStateChanged(evt);
            }
        });

        chbxTeto.setBackground(new java.awt.Color(255, 255, 255));
        chbxTeto.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        chbxTeto.setText("Teto solar");
        chbxTeto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxTetoItemStateChanged(evt);
            }
        });

        chbxBanco.setBackground(new java.awt.Color(255, 255, 255));
        chbxBanco.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        chbxBanco.setText("Banco de couro");
        chbxBanco.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxBancoItemStateChanged(evt);
            }
        });

        chbxFreio.setBackground(new java.awt.Color(255, 255, 255));
        chbxFreio.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        chbxFreio.setText("Freio á disco");
        chbxFreio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxFreioItemStateChanged(evt);
            }
        });

        chbxRoda.setBackground(new java.awt.Color(255, 255, 255));
        chbxRoda.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        chbxRoda.setText("Roda de liga leve");
        chbxRoda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxRodaItemStateChanged(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        jLabel9.setText("Selecione o combústivel");

        rdCombustao.setBackground(new java.awt.Color(255, 255, 255));
        Combustivel.add(rdCombustao);
        rdCombustao.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        rdCombustao.setText("Combustao");
        rdCombustao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdCombustaoItemStateChanged(evt);
            }
        });

        rdEletrico.setBackground(new java.awt.Color(255, 255, 255));
        Combustivel.add(rdEletrico);
        rdEletrico.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        rdEletrico.setText("Elétrico");
        rdEletrico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdEletricoItemStateChanged(evt);
            }
        });

        rdHibrido.setBackground(new java.awt.Color(255, 255, 255));
        Combustivel.add(rdHibrido);
        rdHibrido.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        rdHibrido.setText("Hibrido");
        rdHibrido.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdHibridoItemStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        jLabel8.setText("Valor final:");

        Salvar.setBackground(new java.awt.Color(0, 0, 0));
        Salvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Salvar.setForeground(new java.awt.Color(255, 255, 255));
        Salvar.setText("Fabricar Carro");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        Vender.setBackground(new java.awt.Color(0, 0, 0));
        Vender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Vender.setForeground(new java.awt.Color(255, 255, 255));
        Vender.setText("Vender Carro");
        Vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VenderActionPerformed(evt);
            }
        });

        lblTotal.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(txtCliente)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxMontadora, 0, 124, Short.MAX_VALUE)
                                    .addComponent(cbxModelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(63, 63, 63)
                        .addComponent(imgModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(imgMontadora, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(chbxAr)
                                .addGap(18, 18, 18)
                                .addComponent(chbxDirecao)
                                .addGap(18, 18, 18)
                                .addComponent(chbxMulti)
                                .addGap(18, 18, 18)
                                .addComponent(chbxTeto))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(chbxBanco)
                                .addGap(30, 30, 30)
                                .addComponent(chbxFreio)
                                .addGap(18, 18, 18)
                                .addComponent(chbxRoda))
                            .addComponent(rdCombustao)
                            .addComponent(rdHibrido)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(rdEletrico))
                                .addGap(74, 74, 74)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Salvar)
                                        .addGap(32, 32, 32)
                                        .addComponent(Vender))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 114, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(cbxMontadora, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(imgMontadora, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                        .addComponent(imgModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chbxAr)
                            .addComponent(chbxDirecao)
                            .addComponent(chbxTeto)
                            .addComponent(chbxMulti))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chbxBanco)
                            .addComponent(chbxFreio)
                            .addComponent(chbxRoda))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)))
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdCombustao)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(rdEletrico))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Salvar)
                            .addComponent(Vender))))
                .addGap(18, 18, 18)
                .addComponent(rdHibrido)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(759, 540));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        for (Carro[] linha : carros) {
            String montadora = linha[0].getMontadora();
            cbxMontadora.addItem(montadora);
        }

        lblTotal.setText("");

    }//GEN-LAST:event_formWindowOpened

    private void cbxMontadoraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxMontadoraItemStateChanged

        int indiceMontadora = cbxMontadora.getSelectedIndex();
        cbxModelo.removeAllItems();

        for (Carro carro : carros[indiceMontadora]) {
            String modelo = carro.getModelo();
            if (modelo != null) {
                cbxModelo.addItem(modelo);
            }
        }
        for (Carro img : carrosimg[indiceMontadora]) {
            String logo = img.getLogo();
            try {
                ImageIcon mont = new ImageIcon(logo);
                imgMontadora.setIcon(mont);
            } catch (Exception err) {
                System.out.println(err);

            }
        }

        JCheckBox[] chbx = {
            chbxAr, chbxDirecao, chbxMulti, chbxTeto,
            chbxBanco, chbxFreio, chbxRoda
        };
        JRadioButton[] rd = {
            rdCombustao, rdEletrico, rdHibrido
        };

        if (indiceMontadora == 0) {
            lblTotal.setText("");

            for (JCheckBox check : chbx) {
                check.setEnabled(false);
            }
            for (JRadioButton radio : rd) {
                radio.setEnabled(false);
            }
        } else {
            for (JCheckBox check : chbx) {
                check.setEnabled(true);
            }

            for (JRadioButton radio : rd) {
                radio.setEnabled(true);
            }
        }
    }//GEN-LAST:event_cbxMontadoraItemStateChanged

    private void cbxModeloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxModeloItemStateChanged
        limpaValores();
        int indiceMontadora = cbxMontadora.getSelectedIndex();
        int indiceModelo = cbxModelo.getSelectedIndex();
        if (indiceMontadora >= 0 && indiceModelo >= 0) {
            valorCarros();

            Carro imgmodelo = carrosimg[indiceMontadora][indiceModelo];
            String carr = imgmodelo.getCarroimagem();
            try {
                ImageIcon mode = new ImageIcon(carr);
                imgModelo.setIcon(mode);
            } catch (Exception err) {
                System.out.println(err);
            }
        }

        limpaCheckbox();
        limpaRadio();

    }//GEN-LAST:event_cbxModeloItemStateChanged

    private void chbxArItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxArItemStateChanged
        if (chbxAr.isSelected() == true) {
            total.setValor(ar.getPreco());
        } else {
            total.setValor(-ar.getPreco());
        }
        lblTotal.setText(String.valueOf(df.format(total.getTotal())));
    }//GEN-LAST:event_chbxArItemStateChanged

    private void chbxDirecaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxDirecaoItemStateChanged
        if (chbxDirecao.isSelected() == true) {
            total.setValor(direcao.getPreco());
        } else {
            total.setValor(-direcao.getPreco());
        }
        lblTotal.setText(String.valueOf(df.format(total.getTotal())));
    }//GEN-LAST:event_chbxDirecaoItemStateChanged

    private void chbxMultiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxMultiItemStateChanged
        if (chbxMulti.isSelected() == true) {
            total.setValor(multi.getPreco());
        } else {
            total.setValor(-multi.getPreco());
        }
        lblTotal.setText(String.valueOf(df.format(total.getTotal())));
    }//GEN-LAST:event_chbxMultiItemStateChanged

    private void chbxTetoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxTetoItemStateChanged
        if (chbxTeto.isSelected() == true) {
            total.setValor(teto.getPreco());
        } else {
            total.setValor(-teto.getPreco());
        }
        lblTotal.setText(String.valueOf(df.format(total.getTotal())));
    }//GEN-LAST:event_chbxTetoItemStateChanged

    private void chbxBancoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxBancoItemStateChanged
        if (chbxBanco.isSelected() == true) {
            total.setValor(banco.getPreco());
        } else {
            total.setValor(-banco.getPreco());
        }
        lblTotal.setText(String.valueOf(df.format(total.getTotal())));
    }//GEN-LAST:event_chbxBancoItemStateChanged

    private void chbxFreioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxFreioItemStateChanged
        if (chbxFreio.isSelected() == true) {
            total.setValor(freio.getPreco());
        } else {
            total.setValor(-freio.getPreco());
        }
        lblTotal.setText(String.valueOf(df.format(total.getTotal())));
    }//GEN-LAST:event_chbxFreioItemStateChanged

    private void chbxRodaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxRodaItemStateChanged
        if (chbxRoda.isSelected() == true) {
            total.setValor(roda.getPreco());
        } else {
            total.setValor(-roda.getPreco());
        }
        lblTotal.setText(String.valueOf(df.format(total.getTotal())));
    }//GEN-LAST:event_chbxRodaItemStateChanged

    private void rdCombustaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdCombustaoItemStateChanged
        if (rdCombustao.isSelected() == true) {
            total.setValor(combustao.getPreco());
        } else {
            total.setValor(-combustao.getPreco());
        }
        lblTotal.setText(String.valueOf(df.format(total.getTotal())));
    }//GEN-LAST:event_rdCombustaoItemStateChanged

    private void rdEletricoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdEletricoItemStateChanged
        if (rdEletrico.isSelected() == true) {
            total.setValor(eletrico.getPreco());
        } else {
            total.setValor(-eletrico.getPreco());
        }
        lblTotal.setText(String.valueOf(df.format(total.getTotal())));
    }//GEN-LAST:event_rdEletricoItemStateChanged

    private void rdHibridoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdHibridoItemStateChanged
        if (rdHibrido.isSelected() == true) {
            total.setValor(hibrido.getPreco());
        } else {
            total.setValor(-hibrido.getPreco());
        }
        lblTotal.setText(String.valueOf(df.format(total.getTotal())));
    }//GEN-LAST:event_rdHibridoItemStateChanged

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed

        int indiceMontadora = cbxMontadora.getSelectedIndex();
        int indiceModelo = cbxModelo.getSelectedIndex();
        Carro carroSelecionado = carros[indiceMontadora][indiceModelo];

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja adquirir estes veiculos?", "Selecione uma opçcao", 0);

        String combus;
        if (rdCombustao.isSelected()) {
            combus = combustao.getCombustiveis();
        } else if (rdEletrico.isSelected()) {
            combus = eletrico.getCombustiveis();
        } else if (rdHibrido.isSelected()) {
            combus = hibrido.getCombustiveis();
        } else {
            combus = null;
        }

        if (resposta == JOptionPane.YES_OPTION && indiceMontadora != 0 && !txtCliente.getText().isEmpty() && !txtCpf.getText().trim().isEmpty() && !txtCpf.getText().equals("   .   .   -  ") && rdCombustao.isSelected() || rdEletrico.isSelected() || rdHibrido.isSelected()) {
            if (count < 10) {
                Dados venda = new Dados(
                        txtCliente.getText(),
                        txtCpf.getText(),
                        carroSelecionado.getMontadora(),
                        carroSelecionado.getModelo(),
                        total.getTotal(),
                        combus,
                        (chbxAr.isSelected() ? "Adquirido" : "Não Adquirido"),
                        (chbxDirecao.isSelected() ? "Adquirido" : "Não Adquirido"),
                        (chbxMulti.isSelected() ? "Adquirido" : "Não Adquirido"),
                        (chbxTeto.isSelected() ? "Adquirido" : "Não Adquirido"),
                        (chbxBanco.isSelected() ? "Adquirido" : "Não Adquirido"),
                        (chbxFreio.isSelected() ? "Adquirido" : "Não Adquirido"),
                        (chbxRoda.isSelected() ? "Adquirido" : "Não Adquirido")
                );

                array[count] = venda;
                count++;
                limpaValores();
                limpaCliente();
                limpaCheckbox();
                limpaRadio();
            } else {
                JOptionPane.showMessageDialog(null, "Nao foi possivel cadastrar");
            }

        } else if (resposta == JOptionPane.NO_OPTION) {

        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        }
    }//GEN-LAST:event_SalvarActionPerformed

    private void VenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VenderActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Ir para relatorios de vendas?", "Selecione uma opçcao", 0);
        if (resposta == JOptionPane.YES_OPTION) {
            ViewRelatorio tela = new ViewRelatorio(array, count);
            tela.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Ok");
        }
    }//GEN-LAST:event_VenderActionPerformed


    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged

    }//GEN-LAST:event_formWindowStateChanged

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
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Combustiveis;
    private javax.swing.ButtonGroup Combustivel;
    private javax.swing.JButton Salvar;
    private javax.swing.JButton Vender;
    private javax.swing.JComboBox<String> cbxModelo;
    private javax.swing.JComboBox<String> cbxMontadora;
    private javax.swing.JCheckBox chbxAr;
    private javax.swing.JCheckBox chbxBanco;
    private javax.swing.JCheckBox chbxDirecao;
    private javax.swing.JCheckBox chbxFreio;
    private javax.swing.JCheckBox chbxMulti;
    private javax.swing.JCheckBox chbxRoda;
    private javax.swing.JCheckBox chbxTeto;
    private javax.swing.JLabel imgModelo;
    private javax.swing.JLabel imgMontadora;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JRadioButton rdCombustao;
    private javax.swing.JRadioButton rdEletrico;
    private javax.swing.JRadioButton rdHibrido;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JFormattedTextField txtCpf;
    // End of variables declaration//GEN-END:variables

}
