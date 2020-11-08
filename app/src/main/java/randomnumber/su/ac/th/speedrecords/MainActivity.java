package randomnumber.su.ac.th.speedrecords;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import randomnumber.su.ac.th.speedrecords.db.AppDatabase;
import randomnumber.su.ac.th.speedrecords.model.AddUserActivity;
import randomnumber.su.ac.th.speedrecords.model.User;

public class MainActivity extends AppCompatActivity {
private static final String TAG = MainActivity.class.getName();

private RecyclerView mRecyclerView;

    @Override
    protected void protected void onResume() {
        super.onResume();

        final AppExecutors executors = new AppExecutors();
        executors.diskIO().execute(new Runnable() {
            @Override
            public void run() {
                AppDatabase db = AppDatabase.getInstance(MainActivity.this);
                final User[] users = db.userDao().getAllUsers();  //UserDao

                executors.mainThread().execute(new Runnable() {
                    @Override
                    public void run() {
                        UserAdapter adapter = new UserAdapter(MainActivity.this, users);
                        mRecyclerView.setAdapter(adapter);
                    }
                });

                @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            mRecyclerView = findViewById(R.id.user_recycler_view);
            mRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

            Button addButton = findViewById(R.id.add_button);
            addButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this, AddUserActivity.class);
                    startActivity(i);
                }
            });
                }
            }