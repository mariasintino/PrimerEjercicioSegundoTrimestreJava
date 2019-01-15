/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosconsola;

import java.util.Arrays;

/**
 *
 * @author maria
 */
public class EjemplosConsola {
    //declaro un array de ints de instancia
    int[] listaNumeros={20,31,27,2,5,99};
    
/*   
el método Máximos va a calcular el máximo y el segundo máximo de
una lista de numeros
*/
    public int[] maximos (int[]	lista){
    //declaramos un arry de dos elementos para guardar el maximo y el segundo maximo
        int [] listaMaximos = {lista[0], lista [0]};
        for (int i=0; i< lista.length; i++){
            if (listaMaximos[0]< lista[i]) {
                listaMaximos[1] = listaMaximos [0];
               listaMaximos[0] = lista[i];
            }
        }
     return listaMaximos;
}
        
    
    public static void main(String[] args) {
        EjemplosConsola ejercicios = new EjemplosConsola ();
        //calcula la posición 2
        System.out.println( ejercicios.listaNumeros [2]);
        //calcula el maximo y el segundo maximo de la lista
        System.out.println( Arrays.toString (ejercicios.maximos(ejercicios.listaNumeros)));     


}}
