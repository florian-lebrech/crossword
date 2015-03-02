/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import crossword.Grid;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author julien
 */
public class CongratulationsPopUp extends JDialog implements ActionListener {
    private JPanel panel=new JPanel();
    private GridBagConstraints cont=new GridBagConstraints();
    private JLabel label = new JLabel(" Congratulations you finished the crossword ! ");
    private JButton valid=new JButton("OK");
    private Grid g;
    public CongratulationsPopUp(Grid grid){
        g=grid;
        cont.fill=GridBagConstraints.BOTH;
        panel.setLayout(new GridBagLayout());
        cont.gridx=0;
        cont.gridy=0;
        cont.gridwidth=2;
        panel.add(label,cont);
        cont.gridwidth=1;
        cont.gridy=1;
        valid.addActionListener(this);
        panel.add(valid,cont);
        this.setContentPane(panel);
        this.pack();
        this.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource()==valid){
            ;
        }
    
    }

    public JButton getValid() {
        return valid;
    }
    
    
    
}
