/*
 * Nick Dernovsek
 * marksummative.java
 * This program helps organize marks 
 */

package MarkSummative;
import java.util.*;
import java.text.DecimalFormat;
/**
 *
 * @author nider6687
 */
public class MarkSummative extends javax.swing.JFrame {
    public int [] level = {0,0,0,0,0};                  //array for grades
    ArrayList <Integer> marks = new ArrayList();        //arraylist for marks
    /**
     * Creates new form MarkSummative
     */
    public MarkSummative() {
        initComponents();
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
        nameLabel = new javax.swing.JLabel();
        sortButton = new javax.swing.JButton();
        analyzeButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        analyzeArea = new javax.swing.JTextArea();
        studentMarkLabel = new javax.swing.JLabel();
        markField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sortArea = new javax.swing.JTextArea();
        invalidLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameLabel.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(51, 51, 255));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Organizing Student Marks");

        sortButton.setText("Sort");
        sortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtonActionPerformed(evt);
            }
        });

        analyzeButton.setText("Analyze");
        analyzeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyzeButtonActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBar(null);

        analyzeArea.setColumns(20);
        analyzeArea.setRows(5);
        jScrollPane2.setViewportView(analyzeArea);

        studentMarkLabel.setFont(new java.awt.Font("Swis721 Blk BT", 0, 14)); // NOI18N
        studentMarkLabel.setText("Student Mark:");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBar(null);

        sortArea.setColumns(20);
        sortArea.setRows(5);
        jScrollPane1.setViewportView(sortArea);

        invalidLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        invalidLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(studentMarkLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(markField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(invalidLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(sortButton)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(analyzeButton)
                        .addGap(83, 83, 83))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(studentMarkLabel)
                        .addComponent(markField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addButton))
                    .addComponent(invalidLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sortButton)
                    .addComponent(analyzeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 6, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 7, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if (Integer.parseInt(markField.getText()) <= 100 && Integer.parseInt(markField.getText()) >= 0) {
            Collections.addAll(marks, Integer.parseInt(markField.getText()));
            System.out.println(marks);                                              
            markField.setText(null);        //adding the marks to the array if it's <0 and > 100
            for (int x = 0; x < marks.size(); x++) {
                invalidLabel.setText("Marks Added: " + marks.size());
                sortArea.setText(null);                              //double for loop so the textarea doesn't repeat marks
                for (int i = 0; i < marks.size(); i++) {
                    marks.toString();
                    sortArea.setText(sortArea.getText()+ marks.get(i) + "\n"); //showing each mark on a line
                }
            }
        }
        else {
            invalidLabel.setText("Invalid Mark" + " (" + markField.getText() + ")");
            markField.setText(null);    //show invalid mark if the mark is > 100 < 0
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtonActionPerformed
        Collections.sort(marks);
        for (int x = 0; x < marks.size(); x++) {
            invalidLabel.setText("Marks Added: " + marks.size());
            sortArea.setText(null);
            for (int i = 0; i < marks.size(); i++) {    //using a double for loop again except sorting it
                marks.toString();
                sortArea.setText(sortArea.getText()+ marks.get(i) + "\n");  
            }
        }
    }//GEN-LAST:event_sortButtonActionPerformed
    public double average() {
        double sum = 0;
        double denominator = marks.size(); //setting the denominator to the size of the array to find average
        double product;
        
        for(int i = 0; i < marks.size(); i++) {     
            sum += marks.get(i);            //adding all the marks together using a for loop        
        }
        product = sum/denominator;
        return (product);
    }
    public double maximum() {
        Collections.sort(marks);    //sorting it to make sure the last element is the highest
        double maximum = 0;
        for(int i = 0; i < marks.size(); i++) {
            maximum = marks.get(i);              //finding the last index in the arraylist
        } 
        return maximum;
    } 
    public double minimum() {
        Collections.sort(marks);        //sorting it again to make sure the last element is the highest
        double mimimum = marks.get(0);
        return mimimum;                 //finding the first index and setting it as the minimum
    }
    public void level() {
        for (int x = 0; x < marks.size(); x++) {
            level[0] = 0;
            level[1] = 0;
            level[2] = 0;
            level[3] = 0;
            level[4] = 0;
            for (int i = 0; i < marks.size(); i++) {
                if (marks.get(i)>=80) {              //using a double for loop so the marks dont multiply
                    level[4]++;
                }
                else if (marks.get(i)>=70) {
                    level[3]++;
                }
                else if (marks.get(i)>=60) {
                    level[2]++;
                }                               //finding which section the element is in using the if/else  
                else if (marks.get(i)>=50) {    //statements then adding +1 to which level it's in
                    level[1]++;
                }
                else {
                    level[0]++;
                }
            }
        }
    }
   
    private void analyzeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzeButtonActionPerformed
        level();
        System.out.println(level[0]);
        DecimalFormat x = new DecimalFormat("###.##");  //decimal formats so the average is only 2 decimals
        DecimalFormat i = new DecimalFormat("###");
        analyzeArea.setText(
              "Class Average: " + x.format(average()) 
            + "%\nHighest Mark: " + i.format(maximum()) 
            + "\nLowest Mark: " + i.format(minimum()) 
            + "\nRange of Marks: " + i.format((maximum()-minimum())) 
            + "\n# of Marks at level R:     " + level[0]            
            + "\n# of Marks at level 1:     " + level[1]         //setting the text area all the methods
            + "\n# of Marks at level 2:     " + level[2]         //split it up because it was too long
            + "\n# of Marks at level 3:     " + level[3]
            + "\n# of Marks at level 4:     " + level[4]
        );
    }//GEN-LAST:event_analyzeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MarkSummative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarkSummative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarkSummative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarkSummative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarkSummative().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextArea analyzeArea;
    private javax.swing.JButton analyzeButton;
    private javax.swing.JLabel invalidLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField markField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextArea sortArea;
    private javax.swing.JButton sortButton;
    private javax.swing.JLabel studentMarkLabel;
    // End of variables declaration//GEN-END:variables
}
