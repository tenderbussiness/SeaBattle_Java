import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class Ship
{
    public int size;
    public int X_coordinate;
    public int Y_coordinate;
    public boolean isBroken = false;
    HashMap<Integer, Integer> avaliableShips;

   public void Ship(int size,int X,int Y)
    {
        this.size = size;
        this.X_coordinate = X;
        this.Y_coordinate = Y;
        avaliableShips = new HashMap<>();
        avaliableShips.put(4,1);
        avaliableShips.put(3,2);
        avaliableShips.put(2,3);
        avaliableShips.put(1,4);

    }
    public boolean canPlaceShip(int size)
    {
     return avaliableShips.getOrDefault(size,0)>0;
    }
    public void placeShip( int size, boolean isVertical, int x, int y )
    {

        Ship ship = new Ship();

        BattleField battleField = new BattleField();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Paste your ships on the battlefield ");

        for ( int i = 0; i<10; i++)
        {
            System.out.print("Choose ship size : ");

        }






    }



}
