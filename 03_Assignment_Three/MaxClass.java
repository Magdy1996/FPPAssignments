public class MaxClass {
    public static void main(String[] args) {
        int[] array = {5,-3,6,10,9,4};
       int result =  findMax(array);
        System.out.println( result);
    }

    public static int findMax(int [] arr){
       return  findMax(arr, arr[0],0);
    }

    private static int findMax(int []arr, int max, int position){
        if(position == arr.length)
            return max;
        if(max < arr[position])
                max = arr[position];
       return  findMax(arr,max,++position);
    }
}
