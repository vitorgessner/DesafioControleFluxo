import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt();

        terminal.close();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            throw new ParametrosInvalidosException("Segundo parametro deve ser menor que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois < parametroUm) {
            int contador = parametroUm - parametroDois;
            for (int i = 0; i < contador; i++) {
                System.out.println("Imprimindo número " + (i + 1));
            }
        } else {
            throw new ParametrosInvalidosException();
        }
    }
}
