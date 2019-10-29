
/**
 * Write a description of class MatrixMath here.
 *
 * @author ( Mr. Kim)
 * @version ((October 28. 1029)
 */
public class MatrixMath
{
    // instance variables - replace the example below with your own
    private int[][] data;

    /**
     * Constructor for objects of class MatrixMath
     */
    public MatrixMath(int[][] data)
    {
        // initialise instance variables
        
    }

    /**
     * Find the sum of all the elements in each row.
     * 
     *
     * @return    int[]
     */
    public int[] rowSum()
    {
        int[] sum = new int[3];
        for (int a=0; a<data.length; a++)
        {
            for (int b=0; b<data[0].length; b++)
            {
                sum[a]+=data[a][b];
            }
        }
        return sum;
    }
    
        /**
     * Find the average of all the values in each row
     *
     * @return    int[] 
     */
    public double[] rowAve()
    {
        return null;
    }
    
        /**
     * Find the sum of all the numbers in column
     * 
     *
     * @return    int[] 
     */
    public int[] colSum()
    {
        return null;
    }
    
     /**
     * Find the average of all the values in each column
     *
     * @return    int[] 
     */
    public double[] colAve()
    {
        return null;
    }
    
}
