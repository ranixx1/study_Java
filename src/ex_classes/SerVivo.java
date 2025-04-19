//abstract
package src.ex_classes;

public  abstract class SerVivo { //abstract: não pode ser instanciada
    
    protected int idade;

    public SerVivo(int idade) { //construtor
      this.idade = idade;
    }

    public abstract void respirar(); //método abstrato: não tem implementação


   public void dormir() { //método concreto: tem implementação
       System.out.println("Dormindo...");
   }
}
