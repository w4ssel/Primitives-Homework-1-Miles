public class Main {
    public static void main(String[] args) {
        int purchaseAmount = 4500;
        int amountToGetOneMile = 20;
        int bonusMiles = purchaseAmount / amountToGetOneMile;
        System.out.println("Начислено миль: " + bonusMiles);
    }
}