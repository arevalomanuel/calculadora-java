package Entidad;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;

public class interfaz extends JFrame{
    //numers
    JButton keyPat[] ;

    public interfaz() {
         createButtons();
    }
    
    private void createButtons() {
        this.setSize(500, 500);
        this.setTitle("man");
        this.setLayout(null);
//       setResizable(false);
//        pack();
        
        String vecT[]= {"1","2","3","4","5","6","5","8","9","+","-","*","=","/"};

        keyPat = new JButton[vecT.length];

        int xy = 0;
        int cont = 0;
        
         for (int i = 0; i < keyPat.length; i++) {
            keyPat[i] = new JButton();
            keyPat[i].setText(vecT[i]);
            keyPat[i].setBounds(100*cont, xy, 90, 30);
            this.getContentPane().add(keyPat[i]);
            cont = cont + 1;
            
             if (cont == 4) {
                 xy = xy + 100;
                 cont = 0;
             }
            
        }
    }

//    private JButton createButton() {
//        JButton boton = new JButton();
//        boton.setSize(new Dimension(100,100));
////        xLit = xLit + 100;
////        yLit = yLit + 100;
//        return boton;
//    }

    public static void main(String[] args) {
        interfaz x = new interfaz();
        
        x.setVisible(true);
    }

 
}
