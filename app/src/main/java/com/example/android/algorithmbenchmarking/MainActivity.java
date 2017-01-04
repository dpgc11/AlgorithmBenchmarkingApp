package com.example.android.algorithmbenchmarking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mArraySizeEditText;

    private RadioGroup mAlgorithmCaseGroup;
    private RadioButton mBestCaseRadio;
    private RadioButton mAverageCaseRadio;
    private RadioButton mWorstCaseRadio;

    private TextView mGeneratedArrayTextView;

    private TextView mBubbleSortTextView;
    private TextView mSelectionSortTextView;
    private TextView mInsertionSortTextView;
    private TextView mMergeSortTextView;
    private TextView mQuickSortTextView;

    private Button mBubbleSortBtn;
    private Button mSelectionSortBtn;
    private Button mInsertionSortBtn;
    private Button mMergeSortBtn;
    private Button mQuickSortBtn;
    private Button mBenchmarkAllBtn;
    private Button mStartOverBtn;

    private int size;
    private int[] array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mArraySizeEditText = (EditText) findViewById(R.id.etSizeOfArray);

        mAlgorithmCaseGroup = (RadioGroup) findViewById(R.id.rgAlgorithmCase);
        mBestCaseRadio = (RadioButton) findViewById(R.id.btnBestCase);
        mAverageCaseRadio = (RadioButton) findViewById(R.id.btnAverageCase);
        mWorstCaseRadio = (RadioButton) findViewById(R.id.btnWorstCase);

        mGeneratedArrayTextView = (TextView) findViewById(R.id.tvAlgorithmCase);

        mBubbleSortBtn = (Button) findViewById(R.id.btnBestCase);
        mSelectionSortBtn = (Button) findViewById(R.id.btnSelectionSort);
        mInsertionSortBtn = (Button) findViewById(R.id.btnInsertionSort);
        mMergeSortBtn = (Button) findViewById(R.id.btnMergeSort);
        mQuickSortBtn = (Button) findViewById(R.id.btnQuickSort);
        mBenchmarkAllBtn = (Button) findViewById(R.id.btnBenchmarkAll);
        mStartOverBtn = (Button) findViewById(R.id.btnStartOver);

        size = 0;

        getAlgorithmCase();
    }

    public void getAlgorithmCase() {
        mAlgorithmCaseGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                switch (id) {
                    case R.id.btnBestCase:

                        if (mArraySizeEditText.getText().toString() != null) {
                            try {
                                size = Integer.parseInt(mArraySizeEditText.getText().toString());
                                array = new int[size];
                                mGeneratedArrayTextView.setText(
                                        "Sorted array of size " + size
                                                + " is generated");
                                break;
                            } catch (NumberFormatException e) {
                                mGeneratedArrayTextView.setText("Please enter a non zero number for size");
                            }
                        }

                    case R.id.btnAverageCase:
                        if (mArraySizeEditText.getText().toString() != null) {
                            try {
                                size = Integer.parseInt(mArraySizeEditText.getText().toString());
                                array = new int[size];
                                mGeneratedArrayTextView.setText(
                                        "Random array of size " + size
                                                + " is generated");
                                break;
                            } catch (NumberFormatException e) {
                                mGeneratedArrayTextView.setText("Please enter a non zero number for size");
                            }
                        }
                    case R.id.btnWorstCase:
                        if (mArraySizeEditText.getText().toString() != null) {
                            try {
                                size = Integer.parseInt(mArraySizeEditText.getText().toString());
                                array = new int[size];
                                mGeneratedArrayTextView.setText(
                                        "Sorted array in descending order of size " + size
                                                + " is generated");
                                break;
                            } catch (NumberFormatException e) {
                                mGeneratedArrayTextView.setText("Please enter a non zero number for size");
                            }
                        }
                }
            }
        });
    }

}





