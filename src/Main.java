public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName= "Ivanov";
        String fullName =lastName+" "+firstName+" "+ middleName;
        System.out.println("Employee's full name - "+ fullName);

        System.out.println("Task 2");
        String fullName2= fullName.toUpperCase();
        System.out.println("Employee's full name data for filling out the report - "+fullName2);

        System.out.println("Task 3");
        fullName ="Ivanov Semyon Semyonovich";
        String fullNameReplace =fullName.replace('o','e');
        System.out.println("Employee's full name data - "+fullNameReplace );


    }
}
