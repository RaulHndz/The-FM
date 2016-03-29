package com.raulhndz.thefm.ui;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.raulhndz.thefm.R;

/**
 * Created by RaulHndz on 16/3/16.
 */
public class HypedArtistFragment extends Fragment {

    //por buenas practicas lo declaramos como variable para utilizarlo en el metodo setupArtistsList
    public static final int NUM_COLUMNS = 2;

    public static final String LOG_TAG = HypedArtistFragment.class.getName();

    private RecyclerView mHypedArtistsList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_hyped_artist,container,false);

        mHypedArtistsList = (RecyclerView) root.findViewById(R.id.hyped_artists_list);

        return root;
    }

    // MEtodo para hacer todas las configuraciones iniciales
    private void  setupArtistsList(){

        mHypedArtistsList.setLayoutManager(new GridLayoutManager(getActivity(),NUM_COLUMNS));

    }

}
