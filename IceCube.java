import java.util.Scanner;

/*Crie um vetor de números reais (double[]) com capacidade para 10 elementos, denominado energias.
Cada posição representa o nível de energia (em Tera-eletronvolts, 
TeV
) registrado por um sensor individual.*/

public class IceCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] energias = new double[10];
        double maior = 0;
        double soma = 0;
        int maior_indice = 0;
        int altissima_energia = 0;
        


        System.out.println("=== SISTEMA DE MONITORAMENTO DE NEUTRINOS - ICECUBE ===");
        System.out.println("Informe os níveis de energia registrados (em TeV): ");

    for (int i = 0; i < energias.length; i++ ) {
        System.out.print("Sensor: ["+ i +"]: ");
        energias[i] = sc.nextDouble();

        soma += energias[i];

        if (i == 0 || energias[i] > maior) {
            maior = energias[i];
            maior_indice = i;            
        }

        if (energias[i] > 100) {
            altissima_energia++;

        }

    }
        double media = soma / energias.length;
        System.out.println("=== RELATÓRIO DE DETECÇÃO DE PARTÍCULAS FANTASMA ===");
        System.out.println("Média de energia capturada: " + media);
        System.out.println("Maior pico de energia: " + maior + maior_indice + "TeV (registrado no Sensor [3])");
        System.out.println("Total de sensores com evento > 100 TeV: " + altissima_energia);

        
    sc.close();
    }
}



