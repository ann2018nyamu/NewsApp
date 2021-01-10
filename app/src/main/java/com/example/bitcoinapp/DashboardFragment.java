package com.example.bitcoinapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import java.util.ArrayList;

public class DashboardFragment  extends Fragment{
    public ListView mListView;
    public ArrayList<ListItem> results;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dashboard,container,false);

        mListView =  view.findViewById(R.id.news_list);
        //return super.onCreateView(inflater, container, savedInstanceState);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mListView.setAdapter(new CustomListAdapter(getContext(), getListData()));
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                ListItem user = (ListItem) mListView.getItemAtPosition(position);
                Intent myIntent = new Intent(getActivity(), SecondActivity.class);
                myIntent.putExtra("News", user.getNews() ); //Optional parameters
                myIntent.putExtra("picture", R.drawable.covid_19);
                getActivity().startActivity(myIntent);
            }
        });
    }
    public ArrayList<ListItem> getListData() {
        results = new ArrayList<>();
        ListItem user1 = new ListItem();
        user1.setName("Citizen News");
        user1.setDesignation("Countrywide News");
        user1.setLocation("Nairobi");
        user1.setNews("Covid 19 Report");
        user1.setImage(R.drawable.citizennews);
        user1.setPicture(R.drawable.covid_19);
        results.add(user1);

        ListItem user2 = new ListItem();
        user2.setName("KTN Home News");
        user2.setDesignation("WorldWide News");
        user2.setLocation("Nairobi");
        user2.setNews("Politics");
        user2.setImage(R.drawable.ktnnews);
        results.add(user2);

        ListItem user3 = new ListItem();
        user3.setName("Nation Tv News");
        user3.setDesignation("CountryWide News");
        user3.setLocation("Nairobi");
        user3.setNews("Education");
        user3.setImage(R.drawable.ntv_news);
        results.add(user3);

        ListItem user4 = new ListItem();
        user4.setName("Ktn News");
        user4.setDesignation("Worldwide News");
        user4.setLocation("Kenya");
        user4.setNews("Bbi");
        user4.setImage(R.drawable.ktnn_news);
        results.add(user4);

        ListItem user5 = new ListItem();
        user5.setName("Inooro Tv News");
        user5.setDesignation("CountryWide News");
        user5.setLocation("Nyeri");
        user5.setNews("Science & Tech");
        user5.setImage(R.drawable.inooro_fm);
        results.add(user5);

        ListItem user6 = new ListItem();
        user6.setName("KassTv News");
        user6.setDesignation("Regional News");
        user6.setLocation("Kericho");
        user6.setNews("Business Report");
        user6.setImage(R.drawable.kasstv_news);
        results.add(user6);

        ListItem user7 = new ListItem();
        user7.setName("KBC News");
        user7.setDesignation("Countrywide News");
        user7.setLocation("Nakuru");
        user7.setNews("Weather Report");
        user7.setImage(R.drawable.kbc_news);
        results.add(user7);

        ListItem user8 = new ListItem();
        user8.setName("KTN News");
        user8.setDesignation("WorldWide News");
        user8.setLocation("Kenya");
        user8.setNews("Bbi");
        user8.setImage(R.drawable.ktnn_news);
        results.add(user8);

        ListItem user9 = new ListItem();
        user9.setName("Romanza Africa News");
        user9.setDesignation("Regional News");
        user9.setLocation("Thika");
        user9.setNews("Soap Opera");
        user9.setImage(R.drawable.romanza_africa);
        results.add(user9);

        ListItem user10 = new ListItem();
        user10.setName("KBC News");
        user10.setDesignation("Worldwide News");
        user10.setLocation("Mombasa");
        user10.setNews("Weather Report");
        user10.setImage(R.drawable.kbc_news);
        results.add(user10);

        ListItem user11 = new ListItem();
        user11.setName("Inooro News");
        user11.setDesignation("CountryWide News");
        user11.setLocation("Nanyuki");
        user11.setNews("Science & Tech");
        user11.setImage(R.drawable.inooro_fm);
        results.add(user11);

        ListItem user12 = new ListItem();
        user12.setName("Citizen News");
        user12.setDesignation("Regional News");
        user12.setLocation("Embu");
        user12.setNews("Covid 19");
        user12.setImage(R.drawable.citizennews);
        results.add(user12);

        ListItem user13 = new ListItem();
        user13.setName("Swtich Tv  News");
        user13.setDesignation("Regional News");
        user13.setLocation("Kericho");
        user13.setNews("Youth Programs");
        user13.setImage(R.drawable.switch_news);
        results.add(user13);

        ListItem user14 = new ListItem();
        user14.setName("Romanza Africa News");
        user14.setDesignation("Countrywide News");
        user14.setLocation("Nakuru");
        user14.setNews("Soap Opera");
        user14.setImage(R.drawable.romanza_africa);
        results.add(user14);

        return results;
    }
}
