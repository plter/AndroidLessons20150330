package com.jikexueyuan.learnfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by plter on 3/26/15.
 */
public class JikexueyuanWebViewFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.jikexueyuan_wevview,container,false);
        WebView wv = (WebView) root.findViewById(R.id.wv);

        wv.loadUrl("http://www.jikexueyuan.com");

        return root;
    }
}
