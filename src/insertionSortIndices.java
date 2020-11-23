public class insertionSortIndices
{
    public static void main(String []args)
    {
        int arr[]={1,6,2,7,9,4,0};
        insertionSort(arr);
    }
    public static void insertionSort(int[] array)
    {
        int indices[]=new int[array.length];
        for(int i=0;i<array.length;i++)
        {
            indices[i]=i;
        }
        boolean isAnySwap=false;
        int len=array.length;
        for (int i = 0; i < len; i++)
        {
            for (int j=0;j<len-i-1;j++)
            {
                if(array[j+1] <array[j])
                {
                    isAnySwap = true;
                    swap(indices,j,j+1);
                    swap(array, j, j + 1);
                }
            }
            if(!isAnySwap)
                break;
        }
        printarray(indices);
    }
    public static void swap(int[]array,int from, int to)
    {
        int temp=array[from];
        array[from]=array[to];
        array[to]=temp;
    }
    public static void printarray(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
