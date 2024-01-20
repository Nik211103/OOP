package Seminar.Seminar1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        heroesWhite = generateCommand(0, 0);
        heroesBlack = generateCommand(3, 9);

        heroesWhite.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");
        heroesBlack.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");


//        heroesBlack.forEach(n -> n.printEnemyDistance(heroesWhite)); //вызов позиций для всех
//        System.out.println();

        for (Hero heroWhite : heroesWhite) {
            System.out.print("У " + heroWhite.classHero + " " + heroWhite.nameHero + " ближайшая цель: ");
            (heroWhite).showDistanceToEnemies(heroesBlack);
        }
//
        //ход 1
        System.out.println("*************************************");
        heroesWhite.forEach(n -> n.step(heroesBlack));//ход
        System.out.println("*************************************");
        heroesBlack.forEach(n -> n.step(heroesWhite));//ход

        heroesWhite.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");
        heroesBlack.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");//вывод

        for (Hero heroWhite : heroesWhite) {
            System.out.print("У " + heroWhite.classHero + " " + heroWhite.nameHero + " ближайшая цель: ");
            (heroWhite).showDistanceToEnemies(heroesBlack);
        }

        //ход 2
        heroesWhite.forEach(n -> n.step(heroesBlack));//ход
        System.out.println("*************************************");
        heroesBlack.forEach(n -> n.step(heroesWhite));//ход

        heroesWhite.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");
        heroesBlack.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");//вывод

        for (Hero heroWhite : heroesWhite) {
            System.out.print("У " + heroWhite.classHero + " " + heroWhite.nameHero + " ближайшая цель: ");
            (heroWhite).showDistanceToEnemies(heroesBlack);
        }

        //ход 3
        System.out.println("*************************************");
        heroesWhite.forEach(n -> n.step(heroesBlack));//ход
        System.out.println("*************************************");
        heroesBlack.forEach(n -> n.step(heroesWhite));//ход

        heroesWhite.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");
        heroesBlack.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");//вывод

        for (Hero heroWhite : heroesWhite) {
            System.out.print("У " + heroWhite.classHero + " " + heroWhite.nameHero + " ближайшая цель: ");
            (heroWhite).showDistanceToEnemies(heroesBlack);
        }

        //ход 4
        System.out.println("*************************************");
        heroesWhite.forEach(n -> n.step(heroesBlack));//ход
        System.out.println("*************************************");
        heroesBlack.forEach(n -> n.step(heroesWhite));//ход

        heroesWhite.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");
        heroesBlack.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");//вывод

        for (Hero heroWhite : heroesWhite) {
            System.out.print("У " + heroWhite.classHero + " " + heroWhite.nameHero + " ближайшая цель: ");
            (heroWhite).showDistanceToEnemies(heroesBlack);
        }

        //ход 5
        System.out.println("*************************************");
        heroesWhite.forEach(n -> n.step(heroesBlack));//ход
        System.out.println("*************************************");
        heroesBlack.forEach(n -> n.step(heroesWhite));//ход

        heroesWhite.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");
        heroesBlack.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");//вывод

        for (Hero heroWhite : heroesWhite) {
            System.out.print("У " + heroWhite.classHero + " " + heroWhite.nameHero + " ближайшая цель: ");
            (heroWhite).showDistanceToEnemies(heroesBlack);
        }

        //ход 6
        System.out.println("*************************************");
        heroesWhite.forEach(n -> n.step(heroesBlack));//ход
        System.out.println("*************************************");
        heroesBlack.forEach(n -> n.step(heroesWhite));//ход

        heroesWhite.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");
        heroesBlack.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");//вывод

        for (Hero heroWhite : heroesWhite) {
            System.out.print("У " + heroWhite.classHero + " " + heroWhite.nameHero + " ближайшая цель: ");
            (heroWhite).showDistanceToEnemies(heroesBlack);
        }

        //ход 7
        System.out.println("*************************************");
        heroesWhite.forEach(n -> n.step(heroesBlack));//ход
        System.out.println("*************************************");
        heroesBlack.forEach(n -> n.step(heroesWhite));//ход

        heroesWhite.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");
        heroesBlack.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");//вывод

        for (Hero heroWhite : heroesWhite) {
            System.out.print("У " + heroWhite.classHero + " " + heroWhite.nameHero + " ближайшая цель: ");
            (heroWhite).showDistanceToEnemies(heroesBlack);
        }

        //ход 8
        System.out.println("*************************************");
        heroesWhite.forEach(n -> n.step(heroesBlack));//ход
        System.out.println("*************************************");
        heroesBlack.forEach(n -> n.step(heroesWhite));//ход

        heroesWhite.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");
        heroesBlack.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");//вывод

        for (Hero heroWhite : heroesWhite) {
            System.out.print("У " + heroWhite.classHero + " " + heroWhite.nameHero + " ближайшая цель: ");
            (heroWhite).showDistanceToEnemies(heroesBlack);
        }


        //ход 1
        System.out.println("*************************************");
        heroesWhite.forEach(n -> n.step(heroesBlack));//ход
        System.out.println("*************************************");
        heroesBlack.forEach(n -> n.step(heroesWhite));//ход

        heroesWhite.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");
        heroesBlack.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");//вывод

        for (Hero heroWhite : heroesWhite) {
            System.out.print("У " + heroWhite.classHero + " " + heroWhite.nameHero + " ближайшая цель: ");
            (heroWhite).showDistanceToEnemies(heroesBlack);
        }

        //ход 2
        heroesWhite.forEach(n -> n.step(heroesBlack));//ход
        System.out.println("*************************************");
        heroesBlack.forEach(n -> n.step(heroesWhite));//ход

        heroesWhite.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");
        heroesBlack.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");//вывод

        for (Hero heroWhite : heroesWhite) {
            System.out.print("У " + heroWhite.classHero + " " + heroWhite.nameHero + " ближайшая цель: ");
            (heroWhite).showDistanceToEnemies(heroesBlack);
        }

        //ход 3
        System.out.println("*************************************");
        heroesWhite.forEach(n -> n.step(heroesBlack));//ход
        System.out.println("*************************************");
        heroesBlack.forEach(n -> n.step(heroesWhite));//ход

        heroesWhite.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");
        heroesBlack.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");//вывод

        for (Hero heroWhite : heroesWhite) {
            System.out.print("У " + heroWhite.classHero + " " + heroWhite.nameHero + " ближайшая цель: ");
            (heroWhite).showDistanceToEnemies(heroesBlack);
        }

        //ход 4
        System.out.println("*************************************");
        heroesWhite.forEach(n -> n.step(heroesBlack));//ход
        System.out.println("*************************************");
        heroesBlack.forEach(n -> n.step(heroesWhite));//ход

        heroesWhite.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");
        heroesBlack.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");//вывод

        for (Hero heroWhite : heroesWhite) {
            System.out.print("У " + heroWhite.classHero + " " + heroWhite.nameHero + " ближайшая цель: ");
            (heroWhite).showDistanceToEnemies(heroesBlack);
        }

        //ход 5
        System.out.println("*************************************");
        heroesWhite.forEach(n -> n.step(heroesBlack));//ход
        System.out.println("*************************************");
        heroesBlack.forEach(n -> n.step(heroesWhite));//ход

        heroesWhite.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");
        heroesBlack.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");//вывод

        for (Hero heroWhite : heroesWhite) {
            System.out.print("У " + heroWhite.classHero + " " + heroWhite.nameHero + " ближайшая цель: ");
            (heroWhite).showDistanceToEnemies(heroesBlack);
        }

        //ход 6
        System.out.println("*************************************");
        heroesWhite.forEach(n -> n.step(heroesBlack));//ход
        System.out.println("*************************************");
        heroesBlack.forEach(n -> n.step(heroesWhite));//ход

        heroesWhite.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");
        heroesBlack.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");//вывод

        for (Hero heroWhite : heroesWhite) {
            System.out.print("У " + heroWhite.classHero + " " + heroWhite.nameHero + " ближайшая цель: ");
            (heroWhite).showDistanceToEnemies(heroesBlack);
        }

        //ход 7
        System.out.println("*************************************");
        heroesWhite.forEach(n -> n.step(heroesBlack));//ход
        System.out.println("*************************************");
        heroesBlack.forEach(n -> n.step(heroesWhite));//ход

        heroesWhite.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");
        heroesBlack.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");//вывод

        for (Hero heroWhite : heroesWhite) {
            System.out.print("У " + heroWhite.classHero + " " + heroWhite.nameHero + " ближайшая цель: ");
            (heroWhite).showDistanceToEnemies(heroesBlack);
        }

        //ход 8
        System.out.println("*************************************");
        heroesWhite.forEach(n -> n.step(heroesBlack));//ход
        System.out.println("*************************************");
        heroesBlack.forEach(n -> n.step(heroesWhite));//ход

        heroesWhite.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");
        heroesBlack.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************************************");//вывод

        for (Hero heroWhite : heroesWhite) {
            System.out.print("У " + heroWhite.classHero + " " + heroWhite.nameHero + " ближайшая цель: ");
            (heroWhite).showDistanceToEnemies(heroesBlack);
        }
    }

    static ArrayList<Hero> heroesWhite = new ArrayList<>();
    static ArrayList<Hero> heroesBlack = new ArrayList<>();

    static ArrayList<Hero> generateCommand(int n, int y) {
        ArrayList<Hero> commandHeroes = new ArrayList<>();
        Random random = new Random();
        int rand;
//        int left = 0;
//        int right = 9;
        for (int i = 0; i < 10; i++) {
            rand = random.nextInt(1, 5) + n;
            switch (rand) {
                case 1:
                    commandHeroes.add(new Crossbower(getName(), i, y));
                    break;
                case 2:
                    commandHeroes.add(new Monk(getName(), i, y));
                    break;
                case 3:
                    commandHeroes.add(new Pikeman(getName(), i, y));
                    break;
                case 4:
                    commandHeroes.add(new Peasant(getName(), i, y));
                    break;
                case 5:
                    commandHeroes.add(new Rogue(getName(), i, y));
                    break;
                case 6:
                    commandHeroes.add(new Sniper(getName(), i, y));
                    break;
                case 7:
                    commandHeroes.add(new Wizard(getName(), i, y));
            }
        }
        return commandHeroes;
    }

    static String getName() {
        return NameOfHeroes.values()[new Random().nextInt(NameOfHeroes.values().length - 1)].name();
    }


}

