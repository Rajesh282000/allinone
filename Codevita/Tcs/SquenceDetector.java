package Codevita.Tcs;

import java.util.Scanner;

 class SequenceDetector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of lines of input
        int numLines = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Initialize variables
        char[] sequence = new char[numLines];
        char initialState = 'a';
        char finalState = 'a';
        boolean isOverlapping = false;

        // Read input and build the sequence and detector type
        for (int i = 0; i < numLines; i++) {
            String[] transition = scanner.nextLine().split(" ");
            char presentState = transition[0].charAt(0);
            char nextState = transition[1].charAt(0);
            int output = Integer.parseInt(transition[3]);

            sequence[i] = nextState;

            if (output == 1 && presentState == nextState) {
                isOverlapping = true;
            } else if (output == 1 && presentState != nextState) {
                finalState = nextState;
            }
        }

        // Print the sequence and detector type
        StringBuilder sequenceStr = new StringBuilder();
        for (char state : sequence) {
            sequenceStr.append(state);
        }

        System.out.println(sequenceStr.toString());
        System.out.println(isOverlapping ? "overlapping" : "non-overlapping");
    }
}