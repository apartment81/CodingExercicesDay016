package ro.mirodone;

public class LinearSearch {


    public  int search ( int n, Integer [] list){
        int index =-1;
        for (int i =0 ; i<list.length ;i++){
            if(list[i].equals(n)){
                index = i;
                break;
            }
        }return index;
    }

}
