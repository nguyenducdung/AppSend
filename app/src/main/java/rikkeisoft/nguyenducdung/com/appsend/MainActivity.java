package rikkeisoft.nguyenducdung.com.appsend;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnOpenA;
    private Button btnOpenB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        btnOpenA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent = new Intent("rikkeisoft.nguyenducdung.com.CALL_A");
                Bundle bundle = new Bundle();
                bundle.putString("keya", "Xin chao A");
                intent.putExtras(bundle);
                sendBroadcast(intent);
                Intent intent1 = getPackageManager().getLaunchIntentForPackage("rikkeisoft.nguyenducdung.com.appa");
                startActivity(intent1);
            }
        });
        btnOpenB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent = new Intent("rikkeisoft.nguyenducdung.com.CALL_SUB_B");
                Bundle bundle = new Bundle();
                bundle.putString("keyb", "Xin chao B");
                intent.putExtras(bundle);
                sendBroadcast(intent);
                Intent intent1 = getPackageManager().getLaunchIntentForPackage("rikkeisoft.nguyenducdung.com.appb");
                startActivity(intent1);
            }
        });
    }

    private void initView() {
        btnOpenA = findViewById(R.id.btn_open_a);
        btnOpenB = findViewById(R.id.btn_open_b);
    }

}
