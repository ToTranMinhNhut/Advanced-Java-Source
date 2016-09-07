/**
 * 
 */
package ClassManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author hv
 * @version 1.0
 * @since 6/9/2016
 */
public class ClassManagementMain {

    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("- Demo acount of homeroom teacher. Username: teacher1. Password: 123.");
        System.out.println("- Demo acount of teacher charge of subject. Username: teacher2. Password: 1234.");

        String username = "";
        String password = "";

        // enter username and password
        
        System.out.println("\nPlease enter username: ");

        try {
            username = input.readLine();
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }

        System.out.println("Please enter password: ");

        try {
            password = input.readLine();
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }


        Account account = new Account();

        // Data demo for account of homeroom teacher
        Role role = new Role();
        role.setId(1);
        account.setUsername("teacher1");
        account.setPassword("123");
        account.setRole(role);

        // data demo for information class such as: student, teacher and subject
        Student demoSt = new Student("alan", "1/9/1990", "12345661", "alan@gmail.com");
        ArrayList<Student> demoListSt =  new ArrayList<>();
        demoListSt.add(demoSt);

        Teacher demoT = new Teacher("Dan", "5/9/1980", "23142521", "dan80@gmail.com", "manage");
        ArrayList<Teacher> demoListT = new ArrayList<>();
        demoListT.add(demoT);

        Suject demoS = new Suject("5/9/2016", "java", 250, "15/10/2016");
        ArrayList<Suject> demoListS = new ArrayList<>();
        demoListS.add(demoS);
        
        Class demoC = new Class("5/9/2016", "100", "TRAN1", 20, "5/12/2016", demoListSt, demoListT, demoListS);
        
        // demo data for roll call
        RollCall demoR = new RollCall("present");
        DiligentScore demoDC = new DiligentScore(10);
        DetailRollCall demoDR = new DetailRollCall(demoDC, demoR);
        ArrayList<DetailRollCall> demoListDR = new ArrayList<>();
        demoListDR.add(demoDR);
        demoSt.setDetailRollCall(demoListDR);
        
        // demo data for score
        ActiveScore demoAS = new ActiveScore(8);
        ExercisesScore demoES = new ExercisesScore(9);
        ScoreOfExam demoSE = new ScoreOfExam();
        demoSE.setScoreMultipleChoiceTest(8);
        demoSE.setScorePracticeTest(8);
        Score demoScore = new Score(demoSE, demoDC, demoES, demoAS, demoS);
        demoSt.setScore(demoScore);
        //---------------------------------------------------------------
        
        /* Login with homeroom teacher account
         * to make functions in menu, when finish a function, you can choose come back or out program
         * 
         */
        
