package jp.techacademy.hiroko.sakoda.talesson39;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("まるこ", 12, "プログラミング");

        human.say();
        human.think();
    }
}
