package q6;

import java.util.Scanner;
import java.time.LocalDate;

public final class AccountRecord extends Payment {

    public AccountRecord(int id, String cDate, String uDate, String bankName, String branchCode, String address, String accountNumber, String accountType, double balance, String customerName, String email, String phoneNumber, String transactionId, String transactionType, double amount, double depositAmount, String depositDate, double withdrawalAmount, String withdrawalDate, double loanAmount, double interestRate, int duration, double paymentAmount, String paymentDate) throws BankingException {
        super(id, cDate, uDate, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount, depositAmount, depositDate, withdrawalAmount, withdrawalDate, loanAmount, interestRate, duration, paymentAmount, paymentDate);
    }

    public double calculateInterest() {
        return (getLoanAmount() * getInterestRate() * getDuration()) / 100;
    }

    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String STUDENT_ID = "29620";

        System.out.println("Banking System Data Entry");

        try {
            System.out.println("\n--- Entity Data ---");
            System.out.print("Enter Entity ID (>0): ");
            int id = scanner.nextInt(); scanner.nextLine();
            String createdDateStr = LocalDate.now().toString();
            String updatedDateStr = createdDateStr;

            System.out.println("\n--- Bank Data ---");
            System.out.print("Bank Name: "); String bankName = scanner.nextLine();
            System.out.print("Branch Code (>=3 chars): "); String branchCode = scanner.nextLine();
            System.out.print("Address: "); String address = scanner.nextLine();

            System.out.println("\n--- Account Data ---");
            System.out.print("Account Number: "); String accountNumber = scanner.nextLine();
            System.out.print("Account Type: "); String accountType = scanner.nextLine();
            System.out.print("Balance (>=0): "); double balance = scanner.nextDouble(); scanner.nextLine();

            System.out.println("\n--- Customer Data ---");
            System.out.print("Customer Name: "); String customerName = scanner.nextLine();
            System.out.print("Email: "); String email = scanner.nextLine();
            System.out.print("Phone (10 digits): "); String phoneNumber = scanner.nextLine();

            System.out.println("\n--- Transaction Data ---");
            System.out.print("Transaction ID: "); String transactionId = scanner.nextLine();
            System.out.print("Transaction Type: "); String transactionType = scanner.nextLine();
            System.out.print("Amount (>0): "); double amount = scanner.nextDouble(); scanner.nextLine();

            System.out.println("\n--- Deposit Data ---");
            System.out.print("Deposit Amount (>0): "); double depositAmount = scanner.nextDouble(); scanner.nextLine();
            System.out.print("Deposit Date: "); String depositDate = scanner.nextLine();

            System.out.println("\n--- Withdrawal Data ---");
            System.out.print("Withdrawal Amount (>0): "); double withdrawalAmount = scanner.nextDouble(); scanner.nextLine();
            System.out.print("Withdrawal Date: "); String withdrawalDate = scanner.nextLine();

            System.out.println("\n--- Loan Data ---");
            System.out.print("Loan Amount (>0): "); double loanAmount = scanner.nextDouble();
            System.out.print("Interest Rate (>0): "); double interestRate = scanner.nextDouble();
            System.out.print("Duration (>0): "); int duration = scanner.nextInt(); scanner.nextLine();

            System.out.println("\n--- Payment Data ---");
            System.out.print("Payment Amount (>0): "); double paymentAmount = scanner.nextDouble(); scanner.nextLine();
            System.out.print("Payment Date: "); String paymentDate = scanner.nextLine();

            AccountRecord record = new AccountRecord(id, createdDateStr, updatedDateStr, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount, depositAmount, depositDate, withdrawalAmount, withdrawalDate, loanAmount, interestRate, duration, paymentAmount, paymentDate);

            System.out.println("\n==============================================" + STUDENT_ID);
            System.out.println("Computed Banking System Record Details" + STUDENT_ID);
            System.out.println("==============================================" + STUDENT_ID);
            System.out.println("Bank: " + record.getBankName() + ", Branch: " + record.getBranchCode());
            System.out.println("Customer: " + record.getCustomerName() + ", Account: " + record.getAccountNumber());
            System.out.println("Loan: Amount=" + record.getLoanAmount() + ", Rate=" + record.getInterestRate() + "%");
            System.out.printf("\n**CALCULATED INTEREST**: %.2f" + STUDENT_ID, record.calculateInterest());
            System.out.println("\n==============================================" + STUDENT_ID);

        } catch (BankingException e) {
            System.err.println("\n**VALIDATION FAILED** " + STUDENT_ID);
            System.err.println("Error: " + e.getMessage() + STUDENT_ID);
        } catch (Exception e) {
            System.err.println("\n**UNEXPECTED ERROR** " + STUDENT_ID);
            System.err.println("An unexpected error occurred: " + e.getMessage() + STUDENT_ID);
        } finally {
            scanner.close();
        }
    }
}

