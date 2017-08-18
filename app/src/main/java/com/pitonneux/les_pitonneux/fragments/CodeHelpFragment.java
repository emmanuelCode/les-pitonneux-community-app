package com.pitonneux.les_pitonneux.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.pitonneux.les_pitonneux.ListItem;
import com.pitonneux.les_pitonneux.ListItemAdapter;
import com.pitonneux.les_pitonneux.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CodeHelpFragment extends Fragment {


    public CodeHelpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.navigation_list,container,false);

        ArrayList<ListItem> listItem = new ArrayList<ListItem>();

        //TODO: must replace this with real JSON value

//        listItem.add(new ListItem("User 1","Java ,Kotlin, JavaScript",R.drawable.download));
//        listItem.add(new ListItem("User 2","Objective C, Swift, Node.js", R.drawable.download_2));

        ListItemAdapter listItemAdapter = new ListItemAdapter(getContext(),listItem);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(listItemAdapter);


        return rootView;
    }

}
