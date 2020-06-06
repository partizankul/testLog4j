import bl.FileReader;




public class App {

        public static void main(String[] args) {

            FileReader reader = new FileReader();



            String message = reader.read();

            System.out.println(message);

        }
    }

