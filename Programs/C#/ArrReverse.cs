using System;
class ArrReverse {
  static void Main() {
      Console.WriteLine("No.of Elements:");
      int n=Convert.ToInt32(Console.ReadLine());
      Console.WriteLine("Enter the elements:");
      char[] a=new char[n];
      for(int i=0;i<n;i++){
          a[i]=Convert.ToChar(Console.ReadLine());
      }
      
      Array.Reverse(a);
      Console.WriteLine(new string(a));
  }
}