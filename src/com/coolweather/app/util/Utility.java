package com.coolweather.app.util;

import com.coolweather.app.model.Province;

import android.text.TextUtils;

public class Utility {
	//解析处理省级数据
	public synchronized static boolean handleProvincesResponse(CoolWeatherDB coolweatherDB,String response)
	{
		if(!TextUtils.isEmpty(response))
		{
			String [] allProvinces = response.split(",");
			if(allProvinces != null && allProvinces.length > 0)
			{
				for(String p : allProvinces)
				{
					String [] array = p.split("\\|");
					Province province = new Province();
					province.setProvinceCode(array[0]);
					province.setProvinceName(array[1]);
					coolweatherDB.saveProvince(province);
				}
				return true;
			}
		}
		return false;
	}
}
