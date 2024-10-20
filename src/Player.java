public class Player
{
    public String name;
    public BattleField battleField = new BattleField();
    public Ship ship = new Ship();
    public void Player(String n, BattleField battleField, Ship ship)
    {
        this.name = n;
        this.battleField = battleField;
        this.ship = ship;
    }
    public void setName(String Name)
    {
        this.name = Name;
    }


}
