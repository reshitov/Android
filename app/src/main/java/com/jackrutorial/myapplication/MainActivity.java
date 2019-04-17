package com.jackrutorial.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List <Food> foods = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        // создаем адаптер
        DataAdapter adapter = new DataAdapter(this, foods);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){

        foods.add(new Food ("Греческий салат с курицей","salat","Греческий","Греческий",  R.drawable.lul));
        foods.add(new Food ("Мясо", "Salat","Salat","Мясо", R.drawable.scale_600));
        foods.add(new Food ("Пицца на толстом и тонком тесте, разные виды роллов", "Salat","Salat","Пицца и Суши", R.drawable.pizza));
        foods.add(new Food ("Шашлык из баранины", "Salat","Salat","Шашлык", R.drawable.shashlik));
    }
}
