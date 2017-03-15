package ace.know.you.ado.bubblesort;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int [] arrTest = new int[]{1,5,3,4,2,4,6,9,7,7,8};

        int [] arrResult =  BubbleSort(arrTest);

        Log.d("BubbleSort", arrTest.toString());
    }


    /**
     * 冒泡排序
     * @param arr
     * @return
     */
    public int[] BubbleSort(int[] arr)
    {
        //要冒泡第二个
        for(int j=arr.length-1;j>0;j--) {
            //先冒泡第一个
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;

                }
            }
        }

        return arr;
    }
}
