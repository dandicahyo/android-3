package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
    }
    public void clickForgot(View view) {
        Intent i = new Intent(Form.this, ForgotPassword.class);
        startActivity(i);
    }

    public void postLogin(View view) {
        Intent i = new Intent(Form.this, Succes.class);
        startActivity(i);
    }
    public void clickSignUp(View view){
        Intent i = new Intent(Form.this, RegisterActivity.class);
        startActivity(i);
    }
}
