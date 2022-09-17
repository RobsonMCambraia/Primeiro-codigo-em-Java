public class Main {
    public static void main(String[] args) {
        int np1 = 4, np2 = 4, aprovados = 0, reprovados = 0;
        float media = (float) (np1 + np2) / 2;

            System.out.println("Sua média é: " + media);

            if (media >= 7) {
                System.out.println("Você está aprovado!");
                aprovados++;
            } else if (media >= 4) {
                System.out.println("Você está de recuperação.");
                int nf = 6;
                float media_f = (float) (media + nf) / 2;

                System.out.println("Média obtida na recuperação: " + media_f);

                if (media_f >= 7) {
                    System.out.println("Você foi aprovado na recuperação!");
                    aprovados++;
                } else {
                    System.out.println("Você foi reprovado na recuperação.");
                    reprovados++;
                }

            } else {
                System.out.println("Você está reprovado.");
                reprovados++;
            }

            System.out.printf("Quantidade de aprovados: %s \n", aprovados);
            System.out.printf("Quantidade de reprovados: %s \n", reprovados);
    }
}