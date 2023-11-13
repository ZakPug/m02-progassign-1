import java.util.Date;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        // Get the current date and time
        Date currentDate = new Date();
        long elapsedTime = currentDate.getTime();
        setDate(elapsedTime);
    }

    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapsedTime) {
        // Calculate year, month, and day from elapsed time
        long totalSeconds = elapsedTime / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        // Get the current date
        Date currentDate = new Date(elapsedTime);

        // Set year, month, and day
        this.year = currentDate.getYear() + 1900;
        this.month = currentDate.getMonth();
        this.day = currentDate.getDate();
    }

    public static void main(String[] args) {
        // Create MyDate objects
        MyDate currentDate = new MyDate();
        MyDate customDate = new MyDate(34355555133101L);

        // Display information
        System.out.println("Current Date: " + currentDate.getYear() + "-"
                + (currentDate.getMonth() + 1) + "-" + currentDate.getDay());
        System.out.println("Custom Date: " + customDate.getYear() + "-"
                + (customDate.getMonth() + 1) + "-" + customDate.getDay());
    }
}
