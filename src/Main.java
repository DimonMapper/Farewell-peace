

void main() {


    // 1 task

    int [] weight = new int []{1, 2, 3};
    float [] umber = {1.57f, 7.654f, 9.986f};
    byte[] bit = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    // 2 task


    for (int oneNumber = 0; oneNumber < weight.length; oneNumber++) {
        System.out.print(weight[oneNumber]);
        if (weight.length > (oneNumber +1) ) {
            System.out.print(", ");
        }
    }
    System.out.println(" ");
    System.out.println(" ");

    for (int twoNumber = 0; twoNumber < umber.length; twoNumber++) {
        System.out.print(umber[twoNumber]);
        if (umber.length > (twoNumber +1) ) {
            System.out.print(", ");
        }
    }
    System.out.println(" ");
    System.out.println(" ");

    for (int threeNumber = 0; threeNumber < bit.length; threeNumber++) {
        System.out.print(bit[threeNumber]);
        if (bit.length > (threeNumber +1) ) {
            System.out.print(", ");
        }
    }
    System.out.println(" ");
    System.out.println(" ");

    // 3 task

    for (int oneNumber = weight.length - 1 ; oneNumber >= 0; oneNumber--) {
        System.out.print(weight[oneNumber]);
        if ( oneNumber > 0  ) {
            System.out.print(", ");
        }
    }

    System.out.println(" ");
    System.out.println(" ");

    for (int twoNumber =umber.length - 1 ; twoNumber >= 0; twoNumber--) {
        System.out.print(umber[twoNumber]);
        if ( twoNumber > 0  ) {
            System.out.print(", ");
        }
    }
    System.out.println(" ");
    System.out.println(" ");


    for (int threeNumber =bit.length - 1 ; threeNumber >= 0  ; threeNumber--) {
        System.out.print(bit[threeNumber]);
        if ( threeNumber > 0  ) {
            System.out.print(", ");
        }
    }
    System.out.println(" ");
    System.out.println(" ");


    for (int oneNumber = 0; oneNumber < weight.length; oneNumber++) {

        if (weight[oneNumber]%2 != 0) {
            weight[oneNumber] = weight[oneNumber] + 1;
        }
    }
    System.out.println(Arrays.toString(weight));


}