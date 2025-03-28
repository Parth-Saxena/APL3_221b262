class Whiskey extends Beverage
{
    public void templateMethod()
    {
	pour(30);
	addContiment("Ice");
	stir(27);
	serve();
	System.out.println("");
    }
}
