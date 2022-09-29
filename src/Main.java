public class Main {
    public static void main(String[] args) {
        taskOne ();
        taskTwo ();
        taskThree ();
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
    private static void taskThree () {
        System.out.println("Задание 3");

        String fullName = "Иванов Семён Семёнович";
        boolean notAcceptedCharacters = fullName.contains("ё"); // Проверка есть ли буква "ё"
        System.out.println(notAcceptedCharacters);
        System.out.println();
        String[] fullNameSplit = fullName.split("\\s+");// разделение строки с помощью метода split()
        for (String finishedFullName : fullNameSplit) {
            String changeName = finishedFullName.replace('ё', 'е'); // Замена буквы "ё" на букву "е"
            System.out.println(changeName);
        }
    }
}