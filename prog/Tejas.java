class Sample5
{int x=30;
}
class Demo5 extends Sample5
{
int y=10;
}
class Cool5 extends Demo5
{
	int z=20;
}
class Tester5 extends Sample5
{
	void disp()
	{
		System.out.println("hi");
	}
}
class Tejas
{
	public static void main(String[]args)
	{
	Cool5 t5=new Cool5();
	System.out.println("**m,ain starts**");
	System.out.println("x value is"+t5.x);
	System.out.println("y value is"+t5.y);
	System.out.println("z value is"+t5.z);
	System.out.println("** main end**");
	Tester5 t4=new Tester5();
	t4.disp();
	}
	
}