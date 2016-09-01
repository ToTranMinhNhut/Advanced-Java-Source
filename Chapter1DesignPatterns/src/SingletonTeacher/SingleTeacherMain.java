
package SingletonTeacher;

/**
 * @author hv
 * @version
 * @since 1/9/2016
 */
public class SingleTeacherMain {

    /**
     * @param args
     */
    public static void main(String[] args) {

        SingleTeacher student = SingleTeacher.getInstance();
        
        System.out.println(student.shareDocument());
    }

}
