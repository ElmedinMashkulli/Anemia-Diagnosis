package com.tra.anemiadiagnosis;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.RecViewHolder> {

    private List<SSS> list;

    public RecAdapter(List<SSS> list) {
        this.list = list;
    }

    @Override
    public RecViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_movie, parent, false);
        return new RecViewHolder(view);
    }




    @Override
    public void onBindViewHolder(RecViewHolder holder, int position) {
        SSS sss = list.get(position);

        holder.bind(sss);

        holder.itemView.setOnClickListener(v -> {
            boolean expanded = sss.isExpanded();
            sss.setExpanded(!expanded);
            notifyItemChanged(position);
        });
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    public class RecViewHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private TextView genre;
        private View subItem;

        public RecViewHolder(View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.item_title);
            genre = itemView.findViewById(R.id.sub_item_genre);
            subItem = itemView.findViewById(R.id.sub_item);
        }

        private void bind(SSS movie) {
            boolean expanded = movie.isExpanded();

            subItem.setVisibility(expanded ? View.VISIBLE : View.GONE);

            title.setText(movie.getTitle());
            genre.setText(movie.getGenre());
        }
    }
}