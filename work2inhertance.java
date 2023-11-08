 // base class
class A extends B implements E{
    int Add(int y,int x){
        return y+x;
    }
    public double power(double x,double y){
        return Math.pow(x, y);
    }
}
  // derived class 
class B extends C{
    int sub(int x, int y){
        return x-y;
    }
}
  // derivede class extend from d
class C extends D {
    double division(double x, double y){
        return x/y;
    }
}
class D{
  int multiply(int x,int y){
    return x*y;
  }
}
 // difine interface
interface E{
  double power(double x,double y);  
}
public class work2inhertance {
public static void main(String[]args){
 A Obj = new A();
 System.out.println("adding two numbers:"+ " "+Obj.Add(20, 30));
 System.out.println("productof getting subtraction:"+ " "+Obj.sub(40, 10));
 System.out.println("the product from the dividing two numbers:"+" "+Obj.division(100,10));
 System.out.println("multiply the two number and give answer:"+" "+Obj.Addmultiply(5,5));
 System.out.println("get power of 5 on 5:"+" "+Obj.power(5,5));
}
}  /**
   the out put of add is 50
   the out put of subtraction is 30
   the out put of division is 10
   the out put of multiplicatio  is 25
   the out put of power is 3,125
 */