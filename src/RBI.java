public interface RBI {

    void setInterestRate();
}

class SBI implements RBI{
    public void setInterestRate()
    {
        System.out.println("9 perecent");
    }
}

class ICICI implements RBI{
    public void setInterestRate()
    {
        System.out.println("12 perecent");
    }
}

class Person{
    public static void main(String[] args) {
        RBI sbi = new SBI();
        RBI icici = new ICICI();

        System.out.println("Interest rate of SBI is : ");
        sbi.setInterestRate();
        System.out.println("Interest rate of ICICI is : ");
        icici.setInterestRate();
    }
}