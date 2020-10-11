package session08;

public class totalMarks {
    private int[][] marks;

    public void totalMarks() {
        System.out.println("Total Marks are:");

        for(int row=0; row <marks.length; row++) {
            System.out.println("Roll no." + (row+1));
            int sum =0;

            for(int value:marks[row]) {
                sum = sum + value;
            }
            System.out.println(sum);
        }
    }
}
