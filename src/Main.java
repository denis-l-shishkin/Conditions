public class Main {
    public static void main(String[] args) {
        int age = 22;
        if (age > 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("--End of task 1--\n");
        int temperature = 11;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов. Сегодня достаточно холодно, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов. Сегодня тепло, можно идти без шапки.");
        }
        System.out.println("--End of task 2--\n");
        int speed = 49;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }
        System.out.println("--End of task 3--\n");
        age = 33; // Инициализировали ранее, присвоение нового значения.
        if (age < 2) {
            System.out.println("Если человеку " + age + " год, то ему еще рано куда-либо ходить.");
        } else if (age >= 2 && age <= 6 ) {
            if (age <= 4) {
                System.out.println("Если человеку " + age + " года, то ему нужно ходить в детский сад.");
            } else {
                System.out.println("Если человеку " + age + " лет, то ему нужно ходить в детский сад.");
            }
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если человеку " + age + " лет, то ему нужно ходить в школу.");
        } else if (age >= 18 && age <= 24) {
            if (age == 21) {
                System.out.println("Если человеку " + age + " год, то его место в университете.");
            } else if (age >= 22) {
                System.out.println("Если человеку " + age + " года, то его место в университете.");
            } else {
                System.out.println("Если человеку " + age + " лет, то его место в университете.");
            }
        } else if (age >= 24 && age < 60 ) {
            if (age % 10 == 1) {
                System.out.println("Если человеку " + age + " год, то ему пора ходить на работу.");
            } else if (age % 10 == 2 || age % 10 == 3 || age % 10 == 4) {
                System.out.println("Если человеку " + age + " года, то ему пора ходить на работу.");
            } else {
                System.out.println("Если человеку " + age + " лет, то ему пора ходить на работу.");
            }
        } else {
            System.out.println("Если человеку 60 или более лет, то он может не работать, поздравьте его - он на пенсии!");
        }
        System.out.println("--End of task 4--\n");
        age = 11; // Инициализировали ранее, присвоение нового значения.
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else if (age >= 5 && age < 14 ) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else if (age >= 14 && age < 18) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        } else {
            System.out.println("Ваш возраст " + age + " , Вы уже не ребенок! Катайтесь где, как и с кем хотите!");
        }
        System.out.println("--End of task 5--\n");
        int occupiedPlaces = 106;
        int seatingPlaces = 60;
        int standingPlaces = 42;
        int totalPlaces = seatingPlaces + standingPlaces;
        if (occupiedPlaces < 60) {
            System.out.println("В вагоне доступно: \n" +
                    "сидячих мест - " + (seatingPlaces - occupiedPlaces) +  "\n" +
                    "стоячих мест - " + standingPlaces);
        } else if (occupiedPlaces == 60) {
            System.out.println("В вагоне доступно: \n" +
                    "сидячих мест - 0 \n" +
                    "стоячих мест - " + standingPlaces);
        } else if (occupiedPlaces > 60 && occupiedPlaces < totalPlaces) {
            System.out.println("В вагоне доступно: \n" +
                    "сидячих мест - 0 \n" +
                    "стоячих мест - " + (totalPlaces - occupiedPlaces));
        } else {
            System.out.println("Свободных мест нет, вагон полностью забит!");
        }
        System.out.println("--End of task 6--\n");
        int one = 11;
        int two = 15;
        int three = 12;
        if (one > two && one > three) {
            System.out.println("Число one = " + one + " большее из трех чисел.");
        } else if (two > one && two > three) {
            System.out.println("Число two = " + two + " большее из трех чисел.");
        } else if (three > one && three > two) {
            System.out.println("Число three = " + three + " большее из трех чисел.");
        } else if (one == two && one > three) {
            System.out.println("Числа one и two равны " + one + " и больше three.");
        } else if (two == three && two > one) {
            System.out.println("Числа two и three равны " + two + " больше one.");
        } else if (one == three && one > two) {
            System.out.println("Числа one и three равны " + one + " и больше two.");
        } else {
            System.out.println("Все числа равны.");
        }
        System.out.println("--End of task 7--\n");
    }
}