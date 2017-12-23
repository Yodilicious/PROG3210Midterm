package ca.on.conestogac.jvisser6805.prog3210midterm;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CommentFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_comment, container, false);

        Button submitButton = (Button) view.findViewById(R.id.submitCommentsButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchMainActivity();
            }
        });

        return view;
    }

    public void launchMainActivity() {

        EditText nameEditText = (EditText) getView().findViewById(R.id.nameEditText);
        EditText commentEditText = (EditText) getView().findViewById(R.id.commentEditText);

        Toast.makeText(getView().getContext(), nameEditText.getText() + " - " + commentEditText.getText(), Toast.LENGTH_LONG).show();
        Intent intent = new Intent(getView().getContext(), MainActivity.class);
        intent.putExtra("name", nameEditText.getText());
        intent.putExtra("comment", commentEditText.getText());
        startActivity(intent);
    }
}
