public class Dog {
    public int weightInPounds;

    public Dog(int startingWeight){
        weightInPounds = startingWeight;
    }

    public void makeNoise(){
        if (weightInPounds < 10){
            System.out.println("皮卡丘!");
        }else if (weightInPounds < 30){
            System.out.println("皮卡皮卡!");
        }else{
            System.out.println("年轻人,为什么会睡? ");
            System.out.println("吴卡宸:八嘎, 撤退咯");
            System.out.println("吴卡丘:我打云顶之弈");

        }
    }

    public static void main(String[] args) {
        //way1: Declaration, Instantiation and Assignment.
        Dog xiaogou = new Dog(10);
        Dog dog = new Dog(2);
        Dog wu = new Dog(45);
        //way2:
        //Separqte Declaration and
        Dog smalldog;
        //Instantiation and Assignment
        smalldog = new Dog(8);



        System.out.print("皮卡丘:");
        xiaogou.makeNoise();
        System.out.print("小智:");
        dog.makeNoise();
        System.out.print("吴宇宸:");
        wu.makeNoise();
        smalldog.makeNoise();


    }
}