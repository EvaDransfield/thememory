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

    public class CardView {
    boolean showing;// true of false if the hiden card is showing
    String back; // the hiden symbol at the back of the card
    int front; //The font of the card 
    //private String symbol;
    
    
    
    // constractor 
    public CardView(String theBack, int theFront)
    {
        showing=false; // hidden symbole showing the back
        back=theBack;
        front=theFront;
    }
    //private final MemoryGame cardControll = new MemoryGame(); 

   // CardView() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }
   
    public void showCard()
    {
        if (showing)
        System.out.print(String.format("%10s",back));
         else
        System.out.print(String.format("%10s","["+front+"]"));
    
    }
    public void setShowingStatus()// this method flips the card from showing to not showing
    {
        if (showing)
        showing=false;
        
        else 
       showing = true;

    }
    
}
