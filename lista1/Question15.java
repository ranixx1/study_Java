package lista1;
// contar quantas vezes aparece o nome Bia no array
public class Question15 {
    public static void main(String[]args){
        String alunos[] = {"Ana","Bia","Lucas","Pedro","Lucas","Bia"};
        int count=0;
        for(int i = 0; i< alunos.length; i++){
            if(!alunos[i].equals("Bia")){
                continue; //vai para a proxima iteração
            }
            count++;
        }
        System.err.println("encontrado "+count+" vezes o nome de Bia no cadastro!!!");
    }
}
