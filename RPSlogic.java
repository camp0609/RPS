/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rps.logic;

import java.util.Random;

/**
 *
 * @author collincampbell
 */
public class RPSlogic {
    private Random random;
    private int drawnNumber; // Draw random number 1-3 to decide computers move 
    
    public RPSlogic() {
        this.random = new Random();
        
    }
    
    public void draw() {
        drawnNumber = random.nextInt(3) + 1;
    }
    
    public int getDraw() {
        return drawnNumber;
    }
    
    // use this method to reduce repetition in ClickListener
    public String compPlays() {
        String compPlays = "";
        if (drawnNumber == 1) {
            compPlays = "Computer plays scissors, ";
        } else if (drawnNumber == 2) {
            compPlays = "Computer plays paper, ";
        } else {
            compPlays = "Computer plays rock, ";
        }
        return compPlays;
    } 
}
