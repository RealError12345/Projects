
import java.awt.Color;
import static java.awt.Color.LIGHT_GRAY;
import static java.awt.Color.MAGENTA;
import static java.awt.Color.RED;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Tic_Tac_Toe extends javax.swing.JFrame {

    private String startGame="X";
    private int xCount=0;
    private int oCount=0;
    private boolean gameOver=false;
    private boolean flag1=false;
    private boolean flag2=false;
    private boolean flag3=false;
    private boolean flag4=false;
    private boolean flag5=false;
    private boolean flag6=false;
    private boolean flag7=false;
    private boolean flag8=false;
    private boolean flag9=false;
    
    public Tic_Tac_Toe() {
        initComponents();
    }
    
    private void gameScore(){
        x.setText(String.valueOf(xCount));
        o.setText(String.valueOf(oCount));
    }
    private void choose_a_player(){
        if(startGame.equalsIgnoreCase("X")){
            startGame="O";
        }
        else{
            startGame="X";
        }
    }
    
    private void WinningGame(){
        String b1=box1.getText();
        String b2=box2.getText();
        String b3=box3.getText();
        
        String b4=box4.getText();
        String b5=box5.getText();
        String b6=box6.getText();
        
        String b7=box7.getText();
        String b8=box8.getText();
        String b9=box9.getText();
        
        
        if(b1=="X" && b2=="X" && b3=="X"){
            JOptionPane.showMessageDialog(this, "Playe X won", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            box1.setBackground(Color.BLUE);
            box2.setBackground(Color.BLUE);
            box3.setBackground(Color.BLUE);
           }
        
        else if(b4=="X" && b5=="X" && b6=="X"){
            JOptionPane.showMessageDialog(this, "Playe X won", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            box4.setBackground(Color.BLUE);
            box5.setBackground(Color.BLUE);
            box6.setBackground(Color.BLUE);
        }
        
       else if(b7=="X" && b8=="X" && b9=="X"){
            JOptionPane.showMessageDialog(this, "Playe X won", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            box7.setBackground(Color.BLUE);
            box8.setBackground(Color.BLUE);
            box9.setBackground(Color.BLUE);
        }
        
       else if(b1=="X" && b4=="X" && b7=="X"){
            JOptionPane.showMessageDialog(this, "Playe X won", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            box1.setBackground(Color.BLUE);
            box4.setBackground(Color.BLUE);
            box7.setBackground(Color.BLUE);
        }
       else if(b2=="X" && b5=="X" && b8=="X"){
            JOptionPane.showMessageDialog(this, "Playe X won", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            box2.setBackground(Color.BLUE);
            box5.setBackground(Color.BLUE);
            box8.setBackground(Color.BLUE);
        }
       else if(b3=="X" && b6=="X" && b9=="X"){
            JOptionPane.showMessageDialog(this, "Playe X won", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            box3.setBackground(Color.BLUE);
            box6.setBackground(Color.BLUE);
            box9.setBackground(Color.BLUE);
        }
       else if(b1=="X" && b5=="X" && b9=="X"){
            JOptionPane.showMessageDialog(this, "Playe X won", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            box1.setBackground(Color.BLUE);
            box5.setBackground(Color.BLUE);
            box9.setBackground(Color.BLUE);
        }
       else if(b3=="X" && b5=="X" && b7=="X"){
            JOptionPane.showMessageDialog(this, "Playe X won", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            box3.setBackground(Color.BLUE);
            box5.setBackground(Color.BLUE);
            box7.setBackground(Color.BLUE);
        }
        
        //For playerO
      else  if(b1=="O" && b2=="O" && b3=="O"){
            JOptionPane.showMessageDialog(this, "Playe O won", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            box1.setBackground(Color.BLUE);
            box2.setBackground(Color.BLUE);
            box3.setBackground(Color.BLUE);
        }
        
       else if(b4=="O" && b5=="O" && b6=="O"){
            JOptionPane.showMessageDialog(this, "Playe O won", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            box4.setBackground(Color.BLUE);
            box5.setBackground(Color.BLUE);
            box6.setBackground(Color.BLUE);
        }
        
      else  if(b7=="O" && b8=="O" && b9=="O"){
            JOptionPane.showMessageDialog(this, "Playe O won", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            box7.setBackground(Color.BLUE);
            box8.setBackground(Color.BLUE);
            box9.setBackground(Color.BLUE);
        }
        
       else if(b1=="O" && b4=="O" && b7=="O"){
            JOptionPane.showMessageDialog(this, "Playe O won", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            box1.setBackground(Color.BLUE);
            box4.setBackground(Color.BLUE);
            box7.setBackground(Color.BLUE);
        }
       else if(b2=="O" && b5=="O" && b8=="O"){
            JOptionPane.showMessageDialog(this, "Playe o won", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            box2.setBackground(Color.BLUE);
            box5.setBackground(Color.BLUE);
            box8.setBackground(Color.BLUE);
        }
       else if(b3=="O" && b6=="O" && b9=="O"){
            JOptionPane.showMessageDialog(this, "Playe O won", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            box3.setBackground(Color.BLUE);
            box6.setBackground(Color.BLUE);
            box9.setBackground(Color.BLUE);
        }
       else if(b1=="O" && b5=="O" && b9=="O"){
            JOptionPane.showMessageDialog(this, "Playe O won", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            box1.setBackground(Color.BLUE);
            box5.setBackground(Color.BLUE);
            box9.setBackground(Color.BLUE);
        }
       else if(b3=="O" && b5=="O" && b7=="O"){
            JOptionPane.showMessageDialog(this, "Playe O won", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            box3.setBackground(Color.BLUE);
            box5.setBackground(Color.BLUE);
            box7.setBackground(Color.BLUE);
        }
        
        
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        box2 = new javax.swing.JButton();
        box3 = new javax.swing.JButton();
        box1 = new javax.swing.JButton();
        box5 = new javax.swing.JButton();
        box6 = new javax.swing.JButton();
        box4 = new javax.swing.JButton();
        box8 = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        box7 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        box9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        playerX = new javax.swing.JLabel();
        playerO = new javax.swing.JLabel();
        o = new javax.swing.JLabel();
        x = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        box2.setBackground(new java.awt.Color(204, 204, 255));
        box2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box2ActionPerformed(evt);
            }
        });

        box3.setBackground(new java.awt.Color(204, 204, 255));
        box3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        box3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box3ActionPerformed(evt);
            }
        });

        box1.setBackground(new java.awt.Color(204, 204, 255));
        box1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });

        box5.setBackground(new java.awt.Color(204, 204, 255));
        box5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        box5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box5ActionPerformed(evt);
            }
        });

        box6.setBackground(new java.awt.Color(204, 204, 255));
        box6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        box6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box6ActionPerformed(evt);
            }
        });

        box4.setBackground(new java.awt.Color(204, 204, 255));
        box4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        box4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box4ActionPerformed(evt);
            }
        });

        box8.setBackground(new java.awt.Color(204, 204, 255));
        box8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        box8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box8ActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 0, 0));
        exit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        box7.setBackground(new java.awt.Color(204, 204, 255));
        box7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        box7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box7ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(102, 153, 255));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton12.setText("RESET");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        box9.setBackground(new java.awt.Color(204, 204, 255));
        box9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        box9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box9ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.darkGray));

        playerX.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playerX.setText("Player X:");

        playerO.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playerO.setText("Player O:");

        o.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        o.setForeground(new java.awt.Color(51, 51, 255));
        o.setText("xxxxxxxx");

        x.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        x.setForeground(new java.awt.Color(51, 51, 255));
        x.setText("xxxxxxxx");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(playerO)
                        .addGap(18, 18, 18)
                        .addComponent(o, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(playerX)
                        .addGap(18, 18, 18)
                        .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerX)
                    .addComponent(x))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerO)
                    .addComponent(o))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(box7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(box8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(box9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(box4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(box5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(box6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(box3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(box3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(box6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(box8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)))
                .addGap(0, 34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void box2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box2ActionPerformed
        if(!flag2 && !gameOver){
        box2.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            box2.setForeground(Color.RED);
        }
        else{
            box2.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        WinningGame();
        flag2=true;
        }
    }//GEN-LAST:event_box2ActionPerformed

    private void box3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box3ActionPerformed
        if(!flag3 && !gameOver){
        box3.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            box3.setForeground(Color.RED);
        }
        else{
            box3.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        WinningGame();
        flag3=true;
        }
    }//GEN-LAST:event_box3ActionPerformed

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box1ActionPerformed

        
        if(!flag1 && !gameOver){
            box1.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            box1.setForeground(Color.RED);
        }
        else{
            box1.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        WinningGame();
        flag1=true;
        }
    }//GEN-LAST:event_box1ActionPerformed

    private void box5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box5ActionPerformed
        if(!flag5 && !gameOver){
        box5.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            box5.setForeground(Color.RED);
        }
        else{
            box5.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        WinningGame();
        flag5=true;
        }
    }//GEN-LAST:event_box5ActionPerformed

    private void box6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box6ActionPerformed
        if(!flag6 && !gameOver){
        box6.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            box6.setForeground(Color.RED);
        }
        else{
            box6.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        WinningGame();
        flag6=true;
        }
    }//GEN-LAST:event_box6ActionPerformed

    private void box4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box4ActionPerformed
        if(!flag4 && !gameOver){
        box4.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            box4.setForeground(Color.RED);
        }
        else{
            box4.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        WinningGame();
        flag4=true;
        }
    }//GEN-LAST:event_box4ActionPerformed

    private void box8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box8ActionPerformed
        if(!flag8 && !gameOver){
        box8.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            box8.setForeground(Color.RED);
        }
        else{
            box8.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        WinningGame();
        flag8=true;
        }
    }//GEN-LAST:event_box8ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
           JFrame frame=new JFrame("Exit");
           if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit", 
                   "Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
               System.exit(0);
           }
           
    }//GEN-LAST:event_exitActionPerformed

    private void box7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box7ActionPerformed
        if(!flag7 && !gameOver){
        box7.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            box7.setForeground(Color.RED);
        }
        else{
            box7.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        WinningGame();
        flag7=true;
        }
    }//GEN-LAST:event_box7ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        box1.setText(null);
        box2.setText(null);
        box3.setText(null);
        
        box4.setText(null);
        box5.setText(null);
        box6.setText(null);
        
        box7.setText(null);
        box8.setText(null);
        box9.setText(null);
        
        box1.setBackground(LIGHT_GRAY);
        box2.setBackground(LIGHT_GRAY);
        box3.setBackground(LIGHT_GRAY);
        
        box4.setBackground(LIGHT_GRAY);
        box5.setBackground(LIGHT_GRAY);
        box6.setBackground(LIGHT_GRAY);
        
        box7.setBackground(LIGHT_GRAY);
        box8.setBackground(LIGHT_GRAY);
        box9.setBackground(LIGHT_GRAY);
        
        flag1 = flag2 = flag3 = flag4 = flag5 = flag6 = flag7 = flag8 = flag9 = false;
    
    gameOver = false;
    startGame = "X";
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void box9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box9ActionPerformed
        if(!flag9 && !gameOver){
        box9.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            box9.setForeground(Color.RED);
        }
        else{
            box9.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        WinningGame();
        flag9=true;
        }
    }//GEN-LAST:event_box9ActionPerformed

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
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tic_Tac_Toe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton box1;
    private javax.swing.JButton box2;
    private javax.swing.JButton box3;
    private javax.swing.JButton box4;
    private javax.swing.JButton box5;
    private javax.swing.JButton box6;
    private javax.swing.JButton box7;
    private javax.swing.JButton box8;
    private javax.swing.JButton box9;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel o;
    private javax.swing.JLabel playerO;
    private javax.swing.JLabel playerX;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
