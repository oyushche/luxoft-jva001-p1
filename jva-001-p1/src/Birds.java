import java.util.Scanner;

public class Birds {
    int [][] BIRDS  = new  int [0][4];

    String [] TYPE_OF_BIRDS = new String [0];

    String TYPE = "";
    int STR = 0;
    int COUNT = 0;
    int PRICE = 0;
    int SOLD = 0;

    public static void main(String[] args) {

        Birds bf = new Birds();
        bf.runBirds();
    }

    void runBirds()
    {
        System.out.println("Started");
        Scanner in = new Scanner(System.in);
        int choice = -1;
        while (choice != 0){
            define();
            System.out.println("1 - input ");
            System.out.println("2 - output ");
            System.out.println("0 - exit ");
            System.out.println("make a choice: ");
            choice = in.nextInt();
            int choice2 = -1;
            if (choice == 1) {
                System.out.println("1 - Add type of birds");
                System.out.println("2 - Add Bird");
                System.out.println("3 - Change price");
                System.out.println("4 - Sale bird ");
                System.out.println("0 - exit");
                System.out.println("make a choice: ");
                choice2 = in.nextInt();
                if(choice2==1){
                    System.out.println("Type ");
                    TYPE=in.next();
                    if (isOnTheList()){
                        System.out.println("we know that type");
                    }
                    else{
                        addTypeOfBird();
                    }
                } else if(choice2==2){
                    System.out.println("Type ");
                    TYPE=in.next();
                    if (!isOnTheList()){
                        System.out.println("we don't know that type");
                    }
                    else{
                        defineTypeOfBird();
                        if (!birdAtShop()){
                            System.out.println("test");
                            rebuildBird();
                        }
                        System.out.println("Count ");
                        COUNT=in.nextInt();
                        addBird();
                    }
                } else if(choice2==3){
                    System.out.println("Type ");
                    TYPE=in.next();
                    if (!isOnTheList()){
                        System.out.println("we don't know that type");
                    }
                    else{
                        if (defineTypeOfBird()){
                            System.out.println("Price ");
                            PRICE=in.nextInt();
                            changePrice();
                        }
                        else{
                            System.out.println("we know that type");
                        }
                    }
                } else if(choice2==4){
                    System.out.println("Type ");
                    TYPE=in.next();
                    if (!isOnTheList()){
                        System.out.println("we don't know that type");
                    }
                    else{
                        if (defineTypeOfBird()){
                            System.out.println("Count ");
                            COUNT=in.nextInt();
                            sellBird();
                        }
                        else{
                            System.out.println("we know that type");
                        }
                    }
                }
            } else if (choice == 2) {
                System.out.println("1 - Type of birds");
                System.out.println("2 - Count of birds");
                System.out.println("3 - Price of birds");
                System.out.println("4 - Birds sold");
                System.out.println("5 - less than 3");
                System.out.println("0 - Exit");
                System.out.println("make a choice: ");
                choice2 = in.nextInt();
                if (choice2 ==1){
                    printTypeBirds();
                }
                else if (choice2 ==2){
                    System.out.println("1 - All");
                    System.out.println("2 - Specific");
                    System.out.println("0 - Exit");
                    System.out.println("make a choice: ");
                    int choice3 = in.nextInt();
                    if(choice3 == 1){
                        for (int i =0; i < BIRDS.length; i++){
                            printCountBirds(i);
                        }
                        System.out.println();
                    }
                    else if (choice3 == 2){
                        System.out.println("Type ");
                        TYPE=in.next();
                        defineTypeOfBird();
                        for (int i = 0; i< BIRDS.length; i++)
                        {
                            if (BIRDS[i][0]==STR){
                                printCountBirds(i);
                            }
                        }
                    }
                }
                else if (choice2 ==3){
                    System.out.println("1 - All");
                    System.out.println("2 - Specific");
                    System.out.println("0 - Exit");
                    System.out.println("make a choice: ");
                    int choice3 = in.nextInt();
                    if(choice3 == 1){
                        for (int i =0; i < BIRDS.length; i++){
                            printPriceBirds(i);
                        }
                        System.out.println();
                    }
                    else if (choice3 == 2){
                        System.out.println("Type ");
                        TYPE=in.next();
                        defineTypeOfBird();
                        for (int i = 0; i< BIRDS.length; i++)
                        {
                            if (BIRDS[i][0]==STR){
                                printPriceBirds(i);
                            }
                        }
                    }
                }
                else if (choice2 ==4){
                    System.out.println("1 - All");
                    System.out.println("2 - Specific");
                    System.out.println("0 - Exit");
                    System.out.println("make a choice: ");
                    int choice3 = in.nextInt();
                    if(choice3 == 1){
                        for (int i =0; i < BIRDS.length; i++){
                            printSoldBirds(i);
                        }
                        System.out.println();
                    }
                    else if (choice3 == 2){
                        System.out.println("Type ");
                        TYPE=in.next();
                        defineTypeOfBird();
                        for (int i = 0; i< BIRDS.length; i++)
                        {
                            if (BIRDS[i][0]==STR){
                                printSoldBirds(i);
                            }
                        }
                    }
                }
                else if (choice2 ==5){
                    lessThanThree();
                }
                else if (choice2 ==0){
                    System.out.println("OK");
                }
            }
        }
    }

