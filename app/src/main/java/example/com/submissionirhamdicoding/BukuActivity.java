package example.com.submissionirhamdicoding;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BukuActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Irham>list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_buku);
        rvCategory = (RecyclerView)findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(IrhamData.getListData());
        showRecylerCardView();

    }

    private void showRecylerCardView() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewAdapter cardViewPresidentAdapter= new CardViewAdapter(this);
        cardViewPresidentAdapter.setListIrham(list);
        rvCategory.setAdapter(cardViewPresidentAdapter);

    }

}
