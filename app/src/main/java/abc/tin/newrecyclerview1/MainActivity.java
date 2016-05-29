package abc.tin.newrecyclerview1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import abc.tin.newrecyclerview1.adapter.CustomAdapter;
import abc.tin.newrecyclerview1.adapter.DaTaModel;
import abc.tin.newrecyclerview1.adapter.MyData;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager recyclerViewLayoutManager;
    RecyclerView.Adapter recyclerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.danh_sach_nhom);
        recyclerViewLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);

        List<DaTaModel> list = new ArrayList<>();
        for (int i = 0; i < MyData.tenArray.length; i++) {
            list.add(new DaTaModel(
                    MyData.tenArray[i],
                    MyData.nhiemvuArray[i],
                    MyData.id_[i],
                    MyData.drawableArray[i]
            ));
        }
            recyclerViewAdapter = new CustomAdapter(list);
            recyclerView.setAdapter(recyclerViewAdapter);
        }
    }
