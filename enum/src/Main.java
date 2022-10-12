import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Music music=Music.CLASSIC;
        //створення обэкта класа
        Music music1=Music.valueOf("ROCK");

        //переглянути всі елементи
        for (Music element:Music.values())
            System.out.println(element);

        Music[]m=Music.values();
        System.out.println(Arrays.toString(m));
        //№
        System.out.println(music1.ordinal());


        switch (music){
            case ROCK -> System.out.println("rock");
            case CLASSIC -> System.out.println("classic");
            case POP -> System.out.println("pop");
        }

        //-------------------
        Music2 mc=Music2.POP;
        System.out.println(mc.getI());
        System.out.println(mc.getName());
        //metod
        mc.m();
        System.out.println(Music2.CLASSIC);

    }
}