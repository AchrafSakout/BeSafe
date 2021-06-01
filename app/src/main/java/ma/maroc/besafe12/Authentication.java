package ma.maroc.besafe12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Authentication extends AppCompatActivity {
    Button btn_signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);
        btn_signUp=findViewById(R.id.toto);

        btn_signUp.setOnClickListener(v -> startActivity(new Intent(Authentication.this,Enregistrement.class)));
    }
}