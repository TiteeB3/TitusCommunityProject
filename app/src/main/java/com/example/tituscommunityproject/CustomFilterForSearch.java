package com.example.tituscommunityproject;

import android.widget.Filter;

import java.util.ArrayList;

public class CustomFilterForSearch extends Filter {

    AdapterForPlantList adapter;
    ArrayList<ModelForPlantList> filterList;

    public CustomFilterForSearch(ArrayList<ModelForPlantList> filterList,AdapterForPlantList adapter){

        this.adapter = adapter;
        this.filterList = filterList;
    }

    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
        FilterResults results = new FilterResults();
        if (constraint != null && constraint.length() > 0) {
            constraint = constraint.toString().toUpperCase();
            ArrayList<ModelForPlantList> filteredModels = new ArrayList<>();
            for (int i = 0; i < filterList.size(); i++) {
                if (filterList.get(i).getTitle().toUpperCase().contains(constraint)) {
                    filteredModels.add(filterList.get(i));
                }
                if (filterList.get(i).getCommon_name().toUpperCase().contains(constraint)) {
                    filteredModels.add(filterList.get(i));
                }
                if (filterList.get(i).getSerial_numbers().toUpperCase().contains(constraint)) {
                    filteredModels.add(filterList.get(i));
                }
            }
            results.count = filteredModels.size();
            results.values = filteredModels;
        } else {
            results.count = filterList.size();
            results.values = filterList;
        }
        return results;
    }

    protected void publishResults(CharSequence constraint, FilterResults results){
        adapter.models = (ArrayList<ModelForPlantList>) results.values;
        adapter.notifyDataSetChanged();
    }
}