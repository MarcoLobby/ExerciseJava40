package it.DevelHope.ExerciseJava40;

public class Start {

    public enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
        JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public static void main(String[] args) {

        for (Month month : Month.values()){
            String name = month.name();
            if (name.endsWith("Y")) {
                System.out.println(name + " ends with 'y'");
            }
            else {
                System.out.println(name + " doesn't ends with 'y'");
            }
        }

    }
}
