using System;
class CopyArr {
  static void Main() {
      Console.WriteLine("No.of Elements:");
      int n=Convert.ToInt32(Console.ReadLine());
      int[] a=new int[n];
      Console.WriteLine("Enter the elements:");
      int[] a=new int[n];
      for(int i=0;i<n;i++){
          a[i]=Convert.ToInt32(Console.ReadLine());
      }
      int j=0;
      foreach(int x in arr){
          a[j]=x;
          j++;
      }
      Console.WriteLine(string.Join(", ",a));
  }
}