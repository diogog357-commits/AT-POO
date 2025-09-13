// Interface para ação de voar
interface Voador {
    void voar();
}

// Interface para ação de andar
interface Andador {
    void andar();
}

// Classe pai
class Animal {
    String nome;
    String raca;

    // Construtor
    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Raça: " + raca);
    }
}

// Classe filha Cachorro
class Cachorro extends Animal implements Andador {
    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    public void latir() {
        System.out.println(nome + " está latindo: Au au!");
    }

    // Implementação da ação de andar
    public void andar() {
        System.out.println(nome + " está andando.");
    }
}

// Nova classe Passaro
class Passaro extends Animal implements Voador, Andador {
    public Passaro(String nome, String raca) {
        super(nome, raca);
    }

    public void voar() {
        System.out.println(nome + " está voando.");
    }

    public void andar() {
        System.out.println(nome + " está andando.");
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Rex", "Pastor Alemão");
        Passaro meuPassaro = new Passaro("Piu", "Canário");

        meuCachorro.exibirInfo();
        meuCachorro.comer();
        meuCachorro.latir();
        meuCachorro.andar();

        System.out.println();

        meuPassaro.exibirInfo();
        meuPassaro.comer();
        meuPassaro.andar();
        meuPassaro.voar();
    }
}
