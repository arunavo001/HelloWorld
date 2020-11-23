import java.util.ArrayList;

class MakeAnUnsortedArraySorted {


        // Java implementation of the above approach:

        static ArrayList<String> finalAL =new ArrayList<String>();

        // Function to print the output
        static void printTheArray(int arr[], int n,int k)
        {


            int getIndex=0;
            for (int i = 0; i < n; i++)
            {
                if(arr[i]==1){
                    getIndex=i;
                    break;
                }

            }


            ArrayList<Integer> temp =new ArrayList<Integer>();
            for (int i = getIndex; i < n; i++)
            {

                temp.add(arr[i]);


            }
            int c=0;
            for(int i=0;i<temp.size();i++){
                if(temp.get(i)==1){
                    c++;
                }
            }

            if(c==k){
                String s="";
                for(int i=0;i<temp.size();i++){
                    s+=temp.get(i);
                }
                finalAL.add(s);
            }

        }

        // Function to generate all binary strings
        static void generateAllBinaryStrings(int n,
                                             int arr[], int i,int k)
        {
            if (i == n)
            {
                printTheArray(arr, n,k);
                return;
            }

            // First assign "0" at ith position
            // and try for all other permutations
            // for remaining positions
            arr[i] = 0;
            generateAllBinaryStrings(n, arr, i + 1,k);

            // And then assign "1" at ith position
            // and try for all other permutations
            // for remaining positions
            arr[i] = 1;
            generateAllBinaryStrings(n, arr, i + 1,k);
        }

        // Driver Code
        public static void main(String args[])
        {
            int n = 5;
            int k=2;
            int[] arr = new int[n];
            int nth=5;
            // Print all binary strings
            generateAllBinaryStrings(n, arr, 0,k);
            System.out.println(finalAL);
            System.out.println(finalAL.get(nth-1));
        }



    }