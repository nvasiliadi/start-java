/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrreplace2;

/**
 *
 * @author su
 */
public class ArrReplace2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arr = {1,2,3,4,5,6,7,8,9,0};
        int [] arrResult = new int [arr.length];
        for (int i=arr.length -1; i >=0; i--)
        {
            arrResult[arr.length-1-i]= arr[i];
        }
        for (int elem : arrResult)
        {
            System.out.println(elem);
        }
    }
    
}
