public class ReverseArray {
    public static void main(String[] args) {
        int []reversedArary = reverseArrayRecursively(new int[]{1,3,5,7,9,13});
        for(int num : reversedArary){
            System.out.println( num);
        }
    }

    public static int[] reverseArrayRecursively(int[] array){
         return reverseHelper(array, 0 , array.length-1);
    }

    private static int[] reverseHelper(int[]array, int firstIndex , int lastIndex){
        if(firstIndex >= lastIndex)
            return array ;

       else{
           int temp = array[firstIndex];
           array[firstIndex]= array[lastIndex];
           array[lastIndex]= temp ;
           return reverseHelper(array,++firstIndex, --lastIndex);
        }


    }

}
