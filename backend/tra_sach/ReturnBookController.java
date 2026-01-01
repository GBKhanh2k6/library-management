package tra_sach;

public class ReturnBookController {
    public static void main(String[] args) {
        Borrow borrow = new Borrow(1, 101, java.time.LocalDate.now().minusDays(10));
        ReturnBookService service = new ReturnBookService();

        String result = service.returnBook(borrow);
        System.out.println(result);
    }

}