    void define (){
        TYPE = null;
        STR = -1;
        COUNT = 0;
        PRICE = 0;
        SOLD = 0;
    }

    void rebuildBird (){
        int [][] newBird = new int [BIRDS.length+1][4];
        for (int i = 0; i<BIRDS.length; i++){
            for (int j = 0; j<BIRDS[i].length; j++){
                newBird[i][j] = BIRDS [i][j];
            }
        }
        newBird[BIRDS.length][0] = STR;
        newBird[BIRDS.length][1] = COUNT;
        newBird[BIRDS.length][2] = PRICE;
        newBird[BIRDS.length][3] = SOLD;
        BIRDS = newBird;
    }

    void addBird (){
        for (int i = 0; i< BIRDS.length; i++)
        {
            if (BIRDS[i][0]==STR){
                BIRDS[i][1]+=COUNT;
            }
        }
    }

    void changePrice (){
        for (int i = 0; i< BIRDS.length; i++)
        {
            if (BIRDS[i][0]==STR){
                BIRDS[i][2] = PRICE;
            }
        }

    }

    void sellBird (){
        for (int i = 0; i< BIRDS.length; i++)
        {
            if (BIRDS[i][0]==STR){
                BIRDS[i][1] -= COUNT;
                BIRDS[i][3] += COUNT;
            }
        }
    }


    boolean defineTypeOfBird(){
        boolean res = false;
        for (int i = 0; i < TYPE_OF_BIRDS.length; i++) {
            if (TYPE.equals(TYPE_OF_BIRDS[i])) {
                STR = i;
                res = true;
            }
        }
        return res;
    }

    boolean isOnTheList (){
        boolean res = false;
        for (int i = 0; i < TYPE_OF_BIRDS.length; i++) {
            if(TYPE.equals(TYPE_OF_BIRDS[i])){
                res = true;
            }
        }
        return res;
    }

    boolean birdAtShop (){
        boolean res = false;
        for (int i=0; i < BIRDS.length; i++) {
            if(TYPE.equals(TYPE_OF_BIRDS[BIRDS[i][0]])){
                res = true;
            }
        }
        return res;
    }

    void  addTypeOfBird(){
        String [] newTypeOfBirds = new String [TYPE_OF_BIRDS.length+1];
        for (int i = 0; i < TYPE_OF_BIRDS.length; i++){
            newTypeOfBirds[i]= TYPE_OF_BIRDS[i];

        }
        newTypeOfBirds [TYPE_OF_BIRDS.length] = TYPE;
        TYPE_OF_BIRDS = newTypeOfBirds;
    }

    void printTypeBirds(){
        for (int i = 0; i < TYPE_OF_BIRDS.length; i++){
            System.out.println(TYPE_OF_BIRDS[i]);
        }
        System.out.println();
    }

    void printPriceBirds(int i){
        System.out.println(TYPE_OF_BIRDS[BIRDS[i][0]] + " | " + BIRDS[i][2]);
    }

    void printCountBirds(int i){
        System.out.println(TYPE_OF_BIRDS[BIRDS[i][0]] + " | " + BIRDS[i][1]);
    }

    void printSoldBirds(int i){
        System.out.println(TYPE_OF_BIRDS[BIRDS[i][0]] + " | " + BIRDS[i][3]);
    }

    void lessThanThree (){
        for (int i =0; i<BIRDS.length; i++){
            if (BIRDS[i][1]<3){
                System.out.println(TYPE_OF_BIRDS[BIRDS[i][0]] + " | " + BIRDS[i][1]);
            }
        }
    }
}
