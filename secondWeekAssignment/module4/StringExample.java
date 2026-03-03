package secondWeekAssignment.module4;
public class StringExample {

    public static void main(String[] args) {


        String str = "Hello";
        str.concat(" World");   // This will NOT change original string
        System.out.println("String: " + str);

        str = str.concat(" World");  // Now reassigned
        System.out.println("After Reassignment: " + str);


        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");   // Modifies original object
        System.out.println("StringBuilder: " + sb);


        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");  // Modifies original object
        System.out.println("StringBuffer: " + sbf);
    }
}