/******************************************************************************
 *
 * Reiknar fjórar breytur og prentar svörin út
 *
 ******************************************************************************/

public class Reikna {

    public static void main(String[] args) {
        int a1 = 2 + 20 / 10 * 2;
        int a2 = 2 / 3 / 2;
        String a3 = "2" + true;
        String a4 = 5.1 + 3.0 + "5";

        int result1;
        int result2;
        String result3;
        String result4;

        result1 = a1;
        result2 = a2;
        result3 = a3;
        result4 = a4;
        System.out.print(+result1 + " " + result2 + " " + result3 + " " + result4);
    }

}
