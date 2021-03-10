import java.util.Arrays;

public class T1 {
    private double[] inputData;

    public static void run() {

        T1 main = new T1();
        main.getInput();

        System.out.println(Arrays.toString(main.getTargetArray()));
    }

    private double[] getTargetArray(){
        double[] data = this.inputData;

        int i = data.length;

        double[] output = new double[i + 1];
        output[i] = 1;

        while (i > 0) {
            i--;
            output[i] = data[i] * output[i + 1];
        }

        return Arrays.copyOf(output, output.length - 1);
    }

    private void getInput(){
        this.inputData = new double[]{1.0, 2.0, 3.0, 4.0};
    }
}
