/* 
    Tente isso 1-2
    Este programa converte galões em litros.

 */

 class GalToLitTable {
    public static void main (String [] args) {
            double gallons, liters;
            int counter;

            counter = 0; //Inicialmente, o contador de linhas é 0

            for(gallons = 1; gallons <= 100; gallons++) {
                    liters = gallons * 3.7854;
                    System.out.println(gallons + " gallons is " + liters + " liters.");

                    counter++; //Incrementa o contador de linhas a cada interação do loop
                    if(counter == 10) { //Se o contador estiver em 10 exibe uma linha
                        System.out.println();
                        counter = 0; //Zera o contador de linhas
                    }
            }
    }
 }