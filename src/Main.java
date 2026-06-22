//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int a = 1;
        byte b = 2;
        short c = 3;
        long d = 4L;
        float e = 1.1f;
        double f = 1.2;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
        //Задача 2
        double g = 27.12;
        long h = 987678965549L;
        float i = 2.786f;
        int j = 569;
        short k = -159;
        int l = 27897;
        byte m = 67;
        //Задача 3
        byte luda = 23;
        byte anya = 27;
        byte katya = 30;
        int paper = 480 / (luda + anya + katya);
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги");
        //Задача 4
        byte bottle = 16;
        byte minute = 2;
        int bInM = bottle / minute;
        int twM = bInM * 20;
        int day = bInM * (24 * 60);
        int trD = bInM * (24 * 60 * 3);
        int monthO = bInM * (24 * 60 * 30);
        int monthT = bInM * (24 * 60 * 31);
        int monthTh = bInM * (24 * 60 * 28);
        int monthF = bInM * (24 * 60 * 29);
        System.out.println("За 20 минут машина произвела " + twM + " штук бутылок");
        System.out.println("За 1 сутки машина произвела " + day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + trD + " штук бутылок");
        System.out.println("За 1 месяц (30 дней) машина произвела " + monthO + " штук бутылок");
        System.out.println("За 1 месяц (31 дней) машина произвела " + monthT + " штук бутылок");
        System.out.println("За 1 месяц (28 дней) машина произвела " + monthTh + " штук бутылок");
        System.out.println("За 1 месяц (29 дней) машина произвела " + monthF + " штук бутылок");
        //Задача 5
        byte paint = 120;
        byte white = 2;
        byte brown = 4;
        int onClass = white + brown;
        int classes = paint / onClass;
        int whiteA = white * classes;
        int brownB = brown * classes;
        System.out.println("В школе, где " + classes + " классов, нужно " + whiteA + " банок белой краски и "+ brownB + " банок коричневой краски");
        //Задача 6
        byte banana = 5;
        byte milk = 2;
        byte iceCream = 2;
        byte egg = 4;
        int bananaW = banana * 80;
        int milkW = milk * 105;
        int iceCreamW = iceCream * 100;
        int eggW = egg * 70;
        float shake = bananaW + milkW + iceCreamW + eggW;
        int kg = 1000;
        float kilo = shake / kg;
        System.out.println("Вес спортзавтрака " + kilo + " кг.");
        //Задача 7
        byte goalW = 7;
        short first = 250;
        short second = 500;
        int kgToGram = 1000;
        int goal = goalW * kgToGram;
        int firstD = goal / first;
        int secondD = goal / second;
        System.out.println("Если терять в день 250 грамм, то понадобится " + firstD + " дней.");
        System.out.println("Если терять в день 500 грамм, то понадобится " + secondD + " дней.");
        //Задача 8
        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        float per = 0.1f;
        byte mInYear = 12;
        float mashaN = masha * per + masha;
        float denisN = denis * per + denis;
        float krisN = kris * per + kris;
        float mashaR = mashaN * mInYear - masha * mInYear;
        float denisR = denisN * mInYear - denis * mInYear;
        float krisR = krisN * mInYear - kris * mInYear;
        System.out.println("Маша теперь получает " + mashaN + " рублей. Годовой доход вырос на " + mashaR + " рублей");
        System.out.println("Денис теперь получает " + denisN + " рублей. Годовой доход вырос на " + denisR + " рублей");
        System.out.println("Кристина теперь получает " + krisN + " рублей. Годовой доход вырос на " + krisR + " рублей");


    }
}