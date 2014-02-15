/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

/**
 *
 * @author Mpianatra
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Card cardBoardd= new Card("jnj",1);
      cardBoardd.showCard();
      MemoryGame gameBooard= new MemoryGame();
      gameBooard.playGame();
        // TODO code application logic here
    }
    
}
