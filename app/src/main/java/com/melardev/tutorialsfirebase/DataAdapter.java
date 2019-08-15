package com.melardev.tutorialsfirebase;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;


import com.melardev.tutorialsfirebase.model.AndroidVersion;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> implements Filterable {
    private ArrayList<AndroidVersion> mArrayList;
    private ArrayList<AndroidVersion> mFilteredList;
    private List<AndroidVersion>items;

    Context context;



    public DataAdapter(ArrayList<AndroidVersion> arrayList) {
        mArrayList = arrayList;
        mFilteredList = arrayList;


    }
    public DataAdapter(Context context) {
        this.context = context;


    }





    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        viewHolder.tv_name.setText(mFilteredList.get(i).getLogin());

//        Picasso.get().load(items.get(i).getAvatarURL())
//                .placeholder(R.drawable.load)
//                .into(viewHolder.imageView);
    }



    @Override
    public int getItemCount() {
        return mFilteredList.size();
    }

    @Override
    public Filter getFilter() {

        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {

                String charString = charSequence.toString();

                if (charString.isEmpty()) {

                    mFilteredList = mArrayList;
                } else {

                    ArrayList<AndroidVersion> filteredList = new ArrayList<>();

                    for (AndroidVersion androidVersion : mArrayList) {

                        if (androidVersion.getLogin().toLowerCase().contains(charString) ) {

                            filteredList.add(androidVersion);
                        }
                    }

                    mFilteredList = filteredList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = mFilteredList;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                mFilteredList = (ArrayList<AndroidVersion>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_name;
        private ImageView imageView;
        public ViewHolder(View view) {
            super(view);

            tv_name = (TextView)view.findViewById(R.id.tv_name);
            //imageView = (ImageView) view.findViewById(R.id.cover);
           // tv_version = (TextView)view.findViewById(R.id.tv_version);
            //tv_api_level = (TextView)view.findViewById(R.id.tv_api_level);

        }
    }

}