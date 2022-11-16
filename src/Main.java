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
    }
}