import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class Ship
{
    public int size;
    public int X_coordinate;
    public int Y_coordinate;
    public boolean isBroken = false;
    public boolean isVertical = false;
    HashMap<Integer, Integer> avaliableShips;
    BattleField battleField = new BattleField();

   public Ship()
    {

        this.battleField = new BattleField();

        avaliableShips = new HashMap<>();
        avaliableShips.put(4,1);
        avaliableShips.put(3,2);
        avaliableShips.put(2,3);
        avaliableShips.put(1,4);


    }
    public void InitializeShip()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ship size : ");
        this.size = scanner.nextInt();
        System.out.print("Enter x coordinate : ");
        this.X_coordinate = scanner.nextInt();
        System.out.println("Enter y coordinate : ");
        this.Y_coordinate = scanner.nextInt();
        System.out.println("Is your Ship position vertical ? : ");
        this.isVertical = scanner.nextBoolean();

    }
    public boolean canPlaceShip(int size)
    {
     return avaliableShips.getOrDefault(size,0)>0;
    }
    public void placeShip()
    {
        battleField.Initialize();
        battleField.OutputBattleField();




        Scanner scanner = new Scanner(System.in);


        System.out.println("Paste your ships on the battlefield ");
        int iterator = 0;

        while(iterator <10)
        {
            InitializeShip();
            if(canPlaceShip(size))
            {

                if (X_coordinate<12&&Y_coordinate<12)
                {
                    if (X_coordinate+size<12&&Y_coordinate+size<12)
                    {
                        if (isVertical)
                        {
                            for (int i = X_coordinate; i < X_coordinate + size; i++) {
                                battleField.fieldArr[i][Y_coordinate] = "[S] ";
                            }

                        }
                        else
                        {
                            for (int i = Y_coordinate; i<Y_coordinate+size; i++ )
                            {
                                battleField.fieldArr[X_coordinate][i] = "[S] ";
                            }
                        }
                        System.out.println("You have successfully placed ship!");


                    }
                    else
                    {
                        System.out.println("You cannot place Ship here. Try again!");
                    }


                }
                avaliableShips.put(size,avaliableShips.get(size)-1);
                battleField.OutputBattleField();




            }
            else
            {
                System.out.println("You cannot use this type of Ship anymore. Choose another lenth. ");
            }
            iterator++;


        }







    }



}
