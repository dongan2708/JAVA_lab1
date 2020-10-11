package session08;
import java.io.OptionalDataException;
public class DisplayMarks {
    private boolean[] marks;

    public void displayMarks() {
        System.out.println("Marks are: ");


        for(int count = 0; count < marks.length; count++) {
            System.out.println(marks[count]);
        }
    }
}
