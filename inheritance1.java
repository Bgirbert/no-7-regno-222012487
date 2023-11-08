     // base class
class A extends B implements E{
    void printa(){
        System.out.println("this is class A draw");
    }
    public void printe(){
    System.out.println("this is  interface");
}   
 }
  // derived class 
class B extends C {
    void printb() {
        System.out.println("this is class B draw");
    }
}
  // derived class
class C extends D{
    void printc(){
        System.out.println("this is class C draw");
    }
}
   // class
class D{
    void printd(){
        System.out.println("this is class D draw");
    }
}
   // define interfce
  interface E{
    void printe();
  }
public class inheritance1{ 
public static void main(String[]args){
   A Obj = new A();
   Obj.printa();
   Obj.printb();
   Obj.printc();
   Obj.printd();
   Obj.printe();
 }
}
  /**
   *   the output
   * this is class A draw
   * this is  interface
   * this is class B draw
   * this is class C draw
   * this is class D draw
    */  
