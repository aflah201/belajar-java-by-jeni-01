package aflahbelajarjava3;

public class K_ContinueUnlabeled {
    public static void main(String[] args){
        
        String nama[] = {"Aflah","Azzaky","Zaky","Azza"};
        int hitung = 0;
        
        for (int i = 0; i < nama.length; i++){
            if (!nama[i].equals("Azzaky")){
                continue;
            }
            hitung++;
        }
        System.out.println("Ini adalah nomer "+hitung+" di dalam list data");
    }
}
