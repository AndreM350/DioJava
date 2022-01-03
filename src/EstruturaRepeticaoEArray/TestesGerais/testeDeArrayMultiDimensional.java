package EstruturaRepeticaoEArray.TestesGerais;

public class testeDeArrayMultiDimensional {
    public static void main(String[] args) {


        int[][] idades = new int[][]{{12, 35}, {45, 22}};

        for (int[] id1 : idades) {
            for (int id2 : id1) {
                System.out.println(id2);

            }


        }


    }
}
