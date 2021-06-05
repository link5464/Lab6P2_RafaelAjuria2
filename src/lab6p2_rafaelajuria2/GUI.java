/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_rafaelajuria2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author rajur
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
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

        jDialog_LoginScreen = new javax.swing.JDialog();
        jLabel_LoginScreen = new javax.swing.JLabel();
        jLabel_Username = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jLabel_Password = new javax.swing.JLabel();
        jPasswordField_Password = new javax.swing.JPasswordField();
        jRadioButton_Alumno = new javax.swing.JRadioButton();
        jLabel_Rol = new javax.swing.JLabel();
        jRadioButton_Maestro = new javax.swing.JRadioButton();
        jRadioButton_Admin = new javax.swing.JRadioButton();
        jButton_LoginAction = new javax.swing.JButton();
        buttonGroup_LoginPrivileges = new javax.swing.ButtonGroup();
        jDialog_CreateUserScreen = new javax.swing.JDialog();
        jLabel_CreateUser = new javax.swing.JLabel();
        jLabel_Tipo = new javax.swing.JLabel();
        jRadioButton_Alumno1 = new javax.swing.JRadioButton();
        jRadioButton_Maestro1 = new javax.swing.JRadioButton();
        jLabel_NuevoNombre = new javax.swing.JLabel();
        jTextField_NuevoNombre = new javax.swing.JTextField();
        jLabel_NuevoApellido = new javax.swing.JLabel();
        jTextField_NuevoApellido = new javax.swing.JTextField();
        jTextField_NuevoNumReg = new javax.swing.JTextField();
        jLabel_NuevoNumReg = new javax.swing.JLabel();
        jTextField_NuevaCarrera = new javax.swing.JTextField();
        jLabel_NuevaCarrera = new javax.swing.JLabel();
        jTextField_NuevoAño = new javax.swing.JTextField();
        jLabel_NuevoAño = new javax.swing.JLabel();
        jLabel_Facultad = new javax.swing.JLabel();
        jRadioButton_Licenciatura = new javax.swing.JRadioButton();
        jRadioButton_Ingenieria = new javax.swing.JRadioButton();
        jRadioButton_Medicina = new javax.swing.JRadioButton();
        jTextField_NuevoPromedio = new javax.swing.JTextField();
        jLabel_NuevoPromedio = new javax.swing.JLabel();
        jButton_CrearNuevoUsuario = new javax.swing.JButton();
        buttonGroup_TipoDeUsuarioCreado = new javax.swing.ButtonGroup();
        buttonGroup_Facultad = new javax.swing.ButtonGroup();
        jLabel_Laboratorio6 = new javax.swing.JLabel();
        jButton_LoginWindow = new javax.swing.JButton();
        jButton_Salir = new javax.swing.JButton();
        jButton_CreateUser = new javax.swing.JButton();

        jLabel_LoginScreen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_LoginScreen.setText("Login Screen");

        jLabel_Username.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_Username.setText("Username:");

        jTextField_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UsernameActionPerformed(evt);
            }
        });

        jLabel_Password.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_Password.setText("Password:");

        jPasswordField_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_PasswordActionPerformed(evt);
            }
        });

        buttonGroup_LoginPrivileges.add(jRadioButton_Alumno);
        jRadioButton_Alumno.setText("Alumno");

        jLabel_Rol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Rol.setText("Seleccione su Rol:");

        buttonGroup_LoginPrivileges.add(jRadioButton_Maestro);
        jRadioButton_Maestro.setText("Maestro");

        buttonGroup_LoginPrivileges.add(jRadioButton_Admin);
        jRadioButton_Admin.setText("Administrador del Sistema");

        jButton_LoginAction.setText("Iniciar Sesion");

        javax.swing.GroupLayout jDialog_LoginScreenLayout = new javax.swing.GroupLayout(jDialog_LoginScreen.getContentPane());
        jDialog_LoginScreen.getContentPane().setLayout(jDialog_LoginScreenLayout);
        jDialog_LoginScreenLayout.setHorizontalGroup(
            jDialog_LoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_LoginScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog_LoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_LoginScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Rol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDialog_LoginScreenLayout.createSequentialGroup()
                        .addGroup(jDialog_LoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog_LoginScreenLayout.createSequentialGroup()
                                .addGroup(jDialog_LoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDialog_LoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_Username, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                    .addComponent(jPasswordField_Password)))
                            .addGroup(jDialog_LoginScreenLayout.createSequentialGroup()
                                .addComponent(jRadioButton_Alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton_Maestro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jRadioButton_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jDialog_LoginScreenLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jButton_LoginAction, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog_LoginScreenLayout.setVerticalGroup(
            jDialog_LoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_LoginScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_LoginScreen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_LoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Username))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_LoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Rol)
                .addGap(2, 2, 2)
                .addGroup(jDialog_LoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_Alumno)
                    .addComponent(jRadioButton_Maestro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton_Admin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_LoginAction)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jLabel_CreateUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_CreateUser.setText("Crear Usuario Nuevo");

        jLabel_Tipo.setText("Tipo de Usuario:");

        buttonGroup_TipoDeUsuarioCreado.add(jRadioButton_Alumno1);
        jRadioButton_Alumno1.setText("Alumno");

        buttonGroup_TipoDeUsuarioCreado.add(jRadioButton_Maestro1);
        jRadioButton_Maestro1.setText("Maestro");

        jLabel_NuevoNombre.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_NuevoNombre.setText("Nombre:");

        jLabel_NuevoApellido.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_NuevoApellido.setText("Apellido:");

        jTextField_NuevoNumReg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_NuevoNumRegFocusLost(evt);
            }
        });

        jLabel_NuevoNumReg.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_NuevoNumReg.setText("Num. de Registro:");

        jTextField_NuevaCarrera.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_NuevaCarreraFocusLost(evt);
            }
        });

        jLabel_NuevaCarrera.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_NuevaCarrera.setText("Carrera:");

        jTextField_NuevoAño.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_NuevoAñoFocusLost(evt);
            }
        });

        jLabel_NuevoAño.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_NuevoAño.setText("Año en Curso:");

        jLabel_Facultad.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_Facultad.setText("Facultad:");

        buttonGroup_Facultad.add(jRadioButton_Licenciatura);
        jRadioButton_Licenciatura.setText("Licenciatura");

        buttonGroup_Facultad.add(jRadioButton_Ingenieria);
        jRadioButton_Ingenieria.setText("Ingenieria");

        buttonGroup_Facultad.add(jRadioButton_Medicina);
        jRadioButton_Medicina.setText("Medicina");

        jTextField_NuevoPromedio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_NuevoPromedioFocusLost(evt);
            }
        });

        jLabel_NuevoPromedio.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_NuevoPromedio.setText("Promedio:");

        jButton_CrearNuevoUsuario.setText("Crear Usuario");
        jButton_CrearNuevoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_CrearNuevoUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jDialog_CreateUserScreenLayout = new javax.swing.GroupLayout(jDialog_CreateUserScreen.getContentPane());
        jDialog_CreateUserScreen.getContentPane().setLayout(jDialog_CreateUserScreenLayout);
        jDialog_CreateUserScreenLayout.setHorizontalGroup(
            jDialog_CreateUserScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_CreateUserScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog_CreateUserScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_CreateUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDialog_CreateUserScreenLayout.createSequentialGroup()
                        .addGroup(jDialog_CreateUserScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel_NuevoPromedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Facultad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_NuevoAño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_NuevaCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_NuevoNumReg, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(jLabel_NuevoApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_NuevoNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Tipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDialog_CreateUserScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton_Maestro1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(jRadioButton_Alumno1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_NuevoNombre)
                            .addComponent(jTextField_NuevoApellido)
                            .addComponent(jTextField_NuevoNumReg)
                            .addComponent(jTextField_NuevaCarrera)
                            .addComponent(jTextField_NuevoAño)
                            .addComponent(jRadioButton_Licenciatura, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton_Ingenieria, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton_Medicina, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_NuevoPromedio))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog_CreateUserScreenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_CrearNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jDialog_CreateUserScreenLayout.setVerticalGroup(
            jDialog_CreateUserScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_CreateUserScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_CreateUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_CreateUserScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDialog_CreateUserScreenLayout.createSequentialGroup()
                        .addComponent(jRadioButton_Alumno1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton_Maestro1))
                    .addComponent(jLabel_Tipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_CreateUserScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_NuevoNombre)
                    .addComponent(jLabel_NuevoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_CreateUserScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_NuevoApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_NuevoApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_CreateUserScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_NuevoNumReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_NuevoNumReg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_CreateUserScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_NuevaCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_NuevaCarrera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog_CreateUserScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Facultad)
                    .addComponent(jRadioButton_Licenciatura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton_Ingenieria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton_Medicina)
                .addGap(28, 28, 28)
                .addGroup(jDialog_CreateUserScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_NuevoAño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_NuevoAño))
                .addGap(3, 3, 3)
                .addGroup(jDialog_CreateUserScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_NuevoPromedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_NuevoPromedio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_CrearNuevoUsuario))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_Laboratorio6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Laboratorio6.setText("Laboratorio #6");

        jButton_LoginWindow.setText("Login");
        jButton_LoginWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_LoginWindowMouseClicked(evt);
            }
        });

        jButton_Salir.setText("Salir");
        jButton_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_SalirMouseClicked(evt);
            }
        });

        jButton_CreateUser.setText("Crear Usuario");
        jButton_CreateUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_CreateUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Laboratorio6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_LoginWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_CreateUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Laboratorio6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_LoginWindow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_CreateUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_SalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton_SalirMouseClicked

    private void jPasswordField_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_PasswordActionPerformed

    private void jTextField_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UsernameActionPerformed

    private void jButton_LoginWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_LoginWindowMouseClicked
        // TODO add your handling code here:
        jDialog_LoginScreen.pack();
        jDialog_LoginScreen.setVisible(true);
    }//GEN-LAST:event_jButton_LoginWindowMouseClicked

    private void jButton_CreateUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CreateUserMouseClicked
        // TODO add your handling code here:
        jDialog_CreateUserScreen.pack();
        jDialog_CreateUserScreen.setVisible(true);
    }//GEN-LAST:event_jButton_CreateUserMouseClicked

    private void jTextField_NuevoNumRegFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_NuevoNumRegFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NuevoNumRegFocusLost

    private void jTextField_NuevaCarreraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_NuevaCarreraFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NuevaCarreraFocusLost

    private void jTextField_NuevoAñoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_NuevoAñoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NuevoAñoFocusLost

    private void jTextField_NuevoPromedioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_NuevoPromedioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NuevoPromedioFocusLost

    private void jButton_CrearNuevoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CrearNuevoUsuarioMouseClicked
        // TODO add your handling code here:
        if(jRadioButton_Alumno1.isSelected())
        {
          int edad=0;
          int ID=Integer.parseInt(jTextField_NuevoNumReg.getText());
          String Carrera = jTextField_NuevaCarrera.getText();
          int AñoEnCurso=Integer.parseInt(jTextField_NuevoAño.getText());
          Double Promedio = Double.parseDouble(jTextField_NuevoPromedio.getText());
          String Facultad = "";
          String Nombre = jTextField_NuevoNombre.getText();
          String Apellido = jTextField_NuevoApellido.getText();
          int NumeroDeRegistro=Integer.parseInt(jTextField_NuevoNumReg.getText());
          String Username = "prueba";
          String Password = "prueba";
            try {  
                AgregarAlumno(edad,ID,Carrera,AñoEnCurso,Promedio,Facultad,Nombre,Apellido,NumeroDeRegistro,Username,Password);
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton_CrearNuevoUsuarioMouseClicked

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    //CRUDs
        //Alumnos
            //Create
    public static void AgregarAlumno(int edad, int ID, String Carrera, int AñoEnCurso, double Promedio, String Facultad, String Nombre, String Apellido, int NumeroDeRegistro, String Username, String Password) throws IOException
    {
       AdministradorAlumnos Admin= new AdministradorAlumnos("./alumnos.txt");        
        Admin.LoadFile();
        Alumno Temporal = new Alumno(edad,ID,Carrera,AñoEnCurso,Promedio,Facultad,Nombre,Apellido,NumeroDeRegistro,Username,Password);
        Admin.getAlumnosGuardados().add(Temporal);        
        Admin.WriteFile(); 
    }
            //Read
    public static ArrayList<Alumno> LeerAlumnos()
    {
       ArrayList<Alumno> output;
       AdministradorAlumnos Admin= new AdministradorAlumnos("./alumnos.txt");        
       Admin.LoadFile(); 
       output=Admin.getAlumnosGuardados();
       return output;
    }
            //Update
    public static void ActualizarAlumnos(int Position,int edad, int ID, String Carrera, int AñoEnCurso, double Promedio, String Facultad, String Nombre, String Apellido, int NumeroDeRegistro, String Username, String Password) throws IOException
    {
      AdministradorAlumnos Admin= new AdministradorAlumnos("./alumnos.txt");        
      Admin.LoadFile();
      Admin.getAlumnosGuardados().get(Position).setEdad(edad);
      Admin.getAlumnosGuardados().get(Position).setID(ID);
      Admin.getAlumnosGuardados().get(Position).setCarrera(Carrera);
      Admin.getAlumnosGuardados().get(Position).setAñoEnCurso(AñoEnCurso);
      Admin.getAlumnosGuardados().get(Position).setPromedio(Promedio);
      Admin.getAlumnosGuardados().get(Position).setFacultad(Facultad);
      Admin.getAlumnosGuardados().get(Position).setNombre(Nombre);
      Admin.getAlumnosGuardados().get(Position).setApellido(Apellido);
      Admin.getAlumnosGuardados().get(Position).setNumeroDeRegistro(NumeroDeRegistro);
      Admin.getAlumnosGuardados().get(Position).setUsername(Username);
      Admin.getAlumnosGuardados().get(Position).setPassword(Password);
      Admin.WriteFile();
    }
            //Delete
    public static void BorrarAlumno(int Position) throws IOException
    {
      AdministradorAlumnos Admin= new AdministradorAlumnos("./alumnos.txt");        
      Admin.LoadFile();
      Admin.getAlumnosGuardados().remove(Position);
      Admin.WriteFile();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_Facultad;
    private javax.swing.ButtonGroup buttonGroup_LoginPrivileges;
    private javax.swing.ButtonGroup buttonGroup_TipoDeUsuarioCreado;
    private javax.swing.JButton jButton_CrearNuevoUsuario;
    private javax.swing.JButton jButton_CreateUser;
    private javax.swing.JButton jButton_LoginAction;
    private javax.swing.JButton jButton_LoginWindow;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JDialog jDialog_CreateUserScreen;
    private javax.swing.JDialog jDialog_LoginScreen;
    private javax.swing.JLabel jLabel_CreateUser;
    private javax.swing.JLabel jLabel_Facultad;
    private javax.swing.JLabel jLabel_Laboratorio6;
    private javax.swing.JLabel jLabel_LoginScreen;
    private javax.swing.JLabel jLabel_NuevaCarrera;
    private javax.swing.JLabel jLabel_NuevoApellido;
    private javax.swing.JLabel jLabel_NuevoAño;
    private javax.swing.JLabel jLabel_NuevoNombre;
    private javax.swing.JLabel jLabel_NuevoNumReg;
    private javax.swing.JLabel jLabel_NuevoPromedio;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_Rol;
    private javax.swing.JLabel jLabel_Tipo;
    private javax.swing.JLabel jLabel_Username;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JRadioButton jRadioButton_Admin;
    private javax.swing.JRadioButton jRadioButton_Alumno;
    private javax.swing.JRadioButton jRadioButton_Alumno1;
    private javax.swing.JRadioButton jRadioButton_Ingenieria;
    private javax.swing.JRadioButton jRadioButton_Licenciatura;
    private javax.swing.JRadioButton jRadioButton_Maestro;
    private javax.swing.JRadioButton jRadioButton_Maestro1;
    private javax.swing.JRadioButton jRadioButton_Medicina;
    private javax.swing.JTextField jTextField_NuevaCarrera;
    private javax.swing.JTextField jTextField_NuevoApellido;
    private javax.swing.JTextField jTextField_NuevoAño;
    private javax.swing.JTextField jTextField_NuevoNombre;
    private javax.swing.JTextField jTextField_NuevoNumReg;
    private javax.swing.JTextField jTextField_NuevoPromedio;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
