public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ по переменным");
       //Задача 1
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper +4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 3
        dog = dog - 4;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задание 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2 ;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //Задание 5
        var frog = 3.5 ;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);
        //Задание 6
        var firstFighter = 78.2;
        var secondFighter = 82.7;
        var totalWeight = firstFighter + secondFighter;
        System.out.println("Общий вес бойцов " + totalWeight);
        var differenceWeight = firstFighter - secondFighter;
        System.out.println("Разница в весе " + differenceWeight);
        //Задание 7
        var bigDifferenceWeight = secondFighter - firstFighter;
        var deleteBigDifferenceWeight = secondFighter % firstFighter;
        System.out.println("Разница в весе первым методом " + bigDifferenceWeight + " Разница в весе вторым методом " + deleteBigDifferenceWeight);
       //Задание 8
        var totalTime = 640;
        var timeOnOneWorker = 8;
        var worker = totalTime / timeOnOneWorker;
        System.out.println("Всего работников в компании – " + worker + " человек");
        worker = worker +94;
        totalTime = timeOnOneWorker * worker;
        System.out.println("Если в компании работает " + worker + " человек, то всего " + totalTime + " часов работы может быть поделено между сотрудниками");


    }
}