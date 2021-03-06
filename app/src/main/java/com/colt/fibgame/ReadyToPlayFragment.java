package com.colt.fibgame;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Colt on 6/6/2017.
 */

public class ReadyToPlayFragment extends Fragment {

    TextView tvPlayerName;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.ready_to_play_fragment, container, false);
        tvPlayerName = (TextView)view.findViewById(R.id.tvPlayerName);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();

        Bundle args = getArguments();
        tvPlayerName.setText(args.getString("playerName"));
    }
}
