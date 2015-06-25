package com.example.androiddateselector.wheel;

import java.util.List;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

import com.example.androiddateselector.R;
import com.example.androiddateselector.wheel.wheel.ArrayWheelAdapter;
import com.example.androiddateselector.wheel.wheel.WheelView;

@SuppressLint("Instantiatable")
public class TimePickerActivityDialogView extends PopupWindow implements OnClickListener{
    private WheelView mMounth = null; 
    private WheelView mHours = null;
    private WheelView mMins = null;
//    private TextView mTextView = null;
    public String province[] = new String[] { "  河北省  ", "  山西省  ", "  内蒙古  ", "  辽宁省  ", "  吉林省  ", "  黑龙江  ", "  江苏省  " };

    public String city[][] = new String[][] {
            new String[] {"  石家庄  ", "唐山", "秦皇岛", "邯郸", "邢台", "保定", "张家口", "承德", "沧州", "廊坊", "衡水"},
            new String[] {"太原", "大同", "阳泉", "长治", "晋城", "朔州", "晋中", "运城", "忻州", "临汾", "吕梁"},
            new String[] {"呼和浩特", "包头", "乌海", "赤峰", "通辽", "鄂尔多斯", "呼伦贝尔", "巴彦淖尔", "乌兰察布", "兴安", "锡林郭勒", "阿拉善"},
            new String[] {"沈阳", "大连", "鞍山", "抚顺", "本溪", "丹东", "锦州", "营口", "阜新", "辽阳", "盘锦", "铁岭", "朝阳", "葫芦岛"},
            new String[] {"长春", "吉林", "四平", "辽源", "通化", "白山", "松原", "白城", "延边"},
            new String[] {"哈尔滨", "齐齐哈尔", "鸡西", "鹤岗", "双鸭山", "大庆", "伊春", "佳木斯", "七台河", "牡丹江", "黑河", "绥化", "大兴安岭"},
            new String[] {"南京", "无锡", "徐州", "常州", "苏州", "南通", "连云港", "淮安", "盐城", "扬州", "镇江", "泰州", "宿迁"} };
    private ArrayWheelAdapter<String> mMounthAdapter;
    private ArrayWheelAdapter<String> hourAdapter;
    private ArrayWheelAdapter<String> minAdapter;
    private List<String> mList;
    
    private View mMenuView;
    private Activity context;
    private Button popu_back, popu_ok;
    String text = null;
    private String posMString;
    private String getTimeMessage;
    
//	private DefinedCardTextView et_new_content_time;
    private RelativeLayout linearBack, linearOK;
    
	public TimePickerActivityDialogView(Activity context) {
		// TODO Auto-generated constructor stub
    	this.context = context;
    	LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		mMenuView = inflater.inflate(R.layout.wheel_time, null);
    }
	public void setTimePickerActivityDialog(){
		setFindById();
		setInitView();
		this.setContentView(mMenuView);
		this.setWidth(LayoutParams.FILL_PARENT);
		this.setHeight(LayoutParams.WRAP_CONTENT);
		this.setFocusable(true);
	}
	public void setFindById() {
//		  mTextView = (TextView) mMenuView.findViewById(R.id.sel_password);
	      mMounth = (WheelView) mMenuView.findViewById(R.id.wheelM);
	      mHours = (WheelView) mMenuView.findViewById(R.id.wheel1);
	      mMins = (WheelView) mMenuView.findViewById(R.id.wheel2);
	      mHours.setSeletion(10);
	      mHours.setTextSize(22);
	      mMins.setSeletion(5);
	      
//	      mHours.setCurrentItem(25, true);
//	      mMins.setCurrentItem(25, true);
	    //设置 WheelView 组件最多显示 5 个元素
	      mMounth.setVisibleItems(5);
	        //设置 WheelView 元素是否循环滚动
	      mMounth.setCyclic(false);
	        //设置 WheelView 适配器
	    //设置 WheelView 组件最多显示 5 个元素
	      mHours.setVisibleItems(5);
	        //设置 WheelView 元素是否循环滚动
	      mHours.setCyclic(false);
	        //设置 WheelView 适配器
	    //设置 WheelView 组件最多显示 5 个元素
	      mMins.setVisibleItems(5);
	        //设置 WheelView 元素是否循环滚动
	      mMins.setCyclic(false);
	        //设置 WheelView 适配器
	      popu_ok = (Button) mMenuView.findViewById(R.id.popu_ok);
	      linearOK = (RelativeLayout) mMenuView.findViewById(R.id.linearOK);
	      linearBack = (RelativeLayout) mMenuView.findViewById(R.id.linearBack);
	      popu_ok.setOnClickListener(this);
	      popu_back = (Button) mMenuView.findViewById(R.id.popu_back);
	      popu_back.setOnClickListener(this);
	      
		
	}
	@SuppressWarnings("unchecked")
	public void setInitView() {
	        mMounthAdapter = new ArrayWheelAdapter<String>(province);
	        hourAdapter = new ArrayWheelAdapter<String>(city[0]);
	        minAdapter = new ArrayWheelAdapter<String>(city[0]);
	      
	        mMounth.setAdapter(mMounthAdapter);
	        mHours.setAdapter(hourAdapter);
	        mMins.setAdapter(minAdapter);
	        
	        
	}

	@Override
	public void onClick(View v) {
	}
}
