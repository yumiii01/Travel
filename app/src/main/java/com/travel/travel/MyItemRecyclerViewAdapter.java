package com.travel.travel;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.travel.travel.placeholder.PlaceholderContent.PlaceholderItem;
import com.travel.travel.databinding.FragmentItemBinding;

import java.util.List;


public class MyItemRecyclerViewAdapter extends RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder> {

    private final List<GetTravelSuccess.ResultBean.ListBean> mValues;

    public MyItemRecyclerViewAdapter(List<GetTravelSuccess.ResultBean.ListBean> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mCity.setText(mValues.get(position).getCity());
        holder.mProvince.setText(mValues.get(position).getProvince());
        holder.mName.setText(mValues.get(position).getName());
        holder.mContentView.setText(mValues.get(position).getContent());
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView mProvince;
        public final TextView mCity;
        public final TextView mName;
        public final TextView mContentView;
        public GetTravelSuccess.ResultBean.ListBean mItem;

        public ViewHolder(FragmentItemBinding binding) {
            super(binding.getRoot());
            mProvince = binding.province;
            mCity = binding.city;
            mName = binding.name;
            mContentView = binding.content;
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}