package com.example.androiddateselector;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.example.androiddateselector.wheel.TimePickerActivityDialogView;

public class DateSelectorActivity extends Activity {
	private TextView  text;
	private Button btn;
	private View popuwindow;
	TimePickerActivityDialogView mPopuWindow;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_date_selector);
		btn = (Button) this.findViewById(R.id.btn);
		text = (TextView) this.findViewById(R.id.text);
		popuwindow =  (View) this.findViewById(R.id.popuwindown);
		
		/**
		 * 添加时间
		 */
	    btn.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View v) {
	    		ShowPopoWindow();
	    	}
	    });
	}

	public void ShowPopoWindow(){
		mPopuWindow = new TimePickerActivityDialogView(DateSelectorActivity.this);
//	    mPopuWindow.setEt_new_content_time(text);
	    mPopuWindow.setTimePickerActivityDialog();
	    mPopuWindow.showAtLocation(popuwindow, Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0); // 设置layout在PopupWindow中显示的位置
	}

}

