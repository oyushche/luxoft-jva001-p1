
public class Demo
{
    public static void main(String[] args)
    {

        Bird[] birds = new Bird[10];

        Bird bird = new Bird();

        bird.type = "Duck";
        bird.count = 20;
        bird.sold = 3;
        bird.price = 400;

        Bird bird2 = new Bird();

        bird2.type = "Chicken";
        bird2.count = 40;
        bird2.sold = 29;
        bird2.price = 4;

        Bird bird3 = new Bird("Eagle", 34);

        birds[0] = bird;
        birds[1] = bird2;

        for (Bird b : birds)
        {
            if ("Duck".equals(b.type))
            {
                b.price = 40;
            }
        }


        System.out.println();
    }


    static class Bird
    {
        String type;
        int count;
        int sold;
        double price;

        public Bird() {}

        public Bird(String type, int count)
        {
            this.type = type;
            this.count = count;
        }
    }
}
