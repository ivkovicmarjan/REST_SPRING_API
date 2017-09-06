package ch.teko.benj.notezilla;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DetailView extends AppCompatActivity {
    private EditText titel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);

        makeLogoutButton();
        makeSaveButton();
        titel = (EditText) findViewById(R.id.titel);

        reviceData();
    }

    private void reviceData() {
        Intent intent = getIntent();
        String message = intent.getStringExtra(Overview.TITEL);

        titel.setText(message);
    }

    private void makeLogoutButton() {
        final Button login = (Button) findViewById(R.id.logout);
        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent logout = new Intent(DetailView.this, LoginActivity.class);
                DetailView.this.startActivity(logout);
            }
        });
    }

    private void makeSaveButton() {
        final Button login = (Button) findViewById(R.id.save);
        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent overview = new Intent(DetailView.this, Overview.class);
                DetailView.this.startActivity(overview);
            }
        });
    }
}
