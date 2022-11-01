package com.example.itechnology.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.itechnology.Adapter.ItemProducto;
import com.example.itechnology.Adapter.ProductoAdapter;
import com.example.itechnology.R;
import com.example.itechnology.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private String[] newItem;
    private ArrayList<ItemProducto> itemArrayList;
    private RecyclerView recycleView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();



        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        dataInitialize();
        recycleView = view.findViewById(R.id.recycleView);
        recycleView.setLayoutManager(new LinearLayoutManager(getContext()));
        recycleView.setHasFixedSize(true);
        ProductoAdapter adapter = new ProductoAdapter(getContext(),itemArrayList);
        recycleView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void dataInitialize() {
       itemArrayList = new ArrayList<>();

        newItem = new String[]{
                getString(R.string.nombreItem),
                getString(R.string.descItem),
        };

        for (int i = 0 ; i< newItem.length; i++){
            ItemProducto item = new ItemProducto(newItem[i]);
            itemArrayList.add(item);
        }
    }
}