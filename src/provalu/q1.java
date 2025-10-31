package provalu;

public class q1 {
    public static void main(String[]args){
        int dia = 3;
        String nomeDia;

        if(dia == 1){
            nomeDia = "Domingo";
            System.out.println(nomeDia);
        }else if(dia == 2){
            nomeDia = "Segunda";
            System.out.println(nomeDia);
        }else if(dia == 3){
            nomeDia = "Terca";
            System.out.println(nomeDia);
        }else{
            System.out.println("Dia Invalido");
        }
    }
}
