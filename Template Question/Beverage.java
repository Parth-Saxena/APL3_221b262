abstract class Beverage {
	protected void pour(int qty)
	{
		System.out.println("Pour "+qty+" ml of Beverage in glass.");
	}

	protected void addContiment(String cont)
	{
		System.out.println("Add "+cont+" to the glass.");
	}
	protected void stir(int str)
	{
		System.out.println("Stir the drink for "+str+" sec.");
	}
	protected void serve()
	{
		System.out.println("Serve the drink to Customer through Waiter.");
	}
	
	public abstract void templateMethod();
}