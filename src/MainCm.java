import java.util.Scanner;

public class MainCm {
 public static  int  N=2;
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    
        while(N % 2==0){
        System.out.println("Digite dimension. Nota: la dimension del Cuadro Magico,debe ser un numero impar.");
        N = leer.nextInt();
                        }
        if (N > 1001) {
            System.out.println("Digite un numero menor a 1001 ");
        } else {
 //Menu de las diferentes posiciones del cuadro magico
            int op;
            //haga
            do{
                CuadroMagico Cuadro = new CuadroMagico(N);
            
             System.out.println("Digite la opción \n 1.Cuadro por la derecha \n 2.izquierda \n 3.izquierda parte arriba \n 4.isquierda parte abajo \n 5.abajo parte izquirda \n 6.abajo parte derecha \n 7.derecha parte derecha \n 8.derecha parte izquierda \n 9.salir");
             op=leer.nextInt();
             switch(op){
                 case 1:
                      int[][] Cdmder = Cuadro.crearCuadro(); //este cuadro va hacia dereha  parte superior
                      Cuadro.Mostrar(Cdmder);
                break;
                 case 2: 
                          int[][] Cdiz = Cuadro.crearCuadro2(); //este cuadro va hacia izquierda  parte superior
                           Cuadro.Mostrar(Cdiz);
                          
               break;
                  case 3: 
                      int[][] Cuadriiz= Cuadro.crearCuadro3(); //este cuadro va hacia hacia izquierda parte arriba
                           Cuadro.Mostrar(Cuadriiz);
                      break; 
                  case 4:
                      int[][] Cuadruizab= Cuadro.crearCuadro4(); //este cuadro va hacia la izquierda parte abajo
                           Cuadro.Mostrar(Cuadruizab);
                      break;
                  case 5:
                      int[][] Cuadreabiz= Cuadro.crearCuadro5(); //este cuadro va hacia parte de abajo parte izquierda
                           Cuadro.Mostrar(Cuadreabiz);
                      break;
                  case 6:
                      int[][] Cuadreabdere= Cuadro.crearCuadro6(); //este cuadro va hacia parte de abajo parte derecha
                           Cuadro.Mostrar(Cuadreabdere);
                      break;
                  case 7:
                      int[][] Cuadrederedere= Cuadro.crearCuadro7(); //este cuadro va hacia parte de  derecha parte derecha
                           Cuadro.Mostrar(Cuadrederedere);
                      break;
                  case 8:
                      int[][] Cuadredereiz= Cuadro.crearCuadro8(); //este cuadro va hacia parte de  derecha parte ziquirda
                           Cuadro.Mostrar(Cuadredereiz);
                      break;
             }
             
            }while(op!=9);
           //mientras op!>9
           
            
        }
    }

    private static class CuadroMagico {

        int N;

        public CuadroMagico(int N) {
            this.N = N;
        }

        private boolean Par() {
            if (this.N % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }

        public int[][] crearCuadro() { //este cuadro va hacia dereha de parte superior
            int[][] mat = new int[this.N][this.N];//crea una matriz de n filas x n columnas
            if (Par() == false) {
                int Fila = 0, Col = (this.N) / 2, Val = 1;
                // Col es: la columna y toma el punto medio
                // Val es: el contenido del cuadrado
                mat[Fila][Col] = Val;//Asigna un 1 en la mitad de la priemra fila  
                while (Val < (this.N * this.N)) {
                    if (Val % this.N == 0) //si Val es divisible`por N
                    {
                        Fila++;
                    } else {
                        if (Fila == 0) {
                            Fila = this.N - 1;
                        } else {
                            Fila--;
                        }
                        if (Col == this.N - 1) {
                            Col = 0;
                        } else {
                            Col++;
                        }
                    }
                    Val++;
                    mat[Fila][Col] = Val;
                }//fin while
            }//fin  if
            else {
                System.out.println("ERROR: ---> El valor de N: " + this.N + " debe ser impar");
            }
            return mat;
        }//fin funcion  
        

 public int[][] crearCuadro2() { //este cuadro va hacia izquierda de  parte superior
            int[][] mat = new int[this.N][this.N];//crea una matriz de n filas x n columnas
            if (Par() == false) {
                int Fila = 0, Col = (this.N) / 2, Val = 1;
                // Col es: la columna y toma el punto medio
                // Val es: el contenido del cuadrado
                mat[Fila][Col] = Val;//Asigna un 1 en la mitad de la priemra fila  
                while (Val < (this.N * this.N)) {
                    if (Val % this.N == 0) //si Val es divisible`por N
                    {
                        Fila++;
                    } else {
                        if (Fila == 0) {
                            Fila = this.N - 1;
                        } else {
                            Fila--;
                        }
                        if (Col == 0) {
                            Col = this.N - 1;
                        } else {
                            Col--;
                        }
                    }
                    Val++;
                                                     
                    mat[Fila][Col] = Val;
                }//fin while
            }//fin  if
            else {
                System.out.println("ERROR: ---> El valor de N: " + this.N + " debe ser impar");
            }
            return mat;
        }//fin funcion   
 
 
        public int [][] crearCuadro3() { //este cuadro va hacia hacia izquierda parte arriba
            int[][] mat = new int[this.N][this.N];//crea una matriz de n filas x n columnas
            if (Par() == false) {
                int Fila =(this.N)/2, Col =0, Val = 1;
                System.out.println("probando el método");
                // Col es: la columna y toma el punto medio
                // Val es: el contenido del cuadrado
                mat[Fila][Col] = Val;//Asigna un 1 en la mitad de la priemra fila 
               
                while (Val < (this.N * this.N)) {//v2
                    if (Val % this.N == 0) //si Val es divisible`por N
                    {
                       Fila--;                        
                      
                    } else {
                         if (Fila==0) {
                           Fila=this.N-1; 
                           
                        } else {
                            Fila--;                         
                        }
                           if (Col==0) {
                            Col=this.N-1;                          
                        } else {
                            Col--;                             
                        }
                    }
                    Val++;
                                                     
                    mat[Fila][Col] = Val;
                }//fin while
            }//fin  ifmat
            else {
                System.out.println("ERROR: ---> El valor de N: " + this.N + " debe ser impar");
            }
            return mat;
        }//fin funcion 
        
        
         public int[][] crearCuadro4() {  //este cuadro va hacia la izquierda parte abajo
            int[][] mat = new int[this.N][this.N];//crea una matriz de n filas x n columnas
            if (Par() == false) {
                int Fila = N/2, Col = (this.N) / 2, Val = 1;
                // Col es: la columna y toma el punto medio
                // Val es: el contenido del cuadrado
                mat[Fila][Col] = Val;//Asigna un 1 en la mitad de la priemra fila  
                while (Val < (this.N * this.N)) {
                    if (Val % this.N == 0) //si Val es divisible`por N
                    {
                        Fila++;
                    } else {
                        if (Fila == N/2) {
                            Fila = this.N - 1;
                        } else {
                            Fila--;
                        }
                        if (Col == 0) {
                            Col = this.N - 1;
                        } else {
                            Col--;
                        }
                    }
                    Val++;
                                                     
                    mat[Fila][Col] = Val;
                }//fin while
            }//fin  if
            else {
                System.out.println("ERROR: ---> El valor de N: " + this.N + " debe ser impar");
            }
            return mat;
        }//fin funcion
         
         public int [][] crearCuadro5() { //este cuadro va hacia hacia parte abajo parte izquierda
            int[][] mat = new int[this.N][this.N];//crea una matriz de n filas x n columnas
            if (Par() == false) {
                int Fila = N /2, Col = (this.N) / 2, Val = 1;
                // Col es: la columna y toma el punto medio
                // Val es: el contenido del cuadrado
                mat[Fila][Col] = Val;//Asigna un 1 en la mitad de la priemra fila  
                while (Val < (this.N * this.N)) {
                    if (Val % this.N == 0) //si Val es divisible`por N
                    {
                        Fila++;
                    } else {
                        if (Fila == N/2) {
                            Fila = this.N - 1;
                        } else {
                            Fila++;
                        }
                        if (Col == 0 ) {
                            Col = this.N / 2;
                        } else {
                            Col++;
                        }
                    }
                    Val++;
                                                     
                   mat [Fila][Col] = Val;
                }//fin while
            }//fin  ifmat
            else {
                System.out.println("ERROR: ---> El valor de N: " + this.N + " debe ser impar");
            }
            return mat;
        }//fin funcion 
        
         public int [][] crearCuadro6() { //este cuadro va hacia hacia parte abajo parte derecha
            int[][] mat = new int[this.N][this.N];//crea una matriz de n filas x n columnas
            if (Par() == false) {
                int Fila = N /2, Col = (this.N) / 2, Val = 1;
                // Col es: la columna y toma el punto medio
                // Val es: el contenido del cuadrado
                mat[Fila][Col] = Val;//Asigna un 1 en la mitad de la priemra fila  
                while (Val < (this.N * this.N)) {
                    if (Val % this.N == 0) //si Val es divisible`por N
                    {
                        Fila++;
                    } else {
                        if (Fila == N/2) {
                            Fila = this.N - 1;
                        } else {
                            Fila++;
                        }
                        if (Col == this.N / 2 ) {
                            Col = 0;
                        } else {
                            Col++;
                        }
                    }
                    Val++;
                                                     
                   mat [Fila][Col] = Val;
                }//fin while
            }//fin  ifmat
            else {
                System.out.println("ERROR: ---> El valor de N: " + this.N + " debe ser impar");
            }
            return mat;
        }//fin funcion 
        
          public int [][] crearCuadro7() { //este cuadro va hacia hacia parte  derecha parte derecha
            int[][] mat = new int[this.N][this.N];//crea una matriz de n filas x n columnas
            if (Par() == false) {
                int Fila = N /2, Col = (this.N) / 2, Val = 1;
                // Col es: la columna y toma el punto medio
                // Val es: el contenido del cuadrado
                mat[Fila][Col] = Val;//Asigna un 1 en la mitad de la priemra fila  
                while (Val < (this.N * this.N)) {
                    if (Val % this.N == 0) //si Val es divisible`por N
                    {
                        Fila++;
                    } else {
                        if (Fila == N/2) {
                            Fila = this.N - 1;
                        } else {
                            Fila++;
                        }
                        if (Col == this.N / 2 ) {
                            Col = 0;
                        } else {
                            Col++;
                        }
                    }
                    Val++;
                                                     
                   mat [Fila][Col] = Val;
                }//fin while
            }//fin  ifmat
            else {
                System.out.println("ERROR: ---> El valor de N: " + this.N + " debe ser impar");
            }
            return mat;
        }//fin funcion 
          
          public int [][] crearCuadro8() { //este cuadro va hacia hacia parte  derecha parte derecha
            int[][] mat = new int[this.N][this.N];//crea una matriz de n filas x n columnas
            if (Par() == false) {
                int Fila = N /2, Col = (this.N) / 2, Val = 1;
                // Col es: la columna y toma el punto medio
                // Val es: el contenido del cuadrado
                mat[Fila][Col] = Val;//Asigna un 1 en la mitad de la priemra fila  
                while (Val < (this.N * this.N)) {
                    if (Val % this.N == 0) //si Val es divisible`por N
                    {
                        Fila++;
                    } else {
                        if (Fila == N/2) {
                            Fila = this.N - 1;
                        } else {
                            Fila++;
                        }
                        if (Col == this.N / 2 ) {
                            Col = 0;
                        } else {
                            Col++;
                        }
                    }
                    Val++;
                                                     
                   mat [Fila][Col] = Val;
                }//fin while
            }//fin  ifmat
            else {
                System.out.println("ERROR: ---> El valor de N: " + this.N + " debe ser impar");
            }
            return mat;
        }//fin funcion 
         
                public void Mostrar(int[][] mat) {
            for (int Fila = 0; Fila < this.N; Fila++) {
                for (int Col = 0; Col < this.N; Col++) {
                    String Cnv = String.valueOf(mat[Fila][Col]);
                    if (Cnv.length() == 1) {
                        System.out.print(" 00" + Cnv);
                    }
                    if (Cnv.length() == 2) {
                        System.out.print(" 0" + Cnv);
                    }
                    if (Cnv.length() >= 3) {
                        System.out.print(" " + Cnv);
                    }
                }
                System.out.println("");
            }
        }

    }
}
