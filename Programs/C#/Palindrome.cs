using System;
class Palindrome
{
  static void Main()
  {

    Console.WriteLine("Enter a string Input:");
    string a = Console.ReadLine();
    string b = null;
    for (int i = a.Length - 1; i >= 0; i--)
    {
      b += a[i];
    }
    if (a == b)
    {
      Console.WriteLine("Given String is palindrome");
    }
    else
    {
      Console.WriteLine("Given String is Not Palindrome");
    }
  }
}