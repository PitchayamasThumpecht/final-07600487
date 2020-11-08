package randomnumber.su.ac.th.speedrecords.model;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import randomnumber.su.ac.th.speedrecords.R;

public class AddUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
        Button saveButton = findViewById(R.id.svae_button);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String meter ;
                String seconds;
                final User user = new User(0, "xx", "yy");
            }
        }
    }
}
