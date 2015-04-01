package com.jikexueyuan.learnrv;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
* Created by plter on 3/31/15.
*/
class MyAdapter extends RecyclerView.Adapter {

    class ViewHolder extends RecyclerView.ViewHolder{

        private View root;
        private TextView tvTitle,tvContent;

        public ViewHolder(View root) {
            super(root);

            tvTitle = (TextView) root.findViewById(R.id.tvTitle);
            tvContent = (TextView) root.findViewById(R.id.tvContent);
        }


        public TextView getTvContent() {
            return tvContent;
        }

        public TextView getTvTitle() {
            return tvTitle;
        }
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_cell,null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder vh = (ViewHolder) viewHolder;

        CellData cd = data[i];

        vh.getTvTitle().setText(cd.title);
        vh.getTvContent().setText(cd.content);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }


    private CellData[] data = new CellData[]{new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错")};

//    private String[] data = new String[]{"Hello","jikexueyuan","ime"};
}
