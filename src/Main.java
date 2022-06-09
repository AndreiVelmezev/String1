import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Employee's full name - " + fullName);

        System.out.println("Task 2");
        String fullName2 = fullName.toUpperCase();
        System.out.println("Employee's full name data for filling out the report - " + fullName2);

        System.out.println("Task 3");
        fullName = "Ivanov Semyon Semyonovich";
        //String fullNameReplace =fullName.replace('y','e');
        //System.out.println("Employee's full name data - "+fullNameReplace );


        System.out.println(Arrays.toString(fullName.split(" ")));
        String[] b = fullName.split(" ");
        for (int i = 0; i < b.length; i++) {

            String new_string = " ";
            for (int j = 0; j < b[i].length(); j++) {
                if (b[i].charAt(j) == 'y') {
                    new_string += 'e';
                } else
                    new_string += b[i].charAt(j);
            }
            System.out.println(new_string);
        }
    }


}

