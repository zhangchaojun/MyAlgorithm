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
        bubbleSort2(nums);
        Log.e(TAG, "onCreate: " + Arrays.toString(nums));
    }

    //********************************冒泡排序 start************************************//

    /**
     * 是否需要进行下一轮比较，初始化为true。作为外层循环的与&&条件
     * 每次外层循环开始的时候就置为false
     * 就是每次外层循环开始的时候都奔着不用再来一次去的，减少比较次数
     * 如果新的一轮循环根本就没有进入（前一个数比后一个数大的条件里），说明内层循环了一遍前一个数都比后一个数小
     * 所以就不会置为true，那么就不会进入下一次的外层循环了，等于是提前跳出循环。
     * 不会死板的每次都执行满（n-1）次
     */

    private void bubbleSort1(int[] numbers) {
        boolean flag = true;
        for (int i = 0; i < numbers.length - 1 && flag; i++) {
            flag = false;
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int sum = numbers[j] + numbers[j + 1];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = sum - numbers[j];
                    flag = true;//还需要下一次外层循环
                }
            }
        }
    }

    public void bubbleSort2(int[] nums) {
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

    //********************************冒泡排序  end************************************//


    //********************************选择排序 start************************************//

    private void selectSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int k = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[k]) {
                    k = j;
                }
            }
            if (k != i) {
                int temp = numbers[k];
                numbers[k] = numbers[i];
                numbers[i] = temp;
            }

        }
    }

    //********************************选择排序  end************************************//

}
