/**
 * 
 */
package EmployeeManagement;

import java.util.Comparator;
import java.util.Map;

/**
 * @author hv
 *
 */

class ValueComparator implements Comparator<Employee> {
    Map<String, Employee> base;

    public ValueComparator(Map<String, Employee> base) {
        this.base = base;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.compareTo(o2);
    }
}