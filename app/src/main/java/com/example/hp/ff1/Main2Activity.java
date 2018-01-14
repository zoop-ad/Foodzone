package com.example.hp.ff1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import com.example.hp.foodzone.R;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    ArrayList<String> selection=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void selectItem(View view)
    {
        boolean checked=((CheckBox) view).isChecked();
        switch (view.getId()){
        case R.id.milk:
            if(checked)
            {selection.add("milk");}
        else
            {selection.remove("milk");}
        break;
        case R.id.cheese:
        if(checked)
        {selection.add("cheese");}
        else
        {selection.remove("cheese");}
        break;
        case R.id.bread:
        if(checked)
        {selection.add("bread");}
        else
        {selection.remove("bread");}
        break;
        case R.id.flour:
        if(checked)
        {selection.add("flour");}
        else
        {selection.remove("flour");}
        break;
        case R.id.noodles:
        if(checked)
        {selection.add("noodles");}
        else
        {selection.remove("noodles");}
        break;
        case R.id.semolina:
        if(checked)
        {selection.add("semolina");}
        else
        {selection.remove("semolina");}
        break;
        case R.id.tomato:
        if(checked)
        {selection.add("tomato");}
        else
        {selection.remove("tomato");}
        break;


    }
    }
    public void FinalSelection(View view)
    {


    String fin="";
        for(String Selections : selection)
        {
            fin=fin + Selections + "\n";
        }
    }
}
