package util;

public class Perguntas {

    public static boolean resposta;

     public static void Pergunta01(){
         System.out.println(" 1 - QUAL FERRAMENTA E A MAIS USADA PARA VERSIONAR CODIGO? ");
         System.out.println("1 - JAVA");
         System.out.println("2 - LINKEDIN");
         System.out.println("3 - GIT-LAB");
         System.out.println("4 - GIT-HUB");
     }
    public static void Alternativas01(int alternativaCorreta){
       if (alternativaCorreta == 4){
           resposta = true;
       }
    }
    public static void Pergunta02(){
        System.out.println(" 2 - QUAL O PRINCIPAL FRAMEWORK DO DART? ");
        System.out.println("1 - JAVA");
        System.out.println("2 - FLUTTER");
        System.out.println("3 - C++");
        System.out.println("4 - REACT");
    }

    public static void Alternativas02(int alternativaCorreta){
        if (alternativaCorreta == 2){
            resposta = true;
        }

    }

    public static void Pergunta03(){
        System.out.println(" 3 - QUAL OPÇÁO É UM S.O ?");
        System.out.println("1 - DOCKER");
        System.out.println("2 - LINUX");
        System.out.println("3 - SQL");
        System.out.println("4 - VIRTUAL BOX");
    }
    public static void Alternativas03(int alternativaCorreta){
          if (alternativaCorreta == 2){
              resposta = true;
          }
    }

}
