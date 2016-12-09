public class Test04 
{
		public static void main(String[] args) 
		{
			Son son = new Son();
			son.fun();
		}
		class Father
		{
			public void fun()
			{
			System.out.println("void fun()");
			}
		}
}
class Son extends Father
{
	public void fun()
	{

			System.out.println("Son void fun()");

	}
	public void fun(int a)
	{
		System.out.println("Son void fun(int a)");

	}
}
