public class Main {
    public static void main(String[] args) {
        taskOne ();
    }
    public static void taskOne () {
        System.out.println("Задание 1");

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("ФИО сотрудника — " + firstName +" "+ middleName +" "+ lastName); //1
        System.out.println();
        System.out.println("ФИО сотрудника — " + fullName); //2


    }
}