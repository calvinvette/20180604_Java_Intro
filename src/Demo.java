public class Demo {

    public static void main(String[] args) {
        String str1 = "foo"; //1
        System.out.println(str1 + ": " + str1.length());
        // (str1 + ": ") // 2
        // () + length // 3

//        str1.concat(": ").concat(str1.length())
        System.out.println(str1.toUpperCase().substring(0, 4).length());
    }

}
