package dados;

import java.util.Scanner;

public class quiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int acertos = 0;

        cabecalho cabecalho1 = new cabecalho();

        cabecalho1.Faculdade = "Faculdade: Centro Universitário Alfredo Nasser";
        cabecalho1.Aluno = "Aluno: Heloisa de Castro Miranda";
        cabecalho1.Professor = "Professor: Brenno Pimenta";
        cabecalho1.Disciplina = "Disciplina: Algoritmos e Programaçao II";
        cabecalho1.Inicio = "Bem Vindo ao Quiz!";
        cabecalho1.escrevaCabecalho();

        questoes questoes1 = new questoes();

        questoes1.questoes = "1- Qual é o título do primeiro romance de Agatha Christie, publicado em 1920?";
        questoes1.A = "A) Assassinato no Expresso Oriente";
        questoes1.B = "B) O Misterioso Caso de Styles";
        questoes1.C = "C) O Assassinato de Roger Ackroyd";
        questoes1.D = "D) Os Crimes ABC ";
        questoes1.E = "E) Morte na Mesopotâmia";
        questoes1.escrevaquestao();
        questoes1.correta = "B";
        System.out.println("Digite a alternativa correta: ");
        String resposta = (String) sc.nextLine();
        if (questoes1.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("====================================================================== ");
        questoes questoes2 = new questoes();
        questoes2.questoes = "2- Quem é o famoso detetive belga criado por Agatha Christie?";
        questoes2.A = "A) Hercule Poirot";
        questoes2.B = "B) Miss Marple";
        questoes2.C = "C) Tommy e Tuppence";
        questoes2.D = "D) Superintendent Battle";
        questoes2.E = "E) Ariadne Oliver";
        questoes2.escrevaquestao();
        questoes2.correta = "A";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes2.iscorreta(resposta)) {
            acertos = acertos + 1;
        }
        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");
        questoes questoes3 = new questoes();
        questoes3.questoes = "3- Em O Assassinato de Roger Ackroyd, quem é o narrador da história?";
        questoes3.A = "A) Hercule Poirot";
        questoes3.B = "B) Roger Ackroyd";
        questoes3.C = "C) Dr. Sheppard";
        questoes3.D = "D) Caroline Sheppard";
        questoes3.E = "E) Ralph Paton";
        questoes3.escrevaquestao();
        questoes3.correta = "C";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes3.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");
        questoes questoes4 = new questoes();
        questoes4.questoes = "4- Qual é o título original do romance Assassinato no Expresso Oriente?";
        questoes4.A = "A) Murder on the Orient Express";
        questoes4.B = "B) The Mysterious Affair at Styles";
        questoes4.C = "C) And Then There Were None";
        questoes4.D = "D) The Murder of Roger Ackroyd";
        questoes4.E = "E) Death on the Nile";
        questoes4.escrevaquestao();
        questoes4.correta = "A";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes4.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");
        questoes questoes5 = new questoes();
        questoes5.questoes = "5- Em O Caso dos Dez Negrinhos, onde se passa a história?";
        questoes5.A = "A) Ilha do Soldado";
        questoes5.B = "B) Mansão Styles";
        questoes5.C = "C) Castelo de Lymstock";
        questoes5.D = "D) Ilha do Negro";
        questoes5.E = "E) Mansão Blackheath";
        questoes5.escrevaquestao();
        questoes5.correta = "A";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes5.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");
        questoes questoes6 = new questoes();
        questoes6.questoes = "6- Qual é a ocupação de Miss Marple, a detetive amadora?";
        questoes6.A = "A) Advogada";
        questoes6.B = "B) Médica";
        questoes6.C = "C) Escritora";
        questoes6.D = "D) Professora";
        questoes6.E = "E) Jardineira";
        questoes6.escrevaquestao();
        questoes6.correta = "E";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes6.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");
        questoes questoes7 = new questoes();
        questoes7.questoes = "7- Qual é o nome do famoso livro em que Agatha Christie mata seu personagem principal, causando grande polêmica entre os fãs?";
        questoes7.A = "A) O Caso dos Dez Negrinhos";
        questoes7.B = "B) Morte na Mesopotâmia";
        questoes7.C = "C) O Assassinato de Roger Ackroyd";
        questoes7.D = "D) O Misterioso Caso de Styles";
        questoes7.E = "E) Cai o Pano";
        questoes7.escrevaquestao();
        questoes7.correta = "E";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes7.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");
        questoes questoes8 = new questoes();
        questoes8.questoes = "8- Quem é o fiel amigo e narrador das histórias de Hercule Poirot?";
        questoes8.A = "A) Hastings";
        questoes8.B = "B) Japp";
        questoes8.C = "C) Ariadne Oliver";
        questoes8.D = "D) Miss Lemon";
        questoes8.E = "E) Tommy";
        questoes8.escrevaquestao();
        questoes8.correta = "A";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes8.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");
        questoes questoes9 = new questoes();
        questoes9.questoes = "9- Qual é o título do romance que apresenta pela primeira vez a personagem Ariadne Oliver, uma escritora de romances policiais?";
        questoes9.A = "A) O Assassinato de Roger Ackroyd";
        questoes9.B = "B) A Casa Torta";
        questoes9.C = "C) Poirot Perde uma Cliente";
        questoes9.D = "D) Os Cinco Porquinhos";
        questoes9.E = "E) O Cavalo Amarelo";
        questoes9.escrevaquestao();
        questoes9.correta = "C";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes9.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");
        questoes questoes10 = new questoes();
        questoes10.questoes = "10- Em qual romance Hercule Poirot conhece o famoso detetive fictício Simeon Lee?";
        questoes10.A = "A) Poirot Perde uma Cliente";
        questoes10.B = "B) Cai o Pano";
        questoes10.C = "C) O Natal de Poirot";
        questoes10.D = "D) A Aventura do Pudim de Natal";
        questoes10.E = "E) Os Quatro Grandes";
        questoes10.escrevaquestao();
        questoes10.correta = "C";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes10.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");
        questoes questoes11 = new questoes();
        questoes11.questoes = "11- Qual é o título original do romance O Caso dos Dez Negrinhos?";
        questoes11.A = "A) And Then There Were None";
        questoes11.B = "B) Ten Little Indians";
        questoes11.C = "C) Murder on the Orient Express";
        questoes11.D = "D) The Mysterious Affair at Styles";
        questoes11.E = "E) The Murder of Roger Ackroyd";
        questoes11.escrevaquestao();
        questoes11.correta = "A";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes11.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");
        questoes questoes12 = new questoes();
        questoes12.questoes = "12- Qual é o nome do detetive criado por Agatha Christie que se destaca por sua habilidade em resolver crimes aparentemente insolúveis?";
        questoes12.A = "A) Hercule Poirot";
        questoes12.B = "B) Miss Marple";
        questoes12.C = "C) Tommy e Tuppence";
        questoes12.D = "D) Parker Pyne";
        questoes12.E = "E) Harley Quin";
        questoes12.escrevaquestao();
        questoes12.correta = "E";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes12.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");
        questoes questoes13 = new questoes();
        questoes13.questoes = "13- Qual é o título do romance em que Hercule Poirot investiga um assassinato ocorrido durante um jantar em uma casa de campo?";
        questoes13.A = "A) Poirot Perde uma Cliente";
        questoes13.B = "B) Cai o Pano";
        questoes13.C = "C) Os Quatro Grandes";
        questoes13.D = "D) Assassinato na Casa do Pastor";
        questoes13.E = "E) MarteMorte na Mesopotâmia";
        questoes13.escrevaquestao();
        questoes13.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes13.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");
        questoes questoes14 = new questoes();
        questoes14.questoes = "14- Em qual romance Tommy e Tuppence aparecem pela primeira vez?";
        questoes14.A = "A) Os Cinco Porquinhos";
        questoes14.B = "B) O Segredo de Chimneys";
        questoes14.C = "C) O Misterioso Caso de Styles";
        questoes14.D = "D) Um Presságio de Morte";
        questoes14.E = "E) O Inimigo Secreto";
        questoes14.escrevaquestao();
        questoes14.correta = "B";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes14.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");
        questoes questoes15 = new questoes();
        questoes15.questoes = "15- Qual é o nome do detetive criado por Agatha Christie que é um ex-policial e frequentemente aparece como um investigador secundário em várias histórias?";
        questoes15.A = "A) Parker Pyne";
        questoes15.B = "B) Hercule Poirot";
        questoes15.C = "C) Miss Marple";
        questoes15.D = "D) Superintendent Battle";
        questoes15.E = "E) Harley Quin";
        questoes15.escrevaquestao();
        questoes15.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes15.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("ACERTOS: " + acertos);
        sc.close();

    }

}
