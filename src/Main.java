        public class Main {

            // Lunch the show() method from the class Advertisement
            // (it's hidden) in a new Thread
            public static void main(String[] args){
                new AdThread().start();
            }
        }

         class AdThread extends Thread{
            public void run(){
                Advertisement.show();
            }
        }

