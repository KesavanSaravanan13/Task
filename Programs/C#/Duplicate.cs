using System;
class Duplicate
{
  static void Main ()
  {
	Console.Write ("Enter String Input: ");
	string input = Console.ReadLine ();
	string output="";
	for(int i=0;i<input.Length;i++){
	    if(!output.Contains(input[i])){
	        output+=input[i];
	    }
	}
	Console.Write(output);
  }
}