package com.ssu.kisyuksa;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class ChatHolder extends RecyclerView.ViewHolder {
    TextView mTextView;
    TextView mValueView;


    ChatHolder(@NonNull View itemView) {
        super(itemView);
        mTextView = itemView.findViewById(android.R.id.text1);
        mValueView = itemView.findViewById(android.R.id.text2);
    }

    void bind(@NonNull Chat chat) {
        mTextView.setText(chat.getName());
        mValueView.setText(chat.getMessage());
    }
}
