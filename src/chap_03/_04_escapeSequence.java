package chap_03;

public class _04_escapeSequence {
    public static void main(String[] args) {
//        //escpae sequence , char
//        \n \t \/

        //quiz

        String id1, id2;

        id1 = "941119-1323123";
        id2 = "031223-3132145";

        System.out.println(id1.substring(0,id1.indexOf('-')+2));
//id1.indexOf('-')+1
        System.out.println(id1.substring(0,id2.indexOf('-')+2));

    }
}
