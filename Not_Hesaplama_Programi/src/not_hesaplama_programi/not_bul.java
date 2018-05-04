package not_hesaplama_programi;

public class not_bul extends javax.swing.JFrame {
    
    int ort=45,devam=0,sayacgec=0,sayackal=0,sayacders=0,b,deger1=50,deger2=50,deger3=50,notOrt,final_sinav;
    Object a;
    String metin="";
    String[] dersekle;

    public not_bul() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ders = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        arasinavy = new javax.swing.JSlider();
        kisasinavy = new javax.swing.JSlider();
        finalsinavy = new javax.swing.JSlider();
        arasinavys = new javax.swing.JLabel();
        kisasinavys = new javax.swing.JLabel();
        finalsinavys = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        hata = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        derssec = new javax.swing.JComboBox<>();
        arasinav = new javax.swing.JTextField();
        kisasinav = new javax.swing.JTextField();
        finalsinav = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        son = new javax.swing.JTextArea();
        fsorgu = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        ortalama = new javax.swing.JSlider();
        ortalama1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        devamsizlik = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        deneme1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        gecme = new javax.swing.JLabel();
        kalma = new javax.swing.JLabel();
        deneme2 = new javax.swing.JLabel();
        derssys = new javax.swing.JTextField();
        cihat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Not Hesaplama Programı");

        jLabel1.setText("Kac Dersiniz Var: ");

        jLabel2.setText("Ders Gir: ");

