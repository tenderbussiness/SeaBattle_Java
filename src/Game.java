import java.io.Console;
import java.util.Scanner;

public class Game
{
Player p1 = new Player();
Player p2 = new Player();


   public void startGame()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first player name : ");
        p1.name = scanner.nextLine();
        System.out.println("Enter second player name : ");
        p2.name = scanner.nextLine();
        BattleField battleField = new BattleField();
        Ship ship = new Ship();
        ship.placeShip();



    }


}
