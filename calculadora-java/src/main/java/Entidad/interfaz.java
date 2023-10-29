package Entidad;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;


public final class interfaz extends JPanel implements ActionListener{
    //numers
    private JButton  numer_0;
    private JButton  numer_1;
    private JButton  numer_2;
    private JButton  numer_3;
    private JButton  numer_4;
    private JButton  numer_5;
    private JButton  numer_6;
    private JButton  numer_7;
    private JButton  numer_8;
    private JButton  numer_9;
    
    //arimetics operators
    private JButton  operatorDivision;
    private JButton  operatorMore;
    private JButton  operatorMultical;
    private JButton  operadoresLow;
    
    //clear and equals
    private JButton  clearButton;
    private JButton  equalsButton;
    
    
    private final int L_HEIGHT = 500;
    private final int L_WIDTH = 500;
    
    public interfaz(){
        setPreferredSize(new Dimension(L_WIDTH, L_HEIGHT));
         numericKeypat();
    }
    
    public void numericKeypat(){
        boton = new JButton();
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
