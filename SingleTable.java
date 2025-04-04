public class SingleTable {
    private int seats;
    private int height;
    private double view;
    public SingleTable(int s, int h, double v)
    {
        seats = s;
        height = h;
        view = v;
    }
    public int getNumSeats() {
        return seats; }


    /** Returns the height of this table in centimeters. */
    public int getHeight() {
        return height; }


    /** Returns the quality of the view from this table. */
    public double getViewQuality() {
        return view; }


    /** Sets the quality of the view from this table to value . */
    public void setViewQuality(double value) {
        view = value; }
    // There may be instance variables, constructors, and methods that are not
    // shown.
}
