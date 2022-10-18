/*Galván Rodríguez Esteban*/
/*31/01/2021*/
/*Programa para evaluar la escala de Glasgow*/
public class Inicio extends javax.swing.JPanel {
    /*Método constructor de la clase Inicio*/
    /*Esta clase sirve para controlar el flujo de datos al inicio de la aplicación, es decir, ese panel dará las instrucciones 
    al usuario antes de inciar con la evaluación*/
    /*Método constructor de la clase Inicio*/
    public Inicio() {
        initComponents();      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Inicio = new javax.swing.JPanel();
        BtnNInio = new javax.swing.JButton();
        BtnAdulto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        Panel_Inicio.setBackground(new java.awt.Color(51, 102, 255));

        BtnNInio.setText("NIño");
        BtnNInio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNInioActionPerformed(evt);
            }
        });

        BtnAdulto.setText("Adulto");
        BtnAdulto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdultoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INSTRUCCIONES");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("-Seleccione un rango de edad");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Presione en las opciones para medir las respuestas óptica, verbal y motóra");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Presione el Botón \"OK\" y siga las indicaciones");

        javax.swing.GroupLayout Panel_InicioLayout = new javax.swing.GroupLayout(Panel_Inicio);
        Panel_Inicio.setLayout(Panel_InicioLayout);
        Panel_InicioLayout.setHorizontalGroup(
            Panel_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_InicioLayout.createSequentialGroup()
                .addGroup(Panel_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_InicioLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(Panel_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnNInio, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnAdulto, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(Panel_InicioLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_InicioLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        Panel_InicioLayout.setVerticalGroup(
            Panel_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_InicioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                .addComponent(BtnNInio, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnAdulto, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        add(Panel_Inicio, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
/*Se implementan los ActionListener de los botones 'BtnNinio' y 'BtnAdulto' los cuales servirán para que el usuario elija
    evaluar entre un paciente menor a 5 años o un paciente mayor a 5 años, a continuación se explicarán las ejecuciones de
    los ActionListener*/
    private void BtnNInioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNInioActionPerformed
        /*Este es el ActionListener para el botón "niño". Si un usuario presiona este botón, se instaciará un nuevo panel de
        la clase Ninio*/
        /*Se instancia un objeto de la clase Ninio*/
        Ninio niño = new Ninio();
        /*Se crea un panel de 600 por 750 píxeles*/
        niño.setSize(600,750);
        /*Se llama al método removeAll para que elimine los elementos que se le pasen, pero en este caso, se eliminará el panel*/
        Panel_Inicio.removeAll();
        /*Al panel de inicio se la añada el panel 'niño'*/
        Panel_Inicio.add(niño);
        /*Se llama al método revalidate para 'revalidar' todo el panel*/
        Panel_Inicio.revalidate();
        /*La llamada a repaint() únicamente avisa a la máquina virtual java que ese componente necesita repintado. 
        El método en sí mismo no borra ni dibuja nada.*/
        Panel_Inicio.repaint();
    }//GEN-LAST:event_BtnNInioActionPerformed

    private void BtnAdultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdultoActionPerformed
    /*Este es el ActionListener para el botón "adulto". Si un usuario presiona este botón, se instaciará un nuevo panel de
        la clase Adulto*/
        /*Se instancia un objeto de la clase Adulto*/
        Adulto adulto = new Adulto();
        /*Se crea un panel de 600 por 750 píxeles*/
        adulto.setSize(600,750);
        /*Se llama al método removeAll para que elimine los elementos que se le pasen, pero en este caso, se eliminará el panel*/
        Panel_Inicio.removeAll();
        /*Al panel de inicio se la añada el panel 'adulto'*/
        Panel_Inicio.add(adulto);
        /*Se llama al método revalidate para 'revalidar' todo el panel*/
        Panel_Inicio.revalidate();
        /*La llamada a repaint() únicamente avisa a la máquina virtual java que ese componente necesita repintado. 
        El método en sí mismo no borra ni dibuja nada.*/
        Panel_Inicio.repaint();
    }//GEN-LAST:event_BtnAdultoActionPerformed

/*En esra declaración de variables se declaran 2 botónes, los cuales servirán para que el usuario eliga entre un nuevo
    panel, ya sea para niños o para adultos*/
/*También se crea un nuevo panel, el cual contendrá todos los elementos, como los botónes o las etiquetas*/
/*También se crean etiquetas, las cuales contendrán las instrucciones para que el usuario pueda usar la aplicación*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdulto;
    private javax.swing.JButton BtnNInio;
    private javax.swing.JPanel Panel_Inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
