import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        
        String[] books = {"Sherlock Holmes", "Arsene Lupin", "Game Of Throne", "Psychology Of Money"};
        int[] prices = {350000, 450000, 500000, 95000};

        ArrayList<Integer> selectedBooks = new ArrayList<>();

        System.out.println("Daftar Buku:");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i] + " " + prices[i]);
        }

        boolean continueInput = true;
        while (continueInput) {
            System.out.print("Masukan pilihan buku [1/2/3/4]: ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                selectedBooks.add(prices[choice - 1]);
            } else {
                System.out.println("Pilihan tidak valid, coba lagi.");
                continue;
            }

            System.out.print("Input lagi (Y/N)?: ");
            String moreInput = scanner.next();
            continueInput = moreInput.equalsIgnoreCase("Y");
        }

            int totalPrice = calculateTotalPrice(selectedBooks);
            int voucher = calculateVoucher(totalPrice);

         0 && totalPrice <= 750000) {
            return 1   System.out.println("Total voucher belanja = " + voucher);
            System.out.println("Total yang harus dibayar = " + totalPrice);

            scanner.close();
    }

   
    public static int calculateTotalPrice(ArrayList<Integer> selectedBooks) {
        int total = 0;
        for (int price : selectedBooks) {
            total += price;
        }
        return total;
    }
    public static int calculateVoucher(int totalPrice) {
        if (totalPrice >= 200000 && totalPrice <= 500000) {
            return 50000;
        } else if (totalPrice > 5000000000;
        } else if (totalPrice > 750000 && totalPrice <= 1000000) {
            return 150000;
        } else if (totalPrice > 1000000) {
            return 200000;
        } else {
            return 0;
        }
    }
}
        System.out.println(Nomor2.class.getDeclaredMethods().length); 
    }
}
