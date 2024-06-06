package hwsort.taska.Task_D_Four;


import java.util.Arrays;
import java.util.Comparator;

public class TestMainClass {

    public void sort(DeptEmployee[] dataEmployees){

        Arrays.sort(dataEmployees, new Comparator<DeptEmployee>() {
            @Override
            public int compare(DeptEmployee o1, DeptEmployee o2) {
                return  o2.getName().compareTo(o1.getName());
            }
        });
    }






    public static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();


        System.out.println("Before Sorting:");
        for(int i = 0 ; i <data.length;i++){
            System.out.println(data[i].getName());
        }
        TestMainClass object = new TestMainClass();
        object.sort(data);

        System.out.println("After Sorting:");
        for(int i = 0 ; i <data.length;i++){
            System.out.println(data[i].getName());
        }

    }
}
