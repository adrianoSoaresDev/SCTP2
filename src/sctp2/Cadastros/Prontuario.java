/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sctp2.Cadastros;

import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

/**
 *
 * @author Adriano
 */
public class Prontuario extends javax.swing.JFrame {
    private static String nomeresponsavelGlobal="pepino";
    private static String FixoresponsavelGlobal="pepino";
    private static String CelularresponsavelGlobal="pepino";
    private int tamanhoFonte=15;//varialve que armazena o tamanho da fonte da tela atual

    /**
     * Creates new form Prontuario
     */
    public Prontuario() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);//inicia a janela maximizada
        DesabilitaCampos();//Desabilita os campos que nao devem ser editados
        TamanhoDaFonte(tamanhoFonte);//Esta função define o tamanho da fonte da tela e deve ser chamada em todos os construtoress da classe

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        Voltar = new javax.swing.JButton();
        proximaetapa = new javax.swing.JButton();
        jBAumentaTamFOnte = new javax.swing.JButton();
        jBDiminuiTamFOnte = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLNomeAluno = new javax.swing.JLabel();
        NomeresponsavelProntuario = new javax.swing.JTextField();
        jLTelefoneAluno23 = new javax.swing.JLabel();
        jLInformacoesAdicionais = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProntuarioInformacoesAdicionais = new javax.swing.JTextPane();
        jComboStatusProntuario = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jNotificacao = new javax.swing.JTextField();
        jTelefonefixo = new javax.swing.JTextField();
        JcelularoAluno = new javax.swing.JTextField();
        jCodigoResponsavel = new javax.swing.JTextField();
        jLabelIconeStatus = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Prontuário");

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        Voltar.setBackground(new java.awt.Color(255, 255, 255));
        Voltar.setForeground(new java.awt.Color(0, 51, 255));
        Voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/left-arrow.png"))); // NOI18N
        Voltar.setText("Voltar");
        Voltar.setBorder(null);
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        proximaetapa.setBackground(new java.awt.Color(255, 255, 255));
        proximaetapa.setForeground(new java.awt.Color(0, 51, 255));
        proximaetapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/save2.png"))); // NOI18N
        proximaetapa.setText("Finalizar");
        proximaetapa.setToolTipText("Grava os dados de todas as telas anteriores e encerra");
        proximaetapa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        proximaetapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximaetapaActionPerformed(evt);
            }
        });

        jBAumentaTamFOnte.setBackground(new java.awt.Color(255, 255, 255));
        jBAumentaTamFOnte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1467515709_icon-112-search-plus.png"))); // NOI18N
        jBAumentaTamFOnte.setToolTipText("Aumenta o zoom da tela");
        jBAumentaTamFOnte.setBorder(null);
        jBAumentaTamFOnte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAumentaTamFOnteActionPerformed(evt);
            }
        });

        jBDiminuiTamFOnte.setBackground(new java.awt.Color(255, 255, 255));
        jBDiminuiTamFOnte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1467516016_icon-113-search-minus.png"))); // NOI18N
        jBDiminuiTamFOnte.setToolTipText("Reduz o zoom da tela");
        jBDiminuiTamFOnte.setBorder(null);
        jBDiminuiTamFOnte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDiminuiTamFOnteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(jBAumentaTamFOnte)
                .addGap(18, 18, 18)
                .addComponent(jBDiminuiTamFOnte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(proximaetapa, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBDiminuiTamFOnte, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBAumentaTamFOnte, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(proximaetapa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Prontuário");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel3.setText("Status do Prontuário:");

        jLNomeAluno.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLNomeAluno.setText("Nome do Professor/Aluno:");

        NomeresponsavelProntuario.setEditable(false);
        NomeresponsavelProntuario.setBackground(new java.awt.Color(255, 255, 255));
        NomeresponsavelProntuario.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        NomeresponsavelProntuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NomeresponsavelProntuarioKeyTyped(evt);
            }
        });

        jLTelefoneAluno23.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLTelefoneAluno23.setText("Telefone do Aluno:");

        jLInformacoesAdicionais.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLInformacoesAdicionais.setText("Informações Adicionais:");

        ProntuarioInformacoesAdicionais.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jScrollPane1.setViewportView(ProntuarioInformacoesAdicionais);

        jComboStatusProntuario.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jComboStatusProntuario.setForeground(new java.awt.Color(0, 51, 255));
        jComboStatusProntuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Disponível", "Emprestado", "Reservado" }));
        jComboStatusProntuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        jComboStatusProntuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboStatusProntuarioMouseClicked(evt);
            }
        });
        jComboStatusProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboStatusProntuarioActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add3.png"))); // NOI18N
        jButton1.setText("Adicionar....");
        jButton1.setToolTipText("Adicione um  responsável pelo prontuário");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jNotificacao.setEditable(false);
        jNotificacao.setBackground(new java.awt.Color(255, 255, 255));
        jNotificacao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jNotificacao.setForeground(new java.awt.Color(255, 0, 0));
        jNotificacao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jNotificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNotificacaoActionPerformed(evt);
            }
        });

        jTelefonefixo.setEditable(false);
        jTelefonefixo.setBackground(new java.awt.Color(255, 255, 255));
        jTelefonefixo.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jTelefonefixo.setToolTipText("Celular");

        JcelularoAluno.setEditable(false);
        JcelularoAluno.setBackground(new java.awt.Color(255, 255, 255));
        JcelularoAluno.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        JcelularoAluno.setToolTipText("Telefone fixo");

        jCodigoResponsavel.setEditable(false);

        jLabelIconeStatus.setBackground(new java.awt.Color(255, 255, 255));
        jLabelIconeStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/disponivel.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1036, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 80, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLNomeAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLInformacoesAdicionais)
                            .addComponent(jLTelefoneAluno23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(JcelularoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jTelefonefixo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(NomeresponsavelProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jCodigoResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(38, 38, 38))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelIconeStatus)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboStatusProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jNotificacao))
                        .addGap(256, 256, 256))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboStatusProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIconeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCodigoResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNomeAluno)
                    .addComponent(NomeresponsavelProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefoneAluno23)
                    .addComponent(jTelefonefixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JcelularoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLInformacoesAdicionais))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jNotificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/detalhes.png"))); // NOI18N
        jMenu1.setText("Menu");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/dente.png"))); // NOI18N
        jMenuItem1.setText("Menu Principal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fechar.png"))); // NOI18N
        jMenuItem2.setText("Sair do SCTP");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proximaetapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximaetapaActionPerformed
        boolean retorno;
        retorno = VerificaCampos();//função para vetificar os campos que não podem ficar em branco
        if (retorno == false) {
            jNotificacao.setText(" Preencha os campos em vermelho");
        } else if (retorno == true) {
            sctp2.ClassesdeControle.Controle acesso1 = new sctp2.ClassesdeControle.Controle();
        try {
            PassaValores();
            acesso1.ProntuarioGrava();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TratamentoNecessario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TratamentoNecessario.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            sctp2.ClassesdeControle.Paciente pegarg= new sctp2.ClassesdeControle.Paciente();
        sctp2.Paciente.DadosDoPaciente acesso = new sctp2.Paciente.DadosDoPaciente(pegarg.getRg());
            acesso.setVisible(true);//exibe a tela de cadastro de paciente
            this.setVisible(false);// oculta a tela atual
        }catch(ClassNotFoundException ex){
            Logger.getLogger(TratamentoNecessario.class.getName()).log(Level.SEVERE, null, ex);
            
        }
            
            
        }
    }//GEN-LAST:event_proximaetapaActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        this.setVisible(false);
        sctp2.Cadastros.TratamentoNecessario acesso = new sctp2.Cadastros.TratamentoNecessario();
        acesso.setVisible(true);

    }//GEN-LAST:event_VoltarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        sctp2.Principal.principal acesso = new sctp2.Principal.principal();        // TODO add your handling code here:
        acesso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void NomeresponsavelProntuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomeresponsavelProntuarioKeyTyped
        //Função para impedir a digitação de letras e caracteres especiais no campo de número do prontuário
        String caracteres = "0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_NomeresponsavelProntuarioKeyTyped

    private void jNotificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNotificacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNotificacaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sctp2.Cadastros.ResponsavelProntuario acesso;
        try {
            acesso = new sctp2.Cadastros.ResponsavelProntuario();
            this.setVisible(false);
            acesso.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Prontuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBAumentaTamFOnteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAumentaTamFOnteActionPerformed
        TamanhoDaFonte(tamanhoFonte+1);        // TODO add your handling code here:
    }//GEN-LAST:event_jBAumentaTamFOnteActionPerformed

    private void jBDiminuiTamFOnteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDiminuiTamFOnteActionPerformed
