public class Ecker_MethodenOhneParameter {

    public static void main(String[] args) {
        String hello = "hallo";

        writeStars();
        System.out.println();
        System.out.printf("%22s \n", hello);
        writeLine();
    }

    static void writeStars() {
        for (int i = 0; i < 40; i++){
            System.out.print("*");
        }
    }

    static void writeLine(){
        for (int i = 0; i < 40; i++) {
            System.out.print("=");
        }
    }
}
