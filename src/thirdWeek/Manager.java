package thirdWeek;
import thirdWeek.Employee;


public class Manager extends Employee {
    private float bonus = 10000; 

    float getSalary(){
        return super.getSalary() + bonus;
    }
    
    float getSalary(boolean isCAD){
        float resSalary = super.getSalary() + bonus;
        if(isCAD)
            resSalary = resSalary * 1.35f;
        return resSalary;
    }
}