TamanhoDaFonte(tamanhoFonte-1);        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jBDiminuiTamFOnteActionPerformed

    private void jComboStatusProntuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboStatusProntuarioMouseClicked

    }//GEN-LAST:event_jComboStatusProntuarioMouseClicked

    private void jComboStatusProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboStatusProntuarioActionPerformed
ImageIcon disponivel = new ImageIcon("src\\Imagens\\disponivel.png");
ImageIcon emprestado = new ImageIcon("src\\Imagens\\emprestado.png");
ImageIcon reservado = new ImageIcon("src\\Imagens\\reservado.png");
if(jComboStatusProntuario.getSelectedItem().equals("Disponível"))jLabelIconeStatus.setIcon(disponivel);
if(jComboStatusProntuario.getSelectedItem().equals("Emprestado"))jLabelIconeStatus.setIcon(emprestado);
if(jComboStatusProntuario.getSelectedItem().equals("Reservado"))jLabelIconeStatus.setIcon(reservado);
        
    }//GEN-LAST:event_jComboStatusProntuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Prontuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prontuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prontuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prontuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prontuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JcelularoAluno;
    private javax.swing.JTextField NomeresponsavelProntuario;
    private javax.swing.JTextPane ProntuarioInformacoesAdicionais;
    private javax.swing.JButton Voltar;
    private javax.swing.JButton jBAumentaTamFOnte;
    private javax.swing.JButton jBDiminuiTamFOnte;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jCodigoResponsavel;
    private javax.swing.JComboBox jComboStatusProntuario;
    private javax.swing.JLabel jLInformacoesAdicionais;
    private javax.swing.JLabel jLNomeAluno;
    private javax.swing.JLabel jLTelefoneAluno23;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelIconeStatus;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField jNotificacao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTelefonefixo;
    private javax.swing.JButton proximaetapa;
    // End of variables declaration//GEN-END:variables
