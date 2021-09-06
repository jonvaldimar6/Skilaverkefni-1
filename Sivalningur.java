
public class Sivalningur {
    public static void main(String[] args) {

        //Setjum inn double gildi fyrir arguments

        double r = Double.parseDouble(args[0]);
        double h = Double.parseDouble(args[1]);

        //Setjum inn jöfnur flatar- og rúmmáls sívalnings

        double A = ((2 * Math.PI * r)) * (r + h);
        double B = (Math.PI * (r * r) * h);

        //Prentum svo út texta ásamt jöfnunum sem við skrifuðum hér að ofan.

        System.out.println("Flatarmál sívalnings með radíus 1.5 og hæð 3.0 er " + A);
        System.out.println("Rúmmál sívalningsins með radíus 1.5 og hæð 3.0 er " + B);


    }
}
