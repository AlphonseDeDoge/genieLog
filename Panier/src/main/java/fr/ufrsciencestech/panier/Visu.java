/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import javax.swing.JComboBox;

/**
 *
 * @author nl773507
 */
public class Visu extends javax.swing.JFrame {

    private Controller controller;
    
    private Panier panier;
    private String[] export;
    private JComboBox jcombo;
    
    public Visu() 
    {
        initComponents();
        jcombo = new JComboBox();
        this.jPanel4.add(jcombo);
        
        this.setSize(800, 600);
        update();
    }

    public void update()
    {
        setTitle();
        setArea();
        setJcombo();
    }
    
    private void setTitle()
    {
        if(panier != null)
        {
            this.setTitle("Panier (" + panier.size() + "/" + panier.getMax() + ")");
        }
        else
        {
            this.setTitle("Panier inexistant");
        }
    }
    
    private void setArea()
    {
        if(panier != null)
        {
            String tmp = "";
            for(int i=0 ; i<panier.size() ; i++)
            {
                tmp += panier.get(i).toString() + "\n";
            }
            tmp += panier.getException();
            this.jTextArea1.setText(tmp);
        }
    }

    private void setJcombo()
    {
        if(export != null)
        {
            for(int i=0 ; i<export.length ; i++)
            {
                this.jcombo.addItem(export[i]);
            }
        }
    }
    
    public String[] getExport() {
        return export;
    }

    public void setExport(String[] export) {
        this.export = export;
    }

    public JComboBox getJcombo() {
        return jcombo;
    }

    public void setJcombo(JComboBox jcombo) {
        this.jcombo = jcombo;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Modifier"));
        jPanel3.setLayout(new java.awt.GridLayout());

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jPanel1.add(jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Boycotter"));
        jPanel4.setLayout(new java.awt.GridLayout());

        jButton3.setText("Supprimer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);

        jPanel1.add(jPanel4);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(controller != null)
        {
            controller.genererFruit();
        }
        update();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(controller != null)
        {
            controller.retirerFruit();
        }
        update();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(controller != null)
        {
            controller.boycotter();
        }
        update();
    }//GEN-LAST:event_jButton3ActionPerformed

    public Panier getPanier() {
        return panier;
    }

    public void setPanier(Panier panier) {
        this.panier = panier;
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
