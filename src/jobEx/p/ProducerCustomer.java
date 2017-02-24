package p;

/**
 * 多生产者多消费者
 */
public class ProducerCustomer
{
    public static void main(String[] args)
    {
        Resource resource = new Resource();
        Producer producer = new Producer(resource);
        Customer customer = new Customer(resource);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(customer);
        Thread t3 = new Thread(customer);
        Thread t4 = new Thread(customer);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
