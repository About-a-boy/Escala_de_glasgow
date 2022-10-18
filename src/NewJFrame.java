/*Galván Rodríguez Esteban*/
/*31/01/2021*/
/*Programa para evaluar la escala de Glasgow*/
public class NewJFrame extends javax.swing.JFrame {
    /*Primero se crea una nueva ventana, la cual servirá para mostrar todos los páneles que se usarán en la aplicación*/
    /*Se crea el método constructor del frame*/
    public NewJFrame() {
        /*Se llama al método intiComponents, el cual incicializa todos los atributos del frame e implementa sus compoonentes*/
        initComponents();
        /*Se inicializa el frame con un panel llamado 'nuevo', de la clase Inicio*/
        Inicio nuevo = new Inicio();
        /*Se inicializa el panel 'nuevo' con un tamaño inicial de 600 por 750 píxeles, llamando al método setSize*/
        nuevo.setSize(600,750);
        /*Se invoca al método add para añadir el panel al frame*/
        Panel_de_ventana.add(nuevo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_de_ventana = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(700, 200));
        setResizable(false);

        Panel_de_ventana.setBackground(new java.awt.Color(51, 102, 255));
        Panel_de_ventana.setPreferredSize(new java.awt.Dimension(550, 750));

        javax.swing.GroupLayout Panel_de_ventanaLayout = new javax.swing.GroupLayout(Panel_de_ventana);
        Panel_de_ventana.setLayout(Panel_de_ventanaLayout);
        Panel_de_ventanaLayout.setHorizontalGroup(
            Panel_de_ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
        );
        Panel_de_ventanaLayout.setVerticalGroup(
            Panel_de_ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
        );

        getContentPane().add(Panel_de_ventana, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    /*Se le agrega un nuevo panel al frame de la clase JPanel, este panel servirá como el 'menú de la aplicación'*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Panel_de_ventana;
    // End of variables declaration//GEN-END:variables
}
