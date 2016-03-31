package com.raulhndz.thefm.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.raulhndz.thefm.R;
import com.raulhndz.thefm.domain.Artist;
import com.raulhndz.thefm.ui.adapter.HypedArtistAdapter;

import java.lang.annotation.Retention;
import java.util.ArrayList;

/**
 * Created by RaulHndz on 16/3/16.
 */
public class HypedArtistFragment extends android.support.v4.app.Fragment {

    /**
     * Por buenas practicas lo declaramos como variable para utilizarlo en el metodo setupArtistsList
     */

    public static final int NUM_COLUMNS = 2;

    public static final String LOG_TAG = HypedArtistFragment.class.getName();

    private RecyclerView mHypedArtistsList;
    private HypedArtistAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new HypedArtistAdapter(getActivity());

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_hyped_artist, container, false);

        mHypedArtistsList = (RecyclerView) root.findViewById(R.id.hyped_artists_list);

        setupArtistsList();
        setDummyContent();

        return root;
    }

    /**
     * Metodo para hacer todas las configuraciones iniciales
     */
    private void setupArtistsList() {

        mHypedArtistsList.setLayoutManager(new GridLayoutManager(getActivity(), NUM_COLUMNS));
        mHypedArtistsList.setAdapter(adapter);
    }

    private void setDummyContent() {

        ArrayList<Artist> artists = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            artists.add(new Artist("Artist "));
        }

        adapter.addAll(artists);

    }

}
