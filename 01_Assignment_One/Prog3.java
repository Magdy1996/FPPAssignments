



public class Prog3 {
    public static void main(String[] args) {
        String[] inputArrayStrings = {"horse", "dog", "cat", "horse", "dog"};
        int index = 0 ;
        String[] newArray = new String[inputArrayStrings.length];

        for(int i = 0 ; i < inputArrayStrings.length; i++){

            boolean foundFlag = false;
            for(int j = 0 ; j < inputArrayStrings.length; j++){

                if(inputArrayStrings[i] == newArray[j]){
                    foundFlag = true;
                    break;
                }
            }
            if(!foundFlag){
                newArray[index] = inputArrayStrings[i];
                index++;
                foundFlag = false;
            }
           }




        int size = 0 ;
        for(int i = 0 ; i < inputArrayStrings.length;i++){
            if(newArray[i] != null)
                    size++;
        }
    String[] result = new String [size] ;

        for(int i = 0 ; i < size ; i++){
            result[i] = newArray[i];
        }


        for(int i = 0 ; i < size; i++){
            System.out.println(result[i]);
        }
    }
}
