package com.csl.demo;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
/**
 * @author Cherry
 * @date  2019年6月11日
 */
public class ArticleAdapter extends ArrayAdapter<Article> {
	private int rId;
	public ArticleAdapter(Context context, int resource, List<Article> objects) {
		super(context, resource, objects);
		rId = resource;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Article ac = getItem(position);
		View v ;
		if(null == convertView){
			v = LayoutInflater.from(getContext()).inflate(rId, null);
		}else{
			v = convertView;
		}
		TextView tv = (TextView) v.findViewById(R.id.title);
		tv.setText(ac.getTitle());
		return v;
	}
}
