/*JVM: Java Virtual Marchine ---> Maquina virtual (programa java - comunica - sistema operacional e hardware)
    cache: armazenar dados temporariamente sté que sejam solicitados
    theads: processo de divisão de tarefas em programaçao de computadores
    GARBASE COLLECTION: coleta de lixo --> evitar escapes de memoria
    JRE: Java Runtime Environment : pacote que executa o carregamento de classes por meio do ClassLoader
    ClassLoader: responsável por carregar todas as classes necessárias para o Java
    Bytecode: carrega as classes e verifica se há codigo ilegal 
    IDE :integrated develop,emt environment (ferramentas especializadas produtiva)

    POO/
        classe: conjunto de objetos/seres ou coisas do mundo real com algo comum
            atributos: são caracteristicas do objeto

            metodos: comportamentos ou ações executadas pelo objeto ---> acelerar()
                main: metodo ponto inicial

            indentificadores: nomes que são associados às estruturas

            variavel: espaço de memoria que guarda informaçoes sobre um determinado objeto ---> "="

            operadores/
                operadores de incremento e decremento:
                    ++ : incrementa em um ---> i++ avalia primeiro a expressão
                    ++ : incrementa em um ---> ++i avalia primeiro o incremento
                    -- : decrementa em um ---> i-- avalia primeiro a expessão
                    -- : decrementa em um ---> --1 avalia primeiro o incremento
                
                operadores logicos
                    &&: and (logico)
                    & : and (binario)
                    || : or(logico)
                    | : or (binario)
                    ^ : ou (exclusivo para binários)
                    ! : negação 

        estruturas de controle/
            estruturas de decisão: desvios
                if ---> if(){};
                else-if ---else-if(){};
                else: else{}
                switch: switch(variavel_int){
                    case valor1:
                    instrução1;
                    break;

                    case valor2:
                    break;

                    default:
                    instrução1;
                    break;
                }   

            estruturas de repetição: loopings
                while: while(expressão_logica){}
                    caso do:
                        do{
                        instrução1;
                        instrução2;
                        }
                        while(expressão_logica);

                for: for(expressão_logica){
                            instrução1;
                            instrução2;
                            }

            interrupções: estruturas que param ou redireciona o fluxo do programa
                break: quebrar
                continue: saltar interação corrente
                return: retorna algo
                    ex:
                    return ++i ---> retorna para o codigo que chan=mou a variável i incrementada
                    return 2 ---> retorna para o codigo que chamou o valor 2
                    return ``Ola´´ ---> retorna para o codigo que chamou a string ``Ola´´
                    return; ---> passa a execução para ele mesmo

            Entrada de dados com buffered reader//
                import.java.io.BuferredReader
                


JSE: Java Standard Edition ---> core do sistema (pacote-base para desenvolver programas)
JEE: Java Enterprise Edition ---> desenvolvimento web (dispositivos moveis e embarcados)
JME :  Java Micro Edition ---> desenvolvimento para dispositivo moveis (celulares,palm tops etc)
*/
public class Introducao {
    
}
