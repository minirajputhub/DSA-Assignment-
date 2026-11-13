// Write the complete argumentFunction below.
// The function should take two arguments a and b
// The function should return a+b

import java.util.*;
class Solution {
 public static int argumentFunction(int a, int b) {
   int sum =  a+b;
   return sum;
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(argumentFunction(a,b));
}
}