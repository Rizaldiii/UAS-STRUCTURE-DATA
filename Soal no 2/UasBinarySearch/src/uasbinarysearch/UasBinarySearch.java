
package uasbinarysearch;


public class UasBinarySearch {
    
     public static void main(String[] args) {
        int[] intArray = {1,42,54,32,65,87,53};
        
        System.out.println(iterativeBinarySearch(intArray, 1));
     }
     
     public static int iterativeBinarySearch(int[] masukan,int nilai){
         int awal = 0;
         int akhir = masukan.length;
         
         while (awal < akhir){
             int nilaitengah = (awal + akhir)/2;
             System.out.println("Mid Point = " + nilaitengah);
             if(masukan[nilaitengah] == nilai){
                 return nilaitengah;
             }
             else if(masukan[nilaitengah] < nilai){
                 mulai = nilaitengah + 1;
             }
             else {
                 akhir = nilaitengah;
             }
                 
         }
         
         return -1;
     }
     
     public static int recursiveBinarySearch(int[] masukan, int nilai){
         return recursiveBinarySearch(masukan, 0, masukan.length, nilai);
     }
     
     public static int recursiveBinarySearch(int[] masukan, int mulai, int akhir, int nilai){
         if(awal >= akhir){
             return -1;
         }
         int nilaitengah = (awal + akhir)/2;
         
         System.out.println("Mid Point = " + nilaitengah);
         if(masukan[nilaitengah] == nilai){
             return nilaitengah;
         }
         else if(masukan[nilaitengah] < nilai){
             return recursiveBinarySearch(masukan, nilai tengah + 1, akhir, nilai);
         }
         else{
             return recursiveBinarySearch(masukan, awal,nilaitengah, nilai);
         }
     }
}