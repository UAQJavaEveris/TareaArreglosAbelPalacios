/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaarreglos;

/**
 *
 * @author Abel
 */
public class TareaArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array1[]={0,1,2,3,4,5,6};
        int array2[]={6,5,4,3,2,1,0};
        int suma1=0;
        int suma2=0;
        for (int i=0;i<array1.length;i++){
            suma1+=array1[i];
        }
    
        for (int i=array2.length-1;i>=0;i--){
            suma2+=array2[i];
        }
    
        System.out.println("Suma1= "+suma1);
        System.out.println("Suma2= "+suma2);
    }
    
}
