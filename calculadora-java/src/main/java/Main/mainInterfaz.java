package Main;

import javax.swing.JFrame;
import Entidad.interfaz;
import java.awt.Dimension;

public class mainInterfaz extends JFrame{
    public mainInterfaz(){
        interfaz x = new interfaz();
        
//        this.add();
        setResizable(false);
       this.setBounds( 0, 0,500,500);
        setTitle("Snake");
        setLocationRelativeTo(null);
        this.getContentPane().add(x);
    }
    public static void main(String[] args) {
       mainInterfaz x = new mainInterfaz();
       x.setVisible(true);
    }
}
