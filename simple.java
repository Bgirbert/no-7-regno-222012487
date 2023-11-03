 class simple { // this program is going to calculate simple interest
 static double gain(int prenciple, double rate,int time){ // vriable declaration
return(prenciple*rate*time)/100; // calculate simple by this formula
 }
 public static void main(String[]args){  // the main method 
    int prenciple=100000; // variable declaration
    double rate=5;           // variable
    int time=5;           // 
    double result=simple.gain(prenciple, rate, time);
    System.out.println("simple interest rate:"+" "+result);  // print out the output
}
}
 
    
    
