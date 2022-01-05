/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package User;

import static java.lang.Integer.max;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import static machcinelearning.ClusterJobs.getClusters;

/**
 *
 * @author ryota
 */
public class JobsClassification extends javax.swing.JFrame {

    /**
     * Creates new form JobsClassification
     */
    public JobsClassification() throws Exception {
        initComponents();
        fetch();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cluNum = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(140, 43, 224));
        jLabel1.setText("JOBS CLUSTTERING");

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class1", "Class2", "Class3", "Class4"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(140, 43, 224));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(140, 43, 224));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(140, 43, 224));
        jLabel2.setText("Chnage Cluster Number : ");

        cluNum.setForeground(new java.awt.Color(0, 0, 0));

        jButton2.setBackground(new java.awt.Color(140, 43, 224));
        jButton2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("START");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(cluNum, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jButton2))
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cluNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //BACK to PreTraining
        
                    PreTraining cp = null;                    
                    cp = new PreTraining();
                    cp.setVisible(true);
                    this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int n = Integer.parseInt(cluNum.getText());
        try {
            changeCluster(n);
        } catch (Exception ex) {
            Logger.getLogger(JobsClassification.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void changeCluster(int n) throws Exception{
         HashMap<Integer,ArrayList<EmploiJob>> jobsType = getClusters(n);
          ArrayList<EmploiJob>[] al = new ArrayList[n];
          DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
          model.setRowCount(0);
         //create list of arrayList
         for (int i = 0; i < n; i++) {
            al[i] = new ArrayList<EmploiJob>();
        }
         
         //create my own arrayLists to search in
         int i = 0;
         for (Map.Entry<Integer, ArrayList<EmploiJob>> entry : jobsType.entrySet()) {
    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
         
                        al[i] = entry.getValue();
                        i++;
                }
         //find maximum
         int maximum = al[0].size();
         for (int j = 1; j < n; j++) {
            if(al[j].size()> maximum){
                maximum = al[j].size();
            }
        }
         
         //change data in columns
         for (int k = 0; k < maximum; k++) {
                  Object[] row = new Object[n];
                  for (int j = 0; j < n; j++) {
                    row[j] = k <= al[j].size() -1 ? al[j].get(k).title : "";
                    
             }
                  
                  
                  model.addRow(row);
        }
         
         
         
    }
    
    private void fetch() throws Exception{
        HashMap<Integer,ArrayList<EmploiJob>> jobsType = getClusters(4);
        
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            ArrayList<EmploiJob> jobs1 = new ArrayList<EmploiJob>();
            ArrayList<EmploiJob> jobs2 = new ArrayList<EmploiJob>();
            ArrayList<EmploiJob> jobs3 = new ArrayList<EmploiJob>();
            ArrayList<EmploiJob> jobs4 = new ArrayList<EmploiJob>();
            
                for (Map.Entry<Integer, ArrayList<EmploiJob>> entry : jobsType.entrySet()) {
    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
                    
                    if(entry.getKey() == 0){
                        jobs1 = entry.getValue();
                    }else if(entry.getKey() == 1){
                        jobs2 = entry.getValue();
                    }else if(entry.getKey() == 2){
                        jobs3 = entry.getValue();
                    }else{
                        jobs4 = entry.getValue();
                    }
                }
                    //Object[] row = new Object[4];
//                    row[0] = ++id;
//                    row[1] = job.getTitle();
//                    row[2] = job.getTypeContart();
//                    row[3] = job.getVille();

                    //model.addRow(row);
               int maximum1 = max(jobs1.size(), jobs2.size());
               int maximum2 = max(jobs3.size(),jobs4.size());
               int maximum = max(maximum1,maximum2);
              for (int i = 0; i < maximum; i++) {
                  Object[] row = new Object[4];
                  row[0] = i <= jobs1.size() -1 ? jobs1.get(i).title : "";
                  row[1] = i <= jobs2.size() -1 ? jobs2.get(i).title : "";
                  row[2] = i <= jobs3.size() -1 ? jobs3.get(i).title : "";
                  row[3] = i <= jobs4.size() -1 ?  jobs4.get(i).title : "";
                  
                  model.addRow(row);
        }
      

       }
                    
                    
                

       
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
            java.util.logging.Logger.getLogger(JobsClassification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JobsClassification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JobsClassification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JobsClassification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JobsClassification().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(JobsClassification.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cluNum;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
