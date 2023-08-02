/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ahorcado;

public class Ahorcado extends javax.swing.JFrame {

    
    public Ahorcado() {
        initComponents();
    }
    int length, tries=5, good=0;
    String  sol;
    char word;
    boolean aux=false, win=false;
    int[]check = new int[15];
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        intento = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        init = new javax.swing.JButton();
        text = new javax.swing.JTextField();
        disp = new javax.swing.JLabel();
        alert = new javax.swing.JLabel();
        msg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(intento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        init.setText("Start");
        init.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initActionPerformed(evt);
            }
        });
        jPanel1.add(init, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        text.setEnabled(false);
        text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textActionPerformed(evt);
            }
        });
        jPanel1.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 30, -1));

        disp.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        disp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, 40));

        alert.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        alert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(alert, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 220, 50));

        msg.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 300, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textActionPerformed
        if(text.getText().isEmpty()){
        }else{
            word = text.getText().charAt(0);
            check();
        }
        text.setText("");
    }//GEN-LAST:event_textActionPerformed

    private void initActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initActionPerformed
        genword();
    }//GEN-LAST:event_initActionPerformed

    public void genword(){
        sol="camino";
        length=sol.length();
        start();
        
    }
    public void check(){
        for(int i =0; i<length; i++){
            if(word==sol.charAt(i)){
                   aux=true;
                   check[i]=1;
                   print();
            }else{
                
            }
        }
        if (aux==false){
            tries--;
            intento.setText("Vidas: " + String.valueOf(tries));
            msg.setText(msg.getText() + word + " ");
        }else{
            aux=false;
        }
        
       wincheck();
    }
    
    public void print(){
        disp.setText("");
        for (int i=0; i<length; i++){
            if (check[i]==0){
                disp.setText(disp.getText()+ "_ ");
            }else{
                disp.setText(disp.getText()+ sol.charAt(i) + " ");
            }
        }
    }
    
    public void wincheck(){
        win = true;
        for (int i=0; i<length; i++){
            if(check[i]==0){
                win=false;
            }
        }
        if (win==true){
            alert.setText("Felicidades!");
            msg.setText("Has ganado en " + (5-tries) + " intentos");
            text.setEnabled(false);
        }
        if (tries==0){
            alert.setText("Lástima :(");
            msg.setText("La palabra era " + sol);
            text.setEnabled(false);
        }
    }
    
    public void start(){
        disp.setText("");
        text.setEnabled(true);
        msg.setText("");
        alert.setText("");
        init.setText("Restart");
        for (int i=0; i<length; i++){
            check[i]=0;
        }
        print();
        tries=5;
        intento.setText("Vidas: " + String.valueOf(tries));
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
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ahorcado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alert;
    private javax.swing.JLabel disp;
    private javax.swing.JButton init;
    private javax.swing.JLabel intento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel msg;
    private javax.swing.JTextField text;
    // End of variables declaration//GEN-END:variables
}
