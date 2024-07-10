package questions.chp2;

public class ShowCurrentTime {
    public static void main(String[] args) {
        long  totalMilliSecond = System.currentTimeMillis();

        long totalSeconds = totalMilliSecond / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalSeconds / 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 60;

        System.out.println("Current time is " + currentHour + " : "
                 + currentMinute + " : " + currentSecond + " GMT");


        double a = 6.5;
        a += a + 1;
        System.out.println(a);

        a = 6;
        a /= 2;
        System.out.println(a);

        int i = 1;
        int j = i++;
        System.out.println(i);
        System.out.println(j);

        int ic = 10;
        int newNum = 10 * ic ++;

        System.out.print("ic is " + ic
                + ", newNum is " + newNum);
    }
}
