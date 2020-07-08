package example.com.submissionirhamdicoding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{

    Button katalog, about, tentang ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home);
        katalog = findViewById(R.id.buku);
        about = findViewById(R.id.about);
        tentang = findViewById(R.id.tentang);


        katalog.setOnClickListener(this);
        about.setOnClickListener(this);
        tentang.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buku:
                Toast.makeText(this, "Katalog Buku", Toast.LENGTH_SHORT).show();
                Intent intentBuku = new Intent(this, BukuActivity.class);
                intentBuku.putExtra("KEY_TITLE", "Katalog Buku");
                startActivity(intentBuku);
                break;
            case R.id.about:
                Toast.makeText(this, "Tentang Saya", Toast.LENGTH_SHORT).show();
                Intent intentAbout = new Intent(this, AboutActivity.class);
                intentAbout.putExtra("KEY_TITLE", "Tentang Saya");
                startActivity(intentAbout);
                break;
            case R.id.tentang:
                Toast.makeText(this, "Tentang Saya", Toast.LENGTH_SHORT).show();
                Intent intentTentang = new Intent(this, AboutActivity.class);
                intentTentang.putExtra("KEY_TITLE", "Tentang Saya");
                startActivity(intentTentang);
                break;

        }

    }
}