//Esta classe Seta os valores para a classe de prontuario
    private void PassaValores() {
        sctp2.ClassesdeControle.Prontuario acesso = new sctp2.ClassesdeControle.Prontuario();
        acesso.setNomeresponsavelProntuario(NomeresponsavelProntuario.getText());
        acesso.setStatusProntuario((String) jComboStatusProntuario.getSelectedItem());
        acesso.setTelefoneResponsavelProntuario(JcelularoAluno.getText());
        acesso.setInformacoesProntuario(ProntuarioInformacoesAdicionais.getText());
        if(jCodigoResponsavel.getText().trim().equals(""))acesso.setIdResponsavelProntuario("0");
        else
            if(!jCodigoResponsavel.getText().trim().equals(""))acesso.setIdResponsavelProntuario(jCodigoResponsavel.getText());

    }

    private boolean VerificaCampos() {//função que verifica se os campos obrigatórios foram preenchidos
        boolean retorno = true;
        if (NomeresponsavelProntuario.getText().trim().equals("")||NomeresponsavelProntuario.getText().trim().equals("Clique no botão adicionar")) {
            NomeresponsavelProntuario.setBorder(new LineBorder(Color.red));
            NomeresponsavelProntuario.setText("Clique no botão adicionar");
            
            retorno = false;
        }

//        if (NomeresponsavelProntuario.getText().trim().equals("")) {
//            NomeresponsavelProntuario.setBorder(new LineBorder(Color.red));
//            retorno = false;
//        }

        return retorno;

    }
    public void Recebe(String codigo,String nome,String celular, String fixo,String idResponsavel){

        NomeresponsavelProntuario.setText(nome);
        JcelularoAluno.setText(celular);
        jTelefonefixo.setText(fixo);
        jCodigoResponsavel.setText(idResponsavel);
    }

    private void TamanhoDaFonte(int tamanhoFonte) {
        this.tamanhoFonte=tamanhoFonte;
        System.out.println("tam "+tamanhoFonte);
        if((this.tamanhoFonte<24) && (this.tamanhoFonte>15)){
        jBDiminuiTamFOnte.setEnabled(true);
        jBAumentaTamFOnte.setEnabled(true);
        jLabel3.setFont(new Font("Times new Roman", Font.BOLD, tamanhoFonte));
        jButton1.setFont(new Font("Times new Roman", Font.BOLD, tamanhoFonte));
        jCodigoResponsavel.setFont(new Font("Times new Roman", Font.BOLD, tamanhoFonte));
        jComboStatusProntuario.setFont(new Font("Times new Roman", Font.BOLD, tamanhoFonte));
        jLInformacoesAdicionais.setFont(new Font("Times new Roman", Font.BOLD, tamanhoFonte));
        jLNomeAluno.setFont(new Font("Times new Roman", Font.BOLD, tamanhoFonte));
        jLTelefoneAluno23.setFont(new Font("Times new Roman", Font.BOLD, tamanhoFonte));
        jMenu1.setFont(new Font("Times new Roman", Font.BOLD, tamanhoFonte));
        jMenu3.setFont(new Font("Times new Roman", Font.BOLD, tamanhoFonte));
        jMenu3.setFont(new Font("Times new Roman", Font.BOLD, tamanhoFonte));
        jMenu4.setFont(new Font("Times new Roman", Font.BOLD, tamanhoFonte));
        jMenuBar1.setFont(new Font("Times new Roman", Font.BOLD, tamanhoFonte));
        jMenuBar2.setFont(new Font("Times new Roman", Font.BOLD, tamanhoFonte));
        jMenuItem1.setFont(new Font("Times new Roman", Font.BOLD, tamanhoFonte));
        jMenuItem2.setFont(new Font("Times new Roman", Font.BOLD, tamanhoFonte));
        jPanel1.setFont(new Font("Times new Roman", Font.BOLD, tamanhoFonte));
        jPanel2.setFont(new Font("Times new Roman", Font.BOLD, tamanhoFonte));
        jNotificacao.setFont(new Font("Times new Roman", Font.BOLD, tamanhoFonte));
        jTelefonefixo.setFont(new Font("Times new Roman", Font.BOLD, tamanhoFonte));
        
        
        }
        else
            if(this.tamanhoFonte>=24){
                jBAumentaTamFOnte.setEnabled(false);
                jBDiminuiTamFOnte.setEnabled(true);
                
            }
        else
        if(this.tamanhoFonte<=15){
                jBDiminuiTamFOnte.setEnabled(false);
                jBAumentaTamFOnte.setEnabled(true);
                }
    }

    private void DesabilitaCampos() {
    //NomeresponsavelProntuario.enable(false);
        //jTelefonefixo.enable(false);
        //JcelularoAluno.enable(false);
        NomeresponsavelProntuario.setForeground(Color.black);
        jTelefonefixo.setForeground(Color.black);
        JcelularoAluno.setForeground(Color.black);
    }
    }


