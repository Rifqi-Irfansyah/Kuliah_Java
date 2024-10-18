package W9.SK2;

import java.text.DecimalFormat;

public class PaintThings {
    public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);

        Shape deck = new Rectangle(20, 35);
        Shape bigBall = new Sphere(15);
        Shape tank = new Cylinder(10, 30);

        System.out.println(deck.toString());
        System.out.println(bigBall.toString());
        System.out.println(tank.toString() + "\n");

        double deckAmt, ballAmt, tankAmt;

        deckAmt = paint.amount(deck);
        ballAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);

        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck     : " + fmt.format(deckAmt));
        System.out.println("Big Ball : " + fmt.format(ballAmt));
        System.out.println("Tank     : " + fmt.format(tankAmt));
    }
}