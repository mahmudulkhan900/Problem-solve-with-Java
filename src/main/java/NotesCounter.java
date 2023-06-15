// Write a program that will count number of notes from given array
//        [1000,500,200,100,50,20,10,5,2,1]
//        Input: 562
//        Output:
//        500 1
//        50 1
//        10 1
//        2 1
public class NotesCounter {
    public static void main(String[] args) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int input = 562;

        System.out.println("Input: " + input);
        System.out.println("Output:");

        for (int i = 0; i < notes.length; i++) {
            int note = notes[i];
            if (input >= note) {
                int count = input / note;
                input = input % note;
                System.out.println(note + " " + count);
            }
        }
    }
}
