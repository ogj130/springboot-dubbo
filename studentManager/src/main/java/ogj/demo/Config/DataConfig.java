package ogj.demo.Config;

import java.text.ParsePosition;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DataConfig {
    /**
     * 获取当前时间
     * Date类型
     * @return
     */
    public static Date getNowDate() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        ParsePosition pos = new ParsePosition(0);
        return formatter.parse(dateString, pos);
    }
    /**
     * 时间格式化
     * String->Date
     */
    public static Date stringToDate(String data){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        ParsePosition pos = new ParsePosition(0);
        return sdf.parse(data,pos);
    }
}
