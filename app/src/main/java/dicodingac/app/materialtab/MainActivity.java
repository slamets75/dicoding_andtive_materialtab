package dicodingac.app.materialtab;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import dicodingac.app.materialtab.Adapter.TabFragmentPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // set up toolbar
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Material Tab");

        //inisialisasi tab dan pager
        viewPager = (ViewPager) findViewById(R.id.pager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);

        //set object adapter kedalam ViewPager
        viewPager.setAdapter(new TabFragmentPagerAdapter(getSupportFragmentManager()));

        //Manipulasi set text Color pada Tabget
        tabLayout.setTabTextColors(getResources().getColor(R.color.colorPrimaryDark),
        getResources().getColor(android.R.color.white));

        //set tab ke view Pager
        tabLayout.setupWithViewPager(viewPager);

        //konfigurasi graviti fill agar Tab berada di posisi yang proposional
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


    }
}
