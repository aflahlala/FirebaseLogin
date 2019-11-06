package android.jplas.materi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
        //membuat variabel untuk load waktu
        private int waktu_loading=4000;

        //4000=4 detik

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    //setelah loading maka akan langsung berpindah ke login activity
                    Intent i=new Intent(MainActivity.this, MainFragment.class);
                    startActivity(i);
//                finish();

                }
            },waktu_loading);
        }
}
