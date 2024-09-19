package thirdWeek;
import java.util.ArrayList;


class OddNumberList extends ArrayList<Integer> {
    //@Override
    public boolean add(Integer number) {
        if (number % 2 == 1) {
            return super.add(number);  // Call the add method of ArrayList
        } else {
            System.out.println("Only odds numbers can be added.");
            return false;
        }
    }

    public static void main(String[] args) {
        OddNumberList list = new OddNumberList();

        list.add(3); 
        list.add(6); 
        list.add(7); 

        System.out.println(list); 
    }
}

