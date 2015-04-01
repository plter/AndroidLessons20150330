package com.jikexueyuan.learnfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by plter on 3/26/15.
 */
public class AnotherFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        System.out.println("onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        System.out.println("onCreateView");

        View root = inflater.inflate(R.layout.fragment_another,container,false);

        root.findViewById(R.id.btnBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().popBackStack();
            }
        });

        return root;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        System.out.println("onDestory");
    }

    @Override
    public void onPause() {
        super.onPause();

        System.out.println("onPuase");
    }
}
