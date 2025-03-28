public class Main
{
    public static void main(String args[])
    {
        Beverage w = new Whiskey();
        w.templateMethod();
        w = new Rum();
        w.templateMethod();
    }
}
    
