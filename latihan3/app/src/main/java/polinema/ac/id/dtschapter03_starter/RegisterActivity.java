package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class RegisterActivity extends AppCompatActivity {
    private final String TAG = RegisterActivity.class.getName();
    public static final String Key_RegisterActivity = "Key_RegisterActivity";

    EditText editTextNama,editTextTglLhr,editTextUserName,editTextPass;
    RadioButton radioButtonLaki,radioButtonPerempuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        editTextNama = findViewById(R.id.edt_txt_nama);
        editTextTglLhr = findViewById(R.id.edt_tanggal_lahir);
        editTextUserName = findViewById(R.id.edt_username);
        editTextPass = findViewById(R.id.edt_password);
        radioButtonLaki = findViewById(R.id.rb_laki);
        radioButtonPerempuan = findViewById(R.id.rb_perempuan);

    }

    public void postSignUp(View view) {
        String password = editTextPass.getText().toString();
        String username = editTextUserName.getText().toString();
        String nama = editTextNama.getText().toString();
        String jk = radioButtonPerempuan.isChecked()?"Perempuan":"Laki-laki";
        String tanggal_lahir = editTextTglLhr.getText().toString();
        Log.d(TAG,"postSignUp: "+password);
        Log.d(TAG,"postSignUp: "+username);
        Log.d(TAG,"postSignUp: "+nama);
        Log.d(TAG,"postSignUp: "+jk);
        Log.d(TAG,"postSignUp: "+tanggal_lahir);
        Intent intent = new Intent(RegisterActivity.this,RegisterResultActivity.class);
        intent.putExtra(Key_RegisterActivity,new String[]{nama,tanggal_lahir,jk,username});
        startActivity(intent);
    }
}
