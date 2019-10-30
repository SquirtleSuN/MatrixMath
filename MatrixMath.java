
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
        this.data = data;
    }

    /**
     * Find the sum of all the elements in each row.
     * 
     *
     * @return    int[]
     */
    public int[] rowSum()
    {
        int[] sumRow = new int[data.length];
        for (int a=0; a<data.length; a++)
        {   int sum=0;
            for (int b=0; b<data[a].length; b++)
            {
                sum+= data[a][b];
            }
            sumRow[a]=sum;
        }
        return sumRow;
    }
    
        /**
     * Find the average of all the values in each row
     *
     * @return    int[] 
     */
    public double[] rowAve()
    {
        double[] avgRow = new double[data.length];
        int[] sums= rowSum();
        for (int a=0; a<data.length;a++)
        {
           avgRow[a]= (sums[a]*1.0)/data[a].length;
        }
        return avgRow;
    }
    
        /**
     * Find the sum of all the numbers in column
     * 
     *
     * @return    int[] 
     */
    public int[] colSum()
    {
        int[] sumCol= new int [data.length];
        for (int a=0; a<data.length;a++)
        {   int sum=0;
            for (int b=0; b<data.length;b++)
            {
                sum+=data[b][a];
            }
            sumCol[a]= sum;
        }
        return sumCol;
    }
    
     /**
     * Find the average of all the values in each column
     *
     * @return    int[] 
     */
    public double[] colAve()
    {   double[] avgCol = new double[data.length];
        int[] sum= colSum();
        for (int a=0; a<data.length; a++)
        {
            avgCol[a]=(sum[a]*1.0)/data.length;
        }
        return avgCol;
    }
    
}
