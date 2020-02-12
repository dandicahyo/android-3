package polinema.ac.id.dtschapter03_starter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.StringReader;

public class RegisterResultActivity extends AppCompatActivity {

    TextView textViewnama,textViewTglLhr,textViewJK,textViewUserName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_result);
        textViewnama = findViewById(R.id.tvResultNama);
        textViewTglLhr = findViewById(R.id.tvResultTanggalLahir);
        textViewJK = findViewById(R.id.tvResultJenisKelamin);
        textViewUserName = findViewById(R.id.tvResultUsername);

        //get string array berdasarkan key
        String[] stringArray = getIntent().getStringArrayExtra(RegisterActivity.Key_RegisterActivity);
        //set value to textview
        textViewnama.setText(stringArray[0]);
        textViewTglLhr.setText(stringArray[1]);
        textViewJK.setText(stringArray[2]);
        textViewUserName.setText(stringArray[3]);
    }
}
