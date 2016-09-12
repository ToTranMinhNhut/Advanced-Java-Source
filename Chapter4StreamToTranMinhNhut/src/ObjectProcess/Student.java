/**
 * 
 */
package ObjectProcess;

/**
 * @author hv
 * @version 1.0
 * @since 12/9/2016
 */
public class Student {

    private String age;
    private double mark1;
    private double mark2;
    private String name;
    
    public Student(String age, double mark1, double mark2, String name) {
        super();
        this.age = age;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.name = name;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return the mark1
     */
    public double getMark1() {
        return mark1;
    }

    /**
     * @param mark1 the mark1 to set
     */
    public void setMark1(double mark1) {
        this.mark1 = mark1;
    }

    /**
     * @return the mark2
     */
    public double getMark2() {
        return mark2;
    }

    /**
     * @param mark2 the mark2 to set
     */
    public void setMark2(double mark2) {
        this.mark2 = mark2;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    public double calAvergeMark() {
        return (mark1 + mark2) / 2;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return name + "\t" + "age = " + age + "\t" + "mark 1 = " + mark1
                + "\t" + "mark 2 = " + mark2 + "\t" + "avg = " + calAvergeMark() + ".";
    }
    
    
}
