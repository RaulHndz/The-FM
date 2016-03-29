package com.raulhndz.thefm.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by RaulHndz on 28/3/16.
 */
public class HypedArtistAdapter extends RecyclerView.Adapter<> {


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    // Creamos clase aniada dentro de la clase principal
    public class HypedArtistViewHolder extends RecyclerView.ViewHolder{

        public HypedArtistViewHolder(View itemView) {
            super(itemView);
        }
    }
}
