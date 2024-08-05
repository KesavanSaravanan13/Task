using System;
class CharCount
{
  static void Main ()
  {
	Console.Write ("Enter String Input: ");
	string input = Console.ReadLine ();
	string temp = "";
	for (int i = 0; i < input.Length; i++)
	  {
		if (temp.IndexOf(input[i])<0)
		  {
		    int count=0;
			for (int j = i; j < input.Length; j++)
			  {
			      if(input[i]==input[j])
                  count++;
			  }
			  temp+=input[i];
			  Console.WriteLine(input[i]+"-"+count);
		  }
	  }
  }
}
