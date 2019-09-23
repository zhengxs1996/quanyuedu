import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName: Demo
 * @Description: TODO
 * @author: zhengxs
 * @date: 2019/9/20  19:42
 */
public class Demo {
    public static void main(String[] args) {
        /*
         * 获取系统时间
         */
        Date date = new Date();

        /*
         * 以当前的时间为起始时间增加一年或者一个月
         */
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.YEAR, 1);
        System.out.println("开始时间" + date);
        System.out.println("结束时间" + calendar.getTime());
    }
}
