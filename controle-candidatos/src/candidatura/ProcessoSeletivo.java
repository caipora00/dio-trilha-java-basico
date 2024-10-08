package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        //selecaoCandidatos();
        //imprimirSelecionados();
        for (String candidato : candidatos) {
            entrarEmContato(candidato);
        }
    }
    static void imprimirSelecionados(){
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        System.out.println("Imprimindo a lista de candidatos informando indice do elemento");

        for (int i=0; i < candidatos.length; i++) {
            System.out.println("O candidato de nº " + (i+1) + " é " + candidatos[i]);
        }
        System.out.println("Forma abreviada de interação for each");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi: " + candidato);            
        }
    }
    static void entrarEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do { 
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("Contato Realizado com sucesso");
            }

        } while (continuarTentando && tentativasRealizadas < 3);
        if(atendeu){
            System.out.println("Conseguimo contato com " + candidato + " na " + tentativasRealizadas);
        }else{
            System.out.println("Não conseguimos contato com " + candidato + ", numero maximo de tentativas " + tentativasRealizadas + " realizado");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void  selecaoCandidatos() {
        String[] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto","Monica","Fabricio","Mirella","Daniela","Jorge"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase=2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) { 
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + "Solicitou esse valor de salario: " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato" + candidato + "foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double  valorPretendido(){
        return  ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
