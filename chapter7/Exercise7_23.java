//  (Game: locker puzzle) A school has 100 lockers and 100 students. All lockers are
// closed on the first day of school. As the students enter, the first student, denoted
// as S1, opens every locker. Then the second student, S2, begins with the second
// locker, denoted as L2, and closes every other locker. Student S3 begins with the
// third locker and changes every third locker (closes it if it was open and opens it if
// it was closed). Student S4 begins with locker L4 and changes every fourth locker.
// Student S5 starts with L5 and changes every fifth locker, and so on, until student
// S100 changes L100.
// 		After all the students have passed through the building and changed the lockers,
// which lockers are open? Write a program to find your answer and display all open
// locker numbers separated by exactly one space.
package chapter7;

public class Exercise7_23 {
    public static void main(String[] args) {
        final int TOTAL_LOCKERS = 100, TOTAL_STUDENTS = 100;
        boolean[] lockers = new boolean[TOTAL_LOCKERS]; 
        for (int i = 1; i <= TOTAL_STUDENTS; i++) {
            for (int j = i - 1; j < TOTAL_LOCKERS; j += i) {
                lockers[j] = !lockers[j];
            }
        }

        System.out.print("The open lockers are: ");
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    } 
}
