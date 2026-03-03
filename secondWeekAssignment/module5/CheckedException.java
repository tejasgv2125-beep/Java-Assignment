package secondWeekAssignment.module5;

import java.io.*;

class CheckedException {

    public static void main(String[] args) {

        try {

            FileReader file = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(file);

            String data = br.readLine();
            System.out.println("File Content: " + data);

            br.close();
        }
        catch (IOException e) {
            System.out.println("Checked Exception Caught: " + e);
        }

        System.out.println("Program continues after handling checked exception.");
    }
}