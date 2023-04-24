import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
            menu obj = new menu();
			Scanner ler = new Scanner(System.in);

			obj.getMenu();
			obj.solicitarNumero(1);
            

    }
}

// recurso de poo para reuso de membros em class deferentes 


//                          subClasse2    =>   superClass <= subClasse1

//                                                 ||

//                                             subClasse3  


//   atributos e metodos da superClass são herdados pelas superClasses 

//   -Em Java, a hernça é feita com a diretiva externos 

//                 Veiculo 
//                    |
//           carro         moto 
//             |
//             |
//             |
//         caminhonete                                             
//     |                   |     
//     |                   |
//     |                   |
//    SUV                 hatch       