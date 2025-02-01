import java.util.Scanner;

public class Contador {
    private int valor;

    public Contador() {
        valor = 0;
    }

    public void incrementar() {
        valor++;
    }

    public void decrementar() {
        valor--;
    }

    public void exibirValor() {
        System.out.println("Valor do contador: " + valor);
    }

    public void contagem(int limite) throws Exception {
        if (limite < 0) {
            throw new Exception("O limite não pode ser negativo!");
        }
        while (valor < limite) {
            incrementar();
            exibirValor();
        }
        System.out.println("Contagem completa!");
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o limite da contagem: ");
            int limite = scanner.nextInt();
            
            Contador contador = new Contador();
            contador.contagem(limite); // contagem até o limite
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
