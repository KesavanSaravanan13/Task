using System;
class AddMatrixRow
{
    static void Main()
    {
        int[,] a ={
          {1,2,3},
          {4,5,6},
          {7,8,9}
      };
        for (int i = 0; i < a.GetLength(0); i++)
        {
            int temp = 0;
            for (int j = 0; j < a.GetLength(1); j++)
            {
                temp += a[i, j];
            }
            Console.WriteLine($"Sum of Row {i + 1} : {temp}");
        }
    }
}
