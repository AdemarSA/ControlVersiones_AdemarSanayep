/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlversiones_ademarsanayep;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


/**
 *
 * @author HP
 */
public class ControlVersiones_AdemarSanayep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        // Establecer el estilo visual del sistema operativo
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }

        // Mostrar el formulario en el hilo de la interfaz gráfica
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEstudiante().setVisible(true);
            }
        });
    }
    
}
