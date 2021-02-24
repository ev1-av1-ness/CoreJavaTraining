package CollectionsExample;

import java.util.ArrayList;

public class CollectionDemo {

  public static void main(String[] args) {
    int a[] ={4, 5, 5, 5, 4, 6, 6, 9, 4};

    //unique value and how many times use in array
    //4 - 3, 5 - 3, 6 - 2, 9 - 1
    //create new array, empty
    // 4 - is present in or not
    //scan other values in loop and increase if it is
    ArrayList<Integer> al = new ArrayList<>();

    for(int i=0;i<a.length;i++){ //перебор в массиве

      int k = 0;

      if(!al.contains(a[i])) {

        al.add(a[i]);
        k++;

        for(int j=i+1;j<a.length;j++) {//ищем после этого числа остались ли еще такие же

          if(a[i]==a[j]) {

            k++;

          }

        }

        System.out.println(a[i]);
        System.out.println(k);
        if(k==1)
          System.out.println(a[i]+" is unique number");
      }


    }


  }

}
