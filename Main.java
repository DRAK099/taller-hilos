import Hilonumeroletra.Hilonumeroletra;

public class Main {
     public static void main(String[] args) {
        
         Hilonumeroletra h1= new Hilonumeroletra(1);
         Hilonumeroletra h2= new Hilonumeroletra(2);
         cancion.Cancion h3 = new cancion.Cancion();
         
         Thread t1=new Thread(h1);
         Thread t2=new Thread(h2);
         Thread t3=new Thread(h3);
         
         
         t1.start();
         t2.start();
         t3.start();
    }
}
