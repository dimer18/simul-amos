/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PoisonGUI.java
 *
 * Created on 04-17-2010, 02:30:57 PM
 */

package DistProb.interfaces;

import javax.swing.JOptionPane;
import validadores.api.GrupoValidador;
import validadores.validadoresformato.DoubleValidador;

/**
 *
 * @author Steve
 */
public class PoisonGUI extends javax.swing.JInternalFrame {
GrupoValidador validadorFormulario = new GrupoValidador();
    /** Creates new form PoisonGUI */
    public PoisonGUI() {
        initComponents();
        mediaValidador.configurarValidacion(paramMediaTextField,
                true,
                "Ingrese el valor de la media",
                new DoubleValidador("Ingrese un numero real", DoubleValidador.CONFIGURACIONES.POSITIVO, "Dato incorrecto. Ingrese un numero real"));
        validadorFormulario.add(mediaValidador);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parametrosPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        paramMediaTextField = new javax.swing.JTextField();
        mediaValidador = new validadores.api.ValidadorJTextComponent();
        simularButton = new javax.swing.JButton();
        contenedorPanel = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Distribución Poison");

        jLabel1.setText("Media");

        simularButton.setText("Simular");
        simularButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simularButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout parametrosPanelLayout = new javax.swing.GroupLayout(parametrosPanel);
        parametrosPanel.setLayout(parametrosPanelLayout);
        parametrosPanelLayout.setHorizontalGroup(
            parametrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parametrosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(parametrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(simularButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, parametrosPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(paramMediaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(mediaValidador, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addContainerGap())
        );
        parametrosPanelLayout.setVerticalGroup(
            parametrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parametrosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(parametrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mediaValidador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(parametrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(paramMediaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(simularButton)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(parametrosPanel, java.awt.BorderLayout.NORTH);

        javax.swing.GroupLayout contenedorPanelLayout = new javax.swing.GroupLayout(contenedorPanel);
        contenedorPanel.setLayout(contenedorPanelLayout);
        contenedorPanelLayout.setHorizontalGroup(
            contenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        contenedorPanelLayout.setVerticalGroup(
            contenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
        );

        getContentPane().add(contenedorPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simularButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simularButtonActionPerformed
        if(validadorFormulario.validar()){
           JOptionPane.showMessageDialog(null, "Ok, hacer algo...");
        }

    }//GEN-LAST:event_simularButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedorPanel;
    private javax.swing.JLabel jLabel1;
    private validadores.api.ValidadorJTextComponent mediaValidador;
    private javax.swing.JTextField paramMediaTextField;
    private javax.swing.JPanel parametrosPanel;
    private javax.swing.JButton simularButton;
    // End of variables declaration//GEN-END:variables

}
