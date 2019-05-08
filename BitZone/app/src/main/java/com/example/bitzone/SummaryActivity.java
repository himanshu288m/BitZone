package com.example.bitzone;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;

public class SummaryActivity extends SingleFragmentActivity {

    public static final String FRAGMENT_CODE="Brains";
    public static final String SELECTION_CODE="Khalu ka hai";
    public static final int DAY_SUMMARY=15;
    public static final int MONTH_SUMMARY=25;
    public static final int student=30;



    public static Intent fetchIntent(Context context, UUID id, int code)
    {
        Intent i=new Intent(context,SummaryActivity.class);
        i.putExtra(SELECTION_CODE,code);
        i.putExtra(FRAGMENT_CODE,id);
        return i;
    }

    @Override
    protected Fragment createFragment() {

        switch (getIntent().getIntExtra(SELECTION_CODE,1))
        {

            case DAY_SUMMARY: return new AttendanceSummaryFragment();
            case MONTH_SUMMARY: return new LectureSummaryFragment();
            case student:return new StudentLectureSummaryFragment();
            default: return null;
        }



    }
}
