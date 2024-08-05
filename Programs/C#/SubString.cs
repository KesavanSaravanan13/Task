
using System;
class SubString {
  static void Main() {
    Console.Write("Enter Strin Input: ");
    string input=Console.ReadLine();
    for(int i=0;i<input.Length;i++){
        string output="";
        for(int j=i;j<input.Length;j++){
            output+=input[j];
            Console.Write(output+" ");
        }
    }
  }
}