package Unit_2.Labs;

public class MessageDecoder {
    public static void main(String args[]) {

        String message1;
        String message2;
        String message3;
        String message4;
        String message5;
        String message6;
        String message7;
        String message8;

        System.out.println("\nAlex Zhang\n");

//        print first encoded message
//        print each decoding step
        message1 = "ThCiw^isIs4SecN3]Qfb7Mess4g3!";
        System.out.println(message1);
        message1 = message1.replace('N', 'r');
        System.out.println(message1);
        message1 = message1.replace(']', 't');
        System.out.println(message1);
        message1 = message1.replace('7', '5');
        System.out.println(message1);
        message1 = message1.substring(0,17) + message1.substring(21);
        System.out.println(message1);
        message1 = message1.substring(0,2) + message1.substring(6);
        System.out.println(message1);
        System.out.println("---------------------");

//        print second encoded message
//        print each decoding step
        message2 = "B3++NrQ$ThanQPyth[n\\?dnH=J@v4Q#";

        message2 = message2.substring(19,31) + message2.substring(0,19);
        System.out.println(message2);
        message2 = message2.substring(6);
        System.out.println(message2);
        message2 = message2.replace('N', 'e');
        System.out.println(message2);
        message2 = message2.replace('Q', '_');
        System.out.println(message2);
        message2 = message2.replace('[', 'o');
        System.out.println(message2);
        message2 = message2.replace('@', 'a');
        System.out.println(message2);
        message2 = message2.replace('4', 'a');
        System.out.println(message2);
        message2 = message2.replace('+', 't');
        System.out.println(message2);
        message2 = message2.replace('3', 'e');
        System.out.println(message2);
        message2 = message2.replace('$', ' ');
        System.out.println(message2);
        message2 = message2.replace('#', ' ');
        System.out.println(message2);
        message2 = message2.replace('-', ' ');
        System.out.println(message2);
        System.out.println("---------------------");

//        print third encoded message
//        print each decoding step
        message3 = "QRk8BQ41592I__lov3_3-1NN";
        System.out.println(message3);

        message3 = message3.substring(1,24) + message3.charAt(0);
        System.out.println(message3);
        message3 = message3.substring(5,21);
        System.out.println(message3);
        message3 = message3.substring(5,16) + message3.substring(0,5);
        System.out.println(message3);
        System.out.println("---------------------");

//        print forth encoded message
//        print each decoding step

        message4 = "?upKUDr.jeXkR?edy_Aw5=me4";
        System.out.println(message4);

        message4 = message4.substring(5,24);
        System.out.println(message4);
        message4 = message4.replace('?', 'e');
        System.out.println(message4);
        message4 = message4.replace('=', 'o');
        System.out.println(message4);
        message4 = message4.replace('5', 's');
        System.out.println(message4);
        message4 = message4.substring(0,3) + message4.substring(7);
        System.out.println(message4);
        System.out.println("---------------------");

//        print fifth encoded message
//        print each decoding step
        message5 = "!!!1u1hUjly0U__pkMDiD_It!!";
        System.out.println(message5);

        message5 = message5.substring(0,15) + message5.substring(18);
        System.out.println(message5);
        message5 = message5.substring(4) + message5.substring(0,4);
        System.out.println(message5);
        message5 = message5.substring(6,21);
        System.out.println(message5);
        System.out.println("---------------------");

//        print sixth encoded message
//        print each encoding step
        message6 = "M5ell0,T54tsppAl:oA72";
        System.out.println(message6);

        message6 = message6.substring(18) + message6.substring(0,18);
        System.out.println(message6);
        message6 = message6.substring(4,20);
        System.out.println(message6);
        message6 = message6.replace('p', '-');
        System.out.println(message6);
        message6 = message6.replace('5', 'H');
        System.out.println(message6);
        message6 = message6.replace(':', '1');
        System.out.println(message6);
        System.out.println("---------------------");

//        print seventh encoded message
//        print each encoding step
        message7 = "2.HrsthIsuhK\\!To0K_M3";
        System.out.println(message7);

        message7 = message7.substring(17) + message7.substring(0, 17);
        System.out.println(message7);
        message7 = message7.substring(9) + message7.substring(0,9);
        System.out.println(message7);
        message7 = message7.substring(0,4) + message7.substring(8);
        System.out.println(message7);
        System.out.println("---------------------");

//        print eighth encoded message
//        print each encoding step

        message8 = "Qi:yvL3Fj3s\\”\\”Y";
        System.out.println(message8);

        message8 = message8.substring(3) + message8.substring(0,3);
        System.out.println(message8);
        message8 = message8.substring(6,13);
        System.out.println(message8);
        message8 = message8.substring(5) + message8.substring(0,5);
        System.out.println(message8);
        System.out.println("---------------------");
    }

}