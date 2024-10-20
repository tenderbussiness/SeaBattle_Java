public class BattleField
{
    String[][]fieldArr = new String[12][12];
    public void Initialize()
    {
      for (int i = 0; i < 12; i++)
      {
          for (int j = 0; j < 12; j++)
          {
              fieldArr[i][j] = "[~] ";
          }
      }

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
