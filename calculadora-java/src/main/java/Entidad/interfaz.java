package Entidad;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;

public class interfaz extends JPanel implements ActionListener {

    //numers
    private final List<JButton> keyPat = new ArrayList();

    private final int L_HEIGHT = 500;
    private final int L_WIDTH = 500;

    public interfaz() {
        setPreferredSize(new Dimension(L_WIDTH, L_HEIGHT));
        numericKeypat();
    }

    public void numericKeypat() {
       
    }

    private void createButtons() {
         for (int i = 0; i < 24; i++) {
            keyPat.add(createButton());
        }
    }

    private JButton createButton() {
        JButton boton = new JButton();
        boton.setSize(50, 50);
        return boton;
    }

    public static void main(String[] args) {
        interfaz x = new interfaz();

        x.createButton();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
