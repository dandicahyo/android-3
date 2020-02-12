package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeSlideCalender extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_slide_calender);
    }
    public void clickGetStarted(View view) {
        Intent i = new Intent(WelcomeSlideCalender.this, WorkHappen.class);
        startActivity(i);
    }

    public void clickLogin(View view) {
        Intent i = new Intent(WelcomeSlideCalender.this, Form.class);
        startActivity(i);
    }
    public void clickContactUs(View view) {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{"dts@polinema.ac.id","polinema@polinema.ac.id"});
        i.putExtra(Intent.EXTRA_SUBJECT, "Test Email");
        i.putExtra(Intent.EXTRA_TEXT, "Welcome to dts 2019");
        i.putExtra(Intent.EXTRA_CC, "ade@gmail.com");
        i.putExtra(Intent.EXTRA_BCC, "adec@gmail.com");
        startActivity(i.createChooser(i, "Pilih email client"));
    }
}