        ders.setForeground(new java.awt.Color(150, 150, 150));
        ders.setText("Eklemek için ENTER'a bas");
        ders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dersMouseClicked(evt);
            }
        });
        ders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dersActionPerformed(evt);
            }
        });

        jLabel3.setText("Arasınav % : ");

        jLabel4.setText("Kısasınav % :");

        jLabel5.setText("Finalsınav % :");

        arasinavy.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                arasinavyStateChanged(evt);
            }
        });

        kisasinavy.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                kisasinavyStateChanged(evt);
            }
        });

        finalsinavy.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                finalsinavyStateChanged(evt);
            }
        });

        arasinavys.setText("50");

        kisasinavys.setText("50");

        finalsinavys.setText("50");

        jButton1.setText("Ders Eklemeyi Tamamla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Lütfen Ders Seçin: ");

        arasinav.setForeground(new java.awt.Color(150, 150, 150));

        kisasinav.setForeground(new java.awt.Color(150, 150, 150));

        finalsinav.setForeground(new java.awt.Color(150, 150, 150));

        son.setColumns(20);
        son.setRows(5);
        jScrollPane1.setViewportView(son);

        fsorgu.setText("Final Sınavında 50 Sınırı Var Mı?");

        jLabel7.setText("Geçme Notu: ");

        ortalama.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ortalamaStateChanged(evt);
            }
        });

        ortalama1.setText("45");

        jLabel8.setText("Devamsızlık: ");

        jLabel9.setText("Devamsızlık 4'ten fazla ise kalırsın");

        jButton2.setText("HESAPLA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        deneme1.setForeground(new java.awt.Color(240, 240, 240));

        jLabel13.setText("dersten geçtiniz");

        jLabel14.setText("dersten kaldınız");

        gecme.setText("0");

        kalma.setText("0");

        deneme2.setForeground(new java.awt.Color(240, 240, 240));

        derssys.setForeground(new java.awt.Color(150, 150, 150));
        derssys.setText("Sayı gir ve devam et");
        derssys.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                derssysMouseClicked(evt);
            }
        });
        derssys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derssysActionPerformed(evt);
            }
        });

        cihat.setFont(new java.awt.Font("Comic Sans MS", 2, 13)); // NOI18N
        cihat.setForeground(new java.awt.Color(153, 153, 153));
        cihat.setText("Programmer Cihat Yalman");
        cihat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deneme2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deneme1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ders))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(derssys, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(arasinavy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(arasinavys, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(kisasinavy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(kisasinavys, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(finalsinavy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(finalsinavys, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(hata, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(finalsinav, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(kisasinav, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arasinav, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(derssec, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ortalama, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(fsorgu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ortalama1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kalma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(gecme)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(devamsizlik, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9))
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cihat)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(derssys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(arasinavy, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(arasinavys))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(ders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(kisasinavy, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kisasinavys))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(finalsinavy, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(finalsinavys)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(hata)
                .addGap(51, 51, 51)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(derssec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(arasinav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kisasinav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(finalsinav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fsorgu))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(gecme)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(ortalama, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ortalama1)
                        .addComponent(jLabel14)
                        .addComponent(kalma)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(devamsizlik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deneme2)
                .addGap(9, 9, 9)
                .addComponent(cihat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(deneme1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dersActionPerformed
        dersekle[sayacders]=ders.getText();
        sayacders++;
        ders.setText(null);
    }//GEN-LAST:event_dersActionPerformed

    private void arasinavyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_arasinavyStateChanged
        if((deger1+deger2+deger3)>100){
             hata.setText("Lütfen degerlerin toplamı 100 olsun");
        }
        deger1=arasinavy.getValue();
	arasinavys.setText(String.valueOf(deger1));
    }//GEN-LAST:event_arasinavyStateChanged

    private void kisasinavyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_kisasinavyStateChanged
        deger2=kisasinavy.getValue();
	kisasinavys.setText(String.valueOf(deger2));
	deger3=100-(deger1+deger2);
	finalsinavy.setValue(deger3);
	finalsinavys.setText(String.valueOf(deger3));
	if(deger3<0){
            hata.setText("Lütfen pozitif degerler girin...");
	}
    }//GEN-LAST:event_kisasinavyStateChanged

    private void finalsinavyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_finalsinavyStateChanged
        deger3=100-(deger1+deger2);
	finalsinavy.setValue(deger3);
	finalsinavys.setText(String.valueOf(deger3));
    }//GEN-LAST:event_finalsinavyStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for(int i=0;i<b;i++){
            derssec.addItem(dersekle[i]);
	}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ortalamaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ortalamaStateChanged
        ort=ortalama.getValue();
	ortalama1.setText(String.valueOf(ort));
    }//GEN-LAST:event_ortalamaStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        
        int ara_sinav=Integer.valueOf(arasinav.getText());
        int kisa_sinav=Integer.valueOf(kisasinav.getText());
        final_sinav=Integer.valueOf(finalsinav.getText());
	       
        if(ara_sinav>100 || ara_sinav<0){
            arasinav.setText("Lütfen 0 ile 100 arası değer girin...");
	}
        if(kisa_sinav>100 || kisa_sinav<0){
            kisasinav.setText("Lütfen 0 ile 100 arası değer girin...");
        }
        if(final_sinav>100 || final_sinav<0){
            finalsinav.setText("Lütfen 0 ile 100 arası değer girin...");
        }
        a=devamsizlik.getValue();
        deneme1.setText(String.valueOf(a));
        devam=Integer.valueOf(deneme1.getText());
        
        if((deger1+deger2+deger3)==100){
            notOrt=((ara_sinav*deger1)/100)+((kisa_sinav*deger2)/100)+((final_sinav*deger3)/100);
        }
        /*
        else{
            hata.setText("Lütfen degerlerin toplamı 100 olsun");
        }
*/
        if(ara_sinav<=100 && ara_sinav>=0 && kisa_sinav<=100 && kisa_sinav>=0 && final_sinav<=100 && final_sinav>=0){
        if(notOrt>=ort && devam<5){
            if(final_sinav<50 && fsorgu.isSelected()){
                son.setText(metin+derssec.getSelectedItem()+"  ->  "+notOrt+"  ama finalden 50 altı aldığın için kaldın...\n"); 
                sayackal++;
            }
            else{
                son.setText(metin+derssec.getSelectedItem()+"  ->  "+notOrt+"  ile  Gectiniz..\n");
                sayacgec++;
            }
        }
        else {
        	if(devam>4 && notOrt>=ort){
        		son.setText(metin+derssec.getSelectedItem()+"  ->  "+notOrt+"  ama devamsızlıktan kaldın...\n");
        		sayackal++;
        	}
        	else{
            son.setText(metin+derssec.getSelectedItem()+"  ->  "+notOrt+"  ile  Kaldınız..\n");
            sayackal++;
        	}
        }
        metin=son.getText();
        gecme.setText(String.valueOf(sayacgec));
        kalma.setText(String.valueOf(sayackal));
	}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void derssysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derssysActionPerformed
        //b=Integer.valueOf(derssys.getText());
        //dersekle=new String[b];
    }//GEN-LAST:event_derssysActionPerformed

    private void derssysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_derssysMouseClicked
        derssys.setText("");
    }//GEN-LAST:event_derssysMouseClicked

    private void dersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dersMouseClicked
        ders.setText("");
        b=Integer.valueOf(derssys.getText());
        dersekle=new String[b];
        
    }//GEN-LAST:event_dersMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(not_bul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(not_bul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(not_bul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(not_bul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new not_bul().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arasinav;
    private javax.swing.JSlider arasinavy;
    private javax.swing.JLabel arasinavys;
    private javax.swing.JLabel cihat;
    private javax.swing.JLabel deneme1;
    private javax.swing.JLabel deneme2;
    private javax.swing.JTextField ders;
    private javax.swing.JComboBox<String> derssec;
    private javax.swing.JTextField derssys;
    private javax.swing.JSpinner devamsizlik;
    private javax.swing.JTextField finalsinav;
    private javax.swing.JSlider finalsinavy;
    private javax.swing.JLabel finalsinavys;
    private javax.swing.JCheckBox fsorgu;
    private javax.swing.JLabel gecme;
    private javax.swing.JLabel hata;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kalma;
    private javax.swing.JTextField kisasinav;
    private javax.swing.JSlider kisasinavy;
    private javax.swing.JLabel kisasinavys;
    private javax.swing.JSlider ortalama;
    private javax.swing.JLabel ortalama1;
    private javax.swing.JTextArea son;
    // End of variables declaration//GEN-END:variables
}
