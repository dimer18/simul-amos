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

import DistProb.Poison;
import DistProb.Unifor;
import interfaces.Grafica;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import validadores.api.GrupoValidador;
import validadores.validadoresformato.DoubleValidador;
import validadores.validadoresformato.EnteroValidador;

/**
 *
 * @author Steve
 */
public class UniforGUI extends javax.swing.JInternalFrame {

    GrupoValidador validadorFormulario = new GrupoValidador();

    /** Creates new form PoisonGUI */
    public UniforGUI() {
        initComponents();
        aValidador.configurarValidacion(paramATextField,
                true,
                "Ingrese el valor de a",
                new DoubleValidador("Ingrese un numero real", DoubleValidador.CONFIGURACIONES.POSITIVO, "Dato incorrecto. Ingrese un numero real"));

        bValidador.configurarValidacion(paramATextField,
                true,
                "Ingrese el valor de b",
                new DoubleValidador("Ingrese un numero real", DoubleValidador.CONFIGURACIONES.POSITIVO, "Dato incorrecto. Ingrese un numero real"));

        observacionesValidador.configurarValidacion(paramObservacionesTextField,
                true,
                "Ingrese el numero de observaciones",
                new EnteroValidador("Ingrese el numero entero", EnteroValidador.CONFIGURACIONES.POSITIVO, "Dato Incorrecto. Ingrese un entero"));
        validadorFormulario.add(aValidador, observacionesValidador);
        jSplitPane1.setVisible(false);
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
        paramATextField = new javax.swing.JTextField();
        aValidador = new validadores.api.ValidadorJTextComponent();
        simularButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        paramObservacionesTextField = new javax.swing.JTextField();
        observacionesValidador = new validadores.api.ValidadorJTextComponent();
        paramBTextField = new javax.swing.JTextField();
        bValidador = new validadores.api.ValidadorJTextComponent();
        jLabel2 = new javax.swing.JLabel();
        contenedorPanel = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        datosTable = new javax.swing.JTable();
        graficaPanel = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Distribución Uniforme");

        parametrosPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("a");

        simularButton.setText("Simular");
        simularButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simularButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("<html>Numero de<br>Observaciones</html>");

        jLabel2.setText("b");

        javax.swing.GroupLayout parametrosPanelLayout = new javax.swing.GroupLayout(parametrosPanel);
        parametrosPanel.setLayout(parametrosPanelLayout);
        parametrosPanelLayout.setHorizontalGroup(
            parametrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parametrosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(parametrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(parametrosPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paramATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aValidador, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, parametrosPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paramBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bValidador, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
                    .addComponent(simularButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(parametrosPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paramObservacionesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(observacionesValidador, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)))
                .addContainerGap())
        );
        parametrosPanelLayout.setVerticalGroup(
            parametrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parametrosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(parametrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(parametrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(paramATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(aValidador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(parametrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paramBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bValidador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(parametrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paramObservacionesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(observacionesValidador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(simularButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(parametrosPanel, java.awt.BorderLayout.NORTH);

        jSplitPane1.setDividerLocation(150);
        jSplitPane1.setContinuousLayout(true);
        jSplitPane1.setOneTouchExpandable(true);

        datosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane1.setViewportView(datosTable);

        jSplitPane1.setLeftComponent(jScrollPane1);

        graficaPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        graficaPanel.setLayout(new java.awt.BorderLayout());
        jSplitPane1.setRightComponent(graficaPanel);

        javax.swing.GroupLayout contenedorPanelLayout = new javax.swing.GroupLayout(contenedorPanel);
        contenedorPanel.setLayout(contenedorPanelLayout);
        contenedorPanelLayout.setHorizontalGroup(
            contenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );
        contenedorPanelLayout.setVerticalGroup(
            contenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(contenedorPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simularButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simularButtonActionPerformed
        if (validadorFormulario.validar()) {
            double a = Double.parseDouble(paramATextField.getText());
            double b = Double.parseDouble(paramBTextField.getText());
            int observaciones = Integer.parseInt(paramObservacionesTextField.getText());
            Unifor u = new Unifor(a,b);
            double[] datos = u.getObservaciones(observaciones);
            //arrayToModel(p.getObservaciones(observaciones));
            datosTable.setModel(arrayToModel(datos));

            Grafica g = new Grafica("Grafico", datos);
            graficaPanel.removeAll();
            graficaPanel.add(g.createDemoPanel());
            
            jSplitPane1.setVisible(true);
            contenedorPanel.updateUI();
        }
    }//GEN-LAST:event_simularButtonActionPerformed

    public DefaultTableModel arrayToModel(double[] datos) {
        Object[][] odatos = new Object[datos.length][2];
        for (int i = 0; i < datos.length; i++) {
            odatos[i][0] = 1 + i;
            odatos[i][1] = datos[i];
        }
        Object[] coln = new Object[]{"Observacion", "Dato"};
        DefaultTableModel dtm = new DefaultTableModel(odatos, coln);
        return dtm;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private validadores.api.ValidadorJTextComponent aValidador;
    private validadores.api.ValidadorJTextComponent bValidador;
    private javax.swing.JPanel contenedorPanel;
    private javax.swing.JTable datosTable;
    private javax.swing.JPanel graficaPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private validadores.api.ValidadorJTextComponent observacionesValidador;
    private javax.swing.JTextField paramATextField;
    private javax.swing.JTextField paramBTextField;
    private javax.swing.JTextField paramObservacionesTextField;
    private javax.swing.JPanel parametrosPanel;
    private javax.swing.JButton simularButton;
    // End of variables declaration//GEN-END:variables
}
