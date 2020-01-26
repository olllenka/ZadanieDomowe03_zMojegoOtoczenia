public class Main {
    public static void main(String[] args) {
        Couch couch1 = new Couch();
        Couch couch2 = new Couch();

        couch1.name = "Kanapa do salonu";
        couch1.colour = "Szary";
        couch1.seats = 3;
        couch1.withSleepFunction = true;

        couch2.name = "Kanapa";
        couch2.colour = "Granatowy";
        couch2.seats = 2;
        couch2.withSleepFunction = false;

        System.out.println(couch1.name);
        System.out.println("Kolor: " + couch1.colour);
        System.out.println("Ilość miejsc siedzących: " + couch1.seats);
        System.out.println("Posiada funkcje spania: " + couch1.withSleepFunction);
        System.out.println();

        System.out.println(couch2.name);
        System.out.println("Kolor: " + couch2.colour);
        System.out.println("Ilość miejsc siedzących: " + couch2.seats);
        System.out.println("Posiada funkcje spania: " + couch2.withSleepFunction);
    }
}
