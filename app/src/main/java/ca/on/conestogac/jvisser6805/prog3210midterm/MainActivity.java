package ca.on.conestogac.jvisser6805.prog3210midterm;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ListActivity {

    private Button addComments;
    private Button contactUs;
    private List<String> listValues = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setListAdapter(null);

        String name = getIntent().getStringExtra("name");
        String comment = getIntent().getStringExtra("comment");

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

        listValues.add(name + " - " + comment);

        ListViewAdapter myAdapter = new ListViewAdapter(this, listValues.toArray(new String[0]));

        setListAdapter(myAdapter);
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

