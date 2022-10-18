/*Galván Rodríguez Esteban*/
/*31/01/2021*/
/*Programa para evaluar la escala de Glasgow*/
/*Se importan los paquetes awt,io,net,util para poder accesar a sitios web*/
/*Este es el panel que se usará en caso de que haya un traumatismo grave*/
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Trauma_Grave extends javax.swing.JPanel {
    /*Método constructor*/
    public Trauma_Grave() {
        initComponents();
    }/*Fin del método constructor*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Menu_Principal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelLink = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Trauma Grave");

        Menu_Principal.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Menu_Principal.setText("Menú Principal");
        Menu_Principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_PrincipalActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(250, 250, 250));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dirijase al siguiente link para buscar hospitales en toda la CDMX");

        jLabelLink.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabelLink.setForeground(new java.awt.Color(250, 250, 250));
        jLabelLink.setText("https://www.google.com/maps/search/Hospitales+en+la+ciudad+de+m%C3%A9xico/@19.320069,-99.1526173,10z/data=!3m1!4b1");
        jLabelLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLinkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Menu_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabelLink, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabelLink, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 410, Short.MAX_VALUE)
                .addComponent(Menu_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_PrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_PrincipalActionPerformed
        /*Implementación de un ActionListener para el botón Menu_Principal*/
        /*Si el usuario así lo desea, al presionar el botón, se creará un panel de la clase Inicio, llamado 'inicio', esto
        para regresar al usuario al menú principal y poder volver  a usar la aplicación desde el principio, con un tamaño de
        600 por 750 píxeles, añadiendo el panel 'inicio' al panel Trauma_Grave*/
        Inicio inicio = new Inicio();
        inicio.setSize(600,750);
        removeAll();
        add(inicio);
        revalidate();
    }//GEN-LAST:event_Menu_PrincipalActionPerformed

    private void jLabelLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLinkMouseClicked
    /*Para este panel, usé un método MouseClicked, este método servirá para que, al hacerse click en una etiqueta, ésta
        lleve al usuario a una página web, específicamente a google maps, en la sección de "Hospitales de la ciudad de México"*/    
        try {
        /*Este blóque de código sirve para agregar un link a un JLabel*/
            Desktop.getDesktop().browse(new URI(jLabelLink.getText()));
        } catch (URISyntaxException ex) {
            Logger.getLogger(Trauma_Grave.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Trauma_Grave.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabelLinkMouseClicked
/*El botón 'Menú_Principal' sirve para que el usuario pueda volver a la pantalla principal y usar la aplicación desde el inicio*/
/*La primer etiqueta sirve para indicar en pantalla que se trata de un traumatismo grave*/
/*la segunda etiqueta sirve para indicarle al usuario que debe dirigirse al link para buscar hospitales cercanos*/
/*La tercer etiqueta sirve para pegar el link de google maps*/    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Menu_Principal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelLink;
    // End of variables declaration//GEN-END:variables
}
