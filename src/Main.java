public class Main {
    public static void main(String[] args) {
        taskOne ();
        taskTwo ();
    }
    private static void taskOne () {
        System.out.println("Задание 1");

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = "Ivanov" + " " + "Ivan" + " " + "Ivanovich";
        System.out.println("ФИО сотрудника — " + firstName +" "+ middleName +" "+ lastName); //1
        System.out.println();
        System.out.println("ФИО сотрудника — " + fullName); //2


    }
    private static void taskTwo () {
        System.out.println("Задание 2");
        String fullName = "Ivanov Ivan Ivanovich";
        String upperСaseName = fullName.toUpperCase();
        System.out.println(upperСaseName);
    }
}