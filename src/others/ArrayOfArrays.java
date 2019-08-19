package others;

public class ArrayOfArrays {
    public static void main(String[] args) {
        int[][] ints = {{0, 1, 2,},{9,8}};

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                if (i + j >= 2)
//                    continue;
//                    break;
                System.out.println(ints[i][j]);
            }

        }
    }
}
