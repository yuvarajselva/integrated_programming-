import java.util.*;
import java.io.*;
class Shop extends price
{
	int val;

	int ch;
	static int tot;
public void list()
{
do{
	System.out.println("List of items available:\n1. Soap\n2.Face Cream\n3.Paste\n4 Shampoo\n");
Scanner scan=new Scanner(System.in);
val=scan.nextInt();
amount();
System.out.println("Do you want to continue?\n1.Yes\n2.No\n");
ch=scan.nextInt();
}while(ch!=2);
}
public void amount()
{
pricelist();
int n=val-1;
tot=tot+p[n];
	System.out.println("Total amount is:"+tot+"\n");
}
}
class price
{
	int p[]=new int[5];
public void pricelist()
{
p[0]=35;
p[1]=150;
p[2]=55;
p[3]=80;
p[4]=250;
}
}
public class Storems extends Shop
{
	public static void main(String args[])
	{
	Shop obj=new Shop();
	obj.list();
	}
}
