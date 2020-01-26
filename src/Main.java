public class Main {
    public static void main(String[] args) {
        Couch couch1 = new Couch("Kanapa do salonu", "Szary", 3, true);
        Couch couch2 = new Couch("Kanapa", "Granatowy", 2, false);

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
