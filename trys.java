package pakiet;

public class trys {
    public static void main(String args[]) {
        try {
            metoda();
        }
        finally {
            System.out.println("finally");
        }
    }
    static void metoda(){
        try {
            System.out.println("kdsf");
        }
        finally {
            System.out.println("kdsf");
        }
    }

}
