/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygame;

import java.util.Scanner;

/**
 *
 * @author Mpianatra
 */
public class Memorygame {
    private static Player[] playerList;
    String name;
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Memorygame myGame= new Memorygame();
        myGame.getName();
        MainMenuView mainMenu= new MainMenuView();
        mainMenu.getInput();
     /* CardView cardBoardd= new CardView("jnj",1);
      cardBoardd.showCard();*/
     // cardBoardd.setShowingStatus();
      /*CardControl gameBooard= new CardControl();
      gameBooard.playGame();
      gameBooard.setCells();
      gameBooard.printCells();*/}
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
        System.out.println("-----------------------------------------------");
        System.out.println("Memory is the name of this game! \n\n"
            + "The purpose of the game is to clear the board of all cards \n\n"
            + "by matching each card with its \"twin\" when the board is \n\n"
            + "clear, the game is over. Good Luck! \n\n");
    }
    
        
        public static void setPlayerList(Player[] playerList) {
        Memorygame.playerList = playerList;
    
     
    }
}

