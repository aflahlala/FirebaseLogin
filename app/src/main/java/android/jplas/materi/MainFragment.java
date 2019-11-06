package android.jplas.materi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment);

        FragmentManager fm =getSupportFragmentManager();
        FragmentTransaction ft =fm.beginTransaction();

        ft.add(R.id.framelayout, new Login());
        ft.commit();
    }
}
