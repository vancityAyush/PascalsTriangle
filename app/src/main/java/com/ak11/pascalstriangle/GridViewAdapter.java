package com.ak11.pascalstriangle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class GridViewAdapter extends BaseAdapter {
    private ArrayList<String> arrayList;
    Context context;
    int totalRows;
    LayoutInflater inflater;
    static String arr[][];

    static int row=0,col=0;

    public GridViewAdapter(Context context,int totalRows) {
        this.context = context;
        this.arr = arr;
        this.totalRows = totalRows;
        arr = new String[totalRows][totalRows];
//        arrayList = render2Dto1DArray();
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return totalRows*totalRows;
    }

    private ArrayList<String> render2Dto1DArray(){
        //TODO render 2D string array to String Arraylist
        return null;
    }



    @Override
    public TextView getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public static void print(String s){
        arr[row][col++] = s;
    }
    public static void println(){
        col=0;
        row++;
    }
    public static void println(String s){
        arr[row++][col]=s;
        col=0;
    }

    @Override
    public TextView getView(int position, View convertView, ViewGroup parent) {
        TextView txt = (TextView) inflater.inflate(R.layout.txt_grid,null);
        txt.setText(arrayList.get(position));
        return txt;
    }
}
