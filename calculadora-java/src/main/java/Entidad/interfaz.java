package Entidad;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public final class interfaz extends JFrame {

    //numers
    JButton keyPat[];
    JTextField cajaDeTexto;
    JPanel panel;

    public interfaz() {
        createButtons();
    }

    private void createButtons() {
        this.setSize(500, 500);
        this.setTitle("man");
        this.setLayout(new GridLayout(2, 1));

        cajaDeTexto = new JTextField();
        cajaDeTexto.setSize(100, 200);
//        cajaDeTexto.setLayout(new GridLayout(1,0));
        this.add(cajaDeTexto);
        panel = new JPanel();
        panel.setLayout(new GridLayout(4,1));
        
        String vecT[] = {"1", "2", "3", "4", "5", "6", "5", "8", "9", "+", "-", "*", "=", "/", ",", "R"};
        keyPat = new JButton[vecT.length];


        for (int i = 0; i < keyPat.length; i++) {
            keyPat[i] = new JButton();
            keyPat[i].setText(vecT[i]);
            keyPat[i].setSize(90, 30);
            panel.add(keyPat[i]);
        }
        this.getContentPane().add(panel);
    }

    public static void main(String[] args) {
        interfaz x = new interfaz();

        x.setVisible(true);
    }

}
