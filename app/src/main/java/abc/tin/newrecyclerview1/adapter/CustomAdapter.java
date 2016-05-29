package abc.tin.newrecyclerview1.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import abc.tin.newrecyclerview1.R;

/**
 * Created by Administrator on 22/05/2016.
 */
public class CustomAdapter extends android.support.v7.widget.RecyclerView.Adapter {


    List<DaTaModel> mDataset;
    public CustomAdapter(List<DaTaModel> mDataset){
        this.mDataset = mDataset;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView textViewTen;
        TextView textViewNhiemVu;
        ImageView imageViewIcon;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewTen = (TextView) itemView.findViewById(R.id.ten);
            textViewNhiemVu = (TextView) itemView.findViewById(R.id.nhiem_vu);
            imageViewIcon = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_list,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        ((ViewHolder)holder).textViewTen.setText(mDataset.get(position).getTen());
        ((ViewHolder)holder).textViewNhiemVu.setText( mDataset.get(position).getNhiemvu());
        ((ViewHolder)holder).imageViewIcon.setImageResource(mDataset.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
