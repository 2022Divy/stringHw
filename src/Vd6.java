public class Vd6 {
    //6. Write a java program which replace a “I@love@java” to “we love java”
    //Expected output: We love java

    String p = "I@love@java", q= "we love java", r;

    public static void main(String[] args) {
        Vd3 x = new Vd3();
        x.reply();

    }

    public void reply(){
        r = p.replaceAll(p,q);
        System.out.println(r);

    }
}

