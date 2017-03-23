package dicodingac.app.materialtab.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import dicodingac.app.materialtab.Fragment.Tab1Fragment;
import dicodingac.app.materialtab.Fragment.Tab2Fragment;
import dicodingac.app.materialtab.Fragment.Tab3Fragment;
import dicodingac.app.materialtab.Fragment.Tab4Fragment;

/**
 * Created by irfan on 12/02/2017.
 */

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {

    //Bikin nama tab nya
    String [] title = new String[]{
            "Tab 1","Tab 2","Tab 3","Tab 4"
    };

    public TabFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
       // this.title = title;
    }

    //method untuk tampilan di layar
        @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
         switch (position){
             case 0 :
                 fragment = new Tab1Fragment();
                 break;
             case 1 :
                 fragment = new Tab2Fragment();
                 break;
             case 2 :
                 fragment = new Tab3Fragment();
                 break;
             case 3 :
                 fragment = new Tab4Fragment();
                 break;
             default:
                 fragment = null;
                 break;
         }
       return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public int getCount() {
        return title.length;
    }
}
