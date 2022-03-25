/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_diegomolina_12141157;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author diego
 */
public class Principal extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form Prinicipal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarPublicos();
        cargarCientifico();
        actualizarCB();
    }
    public void cargarPublicos(){
        publicos.add(new Terrestre("Mercurio", 5000, 13000, 400, 300));
        publicos.add(new Terrestre("Venus", 100000, 15000, 640, 260));
        publicos.add(new Terrestre("Tierra",140000, 17000, 760, 570));
        publicos.add(new Terrestre("Marte", 90000, 12000, 360, 360));
        publicos.add(new Gaseoso("Jupiter", 400000, 40000, 340, 310));
        publicos.add(new Gaseoso("Saturno", 300000, 30000, 560, 450));
        publicos.add(new Gaseoso("Urano", 200000, 20000, 670, 690));
        publicos.add(new Gaseoso("Neptuno",200000, 20000, 840, 900));
        
    }
    Thread hilo = new Thread(this);
    Random rd = new Random();
    boolean pausa = false;
    @Override
    public void run(){
        int cont = 0;
        while(true){
            System.out.print("");
            while(!pausa){
                try{
                    pb_distancia.setValue(cont);
                    cont++;
                    Thread.sleep(5);
                }catch(Exception ex){
                    System.out.println(ex);
                }
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popup_addP = new javax.swing.JPopupMenu();
        mi_planeta1 = new javax.swing.JMenuItem();
        mi_planeta2 = new javax.swing.JMenuItem();
        jProgressBar1 = new javax.swing.JProgressBar();
        pb_distancia = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_planetas = new javax.swing.JTree();
        checkb_publicos = new javax.swing.JCheckBox();
        tf_nomP1 = new javax.swing.JTextField();
        tf_nomP2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cb_cientificos = new javax.swing.JComboBox<>();
        bt_collisionar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tf_nomCientifico = new javax.swing.JTextField();
        bt_crearCientifico = new javax.swing.JButton();

        mi_planeta1.setText("Planeta 1");
        mi_planeta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_planeta1ActionPerformed(evt);
            }
        });
        popup_addP.add(mi_planeta1);

        mi_planeta2.setText("Planeta 2");
        mi_planeta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_planeta2ActionPerformed(evt);
            }
        });
        popup_addP.add(mi_planeta2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Planetas");
        jt_planetas.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_planetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_planetasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_planetas);

        checkb_publicos.setText("Publicos");
        checkb_publicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkb_publicosActionPerformed(evt);
            }
        });

        jLabel1.setText("Cientificos");

        cb_cientificos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_cientificosItemStateChanged(evt);
            }
        });

        bt_collisionar.setText("Collisionar");
        bt_collisionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_collisionarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        bt_crearCientifico.setText("Crear Cientifico");
        bt_crearCientifico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_crearCientificoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pb_distancia, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(bt_crearCientifico, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(tf_nomCientifico)
                                                .addComponent(tf_nomP1, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tf_nomP2, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cb_cientificos, javax.swing.GroupLayout.Alignment.LEADING, 0, 155, Short.MAX_VALUE)))
                                        .addGap(26, 26, 26)
                                        .addComponent(bt_collisionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(checkb_publicos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(pb_distancia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_collisionar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_nomP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_nomP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_cientificos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_nomCientifico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_crearCientifico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkb_publicos)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_crearCientificoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_crearCientificoActionPerformed
        // TODO add your handling code here:
        String nombre = tf_nomCientifico.getText();
        cientificos.add(new Cientifico(nombre));
        JOptionPane.showMessageDialog(null, "Cientifico Creado Exitosamente");
        tf_nomCientifico.setText("");
        actualizarCB();
        guardarCientifico();
        
    }//GEN-LAST:event_bt_crearCientificoActionPerformed

    private void cb_cientificosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_cientificosItemStateChanged
        // TODO add your handling code here:
        actualizarArbolP();
    }//GEN-LAST:event_cb_cientificosItemStateChanged

    private void checkb_publicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkb_publicosActionPerformed
        // TODO add your handling code here:
        if(checkb_publicos.isSelected()){
            actualizarArbolPublicos();
        }
        else{
            actualizarArbolDefault();
        }
    }//GEN-LAST:event_checkb_publicosActionPerformed

    private void jt_planetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_planetasMouseClicked
        // TODO add your handling code here:
        if(evt.isMetaDown()){
            popup_addP.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jt_planetasMouseClicked

    private void mi_planeta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_planeta1ActionPerformed
        // TODO add your handling code here:
        DefaultMutableTreeNode p1Hoja = (DefaultMutableTreeNode)jt_planetas.getLastSelectedPathComponent();
        p1 = (Planeta)p1Hoja.getUserObject();
        tf_nomP1.setText(p1.getNombre());
    }//GEN-LAST:event_mi_planeta1ActionPerformed

    private void mi_planeta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_planeta2ActionPerformed
        // TODO add your handling code here:
        DefaultMutableTreeNode p2Hoja = (DefaultMutableTreeNode)jt_planetas.getLastSelectedPathComponent();
        p2 = (Planeta)p2Hoja.getUserObject();
        tf_nomP2.setText(p2.getNombre());
    }//GEN-LAST:event_mi_planeta2ActionPerformed

    private void bt_collisionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_collisionarActionPerformed
        // TODO add your handling code here:
        double x = Math.pow((p2.getX()-p1.getX()), 2);
        double y = Math.pow((p2.getY()-p1.getY()), 2);
        double distancia = Math.sqrt(x+y);
        System.out.println(distancia);
        pb_distancia.setMaximum((int)distancia);
        hilo = new Thread(this);
        pb_distancia.setMaximum((int)distancia);
        
        hilo.start();
    }//GEN-LAST:event_bt_collisionarActionPerformed
    public void actualizarCB(){
        DefaultComboBoxModel dc = (DefaultComboBoxModel) cb_cientificos.getModel();
        dc.removeAllElements();
        for (Cientifico cientifico : cientificos) {
            dc.addElement(cientifico);
            cb_cientificos.setModel(dc);
        }
    }
    public void actualizarArbolP(){
        Cientifico c = (Cientifico)cb_cientificos.getSelectedItem();
        DefaultTreeModel modelo = (DefaultTreeModel)jt_planetas.getModel();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Planetas");
        for (Planeta pDescubierto : c.getpDescubiertos()) {
            DefaultMutableTreeNode hojap = new DefaultMutableTreeNode(pDescubierto);
            root.add(hojap);
        }
        modelo.setRoot(root);
       
    }
    public void actualizarArbolDefault(){
        DefaultTreeModel modelo = (DefaultTreeModel)jt_planetas.getModel();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Planetas");
        modelo.setRoot(root);
    }
    public void actualizarArbolPublicos(){
        DefaultTreeModel modelo = (DefaultTreeModel)jt_planetas.getModel();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Planetas");
        for (Planeta p : publicos){
            DefaultMutableTreeNode hojaPlaneta = new DefaultMutableTreeNode(p);
            root.add(hojaPlaneta);
        }
        modelo.setRoot(root);
    }
    private void guardarCientifico(){
        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("./Cientificos"));
            for (Cientifico c : cientificos)
                os.writeObject(c);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    private void cargarCientifico(){
        cientificos = new ArrayList();
        try{
            ObjectInputStream os = new ObjectInputStream(new FileInputStream("./Cientificos"));
            Cientifico c;
            while( (c = (Cientifico)os.readObject()) != null )
                cientificos.add(c);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_collisionar;
    private javax.swing.JButton bt_crearCientifico;
    private javax.swing.JComboBox<String> cb_cientificos;
    private javax.swing.JCheckBox checkb_publicos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jt_planetas;
    private javax.swing.JMenuItem mi_planeta1;
    private javax.swing.JMenuItem mi_planeta2;
    private javax.swing.JProgressBar pb_distancia;
    private javax.swing.JPopupMenu popup_addP;
    private javax.swing.JTextField tf_nomCientifico;
    private javax.swing.JTextField tf_nomP1;
    private javax.swing.JTextField tf_nomP2;
    // End of variables declaration//GEN-END:variables
    ArrayList<Planeta> publicos = new ArrayList();
    ArrayList<Cientifico> cientificos = new ArrayList();
    Planeta p1;
    Planeta p2;
}
