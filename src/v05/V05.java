/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v05;

import io.MyLib;

/**
 * V05 - Input and display Person Info.
 * @author TuPTCE181028
 */
public class V05 {
    private String name;
    private String address;
    private double salary;

    /**
     * Constructor with parameters
     * 
     * @param name is person's name
     * @param address is person's address
     * @param salary is person's salary
     */
    public V05(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    /**
     * Get the person's name
     *
     * @return the person's name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the person's name
     *
     * @param name the person's name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the person's address
     *
     * @return the person's address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set the person's address
     *
     * @param address the person's address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get the person's salary
     *
     * @return the person's salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Set the person's salary
     *
     * @param salary the person's salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    /**
     * Generate: Input the person's information.
     *
     * @return the V05 object with the input information
     */
    public V05 inputPersonInfo(){
        this.name = MyLib.getString("Please input name: ", "You must input digit.");
        this.address = MyLib.getString("Please enter address: ","You must input digit.");
        this.salary = MyLib.getdouble("Please enter salary: ","You must input salary and Salary is greater than zero.", 0, ">");
       
        return this;
        
    }

    /**
     * Generate: Display the person's information.
     */
    public void displayPersonInfo(){
        System.out.println("Information of person you have enterd: ");
        System.out.println("Name: "+this.getName());
        System.out.println("Adress: "+this.getAddress());
        System.out.printf("Salary: %.1f",this.getSalary());
        System.out.println();
    }

    /**
     * Default constructor
     */
    public V05() {
    }
    
     
}
