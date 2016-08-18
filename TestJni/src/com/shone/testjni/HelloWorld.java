package com.shone.testjni;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloWorld extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView mTv = (TextView) findViewById(R.id.tv);
		int c = printJNI(1, 13);
		mTv.setText(c + "");
	}

	static {
		// 加载库文件
		System.loadLibrary("TestJni");
	}

	// 声明原生函数 参数为String类型 返回类型为String
	private native int printJNI(int a, int b);
}