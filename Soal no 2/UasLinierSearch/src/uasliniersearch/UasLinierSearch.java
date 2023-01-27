package uasliniersearch;

public class UasLinierSearch {

    public static void main(String[] args) {
        int[] intAngka = {32,45,87,43,67,87,65,12,66,42};
        
        if(linierSearch(intAngka,67) == -1){
            System.out.println("Data tidak ditemukan");
        }else{
            System.out.println("Data pada index ke " + linierSearch(intAngka, 67));
        }
    }
    
    public static  int linierSearch(int[] masukan, int nilai){
        for(int i=0; i < masukan.length; i++){
            if(masukan[i] == nilai){
                return i;
            }
        }
        return -1;
    }
    
}
