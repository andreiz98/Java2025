package session_9_Recap;

public class Palindrom {
    public static void main(String[] args) {
        String pal = "Radar";
        System.out.println(isPalindrom(pal));
    }

    private static boolean isPalindrom(String pal) {
        int stanga = 0;
        int dreapta = pal.length() - 1;
        pal = pal.toLowerCase();

        while (stanga < dreapta){
            if(pal.charAt(stanga) != pal.charAt(dreapta))
            {
                return false;
            }
            stanga++;
            dreapta--;
        }
        return true;
    }
}