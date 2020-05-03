package com.satsna.utils.utils;

import android.util.Log;

public class LogUtil {
	public static boolean isDubug=true;

	public static void d(Object obj,String msg){
		if(isDubug){
			Log.d("===========", "==========="+msg);
		}
	}
	public static void d(String msg){
		if(isDubug){
			Log.d("===========", "==========="+msg);
		}
	}

	public static void e(Object obj,String msg){
		if(isDubug){
			Log.e("==========="+obj, "==========="+msg);
		}
	}
	public static void e(Object obj,Integer msg){
		if(isDubug){
			Log.e("==========="+obj, "==========="+msg);
		}
	}
	public static void e(String msg){
		if(isDubug){
			Log.e("===========", "==========="+msg);
		}
	}

	public static void e(int msg){
		if(isDubug){
			Log.e("===========", "==========="+msg);
		}
	}

}


