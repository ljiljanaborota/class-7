package class10;

import java.util.Arrays;

public class D2Array {
    public static void main(String[] args) {
        // a 2D array which can hold 3 one D arrays,each of size of 3
       String []cabin0={"Adam","Zafar","Sam"};
        String []cabin1={"Nabi","Saud","Anees"};
        String []cabin2={"Safi","Abeera","Zahra"};
       String[][] thomsonTrain=new String[3][3];
       thomsonTrain[0]=cabin0;
        thomsonTrain[1]=cabin1;
        thomsonTrain[2]=cabin2;
        // in the first [] we specify the address of 1 D ARRAY CABIN NUMBER
        // in the second [] we specify the address of 2 D ARRAY SEAT NUMBER
        System.out.println(thomsonTrain[1][2]);
        System.out.println(Arrays.toString(thomsonTrain[0]));

    }
}
