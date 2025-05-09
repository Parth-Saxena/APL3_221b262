class Chocolate extends Decoration
{
    Chocolate(Offering offering)
    {
        this.offering=offering;
    }
    
    String getName()
    {
        return offering.getName()+" "+"with Chocolate";
    }
    
    int getPrice()
    {
        return offering.getPrice()+70;
    }
}