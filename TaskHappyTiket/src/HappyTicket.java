
public class HappyTicket {

    public static void sixFor(){

        int firstDial []  = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int secondDial [] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int thirdDial []  = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int fourDial []   = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int fifthDial []  = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sixDial []    = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int a = 0;

        for (int i = 0; i < firstDial.length; i++){
            for (int i2 = 0; i2 < secondDial.length; i2++){
                for (int i3 = 0; i3 < thirdDial.length; i3++){
                    for (int i4 = 0; i4 < fourDial.length; i4++){
                        for (int i5 = 0; i5 < fifthDial.length; i5++){
                            for (int i6 = 0; i6 < sixDial.length; i6++){
                                if (firstDial[i]+secondDial[i2]+thirdDial[i3] == fourDial[i4]+fifthDial[i5]+sixDial[i6]){
                                    a++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(a);
    }


    public static void main(String[] args){

        sixFor();

    }
}

