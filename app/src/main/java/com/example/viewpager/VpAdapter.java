package com.example.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class VpAdapter extends FragmentStateAdapter {
    public VpAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return PageFragment.newInstance(position);
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
