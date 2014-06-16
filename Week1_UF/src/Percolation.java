/**
 * Created by RAGA on 6/15/2014.
 */
public class Percolation
{
    private int [][] sites;
    private final int VIRTUAL_TOP = 0;
    private int VIRTUAL_BOTTOM;

    public Percolation(int N)              // create N-by-N grid, with all sites blocked
    {
            sites = new int [N+1][N+1];
            VIRTUAL_BOTTOM = (N+1)*(N+1);
    }
    public void open(int i, int j)         // open site (row i, column j) if it is not already
    {

    }

    public boolean isOpen(int i, int j)    // is site (row i, column j) open?
    {
        return false;
    }

    public boolean isFull(int i, int j)    // is site (row i, column j) full?
    {
        return false;
    }

    public boolean percolates()            // does the system percolate?
    {
        return false;
    }
}
