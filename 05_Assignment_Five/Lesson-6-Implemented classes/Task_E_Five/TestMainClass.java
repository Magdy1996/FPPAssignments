package hwsort.taska.Task_E_Five;



import hwsort.taska.Task_D_Four.DeptEmployee;
import hwsort.taska.Task_D_Four.DeptEmployeeData;

import java.util.Arrays;
import java.util.Comparator;

public class TestMainClass {

    public void sort(DeptEmployee[] dataEmployees){

        Arrays.sort(dataEmployees, (o1, o2) -> o2.getHireDate().compareTo(o1.getHireDate()));
    }






    public static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();


        System.out.println("Before Sorting:");
        for(int i = 0 ; i <data.length;i++){
            System.out.println(data[i].getHireDate());
        }
        TestMainClass object = new TestMainClass();
        object.sort(data);

        System.out.println("After Sorting:");
        for(int i = 0 ; i <data.length;i++){
            System.out.println(data[i].getHireDate());
        }

    }
}
