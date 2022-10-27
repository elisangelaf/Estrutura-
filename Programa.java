public class Programa.java {
    public static void main(String[]arga){

        ListaLigada<String> lista = new ListaLigada<String>();
        
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("SP");

        System.out.println("Tamanho:" + lista.getTamanho());
        System.out.println("Primeiro:" + lista.getPrimeiro().getValor());
        System.out.println("Ultimo:" + lista.getUltimo().getValor());

        for(int i = 0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }


    }

    
}
