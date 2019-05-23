package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        //testing linear search
        LinearSearch search = new LinearSearch();
        Integer [] myList = new Integer[2];
        myList[0] = 4;
        myList[1] = 3;
        System.out.println(search.search(4,myList));

        //testing sum multiplies
        SumMultiplies sum = new SumMultiplies();
        System.out.println(sum.sum(10));


    }


}
