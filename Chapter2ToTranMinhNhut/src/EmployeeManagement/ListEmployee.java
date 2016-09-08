/**
 * 
 */
package EmployeeManagement;

import java.util.Map;
import java.util.TreeMap;


/**
 * This class is used for processing businesses of instance list's employee
 * 
 * @author hv
 * @version 1.0
 * @sine 8/9/2016
 */
public class ListEmployee {

    private Map<String, Employee> listEmployee;

    public ListEmployee() {
        super();
        listEmployee = new TreeMap<String, Employee>();
    }


    /**
     * @return the listEmployee
     */
    public Map<String, Employee> getListEmployee() {
        return listEmployee;
    }

    /**
     * @param listEmployee the listEmployee to set
     */
    public void setListEmployee(Map<String, Employee> listEmployee) {
        this.listEmployee = listEmployee;
    }

    /*
     * This method is used for viewing all of employee in list's employee
     * Input nothing
     * Output nothing
     */
    public void viewListInformationEmployee() {
        int countEmployee = 0;
        
        TreeMap<String, Employee> sorted_map = new TreeMap(new ValueComparator(listEmployee));
        sorted_map.putAll(listEmployee);;
        
        for (Object id : sorted_map.keySet()) {
            Employee employee = listEmployee.get(id);

            System.out.println("-----Information Employeee" + (countEmployee + 1) + "-----");
            employee.printInformation();
            countEmployee++;
        }
    }

    /*
     * This method is used for adding a new employee to list's employee
     * Input nothing
     * Output nothing
     */
    public void addNewEmployee(Employee employee) {
        listEmployee.put(employee.getId(), employee);
        System.out.println("Add sucessful.");
    }
}
