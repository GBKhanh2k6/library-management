package tra_sach;

import java.time.LocalDate;

public class Borrow {

    private int id;
    private int bookId;
    private LocalDate borrowDate;
    private LocalDate returnDate;
    private String status; // BORROWED, RETURNED

    public Borrow(int id, int bookId, LocalDate borrowDate) {
        this.id = id;
        this.bookId = bookId;
        this.borrowDate = borrowDate;
        this.status = "BORROWED";
    }

    public int getId() {
        return id;
    }

    public int getBookId() {
        return bookId;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public String getStatus() {
        return status;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
        this.status = "RETURNED";
    }
}
