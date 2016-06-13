package com.bartoszlipinski.groupofx.sample.activity;

import android.app.Activity;
import android.os.Bundle;

import com.bartoszlipinski.groupofx.Group;
import com.bartoszlipinski.groupofx.sample.R;

/**
 * Created by Bartosz Lipinski
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Group.OfTwo<String, Integer> aGroupOfTwo =
                new Group.OfTwo<>("This is a group of", 2);
        Group.OfThree<String, Integer, String> aGroupOfThree =
                new Group.OfThree<>(aGroupOfTwo.first, aGroupOfTwo.second + 1, "this is a third argument.");
        Group.OfFour<String, Integer, String, String> aGroupOfFour =
                new Group.OfFour<>(aGroupOfTwo.first, aGroupOfThree.second + 1, "third", "and fourth argument.");
        Group.OfFive<String, Integer, String, String, String> aGroupOfFive =
                new Group.OfFive<>(aGroupOfTwo.first, aGroupOfFour.second + 1, aGroupOfFour.third, "fourth",
                        "and fifth argument. Do you really need more than that?");
    }
}
