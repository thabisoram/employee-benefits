
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Z93K3R4N6
 */
public class EmployeeDetails {

    private int number;
    private double salary;
    private String name;
    private String surname;
    Map<String, Double> empMap = new TreeMap<>();

    public void captureDetails() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many employee do have?");
        int noOfEmp = input.nextInt();

        for (int i = 0; i < noOfEmp; i++) {
            number = Integer.parseInt(JOptionPane.showInputDialog("enter emp code"));
            name = JOptionPane.showInputDialog("enter emp name");
            surname = JOptionPane.showInputDialog("enter emp surname");
            salary = Double.parseDouble(JOptionPane.showInputDialog("enter emp salary"));

            empMap.put(createcode(), salary);
        }
    }

    public String createcode() {
        String code = number + name + surname;
        return code;
    }

    public void printDetails() {
        for (String empNumber : empMap.keySet()) {
            System.out.println(empNumber + " " + empMap.get(empNumber));
            //System.out.printf("%10s%15d",empNumber,empMap.get(empNumber));   
        }
    }

    public void setNewSalary(double salary) {
        if (salary >= 15000) {
            salary = salary * 0.091 + salary;
        } else if (salary >= 8000 && salary < 15000) {
            salary = salary * 0.094 + salary;
        } else {
            salary = salary * 0.104 + salary;
        }
        
    }

    public void printDetailsAfterAdjustment() {
        for (String empNumber : empMap.keySet()) {
           System.out.println(empNumber + " " + empMap.get(empNumber));
             
    }
}
}
