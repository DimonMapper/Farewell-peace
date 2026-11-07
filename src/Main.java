

void main() {


    // 1 task
    int[] inputArray1 = {1200, 850, 2300, 400, 1750};

    // Начальные значения берем из первого элемента
    int sum = inputArray1[0];
    int max = inputArray1[0];
    int min = inputArray1[0];

    for (int i = 1; i < inputArray1.length; i++) {
        sum += inputArray1[i];
        if (inputArray1[i] > max) {
            max = inputArray1[i];
        }
        if (inputArray1[i] < min) {
            min = inputArray1[i];
        }
    }
    double average = (double) sum / inputArray1.length;

    double[] outputArray1 = {sum, max, min, average};

    System.out.println("inputArray1:  " + Arrays.toString(inputArray1));
    System.out.println("outputArray1: " + Arrays.toString(outputArray1));
    System.out.println("  ");

// 2 task

    int[] inputArray2 = {50000, 72500, 1250, 98000, 35400};
    double[] outputArray2 = new double[inputArray2.length];

    for (int i = 0; i < inputArray2.length; i++) {

        outputArray2[i] = inputArray2[i] * 0.13;
    }

    System.out.println("inputArray2:  " + Arrays.toString(inputArray2));
    System.out.println("outputArray2: " + Arrays.toString(outputArray2));
    System.out.println("  ");

    // 3 task



    int[] inputArray3 = {4200, 7500, 5000, 12000, 3100};
    boolean[] outputArray3 = new boolean[inputArray3.length];

    for (int i = 0; i < inputArray3.length; i++) {
        outputArray3[i] = inputArray3[i] > 5000;
    }

    System.out.println("inputArray3:  " + Arrays.toString(inputArray3));
    System.out.println("outputArray3: " + Arrays.toString(outputArray3));
    System.out.println("  ");

    // 4 task

    int[] inputArray4 = {15000, 8200, -3400, 5100, -700};
    boolean[] outputArray4 = new boolean[1];
    outputArray4[0] = true;

    for (int j : inputArray4) {
        if (j < 0) {
            outputArray4[0] = false;
            break;
        }
    }

    System.out.println("inputArray4:  " + Arrays.toString(inputArray4));
    System.out.println("outputArray4: " + Arrays.toString(outputArray4));
    System.out.println("  ");


    // 5 task

    int[] inputArray5 = {250000, -80000, 0, 410000, 120000};
    int[] outputArray5 = new int[1];

    for (int i : inputArray5) {
        if (i > 0) {
            outputArray5[0]++;
        }
    }

    System.out.println("inputArray5:  " + Arrays.toString(inputArray5));
    System.out.println("outputArray5: " + Arrays.toString(outputArray5));
    System.out.println("  ");
 /*
*/
}