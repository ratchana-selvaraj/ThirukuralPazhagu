package com.example.thirukuralpazhagu;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
//fragmentpageadapter used when limited and static
public class PageAdapter  extends FragmentPagerAdapter {
    int nums;
    public PageAdapter(FragmentManager fmm, int nums){
        super (fmm);
        this.nums=nums;
    }
    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                Fragment1 tab1 = new Fragment1();
                return tab1;
            case 1:
                Fragment2 tab2 = new Fragment2();
                return tab2;
            case 2:
                Fragment3 tab3 = new Fragment3();
                return tab3;
            default:
                return null;
        }
    }
    @Override
    public int getCount(){
        return nums;
    }
}
