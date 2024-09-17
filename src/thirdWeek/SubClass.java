package thirdWeek;
import thirdWeek.*;

public class SubClass extends MyClass {
    int increaseValue(){
        System.out.println("in MySub's increaseValue - triple");
        value = value * 3;
        return value;
        }

    // int increaseMyClassValue(){
    //     int v = super.increaseValue();
    //     return v;
    // }
    
}
