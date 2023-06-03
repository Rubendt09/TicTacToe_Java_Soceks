package jugador;

import javax.swing.JButton;

public class Main extends javax.swing.JFrame {
   
    private Cliente cliente;
    private JButton[][] botones = new JButton[3][3];
    /*
    Constructor donde generamos una matriz de botones, que represneta el tablero del juego
    */
    public Main() {
        try {
            initComponents();
            botones[0][0] = M11;
            botones[0][1] = M12;
            botones[0][2] = M13;
            botones[1][0] = M21;
            botones[1][1] = M22;
            botones[1][2] = M23;
            botones[2][0] = M31;
            botones[2][1] = M32;
            botones[2][2] = M33;
            
            cliente= new Cliente(this);
            Thread hilo = new Thread(cliente);
            hilo.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        M14 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        M11 = new javax.swing.JButton();
        M13 = new javax.swing.JButton();
        M12 = new javax.swing.JButton();
        M21 = new javax.swing.JButton();
        M22 = new javax.swing.JButton();
        M23 = new javax.swing.JButton();
        M31 = new javax.swing.JButton();
        M32 = new javax.swing.JButton();
        M33 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lbTurno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNamePlayer = new javax.swing.JTextField();
        btnConnect = new javax.swing.JButton();
        btnDisconnect = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jugador/O.png"))); // NOI18N

        M14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M14ActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe NetoSolis");
        setResizable(false);

        M11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M11ActionPerformed(evt);
            }
        });

        M13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M13ActionPerformed(evt);
            }
        });

        M12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M12ActionPerformed(evt);
            }
        });

        M21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M21ActionPerformed(evt);
            }
        });

        M22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M22ActionPerformed(evt);
            }
        });

        M23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M23ActionPerformed(evt);
            }
        });

        M31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M31ActionPerformed(evt);
            }
        });

        M32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M32ActionPerformed(evt);
            }
        });

        M33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M33ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton1.setText("Reiniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbTurno.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lbTurno.setText("Tu turno: ");

        jLabel1.setText("Player name");

        btnConnect.setText("Connect");

        btnDisconnect.setText("Disconnect");

        jLabel3.setText("Welcome to the game");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(M11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(M21, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(M31, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(M12, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(M22, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(M32, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbTurno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(M23, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(M33, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(M13, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNamePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConnect)
                        .addGap(18, 18, 18)
                        .addComponent(btnDisconnect)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNamePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConnect)
                    .addComponent(btnDisconnect))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M12, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M13, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M21, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M22, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M23, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M31, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M32, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M33, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTurno)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void M11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M11ActionPerformed
        enviarTurno(0, 0);
    }//GEN-LAST:event_M11ActionPerformed

    private void M13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M13ActionPerformed
        enviarTurno(0, 2);
    }//GEN-LAST:event_M13ActionPerformed

    private void M12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M12ActionPerformed
        enviarTurno(0, 1);
    }//GEN-LAST:event_M12ActionPerformed

    private void M14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M14ActionPerformed

    }//GEN-LAST:event_M14ActionPerformed

    private void M21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M21ActionPerformed
        enviarTurno(1, 0);
    }//GEN-LAST:event_M21ActionPerformed

    private void M22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M22ActionPerformed
        enviarTurno(1, 1);
    }//GEN-LAST:event_M22ActionPerformed

    private void M23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M23ActionPerformed
        enviarTurno(1, 2);
    }//GEN-LAST:event_M23ActionPerformed

    private void M31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M31ActionPerformed
        enviarTurno(2, 0);
    }//GEN-LAST:event_M31ActionPerformed

    private void M32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M32ActionPerformed
        enviarTurno(2, 1);
    }//GEN-LAST:event_M32ActionPerformed

    private void M33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M33ActionPerformed
        enviarTurno(2, 2);
    }//GEN-LAST:event_M33ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton M11;
    private javax.swing.JButton M12;
    private javax.swing.JButton M13;
    private javax.swing.JButton M14;
    private javax.swing.JButton M21;
    private javax.swing.JButton M22;
    private javax.swing.JButton M23;
    private javax.swing.JButton M31;
    private javax.swing.JButton M32;
    private javax.swing.JButton M33;
    private javax.swing.JButton btnConnect;
    private javax.swing.JButton btnDisconnect;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbTurno;
    private javax.swing.JTextField txtNamePlayer;
    // End of variables declaration//GEN-END:variables

    
    public void cambioTexto(String cad){
        lbTurno.setText(cad);       
    }
    
    public JButton[][] getBotones(){
        return botones;
    }
    
    //Cuando se preciona un boton enviamos los datos de la jugada al servidor (fila y columna del boton precionado)
    public void enviarTurno(int f,int c){
        cliente.enviarTurno(f, c);
    }

    
}

