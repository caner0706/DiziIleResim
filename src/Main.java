public class Main {
    
    public static void main(String[]args){
        
        yazdir();
        
    }
    
    
    public static void yazdir() {
        // B harfinin matris temsili
        int[][] bharfi = {
            {1, 1, 1},
            {1, 0, 0},
            {1, 1, 1},
            {1, 0, 0},
            {1, 1, 1}
        };
        
        // Matrisin boyutları
        int satir_sayisi = bharfi.length;
        int sutun_sayisi = bharfi[0].length;
        
        // B harfini yıldızlarla yazdırma
        for (int i = 0; i < satir_sayisi; i++) {
            for (int j = 0; j < sutun_sayisi; j++) {
                if (bharfi[i][j] == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();  // Bir sonraki satıra geçmek için yeni satır karakteri ekleme
        }
    }
    
    
}
