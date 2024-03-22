/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproj;

import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author zjbar
 */
public class game extends javax.swing.JFrame {
    
    //Variable
    public static int HP[] = {100, 0}; // {Hero HP, Eenemy_HP }
    public static int MinAtk[] = {7, 1, 4, 3, 1, 1, 5, 3, 1, 1, 5, 4, 10, 13, 15, 10, 7, 15, 15, 7};
    public static int MaxAtk[] = {12, 6, 7, 6, 6, 6, 8, 6, 8, 6, 7, 6, 20, 15, 20, 15, 10, 22, 25, 12};
    public static String[] Name = {"Hero", "Goblin"}; // {Hero_Name, Enemy_Name}
    public static int Enum = 0;
    public static int Dice[] = {0, 100};
    public static int Roll = 0; // rolled dice holder
    public static int Action = 0; // 0 = atk, 1 = block, 2 = flee
    public static int Defeated = 0; // counter for the defeated mobs
    public static String EHolder;
    public static String HHolder;
    public static int MaxHP[] = {100, 0};
    
   
    public void EnemyRoll(){
        Roll = (int) Math.floor(Math.random() * (Dice[0] - Dice[1] + 1) + Dice[1]);
        Log.setText(null);
        if (Defeated >= 10 && ((Defeated % 10) == 0)) { // boss checker
            if (Defeated >= 30 && ((Defeated % 30) == 0)) {
                Name[1] = "Doppelganger";
                Log.append("You encountered "+Name[1]);
                EnemyName.setText(Name[1]);
                HP[1] = 100;
                MaxHP[1] = 100;
                Enum = 19;
                EHolder = MaxHP[1] + "/" + MaxHP[1];
                EnemyHealth.setText(EHolder);
                
            } else {
                if (Roll <= 15) {
                    Name[1] = "Spooder Brod.";
                    Log.append("You encountered "+Name[1]);
                    EnemyName.setText(Name[1]);
                    HP[1] = 45;
                    MaxHP[1] = 45;
                    Enum = 12;
                    EHolder = MaxHP[1] + "/" + MaxHP[1];
                    EnemyHealth.setText(EHolder);
                } else if (Roll > 15 && Roll <= 29) {
                    Name[1] = "Vampire Lord";
                    Log.append("You encountered "+Name[1]);
                    EnemyName.setText(Name[1]);
                    HP[1] = 60;
                    MaxHP[1] = 60;
                    Enum = 13;
                    EHolder = MaxHP[1] + "/" + MaxHP[1];
                    EnemyHealth.setText(EHolder);
                } else if (Roll > 29 && Roll <= 44) {
                    Name[1] = "T. Rex";
                    Log.append("You encountered "+Name[1]);
                    EnemyName.setText(Name[1]);
                    HP[1] = 45;
                    MaxHP[1] = 45;
                    Enum = 14;
                    EHolder = MaxHP[1] + "/" + MaxHP[1];
                    EnemyHealth.setText(EHolder);
                } else if (Roll > 44 && Roll <= 59) {
                    Name[1] = "Gorgon";
                    Log.append("You encountered "+Name[1]);
                    EnemyName.setText(Name[1]);
                    HP[1] = 60;
                    MaxHP[1] = 60;
                    Enum = 15;
                    EHolder = MaxHP[1] + "/" + MaxHP[1];
                    EnemyHealth.setText(EHolder);
                } else if (Roll > 59 && Roll <= 74) {
                    Name[1] = "Hydra";
                    Log.append("You encountered "+Name[1]);
                    EnemyName.setText(Name[1]);
                    HP[1] = 70;
                    MaxHP[1] = 70;
                    Enum = 16;
                    EHolder = MaxHP[1] + "/" + MaxHP[1];
                    EnemyHealth.setText(EHolder);
                } else if (Roll > 74 && Roll <= 89) {
                    Name[1] = "Greater Demon";
                    Log.append("You encountered "+Name[1]);
                    EnemyName.setText(Name[1]);
                    HP[1] = 50;
                    MaxHP[1] = 50;
                    Enum = 17;
                    EHolder = MaxHP[1] + "/" + MaxHP[1];
                    EnemyHealth.setText(EHolder);
                } else {
                    Name[1] = "Kraken";
                    Log.append("You encountered "+Name[1]);
                    EnemyName.setText(Name[1]);
                    HP[1] = 40;
                    MaxHP[1] = 40;
                    Enum = 18;
                    EHolder = MaxHP[1] + "/" + MaxHP[1];
                    EnemyHealth.setText(EHolder);
                }
            }
        } else { // normal mob
            if (Roll <= 9) {
                Name[1] = "Slime";
                Log.append("You encountered "+Name[1]);
                EnemyName.setText(Name[1]);
                HP[1] = 10;
                MaxHP[1] = 10;
                Enum = 1;
                EHolder = MaxHP[1] + "/" + MaxHP[1];
                EnemyHealth.setText(EHolder);
            } else if (Roll > 9 && Roll <= 19) {
                Name[1] = "Golem";
                Log.append("You encountered "+Name[1]);
                EnemyName.setText(Name[1]);
                HP[1] = 20;
                MaxHP[1] = 20;
                Enum = 2;
                EHolder = MaxHP[1] + "/" + MaxHP[1];
                EnemyHealth.setText(EHolder);
            } else if (Roll > 19 && Roll <= 29) {
                Name[1] = "Vulture";
                Log.append("You encountered "+Name[1]);
                EnemyName.setText(Name[1]);
                HP[1] = 12;
                MaxHP[1] = 12;
                Enum = 3;
                EHolder = MaxHP[1] + "/" + MaxHP[1];
                EnemyHealth.setText(EHolder);
            } else if (Roll > 29 && Roll <= 34) {
                Name[1] = "Kobold";
                Log.append("You encountered "+Name[1]);
                EnemyName.setText(Name[1]);
                HP[1] = 10;
                MaxHP[1] = 10;
                Enum = 4;
                EHolder = MaxHP[1] + "/" + MaxHP[1];
                EnemyHealth.setText(EHolder);
            } else if (Roll > 34 && Roll <= 39) {
                Name[1] = "Goblin";
                Log.append("You encountered "+Name[1]);
                EnemyName.setText(Name[1]);
                HP[1] = 10;
                MaxHP[1] = 10;
                Enum = 5;
                EHolder = MaxHP[1] + "/" + MaxHP[1];
                EnemyHealth.setText(EHolder);
            } else if (Roll > 39 && Roll <= 49) {
                Name[1] = "Troll";
                Log.append("You encountered "+Name[1]);
                EnemyName.setText(Name[1]);
                HP[1] = 20;
                MaxHP[1] = 20;
                Enum = 6;
                EHolder = MaxHP[1] + "/" + MaxHP[1];
                EnemyHealth.setText(EHolder);
            } else if (Roll > 49 && Roll <= 59) {
                Name[1] = "Vampire";
                Log.append("You encountered "+Name[1]);
                EnemyName.setText(Name[1]);
                HP[1] = 20;
                MaxHP[1] = 20;
                Enum = 7;
                EHolder = MaxHP[1] + "/" + MaxHP[1];
                EnemyHealth.setText(EHolder);
            } else if (Roll > 59 && Roll <= 69) {
                Name[1] = "Skeleton";
                Log.append("You encountered "+Name[1]);
                EnemyName.setText(Name[1]);
                HP[1] = 15;
                MaxHP[1] = 15;
                Enum = 8;
                EHolder = MaxHP[1] + "/" + MaxHP[1];
                EnemyHealth.setText(EHolder);
            } else if (Roll > 69 && Roll <= 79) {
                Name[1] = "Spooder";
                Log.append("You encountered "+Name[1]);
                EnemyName.setText(Name[1]);
                HP[1] = 10;
                MaxHP[1] = 10;
                Enum = 9;
                EHolder = MaxHP[1] + "/" + MaxHP[1];
                EnemyHealth.setText(EHolder);
            } else if (Roll > 79 && Roll <= 89) {
                Name[1] = "Lesser Demon";
                Log.append("You encountered "+Name[1]);
                EnemyName.setText(Name[1]);
                HP[1] = 30;
                MaxHP[1] = 30;
                Enum = 10;
                EHolder = MaxHP[1] + "/" + MaxHP[1];
                EnemyHealth.setText(EHolder);
            } else {
                Name[1] = "Siren";
                Log.append("You encountered "+Name[1]);
                EnemyName.setText(Name[1]);
                HP[1] = 20;
                MaxHP[1] = 20;
                Enum = 11;
                EHolder = MaxHP[1] + "/" + MaxHP[1];
                EnemyHealth.setText(EHolder);
            }
        }
    }
    public void PlayerSetName(){
        String PHolder = JOptionPane.showInputDialog("What is your name?");
        if(PHolder.isEmpty()){
            PlayerName.setText(Name[0]);
        }
        else{
            Name[0] = PHolder;
            HHolder = Name[0];
            PlayerName.setText(PHolder);
        }
    }
    public void dead(){
        Log.append(null);
        Log.append("Aw he dead\n");
        Log.append("You defeated "+String.valueOf(Defeated)+" monsters");
        HP[0] = 100;
        HP[1] = 0;
        Name[0] = "Smaragos";
        Enum = 0;
        Roll = 0;
        Action = 0;
        Defeated = 0;
        menu menu = new menu();
        int confirm = JOptionPane.showConfirmDialog(null, "You are dead. Continue?", "Continue or Exit", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            Health.setText(MaxHP[0] + "/" + MaxHP[0]);
            EnemyRoll();
        }
        else{
            menu.show();
            dispose();
        }
    }
    public void LoadGame(){
        try{
            File myObj = new File("..\\..\\save.txt");
            if(myObj.exists()){
                Scanner myReader = new Scanner(myObj);
                HP[0]=Integer.valueOf(myReader.nextLine());
                HP[1]=Integer.valueOf(myReader.nextLine());
                MaxHP[1]=Integer.valueOf(myReader.nextLine());
                Name[0]=myReader.nextLine();
                Name[1]=myReader.nextLine();
                int Enum1=Integer.valueOf(myReader.nextLine());
                int Defeated1=Integer.valueOf(myReader.nextLine());
                
                Health.setText(HP[0] + "/" + MaxHP[0]);
                EnemyHealth.setText(HP[1] + "/" + MaxHP[1]);
                PlayerName.setText(Name[0]);
                EnemyName.setText(Name[1]);
                Defeated = Defeated1;
                Enum = Enum1;
            }
            else{
                JOptionPane.showMessageDialog(null,"There is no save.");
            }
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"An error occurred.");
        }
    }
    public game() {
        initComponents();
        //Start
        File object = new File("..\\..\\save.txt");
        if(object.exists()){
            LoadGame();
        }
        else{
            EnemyRoll();
            PlayerSetName();
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        Actions = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        Log = new javax.swing.JTextArea();
        PlayerName = new javax.swing.JLabel();
        EnemyName = new javax.swing.JLabel();
        Health = new javax.swing.JLabel();
        EnemyHealth = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Attack = new javax.swing.JRadioButton();
        Block = new javax.swing.JRadioButton();
        Flee = new javax.swing.JRadioButton();
        DiceRoll = new javax.swing.JButton();
        SaveExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Endless Text Dungeon");
        setName("Game"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Log.setEditable(false);
        Log.setColumns(20);
        Log.setRows(5);
        Log.setName("Log"); // NOI18N
        jScrollPane3.setViewportView(Log);
        Log.getAccessibleContext().setAccessibleName("Log");

        PlayerName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PlayerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlayerName.setText("Hero");

        EnemyName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EnemyName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnemyName.setText("Spooder Brod.");

        Health.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Health.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Health.setText("100/100");

        EnemyHealth.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EnemyHealth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnemyHealth.setText("15/15");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        Actions.add(Attack);
        Attack.setSelected(true);
        Attack.setText("Attack");
        Attack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttackActionPerformed(evt);
            }
        });

        Actions.add(Block);
        Block.setText("Block");
        Block.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlockActionPerformed(evt);
            }
        });

        Actions.add(Flee);
        Flee.setText("Flee");
        Flee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FleeActionPerformed(evt);
            }
        });

        DiceRoll.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DiceRoll.setText("Roll");
        DiceRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiceRollActionPerformed(evt);
            }
        });

        SaveExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SaveExit.setText("Save and Exit");
        SaveExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveExitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("vs");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Health, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EnemyHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EnemyName, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                                .addGap(5, 5, 5)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Block)
                            .addComponent(Attack)
                            .addComponent(Flee))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DiceRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SaveExit)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PlayerName)
                            .addComponent(EnemyName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Health)
                            .addComponent(EnemyHealth)))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Attack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Block)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Flee))
                    .addComponent(DiceRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SaveExit, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlockActionPerformed
        Action = 1;
    }//GEN-LAST:event_BlockActionPerformed

    private void SaveExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveExitActionPerformed
        int confirmed = JOptionPane.showConfirmDialog(null, 
        "Are you sure you want to exit the program?", "Exit Program Message Box",
        JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            try{
                File myObj = new File("..\\..\\save.txt");
                FileWriter myWriter = new FileWriter("../../save.txt");
                myWriter.write(HP[0] + "\n" + HP[1] + "\n" + MaxHP[1] + "\n" + Name[0] + "\n" + Name[1] + "\n" + Enum + "\n" + Defeated);
                myWriter.close();
                JOptionPane.showMessageDialog(null,"Game Saved."); 
                System.exit(0);
            }
            catch(IOException e){
                JOptionPane.showMessageDialog(null,"An error occurred.");
            }
        }
    }//GEN-LAST:event_SaveExitActionPerformed

    private void AttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttackActionPerformed
        Action = 0;
    }//GEN-LAST:event_AttackActionPerformed

    private void DiceRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiceRollActionPerformed
        Roll = (int) Math.floor(Math.random() * (Dice[0] - Dice[1] + 1) + Dice[1]);
        Log.setText(null);
        int Hatk;
        int Eatk;
        int Block;
        int Flee;
        int heal;
        if (HP[1] <= 0 || HP[0] <= 0) {
                if(HP[0]<=0){
                    dead();
                }
                else if(Enum == 0){
                    EnemyRoll();
                }
                else {
                    Defeated++;
                    if(Enum <= 11){
                        heal = (int) Math.floor(Math.random() * (15 - 10 + 1) + 10);
                        HP[0] += heal;
                        HHolder = String.valueOf(HP[0]);
                        Health.setText(HHolder + "/" + MaxHP[0]);
                    } 
                    else {
                        heal = (int) Math.floor(Math.random() * (50 - 25 + 1) + 25);
                        HP[0] += heal;
                        HHolder = String.valueOf(HP[0]);
                        Health.setText(HHolder + "/" + MaxHP[0]);
                    }
                    EnemyRoll();
                }
            } else {
                switch (Action) {
                    case 0: // attack
                        Hatk = (int) Math.floor(Math.random() * (MaxAtk[0] - MinAtk[0] + 1) + MinAtk[0]);
                        Eatk = (int) Math.floor(Math.random() * (MaxAtk[Enum] - MinAtk[Enum] + 1) + MinAtk[Enum]);
                           
                        Log.append("You've attcked for "+ Hatk +" Damage...\n");
                        Log.append(Name[1]+" Attacked for "+ Eatk +" Damage...\n");
                        Log.append("You've taken "+ Eatk +" Damage...\n");
                        HP[1] -= Hatk;
                        HP[0] -= Eatk;
                        EHolder = String.valueOf(HP[1]);
                        HHolder = String.valueOf(HP[0]);
                        EnemyHealth.setText(EHolder + "/" + MaxHP[1]);
                        Health.setText(HHolder + "/" + MaxHP[0]);
                        break;
                        
                    case 1: // block
                        Block = (int) Math.floor(Math.random() * ((MaxAtk[Enum] - MinAtk[Enum] + 1) + MinAtk[Enum]));
                        Eatk = (int) Math.floor(Math.random() * (MaxAtk[Enum] - MinAtk[Enum] + 1) + MinAtk[Enum]);

                        if (Block >= Eatk) {
                            Log.append(Name[1]+" Attacked for "+ Eatk +" Damage...\n");
                            Log.append("You've successfully blocked " + Name[1] +"'s attack!\n");
                            Log.append("You've rebounded "+ (Block-Eatk)+" damage...\n");
                            HP[1] -= (Block - Eatk);
                            EHolder = String.valueOf(HP[1]);
                            EnemyHealth.setText(EHolder + "/" + MaxHP[1]);
                        } 
                        else {
                            Log.append(Name[1]+" Attacked for "+ Eatk +" Damage...\n");
                            Log.append("You've blocked "+ Block +" damage...\n");
                            Log.append("You've taken "+ Math.abs(Block - Eatk)+" damage...\n");
                            HP[0] -= (Eatk - Block);
                            HHolder = String.valueOf(HP[0]);
                            Health.setText(HHolder + "/" + MaxHP[0]);
                        }
                        break;
                    case 2: // flee
                        Eatk = (int) Math.floor(Math.random() * (MaxAtk[Enum] - MinAtk[Enum] + 1) + MinAtk[Enum]);
                        Flee = (int) Math.floor(Math.random() * (Dice[0] - Dice[1] + 1) + Dice[1]);

                        if (Flee > 50) {
                            Log.append("You've Successfully fled...\n");
                            Roll = (int) Math.floor(Math.random() * (Dice[0] - Dice[1] + 1) + Dice[1]);
                            EnemyRoll();
                        } else {
                            Log.append("You've failed to flee...\n");
                            Log.append("You've taken " + Eatk + " Damage...\n");
                            HP[0] -= Eatk;
                            HHolder = String.valueOf(HP[0]);
                            Health.setText(HHolder + "/" + MaxHP[0]);
                        }
                        break;
                    default:
                }
            }
    }//GEN-LAST:event_DiceRollActionPerformed

    private void FleeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FleeActionPerformed
        Action = 2;
    }//GEN-LAST:event_FleeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ImageIcon icon;
        icon = new ImageIcon("Image/Icon.png"); 
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Actions;
    private javax.swing.JRadioButton Attack;
    private javax.swing.JRadioButton Block;
    private javax.swing.JButton DiceRoll;
    private javax.swing.JLabel EnemyHealth;
    private javax.swing.JLabel EnemyName;
    private javax.swing.JRadioButton Flee;
    private javax.swing.JLabel Health;
    private javax.swing.JTextArea Log;
    private javax.swing.JLabel PlayerName;
    private javax.swing.JButton SaveExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
