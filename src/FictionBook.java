public class FictionBook extends Book{
    private String Category;

    public FictionBook() {

    }

    public FictionBook(String bookCode, String name, int price, String author, String category) {
        super(bookCode, name, price, author);
        Category = category;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }
}
