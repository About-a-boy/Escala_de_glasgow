/*Galván Rodríguez Esteban*/
/*31/01/2021*/
/*Programa para evaluar la escala de Glasgow*/
/*Este es el panel que se usará en caso de que haya un traumatismo moderado*/
public class Trauma_Moderado extends javax.swing.JPanel {
    /*Método constructor del panel Trauma_Moderado*/
    public Trauma_Moderado() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Menu_Principal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(51, 255, 51));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Trauma Moderado");

        Menu_Principal.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Menu_Principal.setText("Menú Principal");
        Menu_Principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_PrincipalActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 153, 102));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Instrucciones para primeros auxílios:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(250, 250, 250));
        jLabel3.setText("-No movilizar al accidentado si no es absolutamente necesario para evitar agravar la fractura. ");

        jLabel4.setForeground(new java.awt.Color(250, 250, 250));
        jLabel4.setText(" No retirar el calzado o cualquier prenda de vestir pues, al tratar de hacerlo se producen movimientos");

        jLabel5.setForeground(new java.awt.Color(250, 250, 250));
        jLabel5.setText("innecesarios que pueden ocasionar más daño.");

        jLabel6.setForeground(new java.awt.Color(250, 250, 250));
        jLabel6.setText("-Inmovilizar la fractura, en la misma posición en la que nos la encontremos, incluyendo las articulaciones");

        jLabel7.setForeground(new java.awt.Color(250, 250, 250));
        jLabel7.setText(" evitando siempre la zona afectada o moviéndola, de ser necesario, en bloque y bajo tracción.");

        jLabel8.setForeground(new java.awt.Color(250, 250, 250));
        jLabel8.setText("-En caso de fracturas abiertas, cubrir la herida con apósitos estériles o pañuelos lo más limpios posible ");

        jLabel9.setForeground(new java.awt.Color(250, 250, 250));
        jLabel9.setText("y comprimir para contener la hemorragia. A continuación, inmovilizar y,si se puede, elevar la extremidad");

        jLabel10.setForeground(new java.awt.Color(250, 250, 250));
        jLabel10.setText("afectada");

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(250, 250, 250));
        jLabel11.setText("Números de emergencia:");

        jLabel12.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(250, 250, 250));
        jLabel12.setText("Cruz Roja 065.");

        jLabel13.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(250, 250, 250));
        jLabel13.setText("Emergencias 911.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 11, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                                    .addComponent(Menu_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(jLabel13)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(44, 44, 44)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(45, 45, 45)
                .addComponent(Menu_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_PrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_PrincipalActionPerformed
        /*Implementación de un ActionListener para el botón Menu_Principal*/
        /*Si el usuario así lo desea, al presionar el botón, se creará un panel de la clase Inicio, llamado 'inicio', esto
        para regresar al usuario al menú principal y poder volver  a usar la aplicación desde el principio, con un tamaño de
        600 por 750 píxeles, añadiendo el panel 'inicio' al panel Trauma_Moderado*/
        Inicio inicio = new Inicio();
        inicio.setSize(600,750);
        removeAll();
        add(inicio);
        revalidate();
    }//GEN-LAST:event_Menu_PrincipalActionPerformed

/*El botón 'Menú_Principal' sirve para que el usuario pueda volver a la pantalla principal y usar la aplicación desde el inicio*/
/*A continucación se declaran varias etiquetas, las cuales le darán instrucciones al usuario sobre cómo tratar al paciente*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Menu_Principal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
