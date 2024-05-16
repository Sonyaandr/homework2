public class Main {
    public static void main(String[] args) {
                var dog = 8.0;
                var cat = 3.6;
                var paper = 763789;
                System.out.println("Задание1: " + dog + "  " + cat + "  " + paper);
                var dog1 = dog + 2;
                var cat1 = cat + 2;
                var paper1  = paper + 2;
                System.out.println("Задание2: " + dog1 + "  " + cat1 + "  " + paper1);
                var dog2 = dog - 3.5;
                var cat2 = cat - 1.6;
                var paper2  = paper - 7639;
                System.out.println("Задание3: " + dog2 + "  " + cat2 + "  " + paper2);
                var friend = 19;
                System.out.println("Задание4: " + friend + " " + (friend+2) + " " + ((friend+2)/7));
                var frog = 10;
                System.out.println("Задание5: " + frog + " " + (friend*10) + " " + ((friend*10)/3.5) + " " + ((friend*10)/3.5)+4);
                var boxerWeight1 = 78.2;
                var boxerWeight2 = 82.7;
                System.out.println("Задание6: " + (boxerWeight2 + boxerWeight1) + "  " + Math.abs(boxerWeight2 - boxerWeight1) + "  " + paper2);
                var boxerRemain=0;
                if (boxerWeight2>boxerWeight1) {
                    boxerRemain = (int) (boxerWeight2 % boxerWeight1);
                } else {
                    boxerRemain = (int) (boxerWeight1 % boxerWeight2);
                }
                System.out.println("Задание7: " + boxerRemain);
                var emploersHours = 640;
                var emploerHour = 8;
                var emploer = emploersHours / emploerHour;
                System.out.println("Задание 8.1: Всего работников в компании - " + emploer + " человек.");
                System.out.println("Задание 8.2: Если в компании работает " + (emploer +94) + " человек, то всего " + ((emploer +94)*8) + " часов работы может быть поделено между сотрудниками.");
            }
        }
    }
}