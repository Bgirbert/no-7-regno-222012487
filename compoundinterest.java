public class compoundinterest{ //this program is going to calculate compound interest
 static double compound(double p, double r, double n,int t){ // variable declaration
   return p*(Math.pow(((1+((r/100)/n))),t*n));  // the formula to colculate the CI
}

public static void main(String[]args){   // the main method
compoundinterest k =new compoundinterest();
double result = k.compound(500000,18,12,3);
System.out.println("compound interest:"+" "+result);   // this generate the output of compound interest
}
}    
