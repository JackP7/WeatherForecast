package com.example.blue_sky.weatherforecast;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.blue_sky.app.MyApplication;
import com.example.blue_sky.bean.City;

import java.util.ArrayList;
import java.util.List;
public class CityManager extends Activity implements OnClickListener {
    private ImageView backBtn;
    private ListView citylist_lv;
    private List<City> mCitylist;
    private MyApplication mApplication;
    private ArrayList<String> mArrayList;
    private String updateCityCode="-1";
    private TextView titleName;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); // 隐藏标题
        setContentView(R.layout.select_city);
        titleName = (TextView)findViewById(R.id.title_name);
        titleName.setText("当前城市："+this.getIntent().getStringExtra("cityName"));
        backBtn=(ImageView) findViewById(R.id.title_back);
        backBtn.setOnClickListener(this);
        mApplication=(MyApplication)getApplication();
        mCitylist=mApplication.getCityList();
        mArrayList=new ArrayList<String>();//不new会指向空
        for (int i = 0; i < mCitylist.size(); i++) {
            String cityname=mCitylist.get(i).getCity();
            mArrayList.add(cityname);
        }
        citylist_lv=(ListView) findViewById(R.id.selectcity_lv);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>
                (CityManager.this,android.R.layout.simple_list_item_1,mArrayList);
        citylist_lv.setAdapter(adapter);
        //添加listview的点击事件动作
        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int aaa=Integer.parseInt(mCitylist.get(position).getNumber());
                updateCityCode=Integer.toString(aaa);
                expressItemClick(updateCityCode);
            }
        };
        citylist_lv.setOnItemClickListener(itemClickListener);
    }
    public void expressItemClick(String  updateCityCode){
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("cityCode", updateCityCode);
        setResult(RESULT_OK, intent);
        finish();
    }
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.title_back:
                //传输citycode数据
                Intent i = new Intent(this,MainActivity.class);
                i.putExtra("cityCode", "101160101");
                setResult(RESULT_OK, i);
                finish();
                break;
            default:
                break;
        }
    }


}
