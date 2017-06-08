package main_package;

import java.util.Scanner;

public class jogo_dilema {
    
    public static void main(String[] args) {


        
        Scanner ler = new Scanner (System.in);
        System.out.println("NOME DO JOGADOR: ");
        String nome = ler.nextLine();
 
        int i = 0;//Quantidade de vezes jogada
        int er = 0;//Quantidade de erros
        int tt = 0;// trair x trair
        int cc = 0;// cooperar x cooperar
        int tc = 0;// trair x cooperar
        int a;//variavel de escolha de estrategia
        int res;//Variavel de resposta usuario
        int comparsa;//Variavel de resposta da maquina
        boolean jogo = true;//variavel que controla o loop do jogo inteiro
        String estrategia = "";//variavel para decidir se troca de estrategia
        boolean erro = false;//variavel que controla o repetiçao, caso haja algum erro
        
                System.out.println(" ");
                System.out.println("\t\t\t\t---------------- JOGO INICIADO !! -----------------");
                System.out.println(" ");
                
                //Inicio do jogo
                System.out.println("OBS: SOMENTE NÚMERO!!!");
                System.out.println(" ");
                
                while(jogo){//loop que controla se o jogo continua ou fecha
                    
                    do{
                        System.out.println("ESCOLHA UMA ESTRATÉGIA: ");

                        //Escolha estratégia
                        System.out.println("0 = NÃO ITERADO,"
                        + "\t 1 = OLHO POR OLHO,"
                        + "\t 2 = OLHO POR DOIS OLHOS,"
                        + "\t 3 = PROVADOR INGÊNUO,"
                        + "\t 4 = RETALIADOR PERMANENTE,"
                        + "\t 5 = SAIR E FECHAR O JOGO");

                        a = ler.nextInt();//ler estrategia do jogador

                        if(a!=0 && a!=1 && a!=2 && a!=3 && a!=4 && a!=5){
                            erro = true;
                            System.out.println("\n\nOPÇÃO ERRADA, TENTE NOVAMENTE\n\n");
                        }else{
                            erro = false;
                        }
                    
                    }while(erro);
                    
                    switch(a){
                        case 0:

                            boolean case0 = true;

                            System.out.println("OLHO POR OLHO\n");//estrategia

                            while(case0){
                                //começar escrever o que fazer
                                System.out.println("\n\n\n1 = Trair ou 0 = Cooperar: \n");
                                res = ler.nextInt();
                                comparsa = (int) (Math.random()*2);

                                if(res == 0 || res == 1){//teste para ver se digitou corretamente
                                    
                                    int retorno = mensagens(res,comparsa,cc,tt,tc);
                                    switch(retorno){
                                        case 1: 
                                            cc++;
                                            break;
                                        case 2:
                                            tt++;
                                            break;
                                        default:
                                            tc++;
                                    }
                                    
                                System.out.println("------------------------------");
                                
                                do{
                                    System.out.println("\nDeseja continuar com a estratégia? (s/n)");
                                    estrategia = ler.next();
                                    if (estrategia.equals("S") || estrategia.equals("s")){
                                        erro = false;
                                        //continua a estrategia
                                    }else if (estrategia.equals("N") || estrategia.equals("n")){
                                        System.out.println("trocar estrategia");
                                        case0 = false;//trocar estrategia
                                        erro = false;
                                    }else{
                                        System.out.println("Digitou algo errado. Tente novamente!");   
                                        er++;
                                        erro = true;
                                    }
                                }while(erro);

                                //else do teste para ver se digitou corretamente
                                }else{
                                    System.out.println("Digitou algo errado. Tente novamente!");   
                                    er++;
                                    i--;//retira a jogada caso erro
                                }
                                i++;//Conta quantas rodadas
                            } //fim do case0
                             break;
                            
                            //
                            //
                            //
                            
                            
                        case 1:

                            boolean case1 = true;

                            System.out.println("OLHO POR OLHO\n");//estrategia

                            comparsa = (int) (Math.random()*2);

                            while(case1){
                                //começar escrever o que fazer
                                System.out.println("\n\n\n1 = Trair ou 0 = Cooperar: \n");
                                res = ler.nextInt();

                                if(res == 0 || res == 1){//teste para ver se digitou corretamente

                                int retorno = mensagens(res,comparsa,cc,tt,tc);
                                    switch(retorno){
                                        case 1: 
                                            cc++;
                                            break;
                                        case 2:
                                            tt++;
                                            break;
                                        default:
                                            tc++;
                                    }
                                    
                                System.out.println("------------------------------");

                                comparsa = res;

                                do{
                                    System.out.println("\nDeseja continuar com a estratégia? (s/n)");
                                    estrategia = ler.next();
                                    if (estrategia.equals("S") || estrategia.equals("s")){
                                        erro = false;
                                        //continua a estrategia
                                    }else if (estrategia.equals("N") || estrategia.equals("n")){
                                        System.out.println("trocar estrategia");
                                        case1 = false;//trocar estrategia
                                        erro = false;
                                    }else{
                                        System.out.println("Digitou algo errado. Tente novamente!");   
                                        er++;
                                        erro = true;
                                    }
                                }while(erro);

                                //else do teste para ver se digitou corretamente
                                }else{
                                    System.out.println("Digitou algo errado. Tente novamente!");   
                                    er++;
                                    i--;//retira a jogada caso erro
                                }
                                i++;//Conta quantas rodadas
                            } //fim do case1
                             break;


                            //começar escrever o que fazer
                            //System.out.println("1 = Trair ou 0 = Cooperar: ");
                            //res = ler.nextInt();


                        case 2:
                            System.out.println("OLHO POR DOIS OLHOS\n");//estrategia

                            boolean case2 = true;
                            int repetida = 2; //quantidade de vezes que for igual a res
                            int vez = 0;
                            
                            while(case2){
                                //começar escrever o que fazer
                                System.out.println("\n\n\n1 = Trair ou 0 = Cooperar: ");
                                res = ler.nextInt();//res = ler.nextInt();

                                if(res == 1 || res == 0){//teste para ver se digitou corretamente

                                    //se true, significa que a resposta foi repetida 2 vezes seguidas
                                    if(vez>0){
                                        comparsa = repetida;
                                    }else{//se nao repetida, escolha da maquina é aleatorizada
                                        comparsa = (int) (Math.random() * 2);
                                    }

                                    //teste para testar se a resposta foi repetida
                                    if(res == repetida){
                                        vez++;//se a resposta for igual a jogada anterior, condição será true
                                    }else{
                                        vez = 0;//senão vez continua 0 ou é volta para 0
                                    }

                                    int retorno = mensagens(res,comparsa,cc,tt,tc);
                                    switch(retorno){
                                        case 1: 
                                            cc++;
                                            break;
                                        case 2:
                                            tt++;
                                            break;
                                        default:
                                            tc++;
                                    }

                             System.out.println("------------------------------");

                             repetida = res;

                             do{
                                System.out.println("\nDeseja continuar com a estratégia? (s/n)");
                                estrategia = ler.next();
                                if (estrategia.equals("S") || estrategia.equals("s")){
                                    erro = false;
                                    //continua a estrategia
                                }else if (estrategia.equals("N") || estrategia.equals("n")){
                                    System.out.println("trocar estrategia");
                                    case2 = false;//trocar estrategia
                                    erro = false;
                                }else{
                                    System.out.println("Digitou algo errado. Tente novamente!");   
                                    er++;
                                    erro = true;
                                }
                             }while(erro);

                                //else do teste para ver se digitou corretamente
                                }else{
                                  System.out.println("Digitou algo errado. Tente novamente!");
                                  er++;
                                  i--;//retira a jogada caso erro
                                }       
                                  i++;//conta uma jogada  
                             }      //fim do case 2
                            break;


                        case 3:
                            System.out.println("PROVADOR INGÊNUO\n");//estrategia

                            boolean case3 = true;

                            comparsa = (int) (Math.random()*2);

                            while(case3){
                                //começar escrever o que fazer
                                System.out.println("\n\n\n1 = Trair ou 0 = Cooperar: \n");
                                res = ler.nextInt();

                                if (Math.random() * 100 < 69) {//70% de chance de continuar olho por olho (copiar a escolha)
                                    comparsa = res;
                                }
                                else if (Math.random() * 100 > 70) {//30% de chance de trair na escolha
                                    comparsa = 1;
                                }

                                if(res == 0 || res == 1){//teste para ver se digitou corretamente

                                int retorno = mensagens(res,comparsa,cc,tt,tc);
                                    switch(retorno){
                                        case 1: 
                                            cc++;
                                            break;
                                        case 2:
                                            tt++;
                                            break;
                                        default:
                                            tc++;
                                    }
                                    
                                System.out.println("------------------------------");

                                do{
                                    System.out.println("\n\nDeseja continuar com a estratégia? (s/n)");
                                    estrategia = ler.next();
                                    if (estrategia.equals("S") || estrategia.equals("s")){
                                        erro = false;
                                        //continua a estrategia
                                    }else if (estrategia.equals("N") || estrategia.equals("n")){
                                        System.out.println("trocar estrategia");
                                        case3 = false;//trocar estrategia
                                        erro = false;
                                    }else{
                                        System.out.println("Digitou algo errado. Tente novamente!");   
                                        er++;
                                        erro = true;
                                    }
                                }while(erro);


                                //else do teste para ver se digitou corretamente
                                }else{
                                    System.out.println("Digitou algo errado. Tente novamente!");   
                                    er++;
                                    i--;//retira a jogada caso erro
                                }
                                i++;//Conta quantas rodadas
                            } //fim do case3
                            break;



                        case 4:
                            System.out.println("RETALIADOR PERMANENTE");//estrategia

                            boolean case4 = true;

                            comparsa = 0;

                            while(case4){
                                //começar escrever o que fazer
                                System.out.println("\n\n\n1 = Trair ou 0 = Cooperar: \n");
                                res = ler.nextInt();

                                if(res == 0 || res == 1){//teste para ver se digitou corretamente

                                int retorno = mensagens(res,comparsa,cc,tt,tc);
                                    switch(retorno){
                                        case 1: 
                                            cc++;
                                            break;
                                        case 2:
                                            tt++;
                                            break;
                                        default:
                                            tc++;
                                    }
                                    
                                System.out.println("------------------------------");

                                if (res == 1) {
                                    comparsa = 1;
                                }

                                do{
                                    System.out.println("\n\nDeseja continuar com a estratégia? (s/n)");
                                    estrategia = ler.next();
                                    if (estrategia.equals("S") || estrategia.equals("s")){
                                        erro = false;
                                        //continua a estrategia
                                    }else if (estrategia.equals("N") || estrategia.equals("n")){
                                        case4 = false;//trocar estrategia
                                        erro = false;
                                    }else{
                                        System.out.println("Digitou algo errado. Tente novamente!");   
                                        er++;
                                        erro = true;
                                    }
                                }while(erro);


                                //else do teste para saber se digitou corretamente
                                }else{
                                    System.out.println("Digitou algo errado. Tente novamente!");   
                                    er++;
                                    i--;//retira a jogada caso erro
                                }
                                i++;//Conta quantas rodadas
                            } //fim do case4
                            break;

                        case 5:
                            System.out.println("\n\n");
                            System.out.println("Jogador: "+ nome);
                            System.out.println("Foram jogadas "+ i +" rodadas");
                            System.out.println("Digitou algo errado: "+ er + " vezes");
                            System.out.println("\n");
                            System.out.println(tt*100/i + "% das vezes ocorreu TRAIR X TRAIR");
                            System.out.println(cc*100/i + "% das vezes ocorreu COOPERAR X COOPERAR");
                            System.out.println(tc*100/i + "% das vezes ocorreu TRAIR X COOPERAR");
                            /*
                            teste e comparaçao de porcentagem
                            */
                            System.exit(0);
                            break;//fim do case5
                            
                            
                        default:// CASO DIGITE ALGO ERRADO ELE SAI
                            System.out.println("Digitou algo errado. Tente novamente!");
                            er++;//Conta quantos erros
                        break;
                    }

                    do{
                        System.out.println("\n\nDeseja escolher nova estratégia? \ns = SIM\nn = SAIR E FECHAR");
                        estrategia = ler.next();
                        if (estrategia.equals("S") || estrategia.equals("s")){
                            erro = false;
                            //continua a estrategia
                        }else if (estrategia.equals("N") || estrategia.equals("n")){
                            erro = false;
                            jogo = false;
                        }else{
                            System.out.println("\n\nDigitou algo errado. Tente novamente!");
                            er++;
                            erro = true;
                        }
                    }while(erro);
                    
                }//while(jogo)
                System.out.println("\n\n");
                System.out.println("Jogador: "+ nome);
                System.out.println("Foram jogadas "+ i +" rodadas");
                System.out.println("Digitou algo errado: "+ er + " vezes");
                System.out.println("\n");
                System.out.println(tt*100/i + "% das vezes ocorreu TRAIR X TRAIR");
                System.out.println(cc*100/i + "% das vezes ocorreu COOPERAR X COOPERAR");
                System.out.println(tc*100/i + "% das vezes ocorreu TRAIR X COOPERAR");
                /*
                teste e comparaçao de porcentagem
                */
}
    
    public static int mensagens(int res, int comparsa, int cc, int tt, int tc){
        if(res == 0 && comparsa == 0){
            //cc++;//cooperar x cooperar
            System.out.println("VOCÊ COOPEROU");
            System.out.println("COMPARSA COOPEROU");
            System.out.println("2 ANOS CADA");
            return 1;

        }else if(res == 1 && comparsa == 1){
            //tt++;// trair x trair
            System.out.println("VOCÊ TRAIU");
            System.out.println("COMPARSA TRAIU");
            System.out.println("5 ANOS CADA");
            return 2;

        }else if(res == 1 && comparsa == 0){
            //tc++;// trair x cooperar
            System.out.println("VOCÊ TRAIU");
            System.out.println("COMPARSA COOPEROU");
            System.out.println("COMPARSA PEGOU 10 ANOS");
            System.out.println("VOCÊ ESTÁ LIVRE");
            return 3;

        }else{
            //tc++;
            System.out.println("VOCÊ COOPEROU");
            System.out.println("COMPARSA TRAIU");
            System.out.println("VOCÊ PEGOU 10 ANOS");
            System.out.println("COMPARSA ESTÁ LIVRE");
            return 3;
        }
    }
}
        
//fim de classe