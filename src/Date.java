public class Date {
    //attributes
    int dd;
    int mm;
    int yy;

    //parameterized constructor
    Date (int d, int m, int y) {
        this.dd = d;
        this.mm = m;
        this.yy = y;
    }

    //method to get the date
    public String getDate() {
        return this.dd + "-" + this.mm + "-" + this.yy;
    }
}