package com.myalgorithm;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TabHost;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "cj";
    private int[] nums = {1, 8, 2, 6, 45, 1, 312, 5, 94, 5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bubbleSort(nums);
        Log.e(TAG, "onCreate: " + Arrays.toString(nums));
    }

    /**
     * 冒泡排序
     *
     * @param nums
     */
    public void bubbleSort(int[] nums) {
        int temp = 0;
        int size = nums.length;
        boolean flag = true;
        for (int i = 0; i < size - 1 && flag; i++) {
            flag = false;
            for (int j = 0; j < size - 1 - i; j++) {

                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    flag = true;
                }
            }
        }

    }
}