        if (account.login(username, password) == 1) {
            boolean nextStep = true;

            while (nextStep) {

                System.out.println("---------------Homeroom teacher---------------");
                System.out.println("1. View information of class");
                System.out.println("2. Add a teacher charge of subject to class");
                System.out.println("3. Add a student to class");
                System.out.println("4. Add a subject to class");

                int opt = 0;
                System.out.println("Please choose: ");

                try {
                    opt = Integer.parseInt(input.readLine());
                } catch (NumberFormatException e) {
                    System.out.println("Error: " + e.toString());
                }

                if (opt == 1) {
                    demoC.viewInformationClass();
                    
                    // to choose come back or out
                    System.out.println("-------------------------------");
                    System.out.println("5. Back");
                    System.out.println("6. Out");
                    System.out.println("Please choose: ");

                    try {
                        opt = Integer.parseInt(input.readLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Error: " + e.toString());
                    }

                    if (opt == 5) {
                        continue;
                    } else if (opt == 6) {
                        break;
                    } else {
                        throw new ArithmeticException("Pleasse only enter 5 or 6");
                    }

                } else if (opt == 2) {
                    demoC.addTeacher();

                    System.out.println("-------------------------------");
                    System.out.println("5. Back");
                    System.out.println("6. Out");
                    System.out.println("Please choose: ");

                    try {
                        opt = Integer.parseInt(input.readLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Error: " + e.toString());
                    }

                    if (opt == 5) {
                        continue;
                    } else if (opt == 6) {
                        break;
                    } else {
                        throw new ArithmeticException("Pleasse only enter 5 or 6");
                    }

                } else if (opt == 3) {
                    demoC.addStudent();

                    System.out.println("-------------------------------");
                    System.out.println("5. Back");
                    System.out.println("6. Out");
                    System.out.println("Please choose: ");

                    try {
                        opt = Integer.parseInt(input.readLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Error: " + e.toString());
                    }

                    if (opt == 5) {
                        continue;
                    } else if (opt == 6) {
                        break;
                    } else {
                        throw new ArithmeticException("Pleasse only enter 5 or 6");
                    }

                } else if (opt == 4) {
                    demoC.addSubject();

                    System.out.println("----------------------------------------");
                    System.out.println("5. Back");
                    System.out.println("6. Out");
                    System.out.println("Please choose: ");

                    try {
                        opt = Integer.parseInt(input.readLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Error: " + e.toString());
                    }

                    if (opt == 5) {
                        continue;
                    } else if (opt == 6) {
                        break;
                    } else {
                        throw new ArithmeticException("Pleasse only enter 5 or 6");
                    }

                } else {
                    throw new ArithmeticException("The function do not exists.");
                }
            }

        } else {

            // Data demo for account of teacher charge of subject 
            role.setId(2);
            account.setUsername("teacher2");
            account.setPassword("1234");
            account.setRole(role);
            //---------------------------------------------------------------
            
            /* Login with account of teacher charge of subject
             * to make functions in menu, when finish a function, you can choose come back or out program
             * 
             */
            
            if (account.login(username, password) == 2) {
                boolean nextStep = true;

                while (nextStep) {

                    System.out.println("--------------Teacher charge of subject---------------.");
                    System.out.println("1. View information of class.");
                    System.out.println("2. Roll Call.");
                    System.out.println("3. View Table Roll Call.");
                    System.out.println("4. Process Score for a student.");
                    System.out.println("5. Appreciate Student fo a subject");

                    int opt = 0;
                    System.out.println("Please choose: ");

                    try {
                        opt = Integer.parseInt(input.readLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Error: " + e.toString());
                    }

                    if (opt == 1) {
                        demoC.viewInformationClass();
                        
                        // to choose come or out
                        System.out.println("----------------------------------------");
                        System.out.println("6. Back");
                        System.out.println("7. Out");
                        System.out.println("Please choose: ");

                        try {
                            opt = Integer.parseInt(input.readLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Error: " + e.toString());
                        }

                        if (opt == 6) {
                            continue;
                        } else if (opt == 7) {
                            break;
                        } else {
                            throw new ArithmeticException("Pleasse only enter 7 or 6");
                        }
                        
                    } else if (opt == 2) {
                        demoSt.rollCallStudent();

                        System.out.println("----------------------------------------");
                        System.out.println("6. Back");
                        System.out.println("7. Out");
                        System.out.println("Please choose: ");

                        try {
                            opt = Integer.parseInt(input.readLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Error: " + e.toString());
                        }

                        if (opt == 6) {
                            continue;
                        } else if (opt == 7) {
                            break;
                        } else {
                            throw new ArithmeticException("Pleasse only enter 7 or 6");
                        }

                    } else if (opt == 3) {
                        demoSt.printTableRollCallStudent();
                        
                        System.out.println("----------------------------------------");
                        System.out.println("6. Back");
                        System.out.println("7. Out");
                        System.out.println("Please choose: ");

                        try {
                            opt = Integer.parseInt(input.readLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Error: " + e.toString());
                        }

                        if (opt == 6) {
                            continue;
                        } else if (opt == 7) {
                            break;
                        } else {
                            throw new ArithmeticException("Pleasse only enter 6 or 7");
                        }
                        
                    } else if (opt == 4) {
  
                        System.out.println("------------------Demo----------------");
                        demoSt.printScoreStudent();
                        
                        System.out.println("----------------------------------------");
                        System.out.println("6. Back");
                        System.out.println("7. Out");
                        System.out.println("Please choose: ");

                        try {
                            opt = Integer.parseInt(input.readLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Error: " + e.toString());
                        }

                        if (opt == 6) {
                            continue;
                        } else if (opt == 7) {
                            break;
                        } else {
                            throw new ArithmeticException("Pleasse only enter 6 or 7");
                        }
                        
                    } else if (opt == 5) {
                        AppreciateSubject demoAp = new AppreciateSubject();
                        demoAp.setStudent(demoSt);
                        demoAp.comment();
                        
                        System.out.println("Do you print table appreciate: <1 (Yes) / 0 (No)>");
                        int choice = 0;
                        
                        try {
                            choice = Integer.parseInt(input.readLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Error: " + e.toString());
                        }
                        
                        if (choice == 1) {
                            demoAp.printTableAppreciate();
                        }
                        
                        System.out.println("----------------------------------------");
                        System.out.println("6. Back");
                        System.out.println("7. Out");
                        System.out.println("Please choose: ");

                        try {
                            opt = Integer.parseInt(input.readLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Error: " + e.toString());
                        }

                        if (opt == 6) {
                            continue;
                        } else if (opt == 7) {
                            break;
                        } else {
                            throw new ArithmeticException("Pleasse only enter 6 or 7");
                        }
                    }
                }

            } else {
                System.out.println("Your username or password is wrong.");
            }
        }
    }
}
