package com.raulhndz.thefm.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.raulhndz.thefm.R;
import com.raulhndz.thefm.domain.Artist;

import java.util.ArrayList;

/**
 * Created by RaulHndz on 28/3/16.
 */
public class HypedArtistAdapter extends RecyclerView.Adapter<HypedArtistAdapter.HypedArtistViewHolder> {


    ArrayList<Artist> artists;

    Context context;

    public HypedArtistAdapter(Context context) {
        this.context = context;
        //Para evitar cualquier Null Exception
        this.artists = new ArrayList<>();
    }

    @Override
    public HypedArtistViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // Inflamos la vista Item
        View itemView = LayoutInflater.from(context)
                /**
                 *Vista,contexto,evitar que se mezcle con otros contenedores
                 */
                .inflate(R.layout.item_hyped_artists, parent, false);

        return new HypedArtistViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(HypedArtistViewHolder holder, int position) {

        //Cuales son los datos -- se conecta el ViewHolder con los datos
        Artist currentArtist = artists.get(position);

        holder.setArtistName(currentArtist.getName());
    }

    @Override
    public int getItemCount() {
        //Tamaño del arreglo
        return artists.size();
    }

    /**
     *
     */

    public void addAll(@NonNull ArrayList<Artist> artists) {
        if (artists == null)
            throw new NullPointerException("The items cannot be null");

        this.artists.addAll(artists);
        notifyDataSetChanged();
        //notifyItemRangeInserted(getItemCount()-1,artists.size());
    }

    // Creamos clase aniada dentro de la clase principal
    public class HypedArtistViewHolder extends RecyclerView.ViewHolder {

        TextView artistName;
        ImageView artistImage;

        public HypedArtistViewHolder(View itemView) {
            super(itemView);

            artistName = (TextView) itemView.findViewById(R.id.txt_name);
            artistImage = (ImageView) itemView.findViewById(R.id.img_artist);

        }

        public void setArtistName(String name) {
            artistName.setText(name);
        }

    }
}
