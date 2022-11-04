package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollars = Converter.rubleToDollar(13500);
        System.out.println("13500 rubles are " + dollars + " dollars.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float inRubles = 13500;
        float expectedDollars = 225;
        float outDollars = Converter.rubleToDollar(inRubles);
        boolean successful = expectedDollars == outDollars;
        System.out.println("13500 rubles are 225 dollars. Test result: " + successful);
    }
}
