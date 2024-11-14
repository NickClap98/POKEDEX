/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pokedexapp.Igu;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas Etchevarne
 */
public class Pokedex_Inicio extends javax.swing.JFrame {
// ARREGLO PARA CAMBIAR LA IMAGEN DEL POKEMON
    static String[] Poke = new String[4];
   
    /*VARIABLE PARA USAR LA LIBRERIA RANDOM Y VAR_OLD PARA COMPARAR
    LA VARIABLE ANTERIOR CON LA VARIABLE NUEVA (VAR)
    */
    static int var = 0;
    static int var_old;

   
    
    
    public Pokedex_Inicio() {
        
        //RUTAS DE LAS IMAGENES
        Poke[0] = "/pokedexapp/resource/POKEBALL.png";
        Poke[1] = "/pokedexapp/resource/PIKACHU.png";
        Poke[2] = "/pokedexapp/resource/BOLBAZUR.png";
        Poke[3] = "/pokedexapp/resource/CHAMANDER.png";

        initComponents();
        this.setLocationRelativeTo(this);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_cambiar = new javax.swing.JButton();
        btn_Obtener = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        PokemonImage = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POKEDEX");
        setAlwaysOnTop(true);
        setName("POKEDEX"); // NOI18N
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokedexapp/resource/Templete_POKE.jpg"))); // NOI18N

        jPanel1.setOpaque(false);

        btn_cambiar.setBackground(new java.awt.Color(255, 255, 255));
        btn_cambiar.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btn_cambiar.setForeground(new java.awt.Color(0, 0, 0));
        btn_cambiar.setText("CAMBIAR");
        btn_cambiar.setBorder(null);
        btn_cambiar.setContentAreaFilled(false);
        btn_cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambiarActionPerformed(evt);
            }
        });

        btn_Obtener.setBackground(new java.awt.Color(255, 255, 255));
        btn_Obtener.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btn_Obtener.setForeground(new java.awt.Color(0, 0, 0));
        btn_Obtener.setText("ATRAPAR");
        btn_Obtener.setBorder(null);
        btn_Obtener.setBorderPainted(false);
        btn_Obtener.setContentAreaFilled(false);
        btn_Obtener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ObtenerActionPerformed(evt);
            }
        });

        txt_nombre.setEditable(false);
        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombre.setText("POKEBALL");
        txt_nombre.setBorder(null);
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        PokemonImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokedexapp/resource/POKEBALL.png")));
        PokemonImage.setPreferredSize(new java.awt.Dimension(100, 100));

        area.setEditable(false);
        area.setColumns(20);
        area.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        area.setForeground(new java.awt.Color(0, 0, 0));
        area.setRows(5);
        area.setText("PERFECTA PARA ATRAPAR POKEMONES DE TODOS LOS COLORES Y TIPOS");
        area.setBorder(null);
        txt_descripcion.setViewportView(area);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PokemonImage, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addComponent(btn_cambiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Obtener, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btn_cambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Obtener, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(PokemonImage, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ObtenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ObtenerActionPerformed
      
        //SI ESTA EN LA POKEBOLA QUE NO SE EJECUTE Y QUE TIRE MENSAJE DE ALERTA
        if(var>0){
        
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        area.setText("");
        area.append("TE HAZ ENCONTRADO CON UN " + txt_nombre.getText()+" SALVAJE");
// RUNNEBLE TASK ---> SON TAREAS QUE SE EJECUTAN EN UN TIEMPO ESPECIFICO
        Runnable task = () -> area.append(".");
        scheduler.schedule(task, 1, TimeUnit.SECONDS);
        scheduler.schedule(task, 2, TimeUnit.SECONDS);
        scheduler.schedule(task, 3, TimeUnit.SECONDS);
        scheduler.schedule(task, 4, TimeUnit.SECONDS);
        scheduler.schedule(task, 5, TimeUnit.SECONDS);
        Random Chances = new Random();
        int Chances_var = Chances.nextInt(4)+1;
        
        //50% DE CHANCES PARA ATRAPARLO O NO
        if(Chances_var>=3){
        Runnable felicitar = () -> area.setText("ATRAPADO");
        scheduler.schedule(felicitar, 8, TimeUnit.SECONDS);
        Runnable felicitar2 = ()-> area.setText("FELICIDADES POR ATRAPAR A "+txt_nombre.getText()+" ES HORA DE SALIR A PELEAR\nPOR EL MUNDO");
        scheduler.schedule(felicitar2, 10, TimeUnit.SECONDS);
        scheduler.shutdown();
        }else{
        Runnable Malasuerte = () -> area.setText("CASIII... INTENTALO DENUEVO");
             scheduler.schedule(Malasuerte, 8, TimeUnit.SECONDS);
     
          
        }
        } else{
       
       
           JOptionPane.showMessageDialog(rootPane, "ELIGE UN POKEMON");
       
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ObtenerActionPerformed

    private void btn_cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiarActionPerformed
       //SI EL PROXIMO RANDOM NUM QUE SE ALMACENA EN LA VARIABLE (VAR) ES IGUAL AL ANTERIOR 
       // QUE SE EJECUTE DENUEVO HASTA QUE CAMBIE
        
        area.setText("");
        var_old = var;
        Random rd = new Random();

        var = rd.nextInt(3) + 1;
        while (var_old == var) {

            var = rd.nextInt(3) + 1;

        }

      
        switch (var) {
            case 0 ->
                System.out.println("Pokeball");
            case 1 ->
                txt_nombre.setText("PIKACHU");
            case 2 ->
                txt_nombre.setText("BOLBAZUR");

            default ->
                txt_nombre.setText("CHAMANDER");
        }

        PokemonImage.setIcon(new javax.swing.ImageIcon(getClass().getResource(Poke[var])));
        switch (var) {
            case 0 ->
                System.out.println("Pokeball");
            case 1 ->
                area.append("POKEMON DE TIPO ELECTRICO BUEN POKEMON \nPARA QUE TE ACOMPAÑE "
                        + "EN TUS AVENTURAS ... \nQUIEN NO QUIERE UN PIKACHU?");
            case 2 ->
                area.append("POKEMON DE TIPO PLANTA BUEN POKEMON \nPARA QUE TE ACOMPAÑE "
                        + "EN TUS AVENTURAS DEBIL ANTE TIPO FUEGO\nFUERTE CONTRA ROCA");

            default ->
                area.append("POKEMON DE TIPO FUEGO BUEN POKEMON \nPARA QUE TE ACOMPAÑE "
                        + "EN TUS AVENTURAS DEBIL ANTE TIPO AGUA\nFUERTE CONTRA TIPO PLANTA");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cambiarActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

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
            java.util.logging.Logger.getLogger(Pokedex_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pokedex_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pokedex_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pokedex_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pokedex_Inicio().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PokemonImage;
    private javax.swing.JTextArea area;
    private javax.swing.JButton btn_Obtener;
    private javax.swing.JButton btn_cambiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane txt_descripcion;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables

    public static String[] getPoke() {
        return Poke;
    }

    public static void setPoke(String[] Poke) {
        Pokedex_Inicio.Poke = Poke;
    }

}
