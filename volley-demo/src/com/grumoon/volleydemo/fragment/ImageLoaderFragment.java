package com.grumoon.volleydemo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.grumoon.volleydemo.R;
import com.grumoon.volleydemo.adapter.ImageBaseAdapter;
import com.grumoon.volleydemo.adapter.ImageLoaderAdapter;
import com.grumoon.volleydemo.util.Constants;

public class ImageLoaderFragment extends Fragment{
	public static final int INDEX=22;
	
	private String[] imageUrlArray = Constants.IMAGE_URLS;

	private GridView gvCar;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fr_image_request, container,false);

		gvCar = (GridView) view.findViewById(R.id.gv_car);
		ImageBaseAdapter adapter = new ImageLoaderAdapter(getActivity(),imageUrlArray);
		gvCar.setAdapter(adapter);

		return view;
	}

}
