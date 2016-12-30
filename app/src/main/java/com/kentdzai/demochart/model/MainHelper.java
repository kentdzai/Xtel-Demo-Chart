package com.kentdzai.demochart.model;

import java.util.ArrayList;

/**
 * Created by kentd on 29/12/2016.
 */

public class MainHelper {
    ArrayList<String> arrC;
    OnMainResult onMainResult;

    public void setArrC(ArrayList<String> arrC) {
        this.arrC = arrC;
    }

    public void setOnMainResult(OnMainResult onMainResult) {
        this.onMainResult = onMainResult;
    }

    public void chartList() {
        arrC = new ArrayList<>();
        arrC.add("Pie Chart");
        arrC.add("Line Chart");
        arrC.add("Bar Chart");
        arrC.add("Combined Chart");
        if (onMainResult != null) {
            onMainResult.onMainResultSucces(arrC);
        }
    }
}
