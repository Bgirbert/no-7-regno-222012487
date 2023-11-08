
class a{
    void couta()
{
    System.out.println("grade");
}
} 
class b extends a {
void print()
{
    System.out.println("excellence");
}
}  
 class c extends b{
   void hey(){
    System.out.print("hello world");
   }
 }


public class execiseinh {
    public static void main(String[]args){
   b Obj = new b();
   a ft = new a();
   c gh = new c();
   Obj.print();
   ft.couta();
   gh.hey();
   } 
}


