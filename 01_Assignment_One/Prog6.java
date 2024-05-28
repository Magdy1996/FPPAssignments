

public class Prog6 {
    public static void main(String[] args) {
        secondMin(new int[]{2, 21,3 ,45, 0 , 12 , 19 , 6 , 3, 2, 0 , 22});

    }

    public static void secondMin(int[] arrayOfInts){
        int minElement = arrayOfInts[0];
        int secondElemnt =  arrayOfInts[0];
        for(int i = 0 ; i < arrayOfInts.length;i++){
            if(arrayOfInts[i] < minElement)
                    minElement= arrayOfInts[i];

            if(arrayOfInts[i] > minElement && arrayOfInts[i] < secondElemnt)
                    secondElemnt = arrayOfInts[i];
        }
        System.out.println(secondElemnt);

    }
}
