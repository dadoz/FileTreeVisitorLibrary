package com.application.davidelm.filetreevisitor.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import com.application.davidelm.filetreevisitor.R;

public class MenuView extends RelativeLayout {
    public MenuView(Context context) {
        super(context);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.menu_node_layout, this);
    }

    public MenuView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MenuView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public MenuView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }
}