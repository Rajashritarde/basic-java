package data;

public class TestFinal {
	void m() {
	}

	public static void main(String[] args) {
		TestFinal t;
		System.out.println("Before Exception");
		//t=null ;
		//t.m();
		int x=0;
		try
		{
			x=10/0;
		}
		catch(Throwable o)
		{
			System.out.println("Inside catch");
		}
		finally
		
		{
		System.out.println("Inside Exception");
		}
		System.out.println("After Exception");
		
	}

	public static void main(String[] args) {
		System.out.println("Inside Exception");
				
	}

}
