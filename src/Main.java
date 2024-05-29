import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
     User user = new User("Kurmanbek",17);
proverka(user.getAge());
        System.out.println(user);
    }
    public static void proverka(int age)throws IOException{
        if (age<18){
            try {
                throw new IOException();
            }catch (IOException m){
                 System.err.println("JASHYNYZ JETPEIT");
            }
        }else
            System.out.println();
    }
}