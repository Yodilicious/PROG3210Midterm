package ca.on.conestogac.jvisser6805.prog3210midterm;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button addComments;
    private Button contactUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addComments = (Button) findViewById(R.id.addCommentsButton);
        addComments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity2();
            }
        });

        contactUs = (Button) findViewById(R.id.contactUsButton);
        contactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchImplicitIntent();
            }
        });
    }


    private void launchActivity2() {

        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);

        Toast.makeText(getApplicationContext(), "Jodi Visser", Toast.LENGTH_LONG).show();
    }

    private void launchImplicitIntent() {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:226-232-5520"));
        startActivity(intent);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }
}

