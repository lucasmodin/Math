import java.util.Scanner;
public class diskriminantOgRødder {
  Scanner input = new Scanner(System.in);
  private variabler diskriminant;
  private double disk;
  private double rod1;
  private double rod2;

    public diskriminantOgRødder(Scanner input) {
      this.diskriminant = new variabler(input.nextDouble(), input.nextDouble(), input.nextDouble());

    }

    public double getDiskriminant(){

    disk = Math.pow(diskriminant.getB(),2)-(4*diskriminant.getA()*diskriminant.getC());
    return disk;
    }

    public void getRødder() {
      if (disk < 0) {
        System.out.println("Diskriment is negative. Cannot solve complex roots");
      } else if (disk == 0) {
        rod1 = ((-diskriminant.getB()) / 2*diskriminant.getA());
        System.out.println("Diskriment is " + disk + " Only one root " + rod1);
      } else {
        rod1 = ((-diskriminant.getB()-Math.sqrt(disk)) / 2*diskriminant.getA());
        rod2 = ((-diskriminant.getB()+Math.sqrt(disk)) / 2*diskriminant.getA());
        System.out.println("Diskriment is " + disk +  " The roots are " + rod1 + " " + rod2);
      }
    }
}
