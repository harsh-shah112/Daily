package com.example.dailycartsem2;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;



/**
 * A simple {@link Fragment} subclass.
 */
public class home2 extends Fragment {

    ListView category_list;

    int images[] = {R.drawable.offer1,R.drawable.offer2,R.drawable.offer3,R.drawable.offer4};

    public home2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home2, container, false);

        category_list=view.findViewById(R.id.category_list);

        categoryAdapter categoryAdapter=new categoryAdapter(getActivity().getApplicationContext());
        category_list.setAdapter(categoryAdapter);

        return view;
    }

}
