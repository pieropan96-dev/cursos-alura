package br.com.alura.switchexpression;

public class Teste {

    public static void main(String[] args) {
        String nome = "Jo�o";
        switch (nome) {
            case "Renata" -> System.out.println("N�o � renata!");
            case "Fernando" -> System.out.println("N�o � fernando!");
            case "Jo�o" -> System.out.println("Acertou!");
            default -> System.out.println("Nenhum resultado encontrado!");
        }
    }
}
