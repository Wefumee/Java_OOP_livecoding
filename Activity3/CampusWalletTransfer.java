/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package campuswallettransfer;

public class CampusWalletTransfer {

    public static void main(String[] args) {
        // Create two independent wallets
        CampusWallet aly = new CampusWallet("Aly", 100);
        CampusWallet ben = new CampusWallet("Ben");

        // First Test: Displays the initial balances of the student
        System.out.println("==INITIAL BALANCES==");
        System.out.println(aly.getOwner() + ": " + aly.getBalance());
        System.out.println(ben.getOwner() + ": " + ben.getBalance());

        // Second Test: Aly transfers 35 credits to Ben
        System.out.println("Aly transfers 35 credits");
        System.out.println("Transfer successful: " + aly.transferTo(ben, 35));

        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());

        // Third Test: Aly tries to transfer 70 credits to Ben
        System.out.println("Aly transfers 70 credits");
        System.out.println("Transfer successful: " + aly.transferTo(ben, 70));

        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());

        // Fourth Test: Aly tries to transfer 10 credits to herself
        System.out.println("Aly transfers 10 credits to herself");
        System.out.println("Transfer successful: " + aly.transferTo(aly, 10));

        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());

        // Fifth Test: Ben deposits 15 credits
        System.out.println("Ben deposits 15 credits");
        System.out.println("Deposit successful: " + ben.deposit(15));

        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());

        // Sixth Test: Aly transfers her remaining 65 credits to Ben
        System.out.println("Aly transfers all 65  remaining credits");
        System.out.println("Transfer successful: " + aly.transferTo(ben, 65));

        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());
 
        //OPTIONAL/ADDITIONAL TESTS
        // Seventh Test : Zero-credit transfer
        System.out.println("Zero-credit transfer");
        System.out.println("Transfer successful: " + ben.transferTo(aly, 0));

        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());

        // Eighth Test: Transfer to null
        System.out.println("Transfer to null");
        System.out.println("Transfer successful: " + ben.transferTo(null, 10));

        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());

    }

}
