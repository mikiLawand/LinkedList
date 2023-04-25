public class ListaEncadeada 
{
    No head;
    //o inicio do No 

   //metodo de criação de No 
   public void insert(String f1Equipes)
   {
    No No = new No();
    //criando o primeiro No 
    No.f1Equipes = f1Equipes;
    No.prox = null;

    //checando se o novo No que inserimos é o primeiro 
    if(head==null)
    {
        head = No;
        //porque se for, esse será o No cabeça 
    }
    else 
    //caso contrário,todos os Nos serão percorridos 
    //até que se encontre um espaço vazio null
    {
        No n = head;
        while(n.prox!=null)
        {
            n = n.prox;
        }
        n.prox = No;
        //agora o novo No foi colocado no final da lista 
    }

   } 

   //metodo para excluir um item especifico da lista 
   public void deletarEspecifico(int index)
   {
     if(index==0) //se o index for igual a 0
     {
       //o inicio irá mudar para o proximo no
       head = head.prox;
     }
     else 
     {
        No n = head;
        //e se torna o inicio
        No n1 = null;
        for(int i=0;i<index-1;i++)
        //para cada adição a lista
        {
          n = n.prox;
        }
          n1 = n.prox;
          n.prox = n1.prox;
          System.out.println("n1" + n1.f1Equipes);

     }
   }

   //metodo para exibir a lista criada 
   public void exibir()
   {
     No No = head;

     while(No.prox != null)
     //a exibição da lista começa em nulo
     {
        System.out.println(No.f1Equipes);
        //percorre a lista 
        No = No.prox;
        //exibindo em seguida o proximo No 
        
     }
     System.out.println(No.f1Equipes);
    }

    //metodo para inserir um item no começo da lista 
    public void inserirNoComeço(String f1Equipes)
    {
       No No = new No();
       //criação de um novo No 
       No.f1Equipes = f1Equipes;
       No.prox = null;
       //o primeiro No é nulo 
       No.prox = head;
       //o No passa a ser o primeiro No 
       head = No;
    }

    //metodo para inserir um item em uma posição especifica da lista 
    public void InserirEspecifico(int index, String f1Times)
    {
        No No = new No();
        //criação de um novo No
        No.f1Equipes = f1Times;
        No.prox = null;
       //o primeiro No é nulo 

       if(index==0)
       {
         inserirNoComeço(f1Times);
         //se o index estiver em 0 
         //o item é adicionado no começo
       }
       else{
       No n = head;
       //e se torna o inicio
       for(int i=0;i<index-1;i++)
       //para cada adição a lista
       {
        n = n.prox;
        //um no é adicionado em seguida 
       }
       No.prox = n.prox;
       n.prox = No; 
       }
    }
}
