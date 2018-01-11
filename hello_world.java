package pakiet;

import java.awt.*;

public class hello_world {
    public static void main(String args[]){
        System.out.println("this is hello world in mavn");
//        zewnetrzna zew = new zewnetrzna();
//        zewnetrzna.wewnetrzna wew = zew.new wewnetrzna();
//        wew.metoda2();
//        zew.getName('s');
//        zewnetrzna.wewnetrzna wew = zew.new wewnetrzna();
    }
}

class zewnetrzna{
    private String name = "imie zewnetrznej";
    public void getName(char a){
        System.out.println(name+a);
        wewnetrzna wew = this.new wewnetrzna();
        name ="zmieniony name";
        System.out.println(name+a);
        String lokalana = "lokalna var";
    }


    public zewnetrzna(String tekst){
        wewnetrzna wew = this.new wewnetrzna();
        name = tekst;

    }


    public class wewnetrzna{
        void metoda2(){
            System.out.println(name);
        }
        public wewnetrzna(){
            System.out.println("obiekt klasy wewnetrznej stworzony");
        }
    }

    public void metoda_zew(){
        final String name2 = "name2";

        class wewn2{
            String lokalny = name2;
            wewn2(){

            }
        }
    }

}