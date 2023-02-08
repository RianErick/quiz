package application;
import model.Usuario;
import util.Header;
import util.Perguntas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Progama {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Header.Inicial();
        System.out.println("DIGITE SEU NOME PARA COMEÇAR:");
        String nome = sc.nextLine();
        System.out.println("DIGITE SEU EMAIL:");
        String email = sc.nextLine();




        int  pontuacao  = 0;
        Usuario usuario = new Usuario(nome, email, pontuacao);

        Perguntas.resposta = false;

           int alternativa;

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
            Perguntas.Pergunta03();
            alternativa = sc.nextInt();
            Perguntas.Alternativas03(alternativa);
            if(Perguntas.resposta){
                pontuacao++;

        }

        FileWriter arq = new FileWriter("C:\\Projetos_Software\\PerguntasRespostas\\src\\util\\result.txt");

        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.printf(" PONTUACAO DO JORGADOR :  " +
                           usuario.getNome() + " = " +
                           pontuacao);
        arq.close();

        System.out.println("Consulte o arquivo result.txt para saber seu resultado , obrigado :)");


    }
}
