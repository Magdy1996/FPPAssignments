package hwsort.taska.Task_A_One;

import java.util.Arrays;

public class TestMainClass {
    public static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();

        System.out.println("Before Sorting:");
        for(int i = 0 ; i <data.length;i++){
            System.out.println(data[i].getName());
        }

        Arrays.sort(data,new NameComparator());

        System.out.println("After Sorting:");

        for(int i = 0 ; i <data.length;i++){
            System.out.println(data[i].getName());
        }
    }
}
