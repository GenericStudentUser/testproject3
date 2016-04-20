package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sean.lab3checkoffproject.MainActivity;
import com.example.sean.lab3checkoffproject.R;

/**
 * Created by Sean on 4/20/2016.
 */

public class junit extends ActivityInstrumentationTestCase2<MainActivity>{

    MainActivity mainActivity;
    public junit(){
        super (MainActivity.class);
    }

    public void test_first(){
        mainActivity = getActivity();
        TextView textView = (TextView)mainActivity.findViewById(R.id.sum);
        String tester = textView.getText().toString();
        assertEquals("1", tester);
    }
}
