package com.example.welcome.listviewbaseadapterexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

class Myadapter extends BaseAdapter {
  Context c;
  int[] mysymbol;
  String[] myname;
  String[] myaddress;
  String[] myphone;
    public Myadapter(MainActivity mainActivity, int[] symbolno, String[] name, String[] address, String[] phone) {
     c=mainActivity;
     mysymbol=symbolno;
     myname=name;
     myaddress=address;
     myphone=phone;
    }

    @Override
    public int getCount() {
        return mysymbol.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(c).inflate(R.layout.newlayout,null);
        TextView tvname=convertView.findViewById(R.id.name1);
        TextView tvaddress=convertView.findViewById(R.id.address1);
        TextView tvphone=convertView.findViewById(R.id.phone1);
        TextView tvsymbol=convertView.findViewById(R.id.symbol);
        tvsymbol.setText(String.valueOf(mysymbol[position]));
        tvname.setText(myname[position]);
        tvaddress.setText(myaddress[position]);
        tvphone.setText(myphone[position]);
        return convertView;




    }
}
