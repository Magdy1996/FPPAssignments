package hwsort.taska.Task_C_Three;

import hwsort.taska.Task_A_One.NameComparator;

import java.util.Arrays;
import java.util.Comparator;

public class TestMainClass {
    public void  sort(DeptEmployee[] dataEmployee, NameComparator nameComparator){
         class NameComaparator implements Comparator<DeptEmployee>{

             @Override
             public int compare(DeptEmployee o1, DeptEmployee o2) {
                 return Double.compare(o1.getSalary(), o2.getSalary());
             }
         }
         Arrays.sort(dataEmployee, new NameComaparator());
    }



    public static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();

        System.out.println("Before Sorting:");
        for(int i = 0 ; i <data.length;i++){
            System.out.println(data[i].getSalary());
        }

        TestMainClass object = new TestMainClass();
        object.sort(data, new NameComparator());

        System.out.println("After Sorting:");

        for(int i = 0 ; i <data.length;i++){
            System.out.println(data[i].getSalary());
        }
    }

}
