package cn.dxs.api.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	/**
	 * 获取当前时间戳
	 * 
	 * @return 20190808-220817999
	 */
	public static String getNowDate() {
		SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd-HHmmssSSS");
		return ft.format(new Date());
	}

}
