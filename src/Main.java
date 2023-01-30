public class Main {
    public static void main(String[] args) {
        //Напишите четыре строки:
        //С именем firstName — для хранения имени.
        //С именем middleName — для хранения отчества.
        //С именем lastName — для хранения фамилии.
        //С именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
        //Выведите в консоль фразу: «ФИО сотрудника — …».
        //В качестве данных для задачи используйте "Ivanov Ivan Ivanovich".
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        //Напишите программу, которая изменит написание Ф. И. О. сотрудника с "Ivanov Ivan Ivanovich"
        //на полностью заглавные буквы. В качестве строки с исходными данными используйте строку fullName.
        //Результат программы выведите в консоль в формате: "Данные ФИО сотрудника для заполнения отчета — …"
        System.out.println("Задача 2");
        String fullNameUpCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpCase);

        //Напишите программу, которая заменяет символ «ё» на символ «е».
        //В качестве исходных данных используйте строку fullName и данные в ней — "Иванов Семён Семёнович".
        //Выведите результат программы в консоль в формате: «Данные ФИО сотрудника — ...».
        System.out.println("Задача 3");
        fullName = "Иванов Семён Семёнович";
        String fullNameWithoutЁ = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullNameWithoutЁ);

    }
}