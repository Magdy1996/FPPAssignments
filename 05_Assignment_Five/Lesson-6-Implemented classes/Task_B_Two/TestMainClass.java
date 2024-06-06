package hwsort.taska.Task_B_Two;


import java.util.Arrays;
import java.util.Comparator;

public class TestMainClass {

    private class NameComparator implements Comparator<DeptEmployee>{

        @Override
        public int compare(DeptEmployee o1, DeptEmployee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }




    public static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();

        System.out.println("Before Sorting:");
        for(int i = 0 ; i <data.length;i++){
            System.out.println(data[i].getName());
        }

        TestMainClass testObject = new TestMainClass();
        Arrays.sort(data,testObject.getNameComparator());


        System.out.println("After Sorting:");

        for(int i = 0 ; i <data.length;i++){
            System.out.println(data[i].getName());
        }
    }


    private NameComparator getNameComparator(){
        return new NameComparator();
    }
}
