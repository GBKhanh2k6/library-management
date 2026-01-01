package tra_sach;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ReturnBookService {

    public String returnBook(Borrow borrow) {

        if (borrow.getStatus().equals("RETURNED")) {
            return "Sách đã được trả trước đó!";
        }

        LocalDate today = LocalDate.now();
        borrow.setReturnDate(today);

        long daysLate = ChronoUnit.DAYS.between(
                borrow.getBorrowDate().plusDays(7),
                today
        );

        if (daysLate > 0) {
            return "Trả sách trễ " + daysLate + " ngày. Tiền phạt: " + (daysLate * 5000) + " VNĐ";
        }

        return "Trả sách đúng hạn!";
    }
}
