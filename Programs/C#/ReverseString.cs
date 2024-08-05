using System;
class ReverseString
{
  static void Main()
  {
    Console.WriteLine("Enter a string Input:");
    string a = Console.ReadLine();
    for (int i = a.Length - 1; i >= 0; i--)
    {
      Console.Write(a[i]);
    }
  }
}