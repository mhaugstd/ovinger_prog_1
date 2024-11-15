package oving5_1;

public class ui5_1 {
    public static void main(String[] args) {
        Brok brok1 = new Brok(3, 4);
        Brok brok2 = new Brok(2, 5);

        System.out.println("Brøk 1: " + brok1);
        System.out.println("Brøk 2: " + brok2);

        Brok sum = brok1.summer(brok2).forkort();
        System.out.println("Sum: " + sum);

        Brok differanse = brok1.subtraher(brok2).forkort();
        System.out.println("Differanse: " + differanse);

        Brok produkt = brok1.multipliser(brok2).forkort();
        System.out.println("Produkt: " + produkt);

        Brok kvotient = brok1.divider(brok2).forkort();
        System.out.println("Kvotient: " + kvotient);
    }
}