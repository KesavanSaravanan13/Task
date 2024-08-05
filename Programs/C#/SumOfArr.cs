using System;
class SumOfArr {
  static void Main() {
      int result=0;
      Console.WriteLine("No.of Elements:");
      int n=Convert.ToInt32(Console.ReadLine());
      Console.WriteLine("Enter the elements:");
      int[] a=new int[n];
      for(int i=0;i<n;i++){
          a[i]=Convert.ToInt32(Console.ReadLine());
      }
      foreach(int x in a){
          result+=x;
      }
      Console.WriteLine(result);
  }
}