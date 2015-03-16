/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import crossword.Grid;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
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
    private DefinitionView defView;
    private GridBagConstraints cont;

    public PrincipalView(Grid g) {
        grid = g;
        menu = new JMenu("menu");
        try_again = new JMenuItem("Try Again");
        export = new JMenuItem("Export");
        principalpanel = new JPanel();
        barmenu = new JMenuBar();
        try_again.addActionListener(this);
        export.addActionListener(this);

        cont = new GridBagConstraints();
        cont.fill = GridBagConstraints.BOTH;
        principalpanel.setLayout(new GridBagLayout());
        init();
        this.repaint();
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public void init() {
        gridView = new GridView(grid);
        defView = new DefinitionView(grid);
        menu.add(try_again);
        menu.add(export);
        barmenu.add(menu);
        cont.gridx = 1;
        cont.gridy = 1;
        cont.gridwidth = 1;
        this.addMouseListener(gridView);
        this.addKeyListener(gridView);
        gridView.paintImmediately(0, 0, gridView.getWidth(), gridView.getHeight());
        principalpanel.add(gridView, cont);

        cont.gridwidth = 1;
        cont.gridx = 2;
        principalpanel.add(defView, cont);

       // principalpanel.repaint();
        principalpanel.validate();
        this.setContentPane(principalpanel);
        this.setJMenuBar(barmenu);

        //this.repaint();
        this.setPreferredSize(new Dimension(1200, 700));
        //this.pack();
        //this.validate();

        this.setName("CrossWord :");
        this.setTitle("CrossWord");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (e.getSource() == try_again) {
            for (int i = 0; i < grid.getSize(); i++) {
                for (int j = 0; j < grid.getSize(); j++) {
                    grid.getSquareTable()[i][j].setLetterActual(' ');
                }
            }
            this.setVisible(false);
            this.getContentPane().removeAll();
            grid = crossword.Crossword.try_generate();
            init();

            this.repaint();
            this.pack();
            this.setVisible(true);
        }
        if (e.getSource() == export) {
            BufferedImage bi = new BufferedImage(principalpanel.getSize().width, principalpanel.getSize().height, BufferedImage.TYPE_INT_ARGB);
            Graphics g = bi.createGraphics();
            principalpanel.paint(g);  //this == JComponent
            g.dispose();
            try {
                ImageIO.write(bi, "png", new File("test.png"));
            } catch (IOException ex) {

            }

        }
    }
}
