package Ex4;

public class Goods {

        int amount ;

        public synchronized void produce(int amount) throws InterruptedException {
            while(amount>0){
                wait();

            }
            this.amount += amount;
            System.out.println("Produce"+amount);
            notify();

        }
        public synchronized int consume(){
            if (this.amount == 0){
                try {
                    wait();

                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
            notify();
            this.amount -= 1 ;
            return amount;
        }
}
