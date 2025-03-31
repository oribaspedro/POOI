public class ExerciciosArray {

    public static int soma(int ... numeros) {
        int soma = 0;
        for(int num: numeros) {
            soma += num;
        }
        return soma;
    }

    public static void main(String[] args) {
        //1
        //Modo completo
        double arrayCompleto[] = new double[] {1, 2, 3, 4, 5};
        //Modo simplificado
        double arraySimplificado[] = {1, 2, 3, 4, 5};

        //2
        int arrayInteiros[] = new int[5];
        for(int i = 0; i < arrayInteiros.length; i++) {
            arrayInteiros[i] = i+1;
        }

        //3
        double arrayMedia[] = new double[] {5.2, 4.1, 9.5, 4.9, 7.2};
        double total = 0, media;
        for(int i = 0; i < arrayMedia.length; i++) {
            total += arrayMedia[i];
        }
        media = total / arrayMedia.length;
        System.out.println(media);

        //4
        int[] nums = { 99, -10, 100, 19, 977, -562, 463, -9, 287, 49 };
        int min, max;
        min = max = nums[0];
        for(int num: nums) {
            if(num < min)
                min = num;
            if(num > max)
                max = num;
        }
        System.out.println("Min e Max: " + min + " " + max);

        //5
        int pos1 = 0, pos2 = 1, dif = 0;
        int vet1[] = new int[] {12, 11, 9, 5, 2, 1};
        for(int i = 0; i < vet1.length-1; i++) {
            int x = i, y = i+1;
            if(vet1[x] - vet1[y] > dif) {
                dif = vet1[x] - vet1[y];
                pos1 = x;
                pos2 = y;
            }
        }
        System.out.println("Maior diferenca: " + dif + "\n" + "Posicoes: " + pos1 + " e " + pos2);

        //6
        System.out.println("Soma 1: " + soma(1, 2, 3, 4, 5, 6, 7, 8));
        System.out.println("Soma 2: " + soma(10, 10, 10, 2));

        //7
        int matriz[][] = new int[3][3];
        int k = 0;
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                matriz[i][j] = k;
                k++;
            }
        }
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.print('\n');
        }

    }
}
