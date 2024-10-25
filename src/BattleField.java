public class BattleField
{
    public String[][]fieldArr;

   public BattleField()
   {
       this.fieldArr = new String[12][12];
       Initialize();

   }
    public void Initialize()
    {
      for (int i = 0; i < 12; i++)
      {
          for (int j = 0; j < 12; j++)
          {
              fieldArr[i][j] = "[~] ";
          }
      }

    }
    public void OutputBattleField()
    {
        for (int i = 0; i < 12; i++)
        {
            for (int j = 0; j < 12; j++)
            {
                System.out.print(fieldArr[i][j]);
            }
            System.out.println();
        }
    }




}
