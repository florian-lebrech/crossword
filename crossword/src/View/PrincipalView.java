/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import crossword.Grid;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author julien
 */
public class PrincipalView extends JFrame implements ActionListener {

    private JMenu menu;
    private JMenuItem try_again, export;
    private JPanel principalpanel;
    private JMenuBar barmenu;
    private Grid grid;
    private GridView gridView;

    public PrincipalView(Grid g) {
        grid = g;
        menu = new JMenu("menu");
        try_again = new JMenuItem("Try Again");
        export = new JMenuItem("Export");
        principalpanel = new JPanel();
        barmenu = new JMenuBar();
        try_again.addActionListener(this);
        export.addActionListener(this);
        gridView=new GridView(grid);
        init();

        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void init() {
        menu.add(try_again);
        menu.add(export);
        barmenu.add(menu);

        principalpanel.add(gridView);
        principalpanel.repaint();
        this.setContentPane(principalpanel);
        this.add(barmenu);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
}
