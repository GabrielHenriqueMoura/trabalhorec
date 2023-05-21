package jogadores;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private int quantidadeJogadores;
    private List<Jogador> jogadores;

    public Time(String nome, int quantidadeJogadores) {
        this.nome = nome;
        this.quantidadeJogadores = quantidadeJogadores;
        this.jogadores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeJogadores() {
        return quantidadeJogadores;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void adicionarJogador(String nomeJogador) {
        if (jogadores.size() < quantidadeJogadores) {
            Jogador jogador = new Jogador(nomeJogador);
            jogadores.add(jogador);
            System.out.println("Jogador \"" + nomeJogador + "\" adicionado ao time \"" + nome + "\"");
        } else {
            System.out.println("Limite máximo de jogadores atingido para o time \"" + nome + "\"");
        }
    }

    public void removerJogador(String nomeJogador) {
        for (Jogador jogador : jogadores) {
            if (jogador.getNome().equalsIgnoreCase(nomeJogador)) {
                jogadores.remove(jogador);
                System.out.println("Jogador \"" + nomeJogador + "\" removido do time \"" + nome + "\"");
                return;
            }
        }
        System.out.println("Jogador \"" + nomeJogador + "\" não encontrado no time \"" + nome + "\"");
    }
}