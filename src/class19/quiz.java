package class19;

public class quiz {
    public static void main(String[] args) {
        String str = "0123456789";
        System.out.println(str.substring(4));
        String word ="abrakadabra";

        String replace=word.replaceAll("[^aAeEiIoOuU]", "");

        System.out.println(replace);

    }
}
