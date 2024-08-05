using System;
class ArrrayMerge {
  static void Main() {
      int[] arr1={10,2,6};
      int[] arr2={9,3,5};
      
      int[] arr3= new int[arr1.Length + arr2.Length];
      
      int k=0;
      foreach(int i in arr1){
          arr3[k]=i;
          k++;
      }
      
      foreach(int i in arr2){
          arr3[k]=i;
          k++;
      }
      
      Array.Sort(arr3);
      foreach(int i in arr3){
          Console.Write(i + " ");
      }
  }
}