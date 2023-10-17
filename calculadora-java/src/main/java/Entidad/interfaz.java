package Entidad;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;


public class interfaz extends JPanel {
    private JButton  boton;
    private final int L_HEIGHT = 500;
    private final int L_WIDTH = 500;
    
    public interfaz(){
        setPreferredSize(new Dimension(L_WIDTH, L_HEIGHT));
        teclado();
    }
    
    public void teclado(){
        boton = new JButton();
        
        
    }
}
