/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campuswallettransfer;

public class CampusWallet {

    // Private attributes fr the users info
    private String owner;
    private int balance;

    // Two-argument constructor
    public CampusWallet(String owner, int balance) {
        this.owner = owner;

        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }
    // A one-argument constructor that uses a chain of constructor 
    // One-argument constructor using constructor chaining
    public CampusWallet(String owner) {
        this(owner, 0);
    }

    // The method for deposited credit
    public boolean deposit(int amount) {

        if (amount <= 0) {
            return false;
        }

        this.balance += amount;
        return true;
    }

    // Transfer credits to another wallet
    public boolean transferTo(CampusWallet recipient, int amount) {

        // Checks if there is a recipient or wallet that will
        // receive the credits
        if (recipient == null) {
            return false;
        }

        // This will prevent transferring to the same wallet
        if (recipient == this) {
            return false;
        }

        // Checks if amount is positive or not
        if (amount <= 0) {
            return false;
        }

        // Checks if sender has sufficient credits to perform the transfer
        if (amount > this.balance) {
            return false;
        }

        // This will perform transferring proccess
        this.balance -= amount;
        recipient.balance += amount;

        return true;
    }

    // This will get value of the balance
    public int getBalance() {
        return this.balance;
    }

    // This will get the value for the owner
    public String getOwner() {
        return this.owner;
    }

}
