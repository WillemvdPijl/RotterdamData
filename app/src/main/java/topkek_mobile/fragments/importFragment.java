package topkek_mobile.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.github.mikephil.charting.charts.BarChart;

import topkek_mobile.rotterdamdata.R;
import topkek_mobile.topkek_mobile.charts.barChart;

/**
 * Created by Dave on 26-6-2016.
 */
public class importFragment extends Fragment  {

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
            barChart Chart = new barChart();
            View rootView = inflater.inflate(R.layout.fragment_import, container, false);
            ViewGroup chart = (ViewGroup) rootView.findViewById(
                    R.id.chart);

            return rootView;


        }

    }


