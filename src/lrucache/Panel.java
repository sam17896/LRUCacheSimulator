/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lrucache;

import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Panel extends javax.swing.JPanel {
     int NoofFrames = 6; 
     Queue q;
     Hash h;
     double request = 0;
     double hit = 0;
     double miss=0;
     int value = 2;
     DecimalFormat df = new DecimalFormat("#.##");
     double missrate = 0;
 public Panel() {
         q = new Queue(NoofFrames);
         h = new Hash(10);
        initComponents();
        CacheFrames.setText("Cache of Frames: "+NoofFrames);
        Request.setText("Total Request: "+ request);
        update();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Cache = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Pages = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CacheFrames = new javax.swing.JLabel();
        Request = new javax.swing.JLabel();
        Hit = new javax.swing.JLabel();
        Missrate = new javax.swing.JLabel();
        Miss = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Current Pages In Cache: ");

        Pages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagesActionPerformed(evt);
            }
        });

        jLabel2.setText("Request Page (0-9): ");

        CacheFrames.setText("Cache of Frames:");

        Request.setText("jLabel3");

        Hit.setText("jLabel4");

        Missrate.setText("jLabel5");

        Miss.setText("jLabel3");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("LRU");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("MRU");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cache)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(Pages, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Hit)
                            .addComponent(Missrate)
                            .addComponent(Miss))
                        .addGap(0, 147, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CacheFrames)
                            .addComponent(Request))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addGap(65, 65, 65)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CacheFrames)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Request))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Miss)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Missrate, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(Pages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cache, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void update(){
        if(request!=0){
            missrate = (miss/request)*100;
            missrate= Double.valueOf(df.format(missrate));
        }
        Request.setText("Total Requests: "+ request);
        Hit.setText("Hits: "+hit);
        Miss.setText("Misses: "+miss);
        Missrate.setText("Miss Rate: "+missrate + " %");
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        q.deleteQueue();
        q = new Queue(NoofFrames);
        h = new Hash(10);
        Cache.setText("");
        Pages.setText("");
        request = 0;
        missrate=0;
        hit = 0;
        miss=0;
        update();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void PagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagesActionPerformed
        int page = -1;
        String s = Pages.getText().toString();
        if(Pages.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Something");
        }
        else {
            page = Integer.parseInt(s);
            if(page>9){
                JOptionPane.showMessageDialog(this, "Please Enter Pages from 0-9");    
            }else if(page!=-1){
                LRUCache object = new LRUCache();
                request++;
                if (object.getPage(q, h, page,value,NoofFrames)){
                    JOptionPane.showMessageDialog(this, "HIT!!!!");
                    hit++;
                }else{
                    JOptionPane.showMessageDialog(this, "MISS!!!!");
                    miss++;
                }
                String cache = q.printQueue();
                Cache.setText(cache);
            }else if(page==-1){
                JOptionPane.showMessageDialog(this, "Invalid Input!!!!!!");
            }
        }
        Pages.setText("");
        update();  
        System.out.println(value);
                // TODO add your handling code here:
    }//GEN-LAST:event_PagesActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        value=2;
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        value=1;
    }//GEN-LAST:event_jRadioButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cache;
    private javax.swing.JLabel CacheFrames;
    private javax.swing.JLabel Hit;
    private javax.swing.JLabel Miss;
    private javax.swing.JLabel Missrate;
    private javax.swing.JTextField Pages;
    private javax.swing.JLabel Request;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}
