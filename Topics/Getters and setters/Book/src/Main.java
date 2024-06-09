class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public String getTitle() {
        return title;
    }

    public  String setTitle(String title) {
        return this.title = title;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public int setYearOfPublishing(int yearOfPublishing) {
        return this.yearOfPublishing = yearOfPublishing;
    }

    public String[] getAuthors() {
        return authors;
    }

    public String[] setAuthors(String[] authors) {
        return this.authors = authors;
    }

}