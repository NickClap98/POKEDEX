/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokedexapp;

import pokedexapp.Igu.Pokedex_Inicio;

/**
 *
 * @author Nicolas
 */
public class POKEDEXapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        
         ImportEstilos();

        // Crear y mostrar el formulario Login
        java.awt.EventQueue.invokeLater(() -> {
            new Pokedex_Inicio().setVisible(true);
        });
        
    }
      private static void ImportEstilos() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
}
