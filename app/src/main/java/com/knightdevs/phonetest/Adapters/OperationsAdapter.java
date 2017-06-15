package com.knightdevs.phonetest.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.knightdevs.phonetest.Constants;
import com.knightdevs.phonetest.R;

/**
 * Created by ashah on 14/6/17.
 */

public class OperationsAdapter extends RecyclerView.Adapter<OperationsAdapter.OperationsViewHolder> {

    public OperationsAdapter() {
    }

    @Override
    public OperationsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.operation_item, null);
        return new OperationsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(OperationsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return Constants.operations.size();
    }

    public class OperationsViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewOperations;
        private TextView textViewTitle;

        public OperationsViewHolder(View itemView) {
            super(itemView);
            imageViewOperations = (ImageView) itemView.findViewById(R.id.imageViewOperations);
            textViewTitle = (TextView) itemView.findViewById(R.id.textViewTitle);
        }
    }
}
