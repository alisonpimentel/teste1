package lerArquivo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

 public class Ler {



	public static void main(String[] args) throws Exception {
		
		
		
		BufferedReader leitura = new BufferedReader(new InputStreamReader(new FileInputStream("pessoas.csv")));
		        String linha = null;
			    int  i =0;    
		        Contato[] contato = new Contato[10];
		        
		        while ((linha = leitura.readLine()) != null) {
			            String[] Dados = linha.split(",");			      
			            contato[i] = new Contato(Dados[0], Dados[1]);
			            System.out.println(Arrays.toString(Dados));
			            System.out.println( "Nome: "+ contato[i].getNome());
			            System.out.println("Email: "+ contato[i].getEmail());
			            System.out.println("--------------------------");
			            i++;
			           
			        }
		        leitura.close();
		    }
 }
	

	
