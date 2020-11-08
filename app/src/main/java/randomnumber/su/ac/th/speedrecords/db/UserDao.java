package randomnumber.su.ac.th.speedrecords.db;
import androidx.room.Dao;

import androidx.room.Insert;
import androidx.room.Query;


import randomnumber.su.ac.th.speedrecords.model.User;

public interface UserDao {
    @Dao
    public interface UserDao {   //ประกาศใน database

        @Query("SELECT * FROM users")
        User[] getAllUsers();  //mainActivity

        @Query("SELECT * FROM users WHERE id = :id")
        User getUserById(int id);

        @Insert
        void addUser(User... users);
}
