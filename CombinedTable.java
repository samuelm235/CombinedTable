public class CombinedTable {
    private SingleTable one;
    private SingleTable two;
    private int seats;
    public CombinedTable(SingleTable o, SingleTable t)
    {
        one = o;
        two = t;
        seats = one.getNumSeats() + two.getNumSeats() - 2;
    }
    public boolean canSeat(int num)
    {
        return seats >= num;
    }
    public double getDesirablity()
    {
        if(one.getHeight() == two.getHeight()) return (one.getViewQuality() + two.getViewQuality())/2;
        return (one.getViewQuality() + two.getViewQuality())/2 - 10;
    }
}