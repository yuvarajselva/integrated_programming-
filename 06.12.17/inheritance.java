import java.util.Scanner;

class input{
  int a,b;
  void input_get(){
    Scanner sc = new Scanner(System.in);
     a = sc.nextInt();
     b = sc.nextInt();
  }
}
class addition extends input{
  void add()
  {
  //  addition add1 = new addition();
    int c = a+b;
    System.out.println(c);
  }
}
public class inheritance
{
  public static void main(String[] args)
  {
    addition add1 = new addition();
    System.out.println("the added value is ");
    add1.input_get();
    add1.add();

  }
}
