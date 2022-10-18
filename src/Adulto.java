/*Galván Rodríguez Esteban*/
/*31/01/2021*/
/*Programa para evaluar la escala de Glasgow*/
public class Adulto extends javax.swing.JPanel {
    /*Se crean cuatro variables para almacenar los valores de la evaluación de la escala*/
     int total=0;/*Esta variable almacenatá el resultado total de la evaluación*/
     int res_ocular=0;/*Esta variable almacenará el valor que el usuario haya elegido para evaluar la respuesta ocular*/
     int res_verbal=0;/*Esta variable almacenará el valor que el usuario haya elegido para evaluar la respuesta verbal*/
     int res_motora=0;/*Esta variable almacenará el valor que el usuario haya elegido para evaluar la respuesta motora*/
     /*Declaración del método constructor*/
    public Adulto() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Cambiar = new javax.swing.JPanel();
        Respuesta_Ocular = new javax.swing.JComboBox<>();
        Respuesta_Verbal = new javax.swing.JComboBox<>();
        Respuesta_Motora = new javax.swing.JComboBox<>();
        Volver = new javax.swing.JButton();
        OK = new javax.swing.JButton();

        Panel_Cambiar.setBackground(new java.awt.Color(0, 51, 255));

        Respuesta_Ocular.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Respuesta_Ocular.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Respuesta Ocular", " ", "Indica que el paciente abre los ojos espontáneamente, sin necesidad de un estimulo.", " ", "Indica que el paciente abre los ojos obedeciendo una orden verbal.", " ", "Indica que el paciente abre los ojos sólo en respuesta a un estímulo doloroso.", " ", "El paciente no abre los ojos ante ningún estímulo." }));
        Respuesta_Ocular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Respuesta_OcularActionPerformed(evt);
            }
        });

        Respuesta_Verbal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Respuesta_Verbal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Respuesta Verbal", " ", "El paciente se siente bien orientado y puede hablar de manera coherente.", " ", "El paciente se siente desorientado pero puede hablar de manera coherente.", " ", "El paciente usa palabras poco apropiadas o lenguaje incoherente.", " ", "El paciente emite sonidos incomprensibles.", " ", "El paciente no da ninguna respuesta verbal." }));
        Respuesta_Verbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Respuesta_VerbalActionPerformed(evt);
            }
        });

        Respuesta_Motora.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Respuesta_Motora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Respuesta Motora", " ", "El paciente obedece órdenes.", " ", "El paciente localiza dolor.", " ", "El paciente se retira frente al dolor.", " ", "El paciente flexiona anormalmente.", " ", "El paciente tiene una extensión anormal", " ", "El paciente no demuestra ningún movimiento en respuesta a los estímulos." }));
        Respuesta_Motora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Respuesta_MotoraActionPerformed(evt);
            }
        });

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        OK.setText("OK");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_CambiarLayout = new javax.swing.GroupLayout(Panel_Cambiar);
        Panel_Cambiar.setLayout(Panel_CambiarLayout);
        Panel_CambiarLayout.setHorizontalGroup(
            Panel_CambiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_CambiarLayout.createSequentialGroup()
                .addGroup(Panel_CambiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(Panel_CambiarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel_CambiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Respuesta_Ocular, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel_CambiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Respuesta_Verbal, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                                .addComponent(Respuesta_Motora, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(Panel_CambiarLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        Panel_CambiarLayout.setVerticalGroup(
            Panel_CambiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_CambiarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Respuesta_Ocular, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(Respuesta_Motora, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(Respuesta_Verbal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
                .addGroup(Panel_CambiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Cambiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Cambiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
/*Este bloque sirve para que, en caso de que el usuario lo decida, se pueda volver al panel inicial*/
    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        /*Si el usuario presiona el botón 'volver'...*/
        /*Se instanciará un nuevo objeto de la clase Inicio llamado 'inicio'*/
        Inicio inicio = new Inicio();
        /*El nuevo panel tendrá un tamaño de 600 por 750 píxeles*/
        inicio.setSize(600,750);
        /*Se llama al método removeAll para que elimine los elementos que se le pasen, pero en este caso, se eliminará el panel*/        
        removeAll();
        /*Al panel de Adulto se la añada el panel 'inicio'*/
        add(inicio);
        /*Se llama al método revalidate para 'revalidar' todo el panel*/
        revalidate();
        
    }//GEN-LAST:event_VolverActionPerformed

    private void Respuesta_MotoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Respuesta_MotoraActionPerformed
        /*Se crea un método ActionListener para el combobox Respuesta_Motora, esto para evaluar la opcion que eliga el usuario
        en cada uno de los items*/
        /*Se crea una variable 'opcion', la cual almacenará el texto del item, esto se hará llamando al método getSelectedItem*/
        String opcion =(String)Respuesta_Motora.getSelectedItem();
        /*Este conjunto de sentancias if sirve para evaluar cada uno de los casos en el campo Respuests Motora*/
        /*En el primer caso, si se elige el item con el siguiente texto*/
        if(opcion.equals("El paciente obedece órdenes.")){
            /*Si se elige este item, 'res_motora' tomará el valor de 6*/
            res_motora=6;
        }
        if(opcion.equals("El paciente localiza dolor.")){
            /*Si se elige este item, 'res_motora' tomará el valor de 5*/
            res_motora=5;
        }
        if(opcion.equals("El paciente se retira frente al dolor.")){
            /*Si se elige este item, 'res_motora' tomará el valor de 4*/
            res_motora=4;
        }
        if(opcion.equals("El paciente flexiona anormalmente.")){
            /*Si se elige este item, 'res_motora' tomará el valor de 3*/
            res_motora=3;
        }
        if(opcion.equals("El paciente tiene una extensión anormal")){
            /*Si se elige este item, 'res_motora' tomará el valor de 2*/
            res_motora=2;
        }
        if(opcion.equals("El paciente no demuestra ningún movimiento en respuesta a los estímulos.")){
            /*Si se elige este item, 'res_motora' tomará el valor de 1*/
            res_motora=1;
        }
        
    }//GEN-LAST:event_Respuesta_MotoraActionPerformed

    private void Respuesta_OcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Respuesta_OcularActionPerformed
        /*Se crea un método ActionListener para el combobox Respuesta_Ocular, esto para evaluar la opcion que eliga el usuario
        en cada uno de los items*/
        /*Se crea una variable 'opcion', la cual almacenará el texto del item, esto se hará llamando al método getSelectedItem*/      
        String opcion =(String)Respuesta_Ocular.getSelectedItem();
        /*Este conjunto de sentancias if sirve para evaluar cada uno de los casos en el campo Respuesta Ocular*/
        /*En el primer caso, si se elige el item con el siguiente texto*/
        if(opcion.equals("Indica que el paciente abre los ojos espontáneamente, sin necesidad de un estimulo.")){
            /*Si se elige este item, 'res_ocular' tomará el valor de 4*/
            res_ocular=4;
        }
        if(opcion.equals("Indica que el paciente abre los ojos obedeciendo una orden verbal.")){
            /*Si se elige este item, 'res_ocular' tomará el valor de 3*/
            res_ocular=3;
        }
        if(opcion.equals("Indica que el paciente abre los ojos sólo en respuesta a un estímulo doloroso.")){
            /*Si se elige este item, 'res_ocular' tomará el valor de 2*/
            res_ocular=2;
        }
        if(opcion.equals("El paciente no abre los ojos ante ningún estímulo.")){
            /*Si se elige este item, 'res_ocular' tomará el valor de 1*/
            res_ocular=1;
        }
    }//GEN-LAST:event_Respuesta_OcularActionPerformed

    private void Respuesta_VerbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Respuesta_VerbalActionPerformed
        /*Se crea un método ActionListener para el combobox Respuesta_Verbal, esto para evaluar la opcion que eliga el usuario
        en cada uno de los items*/
        /*Se crea una variable 'opcion', la cual almacenará el texto del item, esto se hará llamando al método getSelectedItem*/
        String opcion =(String)Respuesta_Verbal.getSelectedItem();
        /*Este conjunto de sentancias if sirve para evaluar cada uno de los casos en el campo Respuesta Verbal*/
        /*En el primer caso, si se elige el item con el siguiente texto*/
        if(opcion.equals("El paciente se siente bien orientado y puede hablar de manera coherente.")){
            /*Si se elige este item, 'res_verbal' tomará el valor de 5*/
            res_verbal=5;
        }
        if(opcion.equals("El paciente se siente desorientado pero puede hablar de manera coherente.")){
            /*Si se elige este item, 'res_verbal' tomará el valor de 4*/
            res_verbal=4;
        }
        if(opcion.equals("El paciente usa palabras poco apropiadas o lenguaje incoherente.")){
            /*Si se elige este item, 'res_verbal' tomará el valor de 3*/
            res_verbal=3;
        }
        if(opcion.equals("El paciente emite sonidos incomprensibles.")){
            /*Si se elige este item, 'res_verbal' tomará el valor de 2*/
            res_verbal=2;
        }
        if(opcion.equals("El paciente no da ninguna respuesta verbal.")){
            /*Si se elige este item, 'res_verbal' tomará el valor de 1*/
            res_verbal=1;
        }
    }//GEN-LAST:event_Respuesta_VerbalActionPerformed

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
    /*Este es el ActionListener del botón del botón OK, este botón lo hice con el propósito de que se ejecute la evaluación
        sólo couando el usuario esté seguro de que las opciones que eligió son las correctas*/
    /*Este bloque de istrucciones sirven para evaluar a qué nuevo panel se enviará al usuario*/
    /*En primier lugar se realizará la suma que contenderá todos los valores que hayan tomado las variables para evaluar
    las respuestas motora, verbal y ocular, este resultado se almacenará en la variable 'total'*/
        total=res_motora+res_ocular+res_verbal;
        /*Si la variable 'total' toma valores en un rango mayor a 3 y menor a 8, entonces significa que el paciente tiene un
        traumatismo grave, para este caso se abrirá un nuevo panel de la clase Trauma_Grave*/
        if(total>=3&&total<=8){
            Trauma_Grave traumag = new Trauma_Grave();
            traumag.setSize(600,750);
            Panel_Cambiar.removeAll();
            Panel_Cambiar.add(traumag);
            Panel_Cambiar.revalidate();
            Panel_Cambiar.repaint();
            
        }
        /*Si la variable 'total' toma valores en un rango mayor  o igual a 9 y menor  o igual a 12, entonces significa que el
        paciente tiene un traumatismo moderado, para este caso se abrirá un nuevo panel de la clase Trauma_Moderado*/
        if(total>=9&&total<=12){
            Trauma_Moderado traumam = new Trauma_Moderado();
            traumam.setSize(600,750);
            Panel_Cambiar.removeAll();
            Panel_Cambiar.add(traumam);
            Panel_Cambiar.revalidate();
            Panel_Cambiar.repaint();
        }
        /*Si la variable 'total' toma valores en un rango mayor  o igual a 13, entonces significa que elpaciente tiene un
        traumatismo leve, para este caso se abrirá un nuevo panel de la clase Trauma_*/
        if(total>=13){
            Trauma_Leve traumal = new Trauma_Leve();
            traumal.setSize(600,750);
            Panel_Cambiar.removeAll();
            Panel_Cambiar.add(traumal);
            Panel_Cambiar.revalidate();
            Panel_Cambiar.repaint();
        }   
    }//GEN-LAST:event_OKActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OK;
    private javax.swing.JPanel Panel_Cambiar;
    private javax.swing.JComboBox<String> Respuesta_Motora;
    private javax.swing.JComboBox<String> Respuesta_Ocular;
    private javax.swing.JComboBox<String> Respuesta_Verbal;
    private javax.swing.JButton Volver;
    // End of variables declaration//GEN-END:variables
}
