public class Second {

    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            Boolean trig = false;
            for (int j = i-1; j > 1; j--) {            
                if (i%j == 0) trig = true;
            }
            if (trig == false) System.out.print(String.format("%d, ", i));
        }
    }
    
}
