package example.com.submissionirhamdicoding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener{

    Button menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_about);
        menu = findViewById(R.id.menu);

        menu.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.menu:
                Toast.makeText(this, "Menu Utama", Toast.LENGTH_SHORT).show();
                Intent intentMenu = new Intent(this, HomeActivity.class);
                intentMenu.putExtra("KEY_TITLE", "Menu Utama");
                startActivity(intentMenu);
                break;

        }

    }
}
