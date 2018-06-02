/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rps.ui;

import rps.logic.RPSlogic;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

/**
 *
 * @author collincampbell
 */
public class UserInterface implements Runnable {
    private JFrame frame;
    private RPSlogic rps;
    
    public UserInterface(RPSlogic rps) {
        this.rps = rps;
    }
    
    @Override
    public void run() {
        frame = new JFrame("Rock, Paper, Scissors");
        frame.setPreferredSize(new Dimension(300, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
        
    }
    
    public void createComponents(Container container) {
        BorderLayout layout = new BorderLayout();
        container.setLayout(layout);
        JButton rock = new JButton("Rock");
        JButton paper = new JButton("Paper");
        JButton scissors = new JButton("Scissors");
        
        JTextArea text = new JTextArea("Rock, Paper, or Scissors?");
        
        ClickListener action = new ClickListener(paper, rock, scissors, text, rps);
        rock.addActionListener(action);
        paper.addActionListener(action);
        scissors.addActionListener(action);
        container.add(text, BorderLayout.NORTH);
        container.add(rock, BorderLayout.WEST);
        container.add(paper, BorderLayout.CENTER);
        container.add(scissors, BorderLayout.EAST);
        
        
    }
    
    public JFrame getFrame() {
        return frame;
    }
}
