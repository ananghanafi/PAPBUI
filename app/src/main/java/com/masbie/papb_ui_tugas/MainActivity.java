package com.masbie.papb_ui_tugas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TabHost;


public class MainActivity extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Spinner spinner, spinner1;
        TabHost tabHost;

        spinner = (Spinner) findViewById(R.id.spinner);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        tabHost = (TabHost) findViewById(R.id.tabHost2);
        ListView listView = (ListView) findViewById(R.id.list_view);
        tabHost.setup();

        TabHost.TabSpec tab1 = tabHost.newTabSpec("Profil");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("Setting");
        tab1.setIndicator("Profile");
        tab1.setContent(R.id.tab1);
        tab2.setIndicator("Setting");
        tab2.setContent(R.id.tab2);
        String[] values =

                {"Mahasiswa", "Umum"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, values);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);

        String[] values1 =
                {"Male", "Female"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, values1);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner1.setAdapter(adapter1);
        String[] valueslist =
                {"Sim Card & Mobile network", "Wi-Fi", "Bluetooth", "Hotspot", "Display", "Walpaper", "Themes", "Sound & Vibration", "Loc Screen ","Notification & Status bar","Battery","Storage","Acount","Other Acount","Installed Apps","About Phone"};
        ArrayAdapter adapterlist = new ArrayAdapter<String>(this, R.layout.list_setting, valueslist);

        listView.setAdapter(adapterlist);


        tabHost.addTab(tab1);
        tabHost.addTab(tab2);

    }


}
