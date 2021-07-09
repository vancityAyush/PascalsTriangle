package com.ak11.pascalstriangle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import com.ak11.pascalstriangle.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ActivityMainBinding binding;
    GridView gridView;
    Button btnMethod1, btnMethod2;
    int totalRows;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        gridView = binding.gridView;
        btnMethod1 = binding.btnMethod1;
        btnMethod2 = binding.btnMethod2;

        btnMethod1.setOnClickListener(this);
        btnMethod2.setOnClickListener(this);
        totalRows = 5;


    }
//
//    private int [][] getArray(int n){
//        int arr[][] = new int[n][n];
//        for(int i=0;i<n;i++){
//           for(int j=0;j<n;j++){
//               if(i==j){
//                   arr[i][j]=0;
//               }else {
//                   arr[i][j]=1;
//               }
//           }
//        }
//        return arr;
//    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnMethod1:
                gridView.setNumColumns(totalRows);
                GridViewAdapter gridViewAdapter = new GridViewAdapter(this,5);
                gridViewAdapter.print("Ok");
                gridViewAdapter.println("Nice");
                gridViewAdapter.println();
                gridViewAdapter.print("Nextline");
                String arr[][] = gridViewAdapter.arr;
                gridView.setAdapter(gridViewAdapter);
                TextView txt = gridViewAdapter.getItem(5);

                break;
            case R.id.btnMethod2:
                break;


        }


    }
}