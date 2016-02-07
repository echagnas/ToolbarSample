package com.echagnas.toolbarsample;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Code inspired by: http://www.tutos-android.com/design-support-library-collapsingtoolbarlayout
 */
public class MainActivity extends AppCompatActivity {

    //================= BINDS ====================

    @Bind(R.id.appBarLayout)
    AppBarLayout appBarLayout;

    @Bind(R.id.collapsing_toolbar)
    CollapsingToolbarLayout collapsingToolbarLayout;

    @Bind(R.id.my_recycler_view)
    RecyclerView recyclerView;

    //============================================

    private String[] myDataset = {"item","item","item","item","item","item","item","item","item",
            "item","item","item","item","item","item","item","item","item",
            "item","item","item","item","item","item","item","item","item"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        ViewCompat.setTransitionName(appBarLayout, "Name");

        //Title of the toolbar
        collapsingToolbarLayout.setTitle("Collapsing toolbar");

        //Change the color of the title toolbar to "transparent" color when expanded
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(android.R.color.transparent));

        recyclerView.setHasFixedSize(true);

        //Use a linear layout manager on the recycler view
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Attach adapter to recycler view
        recyclerView.setAdapter(new MyAdapter(myDataset));

    }
}
