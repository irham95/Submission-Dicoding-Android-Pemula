package example.com.submissionirhamdicoding;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detail);
        Irham irhamditerima = getIntent().getParcelableExtra("key");

        ImageView gamabar = (ImageView)findViewById(R.id.img_item_photo);
        TextView name = (TextView)findViewById(R.id.tv_item_name);
        TextView pengarang = (TextView)findViewById(R.id.tv_item_pengarang);
        TextView deskripsi = (TextView)findViewById(R.id.content_detail);
        TextView terbit = (TextView)findViewById(R.id.content_terbit);
        TextView harga = (TextView)findViewById(R.id.content_harga);

        Glide.with(this).load(irhamditerima.getPhoto()).override(350,550).into(gamabar);
        name.setText(irhamditerima.getName());
        pengarang.setText(irhamditerima.getPengarang());
        deskripsi.setText(irhamditerima.getDeskripsi());
        terbit.setText(irhamditerima.getTerbit());
        harga.setText(irhamditerima.getHarga());

        Log.i("photo", irhamditerima.getPhoto());
        Log.i("deskripsi", irhamditerima.getDeskripsi());
    }


}
