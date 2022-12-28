public class Main {
    public static void main(String[] args) {


        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

             }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляем, вы совершеннолетний!");
        } else {
            System.out.println("Вы еще не достигли совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int grad = -5;
        if (grad <= 5) {
            System.out.println("На улице температура: " + grad + " - нужно надеть шапку");
        } else {
            System.out.println("На улице температура: " + grad + " - можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 70;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то  придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, можно ездить спокойно.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 18;
        if (age > 2 && age < 6) {
            System.out.println("Если твой возраст равен " + age + " - тебе нужно ходить в детский сад");
        } else if (age > 7 && age < 18) {
            System.out.println("Если твой возраст равен " + age + " - тебе нужно ходить в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Если твой возраст равен " + age + " - тебе нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если твой возраст равен " + age + " - тебе пора на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 5;
        if (age < 5) {
            System.out.println("Если твой возраст равен " + age + " - тебе нельзя кататься на аттракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если твой возраст равен " + age + " - тебе можно кататься на аттракционе в сопровождении взрослого");
        } else if (age >= 14) {
            System.out.println("Если твой возраст равен " + age + " -  тебе можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int seats = 59;
        int standings = 42;
        int places = seats + standings;
        if (seats < 60) {
            System.out.println("Количество свободных сидячих мест в вагоне: " + (60 - seats));
        }
        if (standings < 42) {
            System.out.println("Количество свободных стоячих мест в вагоне: " + (42 - standings));
        } else if (places >= 102) {
            System.out.println("Свободных мест в вагоне нет");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one=15;
        int two=29;
        int three=19;
        if (one>two && one>three) {
            System.out.println("Максимальное число "+ one);
        }else if (two>one && two>three) {
            System.out.println("Максимальное число " + two);
        } else {
            System.out.println("Максимальное число " + three);
        }

        }
    }




