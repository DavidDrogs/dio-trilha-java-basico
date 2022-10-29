import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExerciciosProsposto {
    public static void main(String[] args) throws Exception {
        
        List<Double> temperaturas = new ArrayList<Double>();
        Scanner scan = new Scanner(System.in);

        System.out.println("---\texercicio 1\t---");

        //Adicionando as temperaturas na lista:
        int count = 0;
        while (true) {
            if(count == 6) break;

            System.out.print("Digite a temperatura: ");
            double temp = scan.nextDouble();
            temperaturas.add(temp);
            count++;
        }
        System.out.println("-------------------------------");

        //exibindo todas as temperaturas:
        System.out.print("Todas as temperaturas: ");
        temperaturas.forEach(t -> System.out.print(t + " "));

        //calculando e exibindo a media das temperaturas
        double media = temperaturas.stream()
            .mapToDouble(Double::doubleValue)
            .average()
            .orElse(0d);
        System.out.printf("\nMedia das temperaturas: %.1f\n", media);

        //exibindo as temperaturas acima da media
        System.out.println("temperaturas acima da media: ");
        temperaturas.stream()
            .filter(t -> t > media)
            .forEach(t -> System.out.printf("%.1f ", t));

        
        //exibindo o mês das temperaturas acima da média por extenso:
        System.out.println("\n\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator = temperaturas.iterator();

        count = 0;
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp > media) {
                switch (count) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n ", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            count++;
        }

        //Exercicio 2
        System.out.println("--\tExercicio 2\t-----");
        List<String> respostas = new ArrayList<>();

        System.out.println("Perguntas: ");
        System.out.print("\nTelefonou para vítima? ");
        String resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Esteve no local do crime? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Mora perto da vítima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Devia para vítima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Já trabalhou com a vítima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);

        int count2 = 0;
        Iterator<String> contador = respostas.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("s")) {
                count2 ++;
            }
        }

        switch(count2) {
            case 2:
                System.out.println(">> SUSPEITA <<"); break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<"); break;
            case 5:
                System.out.println(">> ASSASSINO <<"); break;
            default:
                System.out.println(">> INOCENTE <<"); break;
        }

    }
}
