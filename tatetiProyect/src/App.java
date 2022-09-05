import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bienvenidos al tateti (Prueba Desoxitdante)");  
            System.out.println("ingrese Nombre 1");
            String nombre = scanner.nextLine();
            System.out.println("ingrese Nombre 2");
            String nombre2 = scanner.nextLine();
            char [][] board = new char[3][3];
            
            for(int i = 0 ; i <board.length ; i++){
                for(int j = 0 ; j < board[i].length ; j++){
                    board[i][j] = '-';
                }
            }         
            int jugada = 1;
            while(jugada <= 9){
                char ficha = 'X';
                int jugador = 1;
                if(jugada % 2 == 0){
                    ficha = 'O';
                    jugador = 2;
                }    
                System.out.println("Jugador " + jugador + ", ingresar fila de la jugada (0,1,2)");
                int fila = Integer.parseInt(scanner.nextLine());
                System.out.println("Jugador " + jugador +", ingresar columna de la jugada (0,1,2)");
                int columna = Integer.parseInt(scanner.nextLine());
                
                if(board[fila][columna] == '-'){
                    board[fila][columna] = ficha;
                    jugada++;
                    } else {
                        
                    System.out.println("La posicion ya se encuentra ocupada!");
                    }
                    
                    for(int i = 0 ; i <board.length; i++){
                        for(int j = 0 ; j < board[i].length; j++){
                        System.out.print(board[i][j] + " ");
                        }
                        System.out.println();
                        }
                    }
        }

    }
}
