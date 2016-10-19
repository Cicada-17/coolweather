package com.coolweather.app.util;

import android.text.TextUtils;

public class Utility {
	//解析处理省级数据
	public synchronized static boolean handleProvincesResponse(CoolWeatherDB coolweatherDB,String response)
	{
		if(!TextUtils.isEmpty(response))
		{
			String [] allProvince = response.split(",");
			if()
		}
	}
}
