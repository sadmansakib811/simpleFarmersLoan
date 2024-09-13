import java.util.Scanner;

class FarmerLoan{
    public static int id=1; 
    public float loanAmount;
    public float timePeriod;
  public  static float interestRate=2.5f;
    public float totalInterest;
    public void farmerInputs(){
        id++;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter How much loan do you want");
        loanAmount=scan.nextFloat();
        System.out.println("For How many years you want the loan:");
        timePeriod = scan.nextFloat();


    }

    public void calculateInterest(){
        totalInterest = (loanAmount * interestRate * timePeriod) / 100;
        System.out.println("Zour Interest Rate is:"+ totalInterest);
    }

}
/**
 * SimpleBankLoan
 */
public class SimpleBankLoan {

    public static void main(String[] args) {
        FarmerLoan farmer1 = new FarmerLoan();
        System.out.println("Farmer"+ farmer1.id);
        farmer1.farmerInputs();
        farmer1.calculateInterest();
        

        FarmerLoan farmer2 = new FarmerLoan();
        System.out.println("Farmer"+ farmer2.id);
        farmer2.farmerInputs();
        farmer2.calculateInterest();


    }
}

