package memorygame;

/**
 * @author KenandEva
 * this class creates our Player Object, kind of like the little silver pieces 
 * used to mark a player on the board in Monopoly
 */

// Eva's individual assignment lesson 3


public class Player {// this class should be PlayerScore
    
    public Player(){
        this.getWinningScore(15, true);
        System.out.println("-------------------------------------------");
    
        this.getTotalPoints();
        System.out.println("-------------------------------------------");
         System.out.println("-------------------------------------------");
        
    }
        public String name;
    
        double startingPoints=115.00;
        int gameMove;
        boolean cards;// true if cards matches, false if not.
    
          
        public void getWinningScore(int gameMove, boolean cards){
        
            int score= (int) (startingPoints)-gameMove;// cast double to int
                    if ((cards==true)&&(gameMove==15)){
            System.out.println("you win perfect score!: " +score+" points\n");
            }
            else if  ((cards==true) && (gameMove<115)){
                System.out.println("you win  "+score+" points\n");
            }
                
            else if((cards==false) && (gameMove==115)){
                System.out.println("you loose! "+ score+" points\n");
            }
            else if((cards==true) && (gameMove<=0)){
                System.out.println("invalid input\n");
            }
            else if((cards==false) && (gameMove>115)){
                System.out.println("invalid input\n");
            }
                    
        }
        
        //Michele's Week 6 individual Assignment (collects and totals a players points)
        public void getTotalPoints() {
        
            int points[] = {100, 115, 89, 60, 77, 26, 115};
            int sum = 0;
        
            for(int p : points) {
                System.out.println("\n\tGame Points are: " + p);
                sum += p;
            }
            System.out.println("\n\tTotal Player Points are: " + sum);
        }
}
