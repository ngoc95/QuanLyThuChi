package adapter;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import fragment_page.CaidatFragment;
import fragment_page.ThongkeFragment;
import fragment_page.ThuchiFragment;

public class AdapterGiaodien extends FragmentPagerAdapter {
    private String matk;

    public AdapterGiaodien(FragmentManager fm, String matk) {
        super(fm);
        this.matk = matk;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new ThuchiFragment(matk);
            case 1:
                return new ThongkeFragment(matk);
            case 2:
                return new CaidatFragment(matk);
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
