import javax.swing.JOptionPane;
public class soccerteam
{
    public static void main(String[] args)
    {
        final int MIN_PLAYERS = 9; //min players per team
        final int MAX_PLAYERS = 15; // max players per team 
        int players; // num of avaliable players
        int teamSize; // num of players per teams
        int teams;// num of teams 
        
        int leftOver; //num of leftover players
        String input; // to hold user input 
        
        //Get the number of players per team
        input = JOptionPane.showInputDialog("enter the number of " + "players per team.");
        
        teamSize = Integer.parseInt(input);
        
        //validate the number entered 
        while (teamSize < MIN_PLAYERS || teamSize > MAX_PLAYERS)
        {
            input = JOptionPane.showInputDialog("the number must " + "be at least " + MIN_PLAYERS + "and no more than " + MAX_PLAYERS + ".\nEnter " + "the number of players.");
            teamSize = Integer.parseInt(input);
        }
        
        //get the number of availiable players 
        input = JOptionPane.showInputDialog("enter the available " + "number of players.");
        players = Integer.parseInt(input);
        
        //validate number entered
        while (players < 0)
        {
            input = JOptionPane.showInputDialog("enter 0 or " + "greater.");
            players = Integer.parseInt(input);
        }
        //calculate number of teams 
        teams = players / teamSize;
        
        //calculate number of leftover players
        leftOver = players % teamSize;
        
        //display results 
        JOptionPane.showMessageDialog(null, "there will be " + teams + "teams with " + leftOver + "players left over.");
        
        System.exit(0);
        
    }
    
}