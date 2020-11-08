package randomnumber.su.ac.th.speedrecords.model;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import randomnumber.su.ac.th.speedrecords.model.AddUserActivity;

import java.util.Date;

@Entity(tableName = "users")
public class User {


    @PrimaryKey(autoGenerate = true)
    public final int id;

    @ColumnInfo(name = "meters")
    public final int meter;

    @ColumnInfo(name = "seconds")
    public final int second;



    public User(int id, int meters, int seconds) {
        this.id = id;
        this.meter = meters;
        this.second = seconds;

    }
}
}
