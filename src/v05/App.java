/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v05;

import io.MyLib;
import java.util.LinkedList;

/**
 * V05 - Input and display Person Info.
 * @author TuPTCE181028
 */
public class App {

    /**
     * The main method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<V05> listObj = new LinkedList<>();
        int length = 0;
        
        do {
            System.out.println("=====Management Person programer=====");
            System.out.println("1.Input Information of person.");
            System.out.println("2.Show list information of person.");
            System.out.println("3.Exit.");
            System.out.println("=====================================");
            int choice = MyLib.getInteger("Please choose number(1-3): ", "Accept from 1 to 3 only!");
            switch (choice) {
                case 1: {
                    V05 obj = new V05();
                    listObj.add(obj.inputPersonInfo());
                    break;
                }
                case 2: {
                    for (int i = 0; i < listObj.size() - 1; i++) {
                        for (int j = 0; j < listObj.size() - i - 1; j++) {
                            if (listObj.get(j).getSalary() < listObj.get(j + 1).getSalary()) {
                                V05 temp = listObj.get(j);
                                listObj.set(j, listObj.get(j + 1));
                                listObj.set(j + 1, temp);
                            }
                        }
                    }

                    for(V05 person : listObj) {
                        person.displayPersonInfo();
                    }

                    break;
                }
                case 3: {
                    System.out.println("=====Exit=====");
                    System.exit(0);
                    break;
                }

            }
        } while (true);

    }

}
