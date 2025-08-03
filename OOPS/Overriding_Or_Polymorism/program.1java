class Fruit
  {
    String name;
    String taste;
    String size;

    Fruit(String name, String taste, String size) 
    {
        this.name=name;
        this.taste=taste;
        this.size=size;
    }

    void eat()
    {
        System.out.println("Eating" +name+"which tastes"+taste);
    }
}

class Apple extends Fruit
  {
     Apple() 
    {
        super("Apple", "Sweet", "Medium");
    }
    @Override
    void eat() {
        System.out.println("Eating Apple which tastes Sweet and Medium in size");
    }
}
 
class Orange extends Fruit 
{
    Orange() 
   {
        super("Orange", "Tangy", "Small");
    }
    @Override
    void eat() {
        System.out.println("Eating Orange which tastes Tangy and Small in size");
    }
}
 
public class Main
{
    public static void main(String[] args)
  {
        Fruit a=new Apple();
        Fruit o=new Orange();
        a.eat();
        o.eat();
    }
}
