public class Vd3 {

    //3. Write a java program which replace a “I love java” to “we love java”
    //Expected output: We love java

    String a = "I Love java", b = "we love java", c;

    public static void main(String[] args) {
        Vd3 z = new Vd3();
        z.reply();

    }

    public void reply(){
        c = a.replaceAll(a,b);
        System.out.println(c);

    }
}
