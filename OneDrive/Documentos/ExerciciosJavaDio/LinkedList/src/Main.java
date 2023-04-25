public class Main {
     public static void main(String[] args) {
        
        ListaEncadeada list = new ListaEncadeada();
        list.insert("Mercedes");
        list.insert("Ferrari");
        list.insert("Aston Martin");
        list.inserirNoComeço("Red Bull");
        list.InserirEspecifico(2, "McLaren");
        list.deletarEspecifico(2);
        list.exibir();
     }
}