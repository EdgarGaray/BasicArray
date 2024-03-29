public class BasicArray//----------Edgar Garay-----------
{
    final static int LIMIT = 15;
    final static int MULTIPLE = 10;
    //creates an array, fills it with various integer values, modifies one value, then prints them out
    public static void main (String[] args)
    {
        int[] list = new int[LIMIT];
        //initializes the array values
        for(int index = 0; index < LIMIT; index++)
            list[index] = index * MULTIPLE;
        list[5] = 999;//change one array value
        for(int index = 0; index < LIMIT; index++)
            System.out.print (list[index] + " ");
        System.out.println();
    }//end main method
}//end class BasicArray
