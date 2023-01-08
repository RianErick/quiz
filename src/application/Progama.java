package application;

import model.Usuario;
import util.Header;
import util.Perguntas;

import java.util.Scanner;

public class Progama {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Header.Inicial();
        System.out.println("DIGITE SEU NOME PARA COMEÇAR:");
        String nome = sc.nextLine();
        System.out.println("DIGITE SEU EMAIL:");
        String email = sc.nextLine();

        int VetorSize = 1;
        int[] size = new int[VetorSize];
        int pontuacao  = 0;
        Usuario usuario = new Usuario(nome, email, pontuacao);

        Perguntas.resposta = false;

        int alternativa;
        for (int i = 0; i < VetorSize; i++) {
            Perguntas.Pergunta01();
            alternativa = sc.nextInt();
            Perguntas.Alternativas01(alternativa);
            if(Perguntas.resposta){
                pontuacao++;
            }
            Perguntas.Pergunta02();
            alternativa = sc.nextInt();
            Perguntas.Alternativas02(alternativa);
            if(Perguntas.resposta){
                pontuacao++;
            }

        }
        System.out.println(" OLÁ JOGADOR : " + usuario.getNome() );
        System.out.println("SUA PONTUAÇAO " + pontuacao);
    }
}
