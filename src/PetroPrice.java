abstract class PetrolPrice {

    abstract void ChangePrice(); // Hidden from endUser
}

class Govt extends PetrolPrice {
    void ChangePrice()
    {
        System.out.println("Increased by 2 percent");
    }

    public static void main(String[] args) {

        PetrolPrice price = new Govt();
        price.ChangePrice();
    }
}