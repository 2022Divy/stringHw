public class Vd2 {

    //2. Write a java program which remove extra space from both side “ I love
    //java ”
    //Expected output: “I love java”

    static String z = "  I LOVE YOU  ",y;

    public static void main(String[] args) {

        space();

    }

    public static void space(){

        y=z.trim();
        System.out.println(y);

    }

}
