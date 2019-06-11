package com.csl.demo;

import java.util.ArrayList;
import java.util.UUID;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
/**
 * 
 * 主活动
 * @author Cherry
 * @date  2019年6月10日
 */
public class MainActivity extends BaseActivity{
	private ArrayList<Article> list = new ArrayList<Article>();
	private TextView title;
	private TextView contents;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main_actiivity);
		initListView();
		title = (TextView) findViewById(R.id.title);
		contents = (TextView) findViewById(R.id.contents);
		ListView lv = (ListView) findViewById(R.id.left);
		ArticleAdapter aa = new ArticleAdapter(MainActivity.this, R.layout.one_layout, list);
		lv.setAdapter(aa);
		lv.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Article a = list.get(position);
				title.setText(a.getTitle());
				contents.setText(a.getContents());
			}
		});
	}
	
	/*
	 * 初始化数据
	 */
	public void initListView(){
		Article  a = null;
		for (int i = 0; i < 30; i++) {
			StringBuffer sb = new StringBuffer();
			for (int j = 0; j < 10; j++) {
				sb.append(UUID.randomUUID().toString());
			}
			a = new Article(UUID.randomUUID().toString(), sb.toString());
			list.add(a);
		}
	}
}
