public class Main {
    public static void main(String[] args) {
        int age = 25;
            if (age >= 18) {
                System.out.println("Поздравляем, Вы - совершеннолетний!");
        }
            if (age < 18) {
                System.out.println("Увы, до совершеннолетия Вам нужно подождать.");
            }

        // задание 2

        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек закончил школу и может отправляться в университет");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        //задание 3

        int people = 120;
        int totalSeats = 102;
        int sittingPlace = 60;
        if (people >= totalSeats) {
            System.out.println("Мест в вагоне нет");
        }
        if (people < totalSeats && people >= sittingPlace) {
            System.out.println("В вагоне остались только стоячие места");
        }
        if (people < sittingPlace) {
            System.out.println("В вагоне есть сидячие и стоячие места");
        }

        //задание 1 второй части домашки

        age = 17;
        if (age >= 18) {
            System.out.println("Поздравляем, Вы - совершеннолетний!");
        }
            else {
            System.out.println("Увы, до совершеннолетия Вам нужно подождать.");
                }

        //задание 2 второй части домашки

        age = 27;
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        else
            if (age >= 18) {
                System.out.println("Человек закончил школу и может отправляться в университет");
            }
            else
                if (age >= 7) {
            System.out.println("Ребенок ходит в школу");
        }

        // задание 3 второй части домашки

        people = 10;
        totalSeats = 102;
        sittingPlace = 60;
        if (people >= totalSeats) {
            System.out.println("Мест в вагоне нет");
        }
        else
            if (people >= sittingPlace) {
            System.out.println("В вагоне остались только стоячие места");
        }
            else {
            System.out.println("В вагоне есть сидячие и стоячие места");
        }

    // задание 1 третьей части домашки

        age = 35;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека "+age+" года(лет), то ему нужно ходить в детский сад");
        }
        else
            if (age <= 18) {
                System.out.println("Если возраст человека "+age+" лет, то ему нужно ходить в школу");
            }
            else
                if (age <= 24) {
                    System.out.println("Если возраст человека "+age+" лет, то его место в университете");
                }
                else {
                    System.out.println("Если возраст человека "+age+" лет, то ему пора ходить на работу");
                }
    }
}