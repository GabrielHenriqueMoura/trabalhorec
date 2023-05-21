   package views;
   
   
   
   
   import java.util.ArrayList;
   import java.util.List;
   import java.util.Scanner;
import esporte.EsporteCadastro;
import esporte.EsporteLocal;
import esporte.EsporteTipo;
import jogadores.Jogador;
import jogadores.Time;

   public class menu {
       private EsporteCadastro esporteCadastro;
       private EsporteLocal esporteLocal;
       private List<Time> times;

       public menu() {
           this.esporteCadastro = new EsporteTipo();
           this.esporteLocal = null;
           this.times = new ArrayList<>();
       }

       public void cadastrarEsporte() {
           Scanner scanner = new Scanner(System.in);
          
           System.out.print("Digite o nome do esporte: ");
           String esporte = scanner.nextLine();
           System.out.print("Digite o tipo de quadra necessária: ");
           String tipoQuadra = scanner.nextLine();

           esporteCadastro.setEsporte(esporte);
           esporteCadastro.setTipoQuadra(tipoQuadra);
       }

       public void cadastrarLocal() {
           Scanner scanner = new Scanner(System.in);

           System.out.print("Digite o local: ");
           String local = scanner.nextLine();
           System.out.print("Digite a hora: ");
           String hora = scanner.nextLine();

           esporteLocal = new EsporteLocal(local, hora);
       }

       public void cadastrarTimes() {
           Scanner scanner = new Scanner(System.in);
        
           System.out.print("Digite a quantidade de times: ");
           int quantidadeTimes = scanner.nextInt();

           scanner.nextLine(); 

           for (int i = 1; i <= quantidadeTimes; i++) {
               System.out.print("Digite o nome do time " + i + ": ");
               String nomeTime = scanner.nextLine();
               System.out.print("Digite a quantidade de jogadores do time " + i + ": ");
               int quantidadeJogadores = scanner.nextInt();

               scanner.nextLine();

               Time time = new Time(nomeTime, quantidadeJogadores);
               times.add(time);
           }

   
           System.out.println("Primeiro time cadastrado: " + times.get(0).getNome());
       }

       public void cadastrarJogadores() {
           Scanner scanner = new Scanner(System.in);
   

           for (Time time : times) {
               System.out.println("Time: " + time.getNome());
               System.out.println("Digite o nome dos jogadores:");

               for (int i = 1; i <= time.getQuantidadeJogadores(); i++) {
                   System.out.print("Jogador " + i + ": ");
                   String nomeJogador = scanner.nextLine();
                   time.adicionarJogador(nomeJogador);
               }
           }
       }

       public void exibirDados() {
     
           System.out.println("Esporte: " + esporteCadastro.getEsporte());
           System.out.println("Tipo de Quadra: " + esporteCadastro.getTipoQuadra());
           System.out.println("Local: " + esporteLocal.getLocal());
           System.out.println("Hora: " + esporteLocal.getHora());
          

           for (Time time : times) {
               System.out.println("Time: " + time.getNome());
               System.out.println("Jogadores:");

               for (Jogador jogador : time.getJogadores()) {
                   System.out.println("- " + jogador.getNome());
               }
           }
       }

       public static void main(String[] args) {
           menu menu = new menu();
           Scanner scanner = new Scanner(System.in);

       

       
           menu.cadastrarEsporte();

        
           menu.cadastrarLocal();

        
           menu.cadastrarTimes();

         
           menu.cadastrarJogadores();

        
           menu.exibirDados();
       }
   }	