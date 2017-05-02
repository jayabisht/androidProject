package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by GS-1257 on 28-04-2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int colorOfLayout;

    public WordAdapter(Activity context, ArrayList<Word> wordArrayList, int colorResourceID){
        super(context,0,wordArrayList);
        colorOfLayout = colorResourceID;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokTextView = (TextView)listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = (TextView)listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());
        ImageView logoImageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentWord.isValidImage()) {
            logoImageView.setImageResource(currentWord.getmImageResourceId());
            logoImageView.setVisibility(View.VISIBLE);
        }
        else
        {
            logoImageView.setVisibility(View.GONE);
        }

        // Set background color
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), colorOfLayout);
        textContainer.setBackgroundColor(color);
        
        return listItemView;
    }
}
